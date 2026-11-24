public abstract class Employee1 {
    protected final String name;
    protected final String position;

    public Employee1(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getInfo() {
        return name + " (" + position + ")";
    }

    public abstract double calculateSalary();
}
