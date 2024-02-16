import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o raio do circulo:");
        Scanner in = new Scanner(System.in);
        double n1 = in.nextDouble();
        double result;
        result = Math.pow(n1, 2) * Math.PI;
        
        in.close();

        System.out.println("A área do círculo é:" + result);
    }
}