import java.util.Arrays;

public class Company {
    String name;
    Employee[] staff = new Employee[5];

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] == null) {
                staff[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee searchEmployeeById(int id) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && staff[i].getId() == id) {
                return staff[i];
            }
        }
        return null;
    }
    @Override
    public String toString() {
        String result = "[ Company name = " + name + " Employees = ";
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                result += staff[i].toString();
            }
        }
        return result;
    }
}


