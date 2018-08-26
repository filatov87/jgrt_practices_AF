package homeworks.Circle;

public class Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        double area = radius*radius*3.14;
        return  area;
    }

}