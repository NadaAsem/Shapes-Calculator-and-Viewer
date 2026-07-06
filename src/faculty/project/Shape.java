package faculty.project;

import java.util.Date;

abstract class Shape implements Drawable {

    private Date dateCreated;
    private String color;

    public Shape() {
        dateCreated = new Date();
    }

    public Shape(String color) {
        this();
        this.color = color;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    abstract double getArea();

    abstract double getperimeter();

}
