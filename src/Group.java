public class Group {
    private String groupName;
    private Student[] students;

    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new Student[10];
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return; // Stop after adding to the first free slot
            }
        }
        throw new GroupOverflowException("Группа переполнена!");
    }

    public Student findStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getLastName().equals(lastName)) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("Студент не найден!");
    }

    public boolean removeStudentById(int studentId) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == studentId) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }
}