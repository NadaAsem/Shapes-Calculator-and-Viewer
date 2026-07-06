package faculty.project;

public abstract class ThreeDShape extends Shape {

    public ThreeDShape(String color) {
        super(color);
    }

    public ThreeDShape() {
    }

    public abstract double getVolume();
    //extend shape and call his constractor;

}
