//import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCadastro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        menu(users);
    }

    public static void menu(ArrayList<Usuario> u) {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastro");
        System.out.println("0 - Sair");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                login(u);

            case 2:
                cadastro(u);

            case 0:
                break;
        }
    }

    public static void cadastro(ArrayList<Usuario> u) {
        System.out.println("Qual seu nome? ");
        String name = sc.next();
        System.out.println("Qual sua idade? ");
        int age = sc.nextInt();
        System.out.println("Qual seu login? ");
        String login = sc.next();
        System.out.println("Qual sua senha? ");
        String pass = sc.next();

        u.add(new Usuario(name, age, login, pass));
        System.out.println("Usuário cadastrado com sucesso!");
        menu(u);
    }

    public static void login(ArrayList<Usuario> u) {

        System.out.println("Insira seu login:");
        String log = sc.next();
        System.out.println("Insira sua senha:");
        String pass = sc.next();

        for (Usuario user : u) {
            if (user.getLogin().equals(log) && user.getSenha().equals(pass)) {
                System.out.println("Seja bem vindo(a), " + user.getNome() + "!");
            } else{
                System.out.println("Login ou senha inválidos");
                break;
            }
        }
        menu(u);
    }
}