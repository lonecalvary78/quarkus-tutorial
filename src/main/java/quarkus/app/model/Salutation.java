package quarkus.app.model;

public class Salutation {
    private final String message;

    public Salutation(String message) {
        this.message=message;
    }

    public String getMessage() {
        return message;
    }
}
