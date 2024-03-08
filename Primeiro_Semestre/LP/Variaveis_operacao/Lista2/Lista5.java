/*
 * Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
    eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
    mensagem de erro.
 */
import java.util.Scanner;

public class Lista5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois valores reais, sendo o primeiro o dividendo e segundo o divisor:");

        float dividendo = in.nextFloat();
        float divisor = in.nextFloat();

        if(divisor != 0){
            float resultado = dividendo / divisor;
            System.out.println("O resultado da divisão é: " + resultado);
        }
        else{
            System.out.println("Não é possivel fazer divisão por zero. Por favor digite um divisor diferente de zero!");
        }

    }
}
