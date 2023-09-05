public abstract class Employee implements Salary, Comparable<Employee> {
        private final String firstName;
        private final String lastName;

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return String.format("%s %s", firstName, lastName);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public abstract double getSalary();

        @Override
        public int compareTo(Employee o) {
            int result = this.lastName.compareTo(o.lastName);
            if (result == 0) {
                result = this.firstName.compareTo(o.firstName);
            }
            return result;
        }
}
