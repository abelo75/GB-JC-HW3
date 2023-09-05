public class Freelancer extends Employee {

    private final double hourlyRate;

    public Freelancer(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", getFirstName(), getLastName(), getSalary());
    }

    @Override
    public double getSalary() {
        return 20.8 * 8 * hourlyRate;
    }
}
