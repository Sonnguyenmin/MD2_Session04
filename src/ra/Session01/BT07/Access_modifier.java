package ra.Session01.BT07;

public class Access_modifier {
    private double radius;
    public String color;

    public Access_modifier() {
    }

    public Access_modifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius , 2);
    }

    @Override
    public String toString() {
        return "Access_modifier{" +
                "radius=" + this.radius +
                ", color='" + this.color + '\'' +
                '}';
    }
}
