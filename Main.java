import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double numero1 = 0;
        double dobronumero1 = 0;

        System.out.print("Digite um número: ");
        numero1 = entrada.nextDouble();

        dobronumero1 = numero1 * 2;

        System.out.println("\n\nO valor informado foi: " + numero1);

        System.out.printf("O dobro de %.2f é %.2f: " , numero1, dobronumero1);

        // System.out.print("Digite outro número: ");
        // dobronumero1 = entrada.nextDouble();

        //System.out.print("O dobro desse número é: " + dobronumero1);

    }
}
