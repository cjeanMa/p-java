public class Main {
    public static void main(String[] args) {
        Multiple mult3 = new Multiple(3);
        Multiple mult5 = new Multiple(5);
        Multiple mult15 = new Multiple(15);
        System.out.println("La suma de los múltiplos de 3 y 5 es: ");
        System.out.println(mult3.sumMultiple() + mult5.sumMultiple() - mult15.sumMultiple());
    }
}
