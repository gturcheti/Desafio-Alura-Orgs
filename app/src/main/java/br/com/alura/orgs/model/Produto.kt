package br.com.alura.orgs.model

import android.os.Parcel
import android.os.Parcelable
import java.math.BigDecimal

data class Produto(
        val nome: String,
        val descricao: String,
        val valor: Double,
        val imagem: String? = null
) : Parcelable {
        constructor(parcel: Parcel) : this(
                parcel.readString().toString(),
                parcel.readString().toString(),
                parcel.readDouble(),
                parcel.readString()
        ) {
        }

        override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeString(nome)
                parcel.writeString(descricao)
                parcel.writeDouble(valor)
                parcel.writeString(imagem)
        }

        override fun describeContents(): Int {
                return 0
        }

        companion object CREATOR : Parcelable.Creator<Produto> {
                override fun createFromParcel(parcel: Parcel): Produto {
                        return Produto(parcel)
                }

                override fun newArray(size: Int): Array<Produto?> {
                        return arrayOfNulls(size)
                }
        }

}
