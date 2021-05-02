package semana1;
import java.lang.Math;

public class GeradorNumAleatorio {
    public static void main(String[] args) {

        double number = 1 + Math.random() * (10-1); // define que será sorteado número de 1 a 10
        System.out.format("%.0f", number);


    }
}
