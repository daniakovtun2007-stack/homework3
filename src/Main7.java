public class Main7 {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] {
                new Circle("Круг 1", 3.0),
                new Rectangle("Прямоугольник 1", 4.0, 5.0),
                new Triangle1("Треугольник 1", 3.0, 4.0, 5.0),
                new Circle("Круг 2", 5.5),
                new Rectangle("Квадрат", 6.0, 6.0),
                new Triangle1("Равносторонний треугольник", 7.0, 7.0, 7.0)
        };

        for (Shape shape : shapes) {
            shape.describe();
        }

        double totalArea = ShapeUtils.totalArea(shapes);
        Shape largest = ShapeUtils.findLargest(shapes);

        System.out.println("--------------------------------------------------");
        System.out.println(String.format("Суммарная площадь всех фигур: %.2f", totalArea));
        if (largest != null) {
            System.out.println(String.format(
                    "Самая большая фигура: %s (площадь: %.2f)",
                    largest.getName(),
                    largest.getArea()
            ));
        }
    }
}
