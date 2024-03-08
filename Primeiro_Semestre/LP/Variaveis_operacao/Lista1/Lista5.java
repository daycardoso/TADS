import java.util.Scanner;

public class Lista5{
    public static void main(String[] args){
        // Converter de Fahrenheint para Celcius

        Scanner scanner = new Scanner(System.in);

        float fahrenheint;
        System.out.println("Digite a temperatura em Fahrenheit:");

        fahrenheint = scanner.nextFloat();

        float celcius = (float) (fahrenheint - 32) / 9 * 5;

        System.out.println("A temperatura em Fahrenheint " + fahrenheint + ", convertida para Celcius é:" + celcius);
        
        scanner.close();
    }
}