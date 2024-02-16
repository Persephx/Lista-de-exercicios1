import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu valor em milhas:");
        number = in.nextDouble();

        in.close();
        
        result = number * 1.609;
        System.out.println("O resultado em Km/h é:" + result);
    }
}