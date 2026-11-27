public class Main10 {
    public static void main(String[] args) {
        Student student1 = new Student("Danya", "Kovtun", Gender.MALE, 1, "WEB-25" );
        Group group = new Group("WEB-25");
        try {
            group.addStudent(student1);
        } catch (GroupOverflowException e) {
            throw new RuntimeException(e);
        }
        try {
            group.findStudentByLastName("Danya");
        } catch (StudentNotFoundException e) {
            throw new RuntimeException(e);
        }
        group.removeStudentById(1);
        System.out.println(group);
    }
}
