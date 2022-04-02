package openclosegoodexample;

/*With this class the open-closed principle is no longer broken,
since all new entities extend from it. It is open to its extension but closed to its modification.*/
public class Employee {

    private String fullName;
    private int salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }
}
