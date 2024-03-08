import java.util.Scanner;

public class Lista2{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero real:");

        float real = scanner.nextFloat();

        // System.out.println(real);
        
        float comVinte = real * 1.2f;

        System.out.println("Valor atualizado com 20%:" + comVinte);

        scanner.close();
    }
}