
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("INSERTE EL RADIO DEL CIRCULO:");
        double radio = Double.parseDouble(t.nextLine());
        Circulo x = new Circulo(radio);
        System.out.println("Area del circulo = " + x.calcularArea());
        
    }   
}
