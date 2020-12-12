package ca.durhamcollege;

import java.time.LocalDate;
import java.util.Scanner;

public class SalariedEmployee extends Employee
{

    //Private instance variables
    private double yearlySalary;

    /**
     * Initializes a person object based on parameters.
     *
     * @param fullName  - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @throws IllegalArgumentException when fullName contains less than one
     *                                  character or when fullName contains something other than letters, spaces,
     *                                  hyphens, or apostrophes.
     */
    public SalariedEmployee(String fullName, LocalDate birthDate, String employeeId, double yearlySalary)
    {
        super(fullName, birthDate, employeeId);
        this.yearlySalary = yearlySalary;
    }

    //Public instance methods
    public double getYearlySalary()
    {
        return yearlySalary;
    }

    public void setYearlySalary()
    {
        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean dirtyFlag = true;
        double yearlySalary = 0.00;

        while(dirtyFlag)
        {
            System.out.print("\nPlease enter a new salary: ");
            yearlySalary = keyboard.nextDouble();

            if (yearlySalary > 0 && yearlySalary < 10000)
            {
                System.out.println("Morally I cant let you do that, try again!");
            }
            else if (yearlySalary < 0)
            {
                System.out.println("Salary cannot be negative");
            }
            else
            {
                this.yearlySalary = yearlySalary;
                dirtyFlag = false;
            }
        }
    }

    @Override
    public double calculatePayDay()
    {
        double payday = getYearlySalary() / 52;

        return round(payday, 2);
    }

    public String toString()
    {
        String outputStr = "";
        outputStr += "\n========================================\n";
        outputStr += getName() + "\n";
        outputStr += getFirstName() + "'s Birthday : " + getBirthDate() + "\n";
        outputStr += getFirstName() + "'s Id       : " + getEmployeeId() + "\n";
        outputStr += getFirstName() + "'s Salary   : " + getYearlySalary() + "\n";
        outputStr += getFirstName() + "'s Pay Stub : " + calculatePayDay() + "\n";
        outputStr += "========================================\n";

        return outputStr;
    }
}
