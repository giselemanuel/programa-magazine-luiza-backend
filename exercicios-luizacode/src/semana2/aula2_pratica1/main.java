package semana2.aula2_pratica1;

public class main {
    public static void main(String[] args) {

        // instânciando objetos
        Conta contaGisele = new Conta(1234, "Gisele", 1000);
        Conta contaGuilherme = new Conta(5678, "Guilherme", 500);
        Conta contaMaria = new Conta(9870, "Maria", 3000);
        Pessoa pessoaGisele = new Pessoa("Gisele", "123.456.678.-99", "rua são bento", contaGisele);
        Pessoa pessoaGuilherme = new Pessoa("Guilherme", "111.444.678.-99", "avenida brasil",contaGuilherme);
        Pessoa pessoaMaria = new Pessoa("Maria", "333.222.678.-99","rua padre de paula", contaMaria);

        pessoaGisele.getConta().sacar(10);

        //System.out.println("Total de contas " + contaGisele.getTotalDeContas());
    }
}
