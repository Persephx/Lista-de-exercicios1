import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base do triângulo:");
        n1 = in.nextDouble();
        System.out.println("Digite a altura do triângulo:");
        n2 = in.nextDouble();

        in.close();

        result = (n1 * n2) /2;
        System.out.println("A área é:" + result);
        }
    }
