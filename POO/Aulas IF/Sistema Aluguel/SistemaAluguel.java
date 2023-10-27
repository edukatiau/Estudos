import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

  public class SistemaAluguel{
  static Scanner sc = new Scanner(System.in);
  static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
  static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
    
  public static void main(String[] args){

    Usuario user1 = new Usuario("edu", "edu", "123");
    usuarios.add(user1);
    Veiculo veiculo1 = new Veiculo("Disney", "Relampago Marquinhos", "vermelho", "2023", user1);
    veiculos.add(veiculo1);
    user1.addMeusVeiculos(veiculo1);
    
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
    System.out.println("0 - Sair");

    int escolha = sc.nextInt();

    switch(escolha){
      case 1:
        perfil(usuario);
        break;
      case 2:
        veiculos(usuario);
        break;
      case 0:
        System.out.println("Saindo...");
        break;
      default:
        System.out.println("Opção inválida!");
        sistema(usuario);
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
          String login = sc.next();
          usuario.setLogin(login);
            System.out.println("Login alterado com sucesso.");
        sistema(usuario);
          break;
        case 3:
          System.out.println("Digite a nova senha: ");
          String senha = sc.next();
          usuario.setSenha(senha);
          System.out.println("Senha alterada com sucesso.");
          sistema(usuario);
          break;
        case 4:
          Iterator<Veiculo> iterator = usuario.getMeusVeiculos().iterator();
          while (iterator.hasNext()) {
            Veiculo veiculo = iterator.next();
            veiculos.remove(veiculo);
            iterator.remove();
            System.out.println("Veiculo excluido com sucesso.");
          }
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
    System.out.println("---Veiculos---");
    System.out.println("Digite o número da opção desejada: ");
    System.out.println("1 - Cadastrar veiculo");
    System.out.println("2 - Listar meus veiculos");
    System.out.println("3 - Listar veiculos disponiveis");
    System.out.println("4 - Voltar");

    int escolha = sc.nextInt();
    switch(escolha){
      case 1:
        cadastroVeiculo(usuario);
        break;
      case 2:
        listaMeusVeiculos(usuario);
        break;
      case 3:
        listaVeiculosDisponiveis(usuario);
        break;
      case 4:
        sistema(usuario);
        //break;
    }
  }

  public static void cadastroVeiculo(Usuario usuario){
    System.out.println("---Cadastro Veiculo---");
    System.out.println("Digite o marca do veiculo: ");
    String marca = sc.next();
    System.out.println("Digite a modelo do veiculo: ");
    String modelo = sc.next();
    System.out.println("Digite o ano do veiculo: ");
    String ano = sc.next();
    System.out.println("Digite o cor do veiculo: ");
    String cor = sc.next();

    Veiculo veiculo = new Veiculo(marca, modelo, cor, ano, usuario);
    
    veiculos.add(veiculo);
    usuario.addMeusVeiculos(veiculo);
    System.out.println("Veiculo cadastrado com sucesso.");
    veiculos(usuario);
    //break;
  }

  public static void listaMeusVeiculos(Usuario usuario){
    System.out.println("---Meus Veiculos---");
    int i = 1;
    for(Veiculo veiculo : usuario.getMeusVeiculos()){
      if(usuario.getMeusVeiculos().get(0) != null){
        System.out.printf("Veiculo %d\n", i);
        System.out.println(veiculo.toString());
        System.out.println("----------------");
        i++;
      }else{
        System.out.println("Você não tem veiculos.");
      }
    }

    System.out.println("Digite o número da opção desejada: ");
    System.out.println("1 - Por para alugar veiculo");
    System.out.println("0 - Voltar");

    int escolha = sc.nextInt();
    switch(escolha){
      case 1:
        porAlugarVeiculo(usuario.getMeusVeiculos());
      case 0:
        veiculos(usuario);
        break;
    }
  }

  public static void porAlugarVeiculo(ArrayList<Veiculo> veiculos){
    System.out.println("---Por Para Alugar Veiculo---");
    System.out.println("Digite o numero do veiculo que deseja por para alugar: ");
    int numero = sc.nextInt();
    Veiculo veiculo = veiculos.get(numero - 1);
    System.out.println("Digite o valor do aluguel por diária: ");
    double valor = sc.nextDouble();

    veiculo.setDisponivel(true);
    veiculo.setValorDiaria(valor);
    System.out.println("Veiculo disponível para alugar.");
    
  }
    
  public static void listaVeiculosDisponiveis(Usuario usuario){
    System.out.println("---Veiculos Disponiveis---");
    int i = 1;
    for(Veiculo veiculo : veiculos){
      if(veiculo.isDisponivel() == true){
        System.out.printf("Veiculo %d\n", i);
        System.out.println(veiculo.toString());
        System.out.println("----------------");
        i++;
      }
    }

    System.out.println("Digite o número da opção desejada: ");
    System.out.println("1 - Alugar veiculo");
    System.out.println("0 - Voltar");
    int escolha = sc.nextInt();
    switch(escolha){
        case 1:
        alugarVeiculo(usuario);
        case 0:
        veiculos(usuario);
        break;
    }
  }

  public static void alugarVeiculo(Usuario usuario){
      System.out.println("---Alugar Veiculo---");
      System.out.println("Digite o número do veiculo que deseja alugar: ");
      int numero = sc.nextInt();
      int index = 0;
      for (int i = 0; i < veiculos.size(); i++) {
        Veiculo veiculo = veiculos.get(i);
        if (veiculo.isDisponivel()) {
          if (index + 1 == numero) {
            veiculo.setLocatario(usuario);
            veiculo.setAlugado(true);
            veiculo.setDisponivel(false);
            System.out.println("Veiculo alugado com sucesso.");
            return;
          }
          index++;
        }
      }
      System.out.println("Veiculo não encontrado.");
    }
  
}
