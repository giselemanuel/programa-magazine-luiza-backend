package semana2.aula1;

public class Carro {

    //atributos
    String tipo;
    String cor;
    String placa;
    int numeroDePortas;
    Pessoa dona;

    //Construtor
   public  Carro(){
   }

    public Carro(String tipo, String cor, String placa, int numeroDePortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numeroDePortas = numeroDePortas;
    }
//
//    public Carro(String tipo, String cor, String placa, int numeroDePortas) {
//        this.tipo = tipo;
//        this.cor = cor;
//        this.placa = placa;
//        this.numeroDePortas = numeroDePortas;
//    }

    // GET
    public String getCor(){
       return cor;
    }
    public String getTipo(){
        return tipo;
    }
    public String getPlaca() {
        return placa;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public Pessoa getDona() {
        return dona;
    }

    // SET
    public void setTipo(String tipo){
       this.tipo = tipo;
    }
    public void setCor(String cor){
        this.tipo = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void setDona(Pessoa dona) {
        this.dona = dona;
    }

    //Métodos
    void ligar(){
        System.out.println("Carro ligado!!!");
    }

    void desligar(){
        System.out.println("Carro desligado!!!");
    }

    int dobroPortas(){
       return numeroDePortas * 2;
    }

}

