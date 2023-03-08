package pl.javastart.task;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minValue = 100;
        int maxValue = 200;
        int userChoice;
        int divider = 3;

        do {
            System.out.println("Podaj liczbę:");
            userChoice = sc.nextInt();
            if (userChoice > maxValue) {
                System.out.println("Podana liczba jest za duża");
            } else if (userChoice < minValue) {
                System.out.println("Podana liczba jest za mała");
            } else if (userChoice % divider != 0) {
                System.out.println("Liczba nie jest podzielna przez " + divider);
            }
        } while ((userChoice < minValue) || (userChoice > maxValue) || (userChoice % divider != 0));
        System.out.println("Twoja liczba jest ok");
    }
}
