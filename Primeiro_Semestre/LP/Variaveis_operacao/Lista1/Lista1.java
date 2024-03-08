import java.util.Scanner;

public class Lista1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        
        int inteiro = scanner.nextInt();

        int menos = -1;

        int antecessor = (int) inteiro + menos;

        System.out.println("O antecessor é: " + antecessor);
        scanner.close();
    }
}