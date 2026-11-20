public class Developer extends Employee {
    String skill;
    public Developer(int id, String department, String skill) {
        super(id, department);
        this.skill = skill;
        setId(id);
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    @Override
    public void setId(int id){
        id=(id/10)*10;
        super.setId(id);
    }
    public String toString() {
        return "Developer { skill: " + skill + "department: " + getDepartment() + " id: " + getId() + " }";
    }
}
