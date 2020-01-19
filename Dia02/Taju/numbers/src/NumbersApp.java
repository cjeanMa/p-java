public class NumbersApp {
    private int num1;
    private int num2;
    private int num3;

    public NumbersApp (int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public boolean isEqual() {
        return this.num1 == this.num2;
    }

    public boolean isPositive() {
        return this.num3 > 0;
    }

    public boolean isMultiple() {
        return (this.num1 % this.num2) == 0;
    }
}
