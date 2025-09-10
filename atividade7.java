import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;

        System.out.println("Classificação de idade.");
        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 18){
            System.out.print("Adulto.");
        }else if (idade >= 13){
            System.out.print("Juvenil.");
        }else{
            System.out.print("Infantil.");
        }


    }
}
