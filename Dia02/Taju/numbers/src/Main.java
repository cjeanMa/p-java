import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        var num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        var num2 = scanner.nextInt();
        NumbersApp compare = new NumbersApp(num1, num2);

        if (compare.isEqual()) {
            System.out.println("Los números " + num1 + " y " + num2 + " son iguales");
        } else {
            System.out.println("Los números " + num1 + " y " + num2 + " no son iguales");
        }
    }
}
