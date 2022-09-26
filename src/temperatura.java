import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double C, F;

        System.out.println("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit: ");
        C = scan.nextDouble();

        F = (9 * C + 160) / 5;

        System.out.println("O equivalente a " + C + " é: " + F);
    }
}
