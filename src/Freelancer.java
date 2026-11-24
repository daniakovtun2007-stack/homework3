public class Freelancer extends Employee1 {
    private final double[] completedProjectPayments;

    public Freelancer(String name, String position, double... completedProjectPayments) {
        super(name, position);
        this.completedProjectPayments = completedProjectPayments != null
                ? completedProjectPayments.clone()
                : new double[0];
    }

    @Override
    public double calculateSalary() {
        double sum = 0.0;
        for (double payment : completedProjectPayments) {
            sum += payment;
        }
        return sum;
    }
}