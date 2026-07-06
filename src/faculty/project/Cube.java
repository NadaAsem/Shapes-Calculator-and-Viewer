package faculty.project;

public class Cube extends ThreeDShape {

    private double side;

    public Cube(String c, double s) {
        super(c);
        this.side = s;
    }

    public Cube(double s) {
        this.side = s;
    }

    public void setside(double s) {
        if (s > 0) {
            this.side = s;
        }
    }

    public double getside() {
        return side;
    }

    @Override
    public String toString() {
        return "Cube{" + "side=" + side + '}';
    }

    public double getVolume() {
        return side * side * side;
    }

    public double getArea() {
        return 6 * side * side;
    }

    public double getperimeter() {
        return 12 * side ;
    }

    public String howToDrwa() {
        return "draw Cupe side of cube is " + side;
    }

}
