/*
 * Concatenação de Strings: Peça ao usuário para digitar dois nomes.
    Concatene (junte) esses nomes com um espaço entre eles e imprima o
    resultado.
 */

import java.util.Scanner;

public class Lista3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois nomes:");
        
        String nome1 = in.next();
        String nome2 = in.next();

        String concatenado = nome1 + " " + nome2;

        System.out.println("Nomes concatenados: " + concatenado);

        in.close();
    }
}
