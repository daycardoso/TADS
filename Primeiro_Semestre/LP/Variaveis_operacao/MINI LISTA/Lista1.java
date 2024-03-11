/*
 * Conversão de Tipos: Peça ao usuário para inserir dois números: um inteiro e
    um decimal (float). Em seguida, converta o número inteiro em um tipo float e
    o número decimal em um tipo inteiro, e imprima ambos.
 */
import java.util.Scanner;

public class Lista1{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite respectivamente um numero inteiro e um decimal:");

        int inteiro = in.nextInt();
        float decimal = in.nextFloat();

        float int2dec = (float) inteiro;
        int dec2int = (int) decimal;

        System.out.println("Covertidos: " + int2dec + "\n" + dec2int);

        in.close();
    }
}