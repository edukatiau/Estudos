import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(new Usuario("edu", "edu", "123"));
        login(usuarios);
    }

    public static void login(ArrayList<Usuario> usuarios){
        String log = sc.nextLine();
        String pass = sc.nextLine();

        for(Usuario u: usuarios){
            if(log.equals(u.getLogin()) && pass.equals(u.getSenha())){
                System.out.println("Logado");
            }
        }
    }
}