import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");

        String nome = scanner.nextLine();
        
        System.out.println("Seu nome é: " + nome);

        System.out.println("Digite 's' para receber a mensagem.");

        String resposta = scanner.nextLine();
        
        if ( resposta.equals("s")){
            System.out.println("Olá, " + nome + "!" + "Hello World!" + "Seja bem vindo ao mundo do Java!");
        }
        else{

            System.out.println(" Poxa cara, que mancada ein!");

        }

        scanner.close();


    }
}