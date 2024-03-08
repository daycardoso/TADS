import java.util.Scanner;

public class Lista4{
    public static void main(String[] args){
        // area triangulo = base * altura / 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento da base do triagulo:");

        float base = scanner.nextFloat();

        System.out.println("Digite a altura do triangulo:");

        float altura = scanner.nextFloat();

        float area = (float) base * altura / 2;

        System.out.println("A area do triangulo é:" + area);
        
        scanner.close();
    }
}