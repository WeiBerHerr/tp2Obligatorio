package exceptions;

public class NonexistentKeyExc extends Exception{
    private String message;

    public NonexistentKeyExc(){
        this.message = "The key does not exists.";
    }

    public String getMessage() {
        return message;
    }
}
