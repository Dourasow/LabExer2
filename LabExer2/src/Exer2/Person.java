package Exer2;

public class Person {

    String name;
    String contactNum;

    //Constructor
    public Person()
    {
        name = " ";
        contactNum = " ";
    }

    //Constructor with different parameter (Overloaded Constructor)
    public Person(String name, String contactNum)
    {
        this.name = name;
        this.contactNum = contactNum;
    }

    //Getters and Setters
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getContactNum()
    {
        return contactNum;
    }
    public void setContactNum(String contactNum)
    {
        this.contactNum = contactNum;
    }
}

