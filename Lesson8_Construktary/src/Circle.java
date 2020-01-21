public class Circle {
    double centerX;
    double centerY;
    int radius;
    double width;
    String color;

    public Circle(double centerX, double centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(double centerX, double centerY, int radius, double width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(double centerX, double centerY, int radius, double width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;

    }

}
