import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio de la cicunferencia");
        var rad = scanner.nextDouble();
        Circle circle = new Circle(rad);
        System.out.println("El área de la circunferencia es: " + circle.getArea());
        System.out.println("El diámetro de la circunferencia es: " + circle.getDiameter());
    }
}
