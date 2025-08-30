package employee;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    @PostConstruct
    public void populateData() {
        employeeRepository.save(new Employee(1, "Employee 1"));
        employeeRepository.save(new Employee(2, "Employee 2"));
        employeeRepository.save(new Employee(3, "Employee 3"));
        employeeRepository.save(new Employee(4, "Employee 4"));
        employeeRepository.save(new Employee(5, "Employee 5"));
        employeeRepository.save(new Employee(6, "Employee 6"));
        employeeRepository.save(new Employee(7, "Employee 7"));
        employeeRepository.save(new Employee(8, "Employee 8"));
        employeeRepository.save(new Employee(9, "Employee 9"));
        employeeRepository.save(new Employee(10, "Employee 10"));
    }
}
