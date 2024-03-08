import java.util.Scanner;
/* 
 * Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
    * A entrada de dados será:
    * ● Número total de eleitores;
    * ● Número de votos válidos;
    * ● Número de votos brancos;
    ● Número de votos nulos.
    O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
    relação ao total de eleitores):
    ● Percentual de votos válidos;
    ● Percentual de votos brancos;
    ● Percentual de votos nulos;
*/

public class Lista8 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nº total de eleitores, nº de votos validos, nº de votos brancos, nº numero de votos nulos:");

        int eleitores = scanner.nextInt();
        int validos = scanner.nextInt();
        int brancos = scanner.nextInt();
        int nulos = scanner.nextInt();

        float percent_validos = (float) validos / eleitores * 100;
        float percent_brancos = (float) brancos / eleitores * 100;
        float percent_nulos = (float) nulos / eleitores * 100;


        System.out.println("O percentual de votos validos é: " + percent_validos + "%.\n O percentual de votos brancos é:" + percent_brancos + "%.\n O percentual de votos nulos é:" + percent_nulos + "%.");
        // System.out.printf("Valor: %.2f", percent_brancos);
        scanner.close();
    }
}
