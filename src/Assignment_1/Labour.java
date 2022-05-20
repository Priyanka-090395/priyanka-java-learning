package Assignment_1;

public class Labour extends Employee{
    @Override
    public int salary(int salary, int overtime) {
        int convert_ratio = overtime * 100;
        int final_salary = convert_ratio + salary;
        return final_salary;
    }
}
