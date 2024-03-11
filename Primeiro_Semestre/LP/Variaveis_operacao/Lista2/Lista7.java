/*
 * Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
    e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
    referido mês e qual será seu salário atual. Calcule também o salário líquido
    (desconto de impostos) considerando 15% de impostos e mostre esses valores.
    a. Pergunte ao usuário qual a % de imposto que é descontada do salário.
 */
import java.util.Scanner;
public class Lista7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora, qual o valor da sua hora e quantos porcento é descontado do seu salario:");
        float sal_hora = in.nextFloat();
        float hora_mes = in.nextFloat();
        float desconto = in.nextFloat();

        float sal_bruto = sal_hora * hora_mes;
        float sal_liquido = sal_bruto * (1 - (desconto / 100));

        System.out.println("O seu salario bruto é de: " + sal_bruto + " e o salario liquido com " + desconto + "% de desconto é " + sal_liquido + ".");

        in.close();
        
    }
}
