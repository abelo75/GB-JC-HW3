public class Worker extends Employee {

    private final double salary;

    @Override
    public String toString() {
        return String.format("%s %s %.2f", getFirstName(), getLastName(), getSalary());
    }

    public Worker(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}
