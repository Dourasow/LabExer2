package Exer2;

public class Employee extends Person{

    double salary;
    String department;

    //Constructor
    public Employee()
    {
        salary = 0.0;
        department = "  ";
    }

    //Constructor with differrent parameter (Overloaded Constructor)
    public Employee(double salary, String department)
    {
        this.salary = salary;
        this.department = department;
    }


    //Getters and Setters
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getDepartment()
    {
        return department;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }

}


