package module11;

public class Employee {
    private String fullName;
    private Integer salary;
    private Position position;

    public Employee() {
    }

    public Employee(String fullName, Integer salary, Position position) {
        this.fullName = fullName;
        this.salary = salary;
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}
