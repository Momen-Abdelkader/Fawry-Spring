package employee;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final Map<Integer, Employee> employees = new HashMap<>();

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public Employee findById(int id) {
        return employees.get(id);
    }

    @Override
    public void save(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    @Override
    public void deleteById(int id) {
        employees.remove(id);
    }

//    @PostConstruct
//    public void populateData() {
//        employees.put(1, new Employee(1, "Employee 1"));
//        employees.put(2, new Employee(2, "Employee 2"));
//        employees.put(3, new Employee(3, "Employee 3"));
//        employees.put(4, new Employee(4, "Employee 4"));
//        employees.put(5, new Employee(5, "Employee 5"));
//        employees.put(6, new Employee(6, "Employee 6"));
//        employees.put(7, new Employee(7, "Employee 7"));
//        employees.put(8, new Employee(8, "Employee 8"));
//        employees.put(9, new Employee(9, "Employee 9"));
//        employees.put(10, new Employee(10, "Employee 10"));
//    }
}
