DESAFIO ALURA:

Adicionar uma tela de descrição do produto com as seguintes características:

- Ao clicar em um produto do RecyclerView, é aberta a tela com o conteúdo do produto.
- A imagem de fallback na tela de detalhes é a padrão.
- É possível acessar/ler todo o conteúdo mesmo que o título ou descrição sejam grandes.

Para esta implementação você precisa:

- Criar uma Activity de detalhes de produto.
- Implementar o layout conforme a proposta de implementação.
- Modificar o tema da Activity de detalhes do produto para que não tenha uma App Bar (Action Bar).
- Implementar o listener no adapter do RecyclerView para acessar o produto clicado e abrir a tela de detalhes do produto.
- Enviar e receber valores/objetos entre Activities.

---

O que foi realizado para cumprir o objetivo:

Layout:
- Uso do ScrollView em caso da descrição superar o espaço disponível em tela
- Uso de "Cards" do Material Design p/ inserir a TextView referente ao valor do produto. 
- Referenciação do "cartão" para centralizá-lo no "bottom" da ImageView. 

Código:

Implementação do listener na recycleview por meio de uma função lâmbda para definir o comportamento de clique.

- modificação no adapter:
-- adicao do construtor itemListener (lâmbda) que recebe um produto como parâmetro;
-- alteração da assinatura class -> inner class no viewHolder;
-- inclusao da variavel produto c/ lateinit;
-- init do itemView.setOnclickListener;
-- inicializando o produto na fun vincula(), responsavel por definir cada item de produto na recycleview;

- modificacao na activity da lista de produtos:
-- criada a função "vaiParaDetalhes()" c/ intent p/ activity de detalhes 
-- configurado o itemListiner p/ receber a função "vaiParaDetalhes()"


Implementação do parcelable para o envio do produto entre activitys:

- modificação da classe produtos:
-- herança da classe Parcelable;
-- implementação dos membros da classe Parcelable;

- modificação na ListaProdutosActivity:
-- inclusão do putExtra no intent com o objeto "produto"

Criação da activity de Detalhes
- Criação da classe;
- Herança da AppCompactActivity()
- Implementação de View Binding;
- getExtra() para carregar o produto selecionado e devida inicialização dos campos. 

Remoção da appbar:
- No onCreate da "DetalhesProdutoActivity" foi incluído o código supportActionBar?.hide(), sem necessidade de alteração do tema. 

