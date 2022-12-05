package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WordArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[3];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj kolejny napis");
            array[i] = input.nextLine();
        }

        System.out.println("Podaj indeks");

        try {
            int index = input.nextInt();
            System.out.println(array[index]);
        } catch (InputMismatchException e) {
            System.out.println("Musisz podać liczbę");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks zbyt duży lub ujemny");
        }
    }
}
