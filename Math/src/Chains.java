public class Chains {//Łańcuchy

    public static void main(String[] args) {

        String welcome = "Welcome";
        String w = welcome.substring(0,3);
        String q = (String) welcome.subSequence(0,5);
        System.out.println(welcome + " " + w + " " + q);

        String expletive = "Brzydkie słowo";
        String PG13 = "Usunięto";
        String message = expletive + " " + PG13;
        System.out.println("Konkatenacja = " + message);

        System.out.println("Equals do porównania wartości łańcuchów true lub false"+ expletive.equals(PG13));
    }

}
