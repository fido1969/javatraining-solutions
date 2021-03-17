package debug;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employeeList = new ArrayList<>();

    public void addemployee(Employee employee) {
        employeeList.add(employee);
    }

    public Employee findEmployeeByName(String name) {
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) ;
            return employee;
        }
        return null;
    }

    public List<String> listEmployeeNames() {
        List<String> names = new ArrayList<>();
        for (Employee employee : employeeList) {
            names.add(employee.getName());
        }
        return names;
    }
}

