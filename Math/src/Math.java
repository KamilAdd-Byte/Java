public class Math {
    public static void main(String[] args) {

        int x = 9;
        int a = 6;
        int b = 12;
        double z = 9.6734;
        int y = (int) java.lang.Math.sqrt(x);

        int result = a += (b += x);

        System.out.println("Metoda sqrt = "+y);

        int q = (int) java.lang.Math.sin(x);
        System.out.println("Sin dla x = " + x);

        int nz = (int)z;
        int zz = (int) java.lang.Math.round(z);
        System.out.println("Rzutowanie typu int na double = "+nz);
        System.out.println("Rzutowanie typu int na zmienna double Math.round do najblizszej liczby całkowitej = " + zz);
        System.out.println("Pierwszeństwo operatorów = " + result);
    }
    //Klasa Math zawiera zestaw funkcji matematycznych, które mogą być bardzo przydatne przy
    //pisaniu niektórych rodzajów programów.
    //Do wyciągania pierwiastka stopnia drugiego z liczby służy metoda sqrt

}
