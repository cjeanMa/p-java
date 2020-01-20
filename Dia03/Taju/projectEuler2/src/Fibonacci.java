public class Fibonacci {
    private int numbMax = 4000000;
    private int suma = 0;
    private int ant = 1;
    private int act = 1;
    private int antAct;
    public Fibonacci(int max, int ant, int act) {
        this.numbMax = max;
        this.suma = 0;
        this.ant = ant;
        this.act = act;
    }

    public int fibonacci()
    {
        this.antAct = ant + act;
        while(this.antAct < this.numbMax){
            this.suma += this.antAct;
            this.ant = this.act + this.antAct;
            this.act = this.ant + this.antAct;
            this.antAct = this.ant + this.act;
        }

        return suma;
    }
}
