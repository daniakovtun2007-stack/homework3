public class Intern extends Employee1 {
    private final double stipend;

    public Intern(String name, String position, double stipend) {
        super(name, position);
        this.stipend = stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }
}