import java.util.Scanner;
// import java.util.Math;

public class Lista3{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");

        int inteiro = scanner.nextInt();
    
        int quadrado = inteiro * inteiro;

        System.out.println("O quadrado do numero digitado é:" + quadrado);

        scanner.close();
    }
}