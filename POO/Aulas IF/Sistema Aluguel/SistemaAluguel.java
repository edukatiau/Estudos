import java.util.ArrayList;
import java.util.Scanner;

  public class Main{
  static Scanner sc = new Scanner(System.in);
  static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
  public static void main(String[] args){
    // Declara a variável usuarios
    //ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    // Adiciona um usuário ao ArrayList
    usuarios.add(new Usuario("edu", "edu", "123"));

    // Chama o método menu()
    menu(usuarios);
  }

  public static void menu(ArrayList<Usuario> usuarios){
    System.out.println("---Menu---");
    System.out.println("1 - Cadastrar");
    System.out.println("2 - Login");
    System.out.println("3 - Sair");

    int opcao = sc.nextInt();
    switch(opcao){
        case 1:
          cadastro(usuarios);
          break;
        case 2:
          login(usuarios);
          break;
        case 3:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida!");
          menu(usuarios);
          break;
    }
    
  }
    
  public static void cadastro(ArrayList<Usuario> usuarios){
    System.out.println("---Cadastro---");
    System.out.println("Digite o nome do usuario: ");
    String nome = sc.next();
    System.out.println("Digite o login do usuario: ");
    String login = sc.next();
    System.out.println("Digite a senha do usuario: ");
    String senha = sc.next();
    Usuario usuario = new Usuario(nome, login, senha);
    usuarios.add(usuario);
    System.out.println("Usuario cadastrado com sucesso!");
    menu(usuarios);
  }

  public static void login(ArrayList<Usuario> usuarios){
    System.out.println("---Login---");
    System.out.println("Digite o login do usuario: ");
    String log = sc.next();
    System.out.println("Digite a senha do usuario: ");
    String pass = sc.next();
    
    for(Usuario u: usuarios){
      if(u != null){
        if(u.getLogin().equals(log) && u.getSenha().equals(pass)){
          System.out.println("Logado.");
          sistema(u);
          break;
        }
      } else{ 
        System.out.println("Login ou Senha incorreto.");
        break;
      }       
    }
    System.out.println("Login ou Senha incorreto.");
    menu(usuarios);
  }

  public static void sistema(Usuario usuario){
    System.out.println("---Sistema---");
    System.out.println("Olá, " + usuario.getNome() + ".");
    System.out.println("Digite o número da opção desejada: ");
    System.out.println("1 - Meu Perfil");
    System.out.println("2 - Veiculos");

    int escolha = sc.nextInt();

    switch(escolha){
      case 1:
        perfil(usuario);
        break;
      case 2:
        veiculos(usuario);
        break;
    }
  }

  public static void perfil(Usuario usuario){
    System.out.println("---Meu Perfil---");
    System.out.println("Digite o número da opção desejada: ");
    System.out.println("1 - Alterar nome");
    System.out.println("2 - Alterar login");
    System.out.println("3 - Alterar senha");
    System.out.println("4 - Excluir conta");
    System.out.println("5 - Voltar");
    int escolha = sc.nextInt();
    switch(escolha){
        case 1:
          System.out.println("Digite o novo nome: ");
          String nome = sc.next();
          usuario.setNome(nome);
          System.out.println("Nome alterado com sucesso.");
          sistema(usuario);
          break;
        case 2:
          System.out.println("Digite o novo login: ");
          String login = sc.nextLine();
          usuario.setLogin(login);
            System.out.println("Login alterado com sucesso.");
        sistema(usuario);
          break;
        case 3:
          System.out.println("Digite a nova senha: ");
          String senha = sc.nextLine();
          usuario.setSenha(senha);
          System.out.println("Senha alterada com sucesso.");
          sistema(usuario);
          break;
        case 4:
          //usuario = null;
          usuarios.remove(usuario);
          System.out.println("Conta excluida com sucesso.");
          menu(usuarios);
          break;
        case 5:
          sistema(usuario);
          break;
    }
    
  }

  public static void veiculos(Usuario usuario){
  
  }
  
}