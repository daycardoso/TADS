/*
 * Operações com Caracteres: Solicite ao usuário para digitar um único
    caractere. Imprima o código ASCII desse caractere e, em seguida, converta o
    caractere para maiúsculo se for uma letra minúscula, ou para minúsculo se
    for uma letra maiúscula. Imprima o resultado.
*/

import java.util.Scanner;

public class Lista4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Informe uma letra:");
        char letra = in.next().charAt(0);
        int ascii = letra;
        int convertida;
        char letra_conv;

        // 

        System.out.println("O caracter '" + letra + "' em ASCII é " + ascii);

        if(ascii < 97){
            System.out.println(ascii);
            convertida = (ascii + 32);
            letra_conv = (char) convertida;
        }
        else{
            convertida = (ascii - 32);
            letra_conv = (char) convertida;
        }
        System.out.println(letra_conv);
        

        in.close();



    }
}
