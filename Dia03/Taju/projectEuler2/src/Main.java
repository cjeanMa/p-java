public class Main {
    public static void main(String[] args) {
        System.out.println("La suma de los números pares menores a 40000000 es: ");
        Fibonacci fibo = new Fibonacci(50, 1, 1);
        System.out.println(fibo.fibonacci());
    }
}
