package semana2.aula2_pratica1;

public class Conta {
    // declara atributos
    private int numero;
    private String dono;
    private double saldo;

    // construtor
    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    //getter e setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // metodo sacar
    public boolean sacar(int valor){
        if(this.saldo <= saldo - valor){
            return true;
        }
        return false;

//    //método transferir
//    public int transferir(int valorT){
//       this.saldo = saldo + valorT;
//        }
    }
}
