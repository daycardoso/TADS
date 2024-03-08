/*
 * . Desenvolva um algoritmo que será utilizado para automatizar o cálculo do público e
    da renda total de um evento esportivo. Este evento esportivo possui um valor fixo
    cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre
    o evento possuem um desconto de 30% no valor do ingresso e as crianças menores
    de 10 anos não pagam ingresso. Baseado nos dados acima apresentados o usuário
    deverá digitar 4 informações de
    entrada para o sistema, são elas:
    - Valor de cada ingresso
    - Número de pessoas (público do evento) que são sócias do clube
    - Número de pessoas (público do evento) não pagantes (menores de 10
    anos)
    - Número de pessoas (público do evento) pagantes (sem desconto algum)
    O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento
    e o valor que deixou de ser arrecadada devido aos descontos e isenções.
 */
import java.util.Scanner;

public class Lista10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual o valor deo ingresso, nº de socios, nº pagantes, nº de crianca:");
        
        float ingresso = scanner.nextFloat();
        int socios = scanner.nextInt();
        int pagantes = scanner.nextInt();
        int crianca = scanner.nextInt();

        int total = socios + pagantes + crianca;
        float renda_total = (float) pagantes * ingresso + socios * ingresso * 0.7f;
        float n_arrecadado = (float) socios * ingresso * 0.3f + crianca * ingresso;

        System.out.println("O publico total foi de " + total + ", a renda total do evento foi de " + renda_total + "e o valor que deixou de ser arrecadada devido aos descontos e isenções foi " + n_arrecadado);


        scanner.close();
    }
}
