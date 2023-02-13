package module11;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        Optional<Employee> optionalEmployee = repository.findEmployeeByFullName("Petro1 Petrenko");
        //optionalEmployee.ifPresent(employee -> System.out.println(employee.getSalary()));
        optionalEmployee.ifPresentOrElse(
                employee -> System.out.println(employee.getSalary()),
                () -> System.out.println("Employee not found!"));
        optionalEmployee.orElseThrow(() -> new RuntimeException("No such employee!"));
        optionalEmployee.get();
        //        if (employee != null) {
//            System.out.println("employee.getSalary() = " + employee.getSalary());
//        } else {
//            System.out.println("Employee not found");
//        }
    }
}
