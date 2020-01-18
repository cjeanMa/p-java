public class Main {
    public static void main(String[] args) {
        Rectangulo x = new Rectangulo(10.5,14.2);
        System.out.println("el area es:" + x.calcularArea() + "m2");
        System.out.println("el perimetro es:" + x.calcularPerimetro()+"m");
    }
}
