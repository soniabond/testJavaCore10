package module11;

import java.util.List;
import java.util.Optional;

import static module11.Position.DEVELOPER;
import static module11.Position.MANAGER;

public class EmployeeRepository {
    private List<Employee> employees = List.of(
            new Employee("Ivan Ivanenko", 15000, MANAGER),
            new Employee("Mariia Mariivna", 17000, DEVELOPER),
            new Employee("Petro Petrenko", 14000, MANAGER),
            new Employee("Alina Ivanenko", 13000, MANAGER)
    );

//    public Optional<Employee> findEmployeeByFullName(String fullName){
//        for (Employee employee : employees) {
//            if(employee.getFullName().equals(fullName)){
//                return Optional.of(employee);
//            }
//        }
//        return Optional.empty();
//    }

    public Optional<Employee> findEmployeeByFullName(String fullName){
        return employees.stream()
                .filter(employee -> employee.getFullName().equals(fullName))
                .findFirst();
    }

}
