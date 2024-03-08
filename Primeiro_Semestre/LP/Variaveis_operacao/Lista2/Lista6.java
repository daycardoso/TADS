/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
    e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
    dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
    a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que
    o usuário informe sua data de nascimento e o sistema irá calcular quantos
    anos, meses e dias a pessoa viveu.
 */

// import java.util.Scanner;


// public class Lista6 {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);

//         System.out.println("Digite sua idade expressa em anos, meses e dias:");

//         final int ano = 365;
//         final int mes = 30;

//         int anos = in.nextInt();
//         int meses = in.nextInt();
//         int dias = in.nextInt();

//         int total = ano * anos + meses * mes + dias;

//         System.out.println("Você ja viveu " + total + "dias.");
//     }
// }

import java.util.Scanner;
import java.util.Date;

public class Lista6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Date data = new Date(in.next());

        System.out.println(data);
        in.close();
        
    }
}