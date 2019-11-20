package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    // Getters
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getSalary() {
        return this.salary;
    }

    // Setters
    public void setSalary(int salary) {
         this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name : " + name + "\nTotal Salary earned so far : Rs. " + salaryEarned;
    }

}
