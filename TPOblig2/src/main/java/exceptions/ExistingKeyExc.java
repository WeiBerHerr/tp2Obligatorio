package exceptions;

public class ExistingKeyExc extends Exception {
    private String message;

    public ExistingKeyExc(){
        this.message = "The key already exists.";
    }

    public String getMessage() {
        return message;
    }
}
