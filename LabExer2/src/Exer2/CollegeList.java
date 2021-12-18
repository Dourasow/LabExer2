/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exer2;

import java.util.Scanner;

/**
 *
 * @author ues
 */
public class CollegeList {

    public void systemMemu() {
        //Creating a Scanner
        Scanner input = new Scanner(System.in);

        //Creating Object of the Employee Class
        Employee emp = new Employee();

        emp.setName("Abdul");
        emp.setContactNum("0791431606");
        emp.setSalary(200.60);
        emp.setDepartment("Registrar");

        //creating Object of the Faculty Class
        Faculty fac = new Faculty();

        fac.setName("Abdul");
        fac.setContactNum("0786433883");
        fac.setSalary(400.0);
        fac.setDepartment("Finance'");


        //Creating Object of the Student Class
        Student stu = new Student();

        stu.setName("Dybala");
        stu.setContactNum("0783642764");
        stu.setProgram("BSIT");
        stu.setYearLevel(2);

        //Asking the User to Enter the Name and Contact Number to get access to System
        System.out.println("\n------------------------------------------------------------System Login-------------------------------------------------------------------------------------");
        System.out.print("Enter your Name: ");
        String sel = input.next();
        System.out.print("Enter your Contact Number: ");
        String sele = input.next();

        System.out.println("Name: " + sel);
        System.out.println("Contact Number is : " + sele);

        System.out.println("Succesful Login");


        //Asking the User to select among Employee, Faculty, Student by pressing E, F, S
        System.out.println("--------------------------------------------------------------------------Welcome to Sow's Institution-----------------------------------------------------------------------");

        System.out.println(" Are you ? : \n" +
                "E. Employee\n" +
                "F. Faculty\n" +
                "S. Student");


        System.out.print("Chose Option: ");
        String opt = input.next();

        switch (opt) {
            // E for Employee
            case "E":

                //Asking the user to type the Employee's Monthly's Salary and the Department he or she belongs
                System.out.println("\n-------------------------------------------------------------- Welcome to Employee Page----------------------------------------------------------------------------------");

                System.out.print("Enter Monthly Salary:  ");
                double a = input.nextDouble();
                System.out.print("Enter the Department Name : ");
                String b = input.next();

                if (b.equals(emp.getDepartment()) && a == emp.getSalary()) {
                    System.out.println("Name is : " + emp.getName());
                    System.out.println("Contact Number is: " + emp.getContactNum());
                    System.out.println("Salary is : " + emp.getSalary());
                    System.out.println("Department is : " + emp.getDepartment());
                } else {
                    System.out.println("Incorrect input");
                }
                System.out.println("------------------------------------------------------------------");
                System.out.print("Do you want to continue (Y/N): ");
                String h = input.next();

                switch (h) {
                    case "Y":
                        systemMemu();
                        break;
                    case "N":
                        System.out.println("Thanks for using our Services");
                        break;
                }
                break;

            //F for Faculty
            case "F":
                System.out.println("\n---------------------------------------------------------------------------------Welcome to Faculty Page--------------------------------------------------------------------------");
                //Asking the user to enter Y if Faculty Member  is Regular/Tenure or N if Not.
                System.out.println("Is Faculty member is regular: \n" +
                        "Y. Yes\n" +
                        "N. No");

                System.out.print("Select Option: ");
                String f = input.next();

                switch (f) {
                    case "Y":
                        System.out.println("Name is : " + fac.getName());
                        System.out.println("Contact Number: " + fac.getContactNum());
                        System.out.println("Salary is : " + fac.getSalary());
                        System.out.println("Department is : " + fac.getDepartment());
                        System.out.println(("Is Member Regular :  " + fac.isRegular(true)));
                        break;
                    case "N":
                        System.out.println("Name is : " + fac.getName());
                        System.out.println("Contact Number: " + fac.getContactNum());
                        System.out.println("Salary is : " + fac.getSalary());
                        System.out.println("Department is : " + fac.getDepartment());
                        System.out.println("Is Member Regular : " + fac.isRegular(false));
                        break;
                }
                System.out.println("------------------------------------------------------------------");
                System.out.print("Do you want to continue (Y/N): ");
                String y = input.next();

                switch (y) {
                    case "Y":
                        systemMemu();
                        break;
                    case "N":
                        System.out.println("Thanks for using our Services");
                        break;
                }
                break;
            //S for Student
            case "S":
                //Asking the User enter the Student's Enroll Program and his or her year level
                System.out.println("\n-----------------------------------------------------------------------------Welcome to Student Page------------------------------------------------------------------------");
                System.out.print("Enter Enroll Program: ");
                String st = input.next();
                System.out.print("Enter Year Level: ");
                int sd = input.nextInt();

                if (st.equals(stu.getProgram()) && sd == stu.getYearLevel()) {
                    System.out.println("Name is : " + stu.getName());
                    System.out.println("Contact Number is : " + stu.getContactNum());
                    System.out.println("Program is : " + stu.getProgram());
                    System.out.println("Year Level is : " + stu.getYearLevel());
                } else {
                    System.out.println("Invalid Program or Year Level");
                }
                System.out.println("------------------------------------------------------------------");
                System.out.print("Do you want to continue (Y/N): ");
                String u = input.next();

                switch (u) {
                    case "Y":
                        systemMemu();
                        break;
                    case "N":
                        System.out.println("Thanks for using our Services");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

    }

    public static void main(String[] args) {
        CollegeList co = new CollegeList();
        co.systemMemu();

    }
}