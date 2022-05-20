package Assignment_1;

public class Manager extends Employee{

    @Override
    public int salary(int salary, int incentive) {
       int final_salary = salary + incentive;
       return final_salary;


    }
}
