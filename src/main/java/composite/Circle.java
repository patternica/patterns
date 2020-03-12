package composite;

public class Circle extends Dot {

    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("Circle is moved to x:" + x + " y:" + y);
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
