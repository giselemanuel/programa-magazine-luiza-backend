package semana2.aula1;
// define atributos
// cria construtor
// cria getter
// cria setter

public class Pessoa {

    //atributos
    String nome;
    int idade;
    String cnh;

    // construtor

    public  Pessoa(){
    }

    public Pessoa(String nome, int idade, String cnh) {
        this.nome = nome;
        this.idade = idade;
        this.cnh = cnh;
    }

    // GETTER
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public String getCnh() {
        return cnh;
    }

    // SETTER
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


// métodos -------------------------------------------------------------------------------------------------------------
    void dormindo(){
        System.out.println("Estou dormindo!!!\n zzZzzzZzzzZzzzZZZ");
    }

    void dirigir(){
        System.out.println("Estou Dirigindo !!!");
    }

    void comer(){
        System.out.println("Estou comendo");
    }
}
