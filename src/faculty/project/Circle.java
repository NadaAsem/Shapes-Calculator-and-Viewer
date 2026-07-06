package faculty.project;

public class Circle extends Shape {

    private double raduis;

    public Circle(String c, double r) {
        super(c);
        this.raduis = r;
    }

    public Circle(double r) {
        this.raduis = r;
    }

    public double getReduis() {
        return raduis;
    }

    public void setReduis(double r) {
        if (r > 0) {
            this.raduis = r;
        }
    }

    public double getArea() {
        return raduis * raduis * Math.PI;
    }

    public double getperimeter() {
        return raduis * 2 * Math.PI;

    }

    public String howToDrwa() {
        return "draw circle the raduis is  " + raduis;
    }

    @Override
    public String toString() {
        return "Circle{" + "raduis=" + raduis + '}';
    }

}
