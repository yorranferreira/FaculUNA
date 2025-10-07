import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.print("Informe o valor em kWz: ");
        double kWh = imput.nextDouble();
        if (kWh <= (double)100.0F) {
            double soma = kWh * (double)0.5F;
            System.out.println("Total a pagar: " + soma);
            if (soma <= (double)30.0F) {
                System.out.print("Você poderá pagar no próximo mês.");
            }
        } else if (kWh <= (double)200.0F) {
            double soma = kWh * 0.7;
            if (soma <= (double)200.0F) {
                soma *= 0.1;
            }

            System.out.printf("Total a pagar: R$ %.2f", soma);
        } else if (kWh < (double)500.0F) {
            double soma = kWh * 0.9;
            System.out.printf("Total a pagar: R$ %.2f", soma);
        } else {
            double soma = kWh * 0.9;
            System.out.println("Consumo elevado: considere economizar energia.");
            System.out.printf("Total a pagar: R$ %.2f.", soma);
        }

    }
}
