import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num1, num2, iguais;

        System.out.println("Maior de dois.");
        System.out.print("Digite um número: ");
        num1 = entrada.nextInt();

        System.out.print("Digite outro número: ");
        num2 = entrada.nextInt();

        if (num1 > num2){
            System.out.printf("O número %d é o maior.", num1);
        }else  if (num1 < num2){
            System.out.printf("O número %d é o maior.", num2);
        }else{
            System.out.print("Os números são iguais.");
        }
    }
}
