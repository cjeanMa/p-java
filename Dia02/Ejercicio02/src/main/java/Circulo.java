
public class Circulo {
    private double radio; 
    private static final double PI = 3.1416;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    public double calcularArea(){
        return Math.pow(PI*this.radio,2);
    }
    
    public double calcularLongitud(){
        return 2*PI*this.radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
