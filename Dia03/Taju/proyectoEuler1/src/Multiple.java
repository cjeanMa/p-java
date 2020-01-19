public class Multiple {
    private int numb;
    private int max = 999;
    public Multiple (int numb) {
        this.numb = numb;
    }

    public int sumMultiple(){
        int n = this.max / this.numb;
        return this.numb * (n * (n + 1)) / 2 ;
    }
}
