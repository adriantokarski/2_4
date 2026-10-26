import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wybierz działanie w kalkulatorze (1 - suma, 2 - różnica, 3 - iloczyn, 4 - iloraz): ");
        int wybierz = scanner.nextInt();

        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        switch (wybierz) {
            case 1:
                System.out.println("Wynik: " + (a + b));
                break;
            case 2:
                System.out.println("Wynik: " + (a - b));
                break;
            case 3:
                System.out.println("Wynik: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Error liczba podzielona przez 0");
                } else {
                    System.out.println("Wynik: " + (a / b));
                }
                break;
            default:
                System.out.println("Error: Nieprawidłowy wybór działania.");
        }

        scanner.close();
    }
}