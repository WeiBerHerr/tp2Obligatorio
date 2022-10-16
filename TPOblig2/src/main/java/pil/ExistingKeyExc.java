package pil;

public class ExistingKeyExc {
    private String message;

    public ExistingKeyExc(){
        this.message = "The key already exists.";
    }

    public String getMessage() {
        return message;
    }
}
