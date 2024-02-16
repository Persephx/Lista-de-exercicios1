import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu valor em milímetros:");
        number = in.nextDouble();

        in.close();
        
        result = number / 25.4;
        System.out.println("O resultado em polegada é:" + result);
    }
}