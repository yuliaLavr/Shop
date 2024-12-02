public class IncorrectInfAnimalException extends Exception{
    @Override
    public String getMessage(){
        return "Некоректні дані про тварину.";
    }
}
