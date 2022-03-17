package br.com.alura.orgs.dao

import br.com.alura.orgs.model.Produto

class ProdutosDao {

    fun adiciona(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos(): List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>(
            Produto(
                nome = "Honda Civic",
                descricao = """Lançado originalmente em 1973, no Japão, o Honda Civic tem importância histórica para a marca.
Primeiro carro da Honda produzido no Brasil e modelo mais vendido da fabricante ao redor do mundo, ele chegou por aqui em 1992, passando a ser fabricado no país em 1997.
O Civic revolucionou o mercado em sua décima geração, popularmente conhecida como New Civic, e manteve o perfil ousado nos modelos seguintes. A 10ª geração foi a última a ser produzida no Brasil, na fábrica de Sumaré (SP), portanto, a partir de 2022, o Brasil deverá começar a receber o modelo como importado (Honda Civic 2023).
Civic 2021.
Mantendo o visual esportivo que consagrou a décima geração do Civic, a Honda deu uma leve completada na lista de equipamentos do sedã, incluindo novas centrais multimídias em algumas variantes, sensor crepuscular e outros equipamentos de série, como os faróis de regulagem elétrica de altura.
A versão de entrada, LX, recebeu multimídia de 7 polegadas compatível com Android Auto e Apple CarPlay. A iluminação nos espelhos dos para-sóis também é novidade nessa versão. O visual externo segue com o mesmo estilo de para-choque frontal e grade, além dos frisos cromados ladeando as luzes de neblina. Na traseira há apenas um friso cromado, que chegou na linha 2020.
As versões LX e Sport possuem tecido premium em preto nos bancos, enquanto as outras versões possuem estofamento em couro (cinza ou preto). As cores disponíveis de carroceria são: Branco Tafetá, Prata Platinum, Preto Cristal, Branco Estelar, Cinza Barium e Azul Cósmico.
Na versão topo de linha, a Touring, a única novidade em relação ao 2020 é o novo botão giratório introduzido para regular o volume do som, facilitando a vida de quem vai nos bancos dianteiros.
Motorização.
O Honda Civic segue com apenas duas opções de motor no Brasil. As versões LX, Sport, EX e EXL são equipadas com o 2.0 i-VTEC flex com 155 cv a 6.300 rpm e 19,5 kgfm a 4.800 rpm. Já a versão topo de linha Touring segue com motor 1.5 turbo a gasolina, com injeção direta e abertura variável das válvulas, que gera 173 cv a 5.500 rpm e torque de 22,4 kgfm a 1.700 rpm.
A transmissão é CVT com opção de trocas por meio de borboletas atrás do volante (simula sete velocidades) para todas as versões. A partir da linha 2020, vale lembrar, o Honda Civic deixou de ser oferecido com transmissão manual no Brasil.
As medidas são: 4,63 m de comprimento, 1,79 m de largura, 1,43 m de altura e 2,70 m de entre-eixos. O tanque de combustível pode armazenar 56 litros, seja de etanol ou gasolina. O porta-malas tem uma pequena variação dependendo da versão: 525 litros na LX e Sport, 519 L na EX e EXL, enquanto a Touring possui 517 L de capacidade.
Importado do Canadá, o Honda Civic Si saiu de linha no Brasil. Somente 30 unidades do modelo 2020 chegaram ao Brasil e o número baixo nas vendas fez com que a fabricante desistisse trazê-lo ao Brasil.  O Si 2020 vem equipado com motor 1.5 turbo de 208 cv e 26,5 kgfm de torque, com tração dianteira. A transmissão é feita pelo câmbio manual de seis marchas.
Fonte: icarros.com.br/honda/civic
""",
                valor = 146500.00,
                "https://img0.icarros.com/dbimg/galeriaimgmodelo/7/135106_1.webp"
            ),
            Produto(
                "Volkswagen Jetta",
                """Lançado em 1979 para ser o “Golf sedã”, o Jetta foi vendido inicialmente na Europa e também no mercado norte americano, que estava com uma crescente demanda por esse tipo de carroceria na época.    
O Jetta recebeu diversos nomes durante sua existência. Esses nomes foram variando conforme os países e épocas em que era lançado, o mesmo já se chamou Bora, Jetta City, Fox, Sagitar, Golf Sedan e outros.   
O Jetta chegou ao Brasil em 1999, e a Volkswagen trouxe o sedã médio importado do México. Por aqui recebemos a 4ª geração do modelo com nome de Bora. Este modelo tinha apenas uma versão e era equipado com o mesmo motor a gasolina do Golf brasileiro, o EA 113 2.0.    
Já em 2005, recebemos a 5ª geração, esta sim com o nome Jetta. Seguindo os passos do anterior, o modelo desembarcou por aqui em versão única, equipada com motor 2.5 de 5 cilindros, sendo até hoje um dos propulsores mais aclamados pelos puristas, justamente pela maior litragem entre os que foram comercializados aqui.   
A partir de 2011, chegou ao Brasil a 6ª geração do Jetta, e o Bora se foi de vez. O modelo veio nas versões Comfortline e Highline, sendo a básica com o mesmo motor EA 113 2.0 flex, com transmissão manual de 5 marchas ou automática de 6 marchas tiptronic. Na Highline, o Jetta ganhou o motor EA888 2.0 Turbo e a única opção de transmissão era a automatizada DSG de dupla embreagem.    
Em 2015, o sedã passou uma reestilização com novos faróis dianteiros e traseiros, novo volante e apliques em black-piano no painel. Este modelo chegou a receber o motor 1.4 16V turbo, o famoso TSI de 150 cv do Golf.   
Em 2020, o Jetta vinha em três versões ao Brasil: a Comfortline a R-Line com o 1.4 TSI de 150 cv e 25,5 kgfm, enquanto a topo de linha era a 2.0 350TSI de 230 cv e 35,7 kgfm de torque. O modelo recebeu um novo visual com linhas bem marcadas e mais definidas, além de uma nova grade. 
As vendas da versão de entrada não vingaram em 2020 e a VW do Brasil decidiu extingui-la do País. Por conta disso, o Jetta 2021 chegou no Brasil apenas na versão GLI, a mais esportiva do modelo, permanecendo com o 2.0 turbo de 230 cv, com transmissão automática de dupla embreagem com 6 marchas. 
Entre os modelos 2020 e 2021 houve poucas alterações. As novidades são: porta USB do tipo C, carregador wireless e central multimídia de 8” com Apple CarPlay sem fio. O único opcional é o teto solar elétrico, além das cores metálicas cinza Platinum, prata Pyrit e a perolizada preto Mystic.  
O Jetta 2021 possui 4,70m de comprimento, sendo 4,3 cm maior que o 2020. A largura chegou aos 1,79 m de largura (+2,1 cm), enquanto a altura é de 1,45 m, (-1cm). O espaço entre-eixos permanece com 2,68m, assim como os 510 litros de capacidade do porta-malas. 
Fonte: https://www.icarros.com.br/volkswagen/jetta/
""",
                178490.00,
                "https://img0.icarros.com/dbimg/galeriaimgmodelo/7/134971_1.webp"
            )
        )
    }

}