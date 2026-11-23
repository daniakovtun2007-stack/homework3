public final class ShapeUtils {
    private ShapeUtils() {
        // Приватный конструктор запрещает создание экземпляров утилитного класса
    }

    public static double totalArea(Shape[] shapes) {
        if (shapes == null) {
            return 0.0;
        }
        double sum = 0.0;
        for (Shape shape : shapes) {
            if (shape != null) {
                sum += shape.getArea();
            }
        }
        return sum;
    }

    public static Shape findLargest(Shape[] shapes) {
        if (shapes == null) {
            return null;
        }
        Shape largest = null;
        double maxArea = -1.0;

        for (Shape shape : shapes) {
            if (shape != null) {
                double area = shape.getArea();
                if (area > maxArea) {
                    maxArea = area;
                    largest = shape;
                }
            }
        }
        return largest;
    }
}