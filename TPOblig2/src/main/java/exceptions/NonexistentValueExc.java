package exceptions;

public class NonexistentValueExc extends Exception{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public NonexistentValueExc(){
        this.message = "The value does not exists.";
    }
}
