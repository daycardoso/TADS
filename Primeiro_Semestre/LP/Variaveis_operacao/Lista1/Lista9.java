/*
    Considere que você deseja uma comemoração especial para o seu aniversário e
    assim irá convidar familiares a amigos para um churrasco na sua residência. Você
    irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
    de uma forma de calcular a quantidade certa a ser adquirida.
    Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
    bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
    consomem uma quantidades diferentes de carne.
    Consumo de carne médio
    (http://www.embaixadordochurrasco.com.br/calculochurrasco):
    Homens: 400 gramas
    Mulheres: 320 gramas
    Crianças: 200 gramas
    *Observação: geralmente é adicionada uma margem de segurança na quantidade
    de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
    de 20% no total de carne a ser adquirida.
 */
import java.util.Scanner;

public class Lista9 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        final int G_HOMENS = 400;
        final int G_MULHERES = 320;
        final int G_CRIANCA = 200;

        System.out.println("Digite quantos homens, mulheres e crianças iram ao seu churrasco:");

        int homens = scanner.nextInt();
        int mulheres = scanner.nextInt();
        int crianca = scanner.nextInt();

        float total_g = (float) ((homens * G_HOMENS) + (mulheres * G_MULHERES) + (crianca *G_CRIANCA)) * 1.2f;
        float total_k = total_g / 1000f;

        System.out.println("Você precisa comprar:" + total_k + " Kg de carne sem osso.");

        scanner.close();

    }
}
