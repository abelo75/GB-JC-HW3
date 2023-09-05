public class HW3 {
    public static void main(String[] args) {
        EmployeeList employees = new EmployeeList();

        employees.add(new Worker("Bubba", "Doe", 1000));
        employees.add(new Worker("Jane", "Doe", 2000));
        employees.add(new Freelancer("Xavier", "Smith", 10));
        employees.add(new Freelancer("Aaron", "Zimmermann", 20));
        employees.add(new Worker("John", "Smith", 3000));

        System.out.println(employees);

        employees.sort();

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
