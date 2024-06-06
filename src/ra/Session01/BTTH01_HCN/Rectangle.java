package ra.Session01.BTTH01_HCN;

public class Rectangle {
    public  double width;
    public  double height;

    public void Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
