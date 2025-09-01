import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;
        int ano;
        int dobro;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        ano = 2025 - idade;
        dobro = idade * 2;

        System.out.println("Seu nome é " + nome + " " + sobrenome + ", e sua idade é " + idade + " anos.");
        System.out.print("Você nasceu no ano de " + ano + ", e o dobro da sua idade é " + dobro + ".");

    }
}
