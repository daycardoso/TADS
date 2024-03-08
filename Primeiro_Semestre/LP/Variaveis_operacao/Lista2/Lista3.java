/*
 *  Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
    positivo)
 */
import java.util.Scanner;
public class Lista3 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número:");

        float valor = in.nextFloat();

        if(valor >= 0){
            System.out.println("O valor " + valor + " é positivo");
        }
        else{
            System.out.println("O valor " + valor + " é negativo");
        };

        in.close();

    }
}
