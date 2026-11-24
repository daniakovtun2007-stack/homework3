import java.util.Locale;

public class Payroll {

    public void printPayroll(Employee1[] staff) {
        if (staff == null) {
            return;
        }
        for (Employee1 employee : staff) {
            if (employee != null) {
                double salary = employee.calculateSalary();
                System.out.println(String.format(
                        Locale.US,
                        "%-15s | %-11s | %.2f",
                        employee.getName(),
                        employee.getPosition(),
                        salary
                ));
            }
        }
        System.out.println(String.format(Locale.US, "Итого к выплате: %.2f", total(staff)));
    }

    public double total(Employee1[] staff) {
        if (staff == null) {
            return 0.0;
        }
        double sum = 0.0;
        for (Employee1 employee : staff) {
            if (employee != null) {
                sum += employee.calculateSalary();
            }
        }
        return sum;
    }
}