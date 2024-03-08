/*
 * Faça um algoritmo que converta metros para centímetros. Lembrando que 1m =
    100cm
 */
import java.util.Scanner;

public class Lista1{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        final int conversor = 100;

        System.out.println("Digite a medida em metros:");

        float metros = in.nextFloat();

        float centimetros = metros * conversor;

        System.out.println(metros + "m equivale a " + centimetros + "cm.");

        in.close();
    }
}