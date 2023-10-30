public class ShapePrinter {
    public void printShapeName(Shape shape) {
        System.out.println("This is a " + shape.getName());
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Figures.Circle();
        Shape quad = new Figures.Quad();
        Shape triangle = new Figures.Triangle();
        Shape ellipse = new Figures.Ellipse();
        Shape rectangle = new Figures.Rectangle();
        Shape line = new Figures.Line();
        Shape polygon = new Figures.Polygon();
        Shape star = new Figures.Star();

        ShapePrinter shapePrinter = new ShapePrinter();

        shapePrinter.printShapeName(circle);
        shapePrinter.printShapeName(quad);
        shapePrinter.printShapeName(triangle);
        shapePrinter.printShapeName(ellipse);
        shapePrinter.printShapeName(rectangle);
        shapePrinter.printShapeName(line);
        shapePrinter.printShapeName(polygon);
        shapePrinter.printShapeName(star);
    }
}