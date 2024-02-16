import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double n1, n2, n3, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial do corpo (em m/s):");
        n1 = in.nextDouble();
        System.out.println("Digite a aceleração do corpo (em m/s²):");
        n2 = in.nextDouble();
        System.out.println("Digite o tempo de percurso do corpo (em segundos):");
        n3 = in.nextDouble();

        in.close();

        result = ( n1 + n2 * n3);
        System.out.println("A velocidade final do corpo é:" + result);
        }
    }
