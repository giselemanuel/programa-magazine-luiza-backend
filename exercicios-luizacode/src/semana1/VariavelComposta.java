package semana1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VariavelComposta {

    public static void main(String[] args) {
//        int n = 1;
//        int n2;

        int numbers[] =  {99, 56, 17, 90, 89};

//      System.out.println("Vetor: " + numbers);
//        System.out.println("O valor  inserido no indice no 3 é " + numbers[3]);
//        System.out.println(("O valor inserido na posição 3 é " + numbers[2]));

//        int numbers2[] = new int[5];

//        numbers2[0] = 23;
//        numbers2[1] = 3;
//        numbers2[2] = 32;
//        numbers2[3] = 21;
//        numbers2[4] = 39;

//      int tamanho =  numbers.length;
//        System.out.println("O tamanho do vetor 1 é:  " + numbers.length);

//        int i;

//        for(i = 0; i <= numbers.length; i++){
//            System.out.printf("No indice %d que esta  na posição  %d  temos  o valor  %d\n", i, i+1, numbers[i]);
//
//        }
// Outra forma de usar o  for
        for (int value  : numbers){
            System.out.println("O valor  da vez é: "  + value);
        }

        System.out.print("\n\n");
// organiza os elementos do vetor
        Arrays.sort(numbers);
        for (int value  : numbers){
            System.out.println("O valor  da vez é: "  + value);
        }

    }
}
