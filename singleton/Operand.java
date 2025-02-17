public enum Operand {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*");

    public final String label;

    private Operand(String label){
        this.label = label;
    }
}
