import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        double n1, n2, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        n1 = in.nextDouble();
        System.out.println("Digite um número:");
        n2 = in.nextDouble();

        in.close();

        result = (n1 + n2) *2 /2;
        System.out.println("A média foi:" + result);
    }
}