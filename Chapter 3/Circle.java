public class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Initial radius: " + circle.getRadius());
        System.out.println("Initial diameter: " + circle.getDiameter());
        System.out.println("Initial area: " + circle.getArea());

        circle.setRadius(5);
        System.out.println("Radius after setting: " + circle.getRadius());
        System.out.println("Diameter after setting: " + circle.getDiameter());
        System.out.println("Area after setting: " + circle.getArea());
    }
}
