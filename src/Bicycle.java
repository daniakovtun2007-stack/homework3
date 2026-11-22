public final class Bicycle extends Vehicle {
    public Bicycle(String brand, int year, int maxSpeed) {
        super(brand, year, maxSpeed);
    }

    @Override
    public void move() {
        System.out.println("Велосипед едет по велодорожке");
    }
}