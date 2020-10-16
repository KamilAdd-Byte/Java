public class UnknowOperationExeption extends RuntimeException{
    public UnknowOperationExeption(String message) {//Konstruktor obsługuje wysłanie wiadomości.
        super(message);
    }
}
