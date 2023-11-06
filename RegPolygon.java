public class RegPolygon {
    private int n = 3; // number of sides
    private double side = 1; // length of side
    private double x = 0; // x-coordinate of the polygon's center
    private double y = 0; // y-coordinate of the polygon's center

    // No-arg constructor
    public RegPolygon() {
    }

    // Constructor with a specified number of sides and length of side
    public RegPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    // Constructor with specified number of sides, length of side, and x- and
    // y-coordinates
    public RegPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor and mutator methods for all data fields
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to get the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // Method to get the area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}

// Test the program
class TestRegPolygon {
    public static void main(String[] args) {
        RegPolygon polygon1 = new RegPolygon();
        RegPolygon polygon2 = new RegPolygon(6, 4);
        RegPolygon polygon3 = new RegPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter() + ", area: " + polygon1.getArea());
        System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter() + ", area: " + polygon2.getArea());
        System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter() + ", area: " + polygon3.getArea());
    }
}
