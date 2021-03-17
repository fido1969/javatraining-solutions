package debug.employee;

public class CompanyMain {

    public static void main(String[] args) {

        Company company = new Company();
        company.addemployee(new Employee("Anna", 1967));
        company.addemployee(new Employee("Attila", 1878));
        company.addemployee(new Employee("Béla", 1999));
        System.out.println(company.listEmployeeNames());

        System.out.println(company.findEmployeeByName("Anna").toString());

        company.addemployee(new Employee("Anonymus", 1805));
        System.out.println(company.listEmployeeNames());
    }
}
