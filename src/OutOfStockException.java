public class OutOfStockException extends Exception {
    @Override
    public String getMessage(){
        return "Товар закінчився.";
    }
}
