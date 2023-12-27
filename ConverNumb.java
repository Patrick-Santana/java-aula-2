import java.util.Scanner;

/**
 * @param args
 */

public class ConverNumb {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrein: ");

        double valorTem1 = entrada.nextDouble();

        var c = (5 * valorTem1 - 160) / 9;

        System.out.println("O valor da temperatura em celsius: " + c);

        if (c > 0)
            System.out.println("Temperatura acima de Zero");

        entrada.close();
    }
}
