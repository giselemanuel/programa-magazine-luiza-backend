package semana2.pratica01_04;

public class Produto {

    //atributos --------------------------------------------------------------------------------------------------------
    private long codigo;
    private String nome;

    //construtor -------------------------------------------------------------------------------------------------------

    public Produto(){

    }
    public Produto(long codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    //Getter -----------------------------------------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    // Setter ----------------------------------------------------------------------------------------------------------

    public void setCodigo(long codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    // métodos ---------------------------------------------------------------------------------------------------------

    public String consultaNome(){
        return getNome();
    }

}
