package br.com.alura.orgs.ui.activity

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.orgs.databinding.ActivityDetalhesBinding
import br.com.alura.orgs.extensions.tentaCarregarImagem
import br.com.alura.orgs.model.Produto
import java.text.NumberFormat
import java.util.*

class DetalhesProdutoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityDetalhesBinding.inflate(layoutInflater)
    }

    private lateinit var produto: Produto

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(binding.root)
        getExtra()
        inicializaCampos()

    }
    private fun getExtra() {
        this.produto = intent.extras!!.getParcelable("produto")!!
        Log.i("Importado", "$produto")
    }

    private fun inicializaCampos() {
        val imagemCampo: ImageView = binding.detalhesImagem
        imagemCampo.tentaCarregarImagem(produto.imagem)
        val valor: TextView = binding.detalhesValor
        val valorEmMoeda = formataParaMoedaBrasileira(produto.valor)
        valor.text = valorEmMoeda
        val tituloCampo = binding.detalhesTitulo
        tituloCampo.text = produto.nome
        val descricaoCampo = binding.detalhesDescricao
        descricaoCampo.text = produto.descricao
    }

    private fun formataParaMoedaBrasileira(valor: Double): String {
        val formatador: NumberFormat = NumberFormat
            .getCurrencyInstance(Locale("pt", "br"))
        return formatador.format(valor)
    }

}
