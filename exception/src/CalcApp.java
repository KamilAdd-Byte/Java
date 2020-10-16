import java.util.Locale;
import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //wczytywanie danych z kropką

        double x = 0;
        double y = 0;
        String operator=null;

        boolean readComplete = true;
        try {
            System.out.println("Podaj 1 liczbę");
            x = sc.nextDouble();
            sc.nextLine();
            System.out.println("Podaj 2 liczbę");
            y = sc.nextDouble();
            sc.nextLine();
        }catch (RuntimeException runtimeException){
            System.out.println("Coś poszło nie tak");
        }

    }
}
