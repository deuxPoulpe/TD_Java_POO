package GemsSafe;

public class SafeWithCode extends Safe {
    private String code;

    public SafeWithCode(int capacity, String code) {
        super(capacity);
        this.code = code;
    }

    public void open(String enteredCode) {
        if (this.code.equals(enteredCode)) {
            super.open();
        } else {
            System.out.println("Incorrect code.");
        }
    }
}
