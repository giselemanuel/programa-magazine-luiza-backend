package semana2.pratica01_04;

public class Compra {

    //atributos --------------------------------------------------------------------------------------------------------

    private Pessoa pessoa;
    private Produto produto;

    // construtores ----------------------------------------------------------------------------------------------------
    public Compra(){

    }

    // getter ----------------------------------------------------------------------------------------------------------

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Produto getProduto() {
        return produto;
    }

    // Setter ----------------------------------------------------------------------------------------------------------

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    // métodos ---------------------------------------------------------------------------------------------------------

   public void comprar(Pessoa pessoa, Produto produto){
        this.pessoa = pessoa;
        this.produto = produto;
   }
    public String verificarCompra(){
        System.out.println("--\nCliente: " + getPessoa().getNome() + "\nProduto: " + getProduto().getNome());
        return "Cliente:" + getPessoa().getNome() + "\nProduto: " + getProduto().getNome();
    }
}
