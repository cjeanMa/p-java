public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }
    public double getDiameter() {
        return (this.radius * 2);
    }
}
