public class Car extends Vehicle {
    private final int doorsCount;

    public Car(String brand, int year, int maxSpeed, int doorsCount) {
        super(brand, year, maxSpeed);
        this.doorsCount = doorsCount;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", дверей: " + doorsCount;
    }

    @Override
    public void move() {
        System.out.println("Автомобиль едет по дороге");
    }
}
