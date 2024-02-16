import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double n1, n2, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do raio da base do cilindro:");
        n1 = in.nextDouble();
        System.out.println("Digite o valor da altura do cilindro");
        n2 = in.nextDouble();

        in.close();

        result = (Math.PI * n1 * n1 * n2);
        System.out.println("O volume do cilindro é:" + result);
    }
}