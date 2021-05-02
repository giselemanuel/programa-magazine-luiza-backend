package semana2.aula2;

public class Conta {
    private int numero;
    private String dono;
    private double saldo;
    private static int totalDeContas;

    //construtor
    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
        this.totalDeContas = totalDeContas + 1;
    }

    // como boa prática se não esta utilizando deve ser excluído no código.
//   public int getNumero() {
//        return numero;
//    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

//    public String getDono() {
//        return dono;
//    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

//    public static int getTotalDeContas() {
////        return Conta totalDeContas;
//    }

    // métodos da classe
    public boolean sacar(int valor){
        if(valor <= this.saldo){
            this.saldo  = saldo - valor;
            return true;
        }
        return false;
    }

    public void tranferir(double valor){
        this.saldo += valor;
//        this.saldo = saldo + valor;
    }

}
