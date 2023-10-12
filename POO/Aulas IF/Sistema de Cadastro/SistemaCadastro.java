public class SistemaCadastro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        String login = sc.next();
        String senha = sc.next();

       Usuario user = new Usuario(name, age, login, senha);

       System.out.println(user);
    }
}