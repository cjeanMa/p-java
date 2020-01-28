package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 15;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else
            System.out.println("No es posible agregar mas de: "+ MAX_COMPUTADORAS);
    }
    
    public void mostrarOrden(){
        System.out.println("Numero de orden:" + this.getIdOrden());
        System.out.println("Computadoras almacenadas: ");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("Numero" + (i+1) + "-->" + this.computadoras[i].toString());
        }
    }

    public int getIdOrden() {
        return idOrden;
    }

    public Computadora[] getComputadoras() {
        return computadoras;
    }

    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }

    public int getContadorComputadoras() {
        return contadorComputadoras;
    }

    public static int getMAX_COMPUTADORAS() {
        return MAX_COMPUTADORAS;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", computadoras=" + computadoras + ", contadorComputadoras=" + contadorComputadoras + '}';
    }
    
    
}
