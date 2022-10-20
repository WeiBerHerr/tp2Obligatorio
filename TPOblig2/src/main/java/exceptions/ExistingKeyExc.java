package exceptions;

public class ExistingKeyExc extends Exception {
    private String message;

    public String getMessage() {
        return message;
    }

    public ExistingKeyExc(){
        this.message = "The key already exists.";
    }


}
