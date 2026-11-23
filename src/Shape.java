public abstract class Shape {
    protected final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void describe() {
        System.out.println(String.format(
                "Фигура: %s | Площадь: %.2f | Периметр: %.2f",
                name,
                getArea(),
                getPerimeter()
        ));
    }
}
