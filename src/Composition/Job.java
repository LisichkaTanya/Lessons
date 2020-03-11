package Composition;

public class Job {
    private int salary;
    private String profession;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public String getProfession() {
        return profession;
    }
}
