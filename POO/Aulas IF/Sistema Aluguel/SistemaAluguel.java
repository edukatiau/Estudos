import java.util.Scanner;

public class SistemaAluguel{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        List<Usuario> usuarios = new ArrayList<Usuario>;

        usuarios.add(new Usuario("edu", "edu", "123"));
    }

    public static login(ArrayList<Usuario> usuarios){
        String log = sc.next();
        String pass = sc.next();

        for(Usuario u: usuarios){
            if(log.equals(u.getLogin()) && pass.equals(u.getSenha())){
                System.out.println("Logado")
            }
        }
    }
}