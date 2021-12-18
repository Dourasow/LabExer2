package Exer2;

public class Student extends Person{

    String program;
    int yearLevel;

    //Constructor
    public Student()
    {
        program = " ";
        yearLevel = 0;
    }

    //Constructor with different parameters (Overloaded Constructor)
    public Student(String program, int yearLevel)
    {
        this.program = program;
        this.yearLevel = yearLevel;
    }


    //Getter and Setters
    public String getProgram()
    {
        return program;
    }
    public void setProgram(String program)
    {
        this.program = program;
    }

    public int getYearLevel()
    {
        return yearLevel;
    }
    public void setYearLevel(int yearLevel)
    {
        this.yearLevel = yearLevel;
    }

}


