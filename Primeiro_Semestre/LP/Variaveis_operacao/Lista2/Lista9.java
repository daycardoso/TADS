/*
 * Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
    mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692
 */

import java.util.Scanner;

public class Lista9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio de uma circunferência:");

        float raio = in.nextInt();

        final float PI = 3.141692f;

        float diametro = 2 * raio;
        float comprimento =  2 * PI * raio;
        float area = PI * (raio * raio);

        System.out.println("Uma circunferência de raio " + raio + " tem " + diametro + " de diâmetro, " + comprimento + " de comprimentro  e " + area + " de area.");



    }
}
