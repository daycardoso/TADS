import java.util.Scanner;

public class Lista6{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");

        float primeira_nota = scanner.nextFloat();

        System.out.println("Digite a segunda nota do aluno:");

        float segunda_nota = scanner.nextFloat();

        float media = (float) (primeira_nota + segunda_nota) / 2;

        System.out.println("A media das duas notas do aluno é:" + media);

        scanner.close();
    }
}