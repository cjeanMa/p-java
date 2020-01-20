public class Numbers {
    private int num;
    public static final int n3 = 3;
    public static final int n5 = 5;
    public Numbers(int num){
        this.num = num;
    }
    public int SumaMultiplos(){
        int result = 0;
        for(int i=0; i<this.num; i++){
            if (i%n3==0||i%n5==0) {
                result += i;
            }
        }
        return result;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
