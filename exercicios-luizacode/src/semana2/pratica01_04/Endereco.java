package semana2.pratica01_04;

public class Endereco {

    //atributo ---------------------------------------------------------------------------------------------------------

    private String logradouro;
    private String cidade;
    private String estado;

    //construtor -------------------------------------------------------------------------------------------------------
    public Endereco(){

    }
    public Endereco(String logradouro, String cidade, String estado){
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
      }

    //Getter -----------------------------------------------------------------------------------------------------------

    public String getLogradouro() {
        return logradouro;
    }

    public String getCidade(){
        return cidade;
    }

    public String getEstado(){
        return estado;
    }

    //Setter -----------------------------------------------------------------------------------------------------------

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    //Métodos ----------------------------------------------------------------------------------------------------------

    public void consultaLogradouro(){
        System.out.println("O seu logradouro é: " + logradouro);
    }

}
