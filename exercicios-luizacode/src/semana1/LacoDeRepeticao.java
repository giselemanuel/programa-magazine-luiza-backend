package semana1;

public class LacoDeRepeticao {
    public static void main(String[] args) {
        int count;

        for(count = 10; count<= 100; count++) {
            if (count % 18 == 0) {
                System.out.printf("Querida usuária, esse número %d é divisível\n", count);
            }
        }
    }
}
