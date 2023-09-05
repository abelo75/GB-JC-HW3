import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeList implements Iterable<Employee> {
    private final ArrayList<Employee> employees;

    public EmployeeList() {
        this.employees = new ArrayList<>();
    }

    void add(Employee employee) {
        employees.add(employee);
    }

    void sort() {
        Collections.sort(employees);
    }

    @Override
    public Iterator<Employee> iterator() {

        final int[] index = {0};
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return index[0] < employees.size();
            }

            @Override
            public Employee next() {
                return employees.get(index[0]++);
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append("\n");
        }
        return sb.toString();
    }
}
