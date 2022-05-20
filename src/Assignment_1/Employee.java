package Assignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

    private int base_salary;
    public int salary(int base_salary, int salary){
        return salary;
    }

  public static void main(String[] args) {
        Employee employee = new Employee();
        List<EmployeeEntity> employeeEntityList = Arrays.asList(
              new EmployeeEntity("Fayaaz","Labour",10000),
              new EmployeeEntity("Priyanka","Manager",22000),
              new EmployeeEntity("Vinod", "Manager", 25000)
        );

        employee.employeeSalaryCalculation(employeeEntityList);
  }

    private void employeeSalaryCalculation(List<EmployeeEntity> employeeEntityList) {

        for (EmployeeEntity e : employeeEntityList ) {
            if(e.getDesignation().equals("Manager")){
                System.out.println("Final Salary of: " + e.getName() + " is: "+new Manager().salary(e.getSalary(),((e.getSalary()/2))));
            }
            else {
                System.out.println("Final Salary of: " + e.getName() + " is: "+new Labour().salary(e.getSalary(),(e.getSalary()/1000)));
            }

        }

    }
}
