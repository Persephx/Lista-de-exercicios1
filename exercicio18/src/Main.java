import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor de 'a': ");
        double a = input.nextDouble();

        System.out.print("Informe o valor de 'b': ");
        double b = input.nextDouble();

        input.close();

        if (a == 0) {
            if (b == 0) {
                System.out.println("A equação é indeterminada: possui infinitas soluções.");
            } else {
                System.out.println("A equação é impossível: não possui solução.");
            }
        } else {
            double x = -b / a;
            System.out.println("A solução da equação é x = " + x);
        }
    }
}