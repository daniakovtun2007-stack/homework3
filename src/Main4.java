public class Main4 {
    public static void main(String[] args) {
        Company company = new Company("ProgAcademy");
        Employee em1 = new Employee(1, "ProgAcademy");
        company.addEmployee(em1);
        System.out.println(company);
        Employee em = company.searchEmployeeById(1);
        System.out.println(em);
    }
}
