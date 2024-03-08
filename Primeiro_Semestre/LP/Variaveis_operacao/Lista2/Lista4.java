/*
 * Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
    deles é o maior, imprimindo na resposta o nome da variável e o seu valor.
 */

import java.util.Scanner;

public class Lista4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois numeros diferentes:");

        float numero1 = in.nextFloat();
        float numero2 = in.nextFloat();

        float compara = numero1 - numero2;

        if(compara > 0){

            System.out.println("A variavel numero1 é a maior com o valor de " + numero1);

        }
        else{
            System.out.println("A variavel numero2 é a maior com o valor de " + numero2);
        };

        in.close();
    }
}
