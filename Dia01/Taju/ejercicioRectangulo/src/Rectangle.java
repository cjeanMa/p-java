public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.width;
    }
    public double getPerimeter() {
        return (this.width * 2) + (this.height * 2);
    }
}
