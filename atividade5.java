import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.println("Verificador de aprovação de nota dos alunos");
        System.out.print("Digite sua nota (0 a 10): ");
        nota = entrada.nextDouble();

        if (nota > 10){
        System.out.print("Nota inválida.");
        }else if (nota >= 7){
            System.out.print("Você foi aprovado!");
        }else if (nota >= 4) {
            System.out.print("Você está em recuperação!");
        }else {
            System.out.print("Você foi reprovado!");
        }
    }
}
