package exceptions;

public class RepeatedValueExc extends Exception{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public RepeatedValueExc(){
        this.message = "Value repeated three times or more.";
    }
}
