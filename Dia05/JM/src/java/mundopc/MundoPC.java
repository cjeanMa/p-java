package mundopc;
import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args){
        //Datos ejemplo para tipo de entra y marca
        String[] tipoEntrada = {"USB", "PS/1" ,"PS/2", "MINI-USB"};
        String[] marcas = {"logitech", "smart" ,"daewo", "HP"};    
        //Inicializamos e instanciamos los objeteos necesarios para crear nuestro objeto Orden
        Monitor mon1 = new Monitor(marcas[2], 15.0);
        Monitor mon2 = new Monitor(marcas[3], 15.0);
        Monitor mon3 = new Monitor(marcas[0], 15.0);
        Raton raton1 = new Raton(tipoEntrada[0],marcas[0]);
        Raton raton2 = new Raton(tipoEntrada[1],marcas[2]);
        Raton raton3 = new Raton(tipoEntrada[3],marcas[1]);
        Teclado teclado1 = new Teclado(tipoEntrada[3], marcas[3]);
        Teclado teclado2 = new Teclado(tipoEntrada[2], marcas[3]);
        Teclado teclado3 = new Teclado(tipoEntrada[1], marcas[3]);
        
        Computadora com1 = new Computadora("Robertito", mon1, teclado1, raton1);
        Computadora com2 = new Computadora("juancito", mon2, teclado2, raton2);
        Computadora com3 = new Computadora("alancito", mon3, teclado3, raton3);
        
        //Pruebas con dos objetos de tipo Orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(com1);
        orden1.agregarComputadora(com2);
        orden1.agregarComputadora(com3);
        
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(com2);
        orden2.agregarComputadora(com3);
        orden2.agregarComputadora(com1);
        
        orden2.mostrarOrden();
    }
}
