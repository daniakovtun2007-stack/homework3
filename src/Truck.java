public class Truck extends Vehicle {
    private final double maxLoadKg;
    private double currentLoadKg;

    public Truck(String brand, int year, int maxSpeed, double maxLoadKg) {
        super(brand, year, maxSpeed);
        this.maxLoadKg = maxLoadKg;
        this.currentLoadKg = 0.0;
    }

    public boolean load(double weight) {
        if (weight <= 0) {
            System.out.println("Некорректный вес груза: " + formatWeight(weight) + " кг");
            return false;
        }
        if (currentLoadKg + weight > maxLoadKg) {
            System.out.println("Загрузка " + formatWeight(weight) + " кг в " + brand + " невозможна: превышена грузоподъёмность");
            return false;
        }
        currentLoadKg += weight;
        System.out.println(brand + " загружен: " + formatWeight(currentLoadKg) + " кг");
        return true;
    }

    @Override
    public String getInfo() {
        return super.getInfo()
                + ", грузоподъёмность: " + formatWeight(maxLoadKg) + " кг"
                + ", загружено: " + formatWeight(currentLoadKg) + " кг";
    }

    @Override
    public void move() {
        System.out.println("Грузовик едет по трассе");
    }

    private String formatWeight(double value) {
        if (value == Math.rint(value)) {
            return Long.toString((long) value);
        }
        return Double.toString(value);
    }
}