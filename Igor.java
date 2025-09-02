import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String rua, bairro, cidade, estado, numero, cep;
        String confirmacao;

        confirmacao = "Não";

        while (confirmacao.equalsIgnoreCase("Não")){

        System.out.println("Cadastro de endereço!");

        System.out.print("Informe o CEP: ");
        cep  = entrada.nextLine();

        System.out.print("Informe a rua: ");
        rua = entrada.nextLine();

        System.out.print("Informe o número: ");
        numero = entrada.nextLine();

        System.out.print("Informe o bairro: ");
        bairro = entrada.nextLine();

        System.out.print("Informe a cidade: ");
        cidade = entrada.nextLine();

        System.out.print("Informe o estado: ");
        estado = entrada.nextLine();

        System.out.println("Endereço: " + cep + " - " + rua + ", " + numero + ", " + bairro + ", " + cidade + ", " + estado);
        System.out.print("Confirmar? (Sim/Não): ");
        confirmacao = entrada.nextLine();

        if (confirmacao.equalsIgnoreCase("Sim")) {
            System.out.print("Endereço confirmado com sucesso!");
        } else if (confirmacao.equalsIgnoreCase("Não")) {
            System.out.print("Ok, refaça o cadastro!");
        } else {
            System.out.print("Resposta inválida!");
            confirmacao = "Não";
        }
        }



    }
}
