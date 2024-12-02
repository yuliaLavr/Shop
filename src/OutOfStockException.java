public class OutOfStockException extends Exception {
    @Override
    public String getMess(){
        return "Товар закінчився.";
    }
}
