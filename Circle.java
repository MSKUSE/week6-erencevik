public class Circle extends Shape {

    private int radius;

    public Circle(Point location, int radius) {
        super(location);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius must be a positive number");
        }
        else {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + this.getLocation() +
                ", radius=" + this.radius +
                '}';
    }

    @Override
    public double area() {
        System.out.println("Shape Class Area Method : ");
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        System.out.println("Shape Class Perimeter Method : ");
        return 2 * Math.PI * this.radius;
    }
}
