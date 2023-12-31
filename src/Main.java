import agencia.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //instanciamento de objeto de Agencia quando concertarem a classe
        //hardcoding listaUsuario. adicionar metodo de adicao de usuario à classe Agencia depois
        LinkedList<Usuario> listaUsuarios = new LinkedList<Usuario>();
        LocalDate nascimento = LocalDate.of(1993,12,10);
        listaUsuarios.add(new Usuario("foo", "bar", "Sam", "06988005404", 99999999, "email@exemplo.com", nascimento));
        Agencia agencia = new Agencia("66320453000103", "Agencia de Turismo", 99999999, "email@exemplo.com", listaUsuarios, null, null, null, null);

        boolean flagLogin = false;
        String login, senha, nome, cpf, telefone, email;
        Scanner input = new Scanner(System.in);

        //while de login e cadastro
        while(flagLogin == false){
            System.out.println("Digite o numero do comando a ser executado.");
            System.out.println("1. Log in");
            System.out.println("2. Sign in");
            
            int choice = 0;
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            
            switch (choice) {
                case 1:
                    //logica de login
                    System.out.println("Digite usuario para login:");
                    login = input.nextLine();
                    System.out.println("Digite senha para login:");
                    senha = input.nextLine();
        
                    //logica de login
                    flagLogin = agencia.logIn(login, senha);
                    break;
                case 2:
                    //sign in
                    //criação de novo usuario para ser salvo em agencia.ListaUsuario
                    Usuario cliente = new Cliente();
                    System.out.println("Digite usuario para login:");
                    cliente.setLogin(input.nextLine());
                    // login = input.nextLine();
                    System.out.println("Digite senha para login:");
                    cliente.setSenha(input.nextLine());
                    System.out.println("Digite nome para usuario:");
                    cliente.setNome(input.nextLine());
                    System.out.println("Digite cpf para usuario");
                    cliente.setCpf(input.nextLine());
                    System.out.println("Digite telefone para usuario");
                    cliente.setTelefone(Integer.parseInt(input.nextLine()));
                    System.out.println("Digite email para usuario");
                    cliente.setEmail(input.nextLine());
                    System.out.println("Digite data de nascimento para usuario('dd/MM/YYYY')");
                    String dataUsuario = input.nextLine(); 
                    LocalDate nascimentoUsuario = LocalDate.of(Integer.parseInt(dataUsuario.split("/")[2]),Integer.parseInt(dataUsuario.split("/")[1]),Integer.parseInt(dataUsuario.split("/")[0]));
                    agencia.adicionarUsuario(cliente);
                    flagLogin = false;
                    break;
                default:
                    System.out.println("Por favor digite numero de comando valido.");
                    flagLogin = false;
    
                    break;
            }
        }
        //fim do while de login e cadastro
        System.out.println("inicio do segundo menu");



    }
}
