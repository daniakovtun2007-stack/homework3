public class Main8 {
    public static void main(String[] args) {
        Employee1[] staff = new Employee1[] {
                new Manager("Ольга Иванова", "Менеджер", 30000.0, 20.0),
                new Developer1("Петр Коваль", "Разработчик", 300.0, 170.0),
                new Intern("Ирина Ким", "Стажёр", 12000.0),
                new Freelancer("Сергей Бондарь", "Фрилансер", 15000.0, 12000.0)
        };

        Payroll payroll = new Payroll();
        payroll.printPayroll(staff);
    }
}