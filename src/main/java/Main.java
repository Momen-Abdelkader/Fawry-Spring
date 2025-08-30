import config.AppConfig;
import employee.Employee;
import employee.EmployeeService;
import employee.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

        Employee employee = new Employee(11, "Employee 11");
        employeeService.save(employee);
        employeeService.deleteById(1);
        System.out.println(employeeService.findAll());
        System.out.println(employeeService.findById(5));
    }
}
