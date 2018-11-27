package pl.sda.group2.intermediate;

class IDontEatException extends RuntimeException {
    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public IDontEatException() {
        super("I don't eat");
    }
}
