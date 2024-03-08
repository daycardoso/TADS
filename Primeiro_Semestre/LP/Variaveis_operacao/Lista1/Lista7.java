import java.util.Scanner;

public class Lista7{
/*
Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
média da viagem, informe o tempo que uma família levará saindo de sua cidade de
férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
calculado. 
*/
    public static void main(String[] args){
        // tempo = distancia percorrida / pela taxa
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a distancia do trajeto e qual sera a velocidade media da viagem em Km/h:");
        
        float distancia =  scanner.nextFloat();
        float delta = scanner.nextFloat();

         
        float tempo = (float) distancia / delta;

        System.out.println("O tempo gasto na viajem sera de: " + tempo + " horas.");

        scanner.close();
        
    }
        
}