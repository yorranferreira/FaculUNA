import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome,senha;
        int login = 0;

        System.out.println("Realize o seu Login.");
        while (login < 3) {

            System.out.print("Usuário: ");
            nome = entrada.nextLine();

            System.out.print("Senha: ");
            senha = entrada.nextLine();

            if (nome.equals("admin") && senha.equals("1234")) {
                System.out.print("Bem vindo Administrador!");
                login = login + 3;
            } else if (nome.equals("aluno") && senha.equals("0000")) {
                System.out.print("Bem vindo Aluno! Você pode consultar suas notas.");
                login = login + 3;
            } else if (nome.equals("professor") && senha.equals("4321")) {
                System.out.print("Bem vindo Professor! Você pode lançar notas.");
                login = login + 3;

            } else if (nome.equals("admin") && !senha.equals("1234") || nome.equals("aluno") && !senha.equals("0000")
                    || nome.equals("professor") && !senha.equals("4321")) {
                System.out.println("Senha incorreta!");
                login = login + 1;
            } else if (!nome.equals("admin") && senha.equals("1234") || !nome.equals("aluno") && senha.equals("0000")
                    || !nome.equals("professor") && senha.equals("4321")) {
                System.out.println("Usuário incorreto!");
                login = login + 1;
            } else if (!nome.equals("admin") && !senha.equals("1234") || !nome.equals("aluno") && !senha.equals("0000")
                    || !nome.equals("professor") && !senha.equals("4321")) {
                System.out.println("Usuário e Senha incorretos!");
                login = login + 1;
            }
        }if (login <= 3){
            System.out.print("Acesso bloqueado! Tente novamente mais tarde.");
        }

    }
}
