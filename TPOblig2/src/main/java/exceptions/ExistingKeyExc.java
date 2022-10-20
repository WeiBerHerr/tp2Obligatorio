package TPOblig2.src.main.java.exceptions;

public class ExistingKeyExc extends java.lang.Exception {
    private String message = "ya existe este key, agregue otro";

    public ExistingKeyExc(){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void printStackTrace(String message) {


    }
}
