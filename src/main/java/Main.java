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
        System.out.println(employeeService.findAll());
    }
}
