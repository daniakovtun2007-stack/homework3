public class Manager extends Employee1 {
    private final double baseSalary;
    private final double bonusPercent; // процент от оклада, например 20.0 для 20%

    public Manager(String name, String position, double baseSalary, double bonusPercent) {
        super(name, position);
        this.baseSalary = baseSalary;
        this.bonusPercent = bonusPercent;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + baseSalary * (bonusPercent / 100.0);
    }
}