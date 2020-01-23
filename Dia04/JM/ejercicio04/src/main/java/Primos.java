
import java.util.regex.*;

public final class Primos {

    public static void buscarPrimos(long x){
            for (long i = 2; i <= x; i++) {
              double res = (double)x / (double)i;
                if (calcInteger(Double.toString(res))) {
                    if(res == 1){
                        System.out.println(x);
                    }
                    else{
                        buscarPrimos(i);
                        buscarPrimos((long)res);
                        break;
                    }
                }
            }
    }

    public static boolean calcInteger(String x){
        Pattern p = Pattern.compile("[0-9]\\.0$");
        Matcher m = p.matcher(x);
        if (m.find())
            return true;
        else
            return false;
    }
}
