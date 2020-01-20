public class Serie {
        private int aux1 = 1;
        private int aux2 = 2;
        private int sum = 0;
    
    public int fiboMax(long max){
        
        if (max < 3) {
            return sum;
        }
        else {
            sum += aux2;
            for (int i = 1; (aux1 + aux2) <= max; i++) {
                if (i%2==1) {
                    aux1 += aux2;
                    if ((esPar(aux1))) {
                        sum += aux1;
                    }
                }
                else{
                    aux2 += aux1;
                    if (esPar(aux2)) {
                        sum += aux2;
                    }
                }
            }
        }      
        return sum;
    }
    public static boolean esPar(int x){
       if(x%2==0)
            return true;
       else
            return false;
    }
}
