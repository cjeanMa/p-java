import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        var num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        var num2 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        var num3 = scanner.nextInt();
        NumbersApp compare = new NumbersApp(num1, num2, num3);

        // Comparación de dos números
        if (compare.isEqual()) {
            System.out.println("Los números " + num1 + " y " + num2 + " son iguales");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son iguales");
        }

        // Validar si un número es positivo o no
        if (compare.isPositive()) {
            System.out.println("El número " + num3 +  " es positivo");
        } else {
            System.out.println("El número " + num3 +  " es negativo");
        }

        // Verificar si dos números son múltiplos
        if (compare.isMultiple()) {
            System.out.println("Los números " + num1 + " y " + num2 + " son múltiplos");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son múltiplos");
        }
    }
}
