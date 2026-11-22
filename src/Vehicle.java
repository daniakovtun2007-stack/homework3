public class Vehicle {
    protected final String brand;
    protected final int year;
    protected final int maxSpeed;

    public Vehicle(String brand, int year, int maxSpeed) {
        this.brand = brand;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public final int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getInfo() {
        return brand + ", " + year + ", " + maxSpeed + " км/ч";
    }

    public void move() {
        System.out.println("Транспорт едет");
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
