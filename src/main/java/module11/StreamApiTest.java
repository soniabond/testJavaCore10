package module11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTest {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Ivan Ivanenko", 15000, Position.MANAGER),
                new Employee("Mariia Mariivna", 17000, Position.DEVELOPER),
                new Employee("Petro Petrenko", 14000, Position.MANAGER),
                new Employee("Alina Ivanenko", 13000, Position.MANAGER)
        );
        System.out.println("employees = " + employees);
        //System.out.println(convertEmployeeToNamesList(employees));
        //System.out.println(convertEmployeeToNamesString(employees));
        //System.out.println(convertEmployeesToManagerSalaries(employees));
        //System.out.println(convertEmployeesToManagerSalariesAsc(employees));
        //System.out.println(convertEmployeesToManagerSalariesTop2(employees));
        System.out.println(findManagerWithFighestSalary(employees));
    }

    //є список об'єктів робітників компаніі. перетворити його на список імен співробітників
//    public static List<String> convertEmployeeToNamesList(List<Employee> employees){
//        List<String> names = new ArrayList<>();
//        for (Employee employee : employees) {
//            names.add(employee.getFullName());
//        }
//        Stream<Employee> employeeStream = employees.stream();
//        Function<Employee, String> function = empl -> empl.getFullName();
//        return names;
//    }

    public static List<String> convertEmployeeToNamesList(List<Employee> employees){
//        Stream<Employee> employeeStream = employees.stream();
//        Function<Employee, String> function = empl -> empl.getFullName();
//        List<String> res = employeeStream
//                .map(function)
//                .collect(Collectors.toList());

        ;

//        return employees.stream()
//                .map(empl -> empl.getFullName())
//                .collect(Collectors.toList());

        return employees.stream()
                .map(Employee::getFullName)
                .collect(Collectors.toList());
    }

    //є список об'єктів робітників компаніі. перетворити його на рядок імен співробітників через кому
    public static String convertEmployeeToNamesString(List<Employee> employees){
        return employees.stream()
                .map(Employee::getFullName)
                .collect(Collectors.joining(","));
    }

    //є список об'єктів робітників компаніі. знайти середню зп менеджерів
    //є список об'єктів робітників компаніі. повернути зп менеджерів
//    public static List<Integer> convertEmployeesToManagerSalaries(List<Employee> employees){
//        return employees.stream()
//                .filter(employee -> employee.getPosition().equals(Position.MANAGER))
//                .map(Employee::getSalary)
//                .collect(Collectors.toList());
//    }

    //є список об'єктів робітників компаніі. повернути топ 2 менеджера з найбільшою зп
    public static List<Employee> convertEmployeesToManagerSalariesTop2(List<Employee> employees){
        return employees.stream()
                .filter(employee -> employee.getPosition().equals(Position.MANAGER))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(2)
                .collect(Collectors.toList());
    }

    public static Employee findManagerWithFighestSalary(List<Employee> employees){
        return employees.stream()
                .filter(employee -> employee.getPosition().equals(Position.MANAGER))
                .max(Comparator.comparing(Employee::getSalary))
                .get();
    }
}
