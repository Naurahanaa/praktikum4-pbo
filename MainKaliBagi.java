import java.util.InputMismatchException;
import java.util.Scanner;

public class MainKaliBagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan a1: ");
            double a1 = input.nextDouble();

            System.out.print("Masukkan a2: ");
            double a2 = input.nextDouble();

            KaliBagi kb = new KaliBagi(a1, a2);

            System.out.println(a1 + " x " + a2 + " = " + kb.kali());

            try {
                System.out.println(a1 + " / " + a2 + " = " + kb.bagi());
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Inputan harus angka!!");
        }
    }
}