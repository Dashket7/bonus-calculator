package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long expected = 30;
        long actual = service.calculate(1000, true);
        //System.out.println(actual);
        expected = 500;
        actual = service.calculate(1_000_000, true);
        expected = 10;
        actual = service.calculate(1000, false);
        expected = 500;
        actual = service.calculate(1_000_000, false);

    }
}