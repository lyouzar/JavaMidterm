package design;

public class FortuneEmployee {

    /**
     FortuneEmployee class has a main method where you will be able to create Object from
        EmployeeInfo class to use fields and attributes
     <p>
     Demonstrate as many methods as possible to use with proper business work flow.
        Try to think like a Software Architect/Developer.
        This application should provide basic employee information services
     </p>
     <p>
     Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     </p>
     **/
    public static void main(String[] args) {

        EmployeeInfo employeeInfo = new EmployeeInfo();

        employeeInfo.setEmployeeName("John Doe");
        employeeInfo.setEmployeeId(12345);
        employeeInfo.assignDepartment("Human Resources");
        EmployeeInfo.setCompanyName("Google");
        employeeInfo.setEmployeeSalary(150000);

        System.out.println("Employee Name: " + employeeInfo.employeeName());
        System.out.println("Employee ID: " + employeeInfo.employeeId());
        System.out.println("Company Name: " + employeeInfo.getCompanyName());
        System.out.println("Department: " + employeeInfo.getEmployeeDepartment());

        double employeePension = employeeInfo.calculateEmployeePension();
        System.out.println("Employee pension: " + employeePension);

        System.out.println("Assigning a new department to the employee.");
        employeeInfo.assignDepartment("Marketing");
        System.out.println("New employee department: " + employeeInfo.getEmployeeDepartment());


    }

}
