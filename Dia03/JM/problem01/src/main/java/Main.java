public class Main {
    public static void main(String[] args) {
        //Prueba basada en el enunciado del problema
        Numbers x = new Numbers(10);
        System.out.println("La suma de multiplos de 3 y 5 hasta el numero: "+ x.getNum()+" es ->" + x.SumaMultiplos());
        
        x.setNum(1000);
        System.out.println("La suma de multiplos de 3 y 5 hasta el numero: "+ x.getNum()+" es ->" + x.SumaMultiplos());
    }
}
