public class Developer1 extends Employee1 {
    private static final int NORMAL_HOURS = 160;
    private static final double OVERTIME_MULTIPLIER = 1.5;

    private final double hourlyRate;
    private final double hoursWorked;

    public Developer1(String name, String position, double hourlyRate, double hoursWorked) {
        super(name, position);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        if (hoursWorked <= NORMAL_HOURS) {
            return hourlyRate * hoursWorked;
        }
        double regularPay = hourlyRate * NORMAL_HOURS;
        double overtimeHours = hoursWorked - NORMAL_HOURS;
        double overtimePay = overtimeHours * hourlyRate * OVERTIME_MULTIPLIER;
        return regularPay + overtimePay;
    }
}