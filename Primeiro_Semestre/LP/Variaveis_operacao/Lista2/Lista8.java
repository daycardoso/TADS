/*
 * Escreva um algoritmo para ler o número total de eleitores de um município, o
    número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
    cada um representa em relação ao total de eleitores
 */
import java.util.Scanner; 

public class Lista8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite respectivamente o número de eleitores, votos brancos, nulos e validos:");
        int total = in.nextInt();
        int brancos = in.nextInt();
        int nulos = in.nextInt();
        int validos = in.nextInt();

        float percentual_branco = brancos * 100 / total;
        float percentual_nulos = nulos * 100 / total;
        float percentual_validos = validos * 100 / total;

        System.out.println("Percentual de votos brancos é de: " + percentual_branco + "%. \n O percentual de votos nulos é de: " + percentual_nulos + "%. \n O percentual de votos válidos é de:" + percentual_validos + "%.");

        in.close();
    }
    
}
