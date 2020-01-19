public class NumbersApp {
    private int num1;
    private int num2;
    private int num3;

    public NumbersApp (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public boolean isEqual() {
        return this.num1 == this.num2;
    }
}
