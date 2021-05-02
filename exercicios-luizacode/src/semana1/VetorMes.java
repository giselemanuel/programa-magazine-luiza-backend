package semana1;

public class VetorMes{
    public static void main(String[] args) {

    //declaração dos vetores -------------------------------------------------------------------------------------------------------------------------
        String mes[] = {"Janeiro", "Fevereiro", "Março","Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //estrutura de repetição para exibir os meses e seus respectivos dias ----------------------------------------------------------------------------
        for(int i = 0; i < mes.length; i++){
            System.out.printf("O mês de %s tem %d dias.\n", mes[i], tot[i]);
         }
    }
}
