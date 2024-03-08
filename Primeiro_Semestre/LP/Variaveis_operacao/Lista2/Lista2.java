/*
 * Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
    calcular e escrever a área e o perímetro do retângulo.
 */
import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a base e a altura do retângulo:");

        float base = in.nextFloat();
        float altura = in.nextFloat();

        float area = base * altura;
        float perimetro = 2 * base + 2 * altura;

        System.out.println("A area do retângulo é igual a: " + area + ". E o perimetro do retângulo é igual a: " + perimetro);
        
        in.close();
        
    }
    
}
