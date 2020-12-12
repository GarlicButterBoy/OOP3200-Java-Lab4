package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.Scanner;

public class HourlyWorker extends Employee
{

    //private instance variables
    private double hourlyRate;
    private double hoursPerWeekAmount;

    /**
     * Initializes a person object based on parameters.
     *
     * @param fullName  - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @throws IllegalArgumentException when fullName contains less than one
     *                                  character or when fullName contains something other than letters, spaces,
     *                                  hyphens, or apostrophes.
     */
    public HourlyWorker(String fullName, LocalDate birthDate, @NotNull String employeeId, double hourlyRate, double hoursPerWeekAmount)
    {
        super(fullName, birthDate, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursPerWeekAmount = hoursPerWeekAmount;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate()
    {
        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean dirtyFlag = true;
        double hourlyRate = 0.00;

        while(dirtyFlag)
        {
            System.out.print("\nPlease enter your new rate: ");
            hourlyRate = keyboard.nextDouble();

            if (hourlyRate < 0)
            {
                System.out.println("You cannot enter a negative number.");
            }
            else if (hourlyRate >= 17)
            {
                this.hourlyRate = hourlyRate;
                dirtyFlag = false;
            }
            else
            {
                System.out.println("Can't let you do that champ, try more than 16.99!");
            }
        }
    }

    public double getHoursPerWeekAmount() {
        return hoursPerWeekAmount;
    }

    public void setHoursPerWeekAmount()
    {
        //Declarations
        Scanner keyboard = new Scanner(System.in);
        boolean dirtyFlag = true;
        double hoursPerWeekAmount = 0.00;

        while(dirtyFlag)
        {
            System.out.print("\nPlease enter your hours: ");
            hoursPerWeekAmount = keyboard.nextDouble();

            if (hoursPerWeekAmount < 0)
            {
                System.out.println("You cannot enter a negative number.");
            }
            else if (hoursPerWeekAmount <= 48.0)
            {
                this.hoursPerWeekAmount = hoursPerWeekAmount;
                dirtyFlag = false;
            }
            else
            {
                System.out.println("You cannot enter more than 48 hours per week.");
            }
        }

    }
    @Override
    public double calculatePayDay()
    {
        return round((hourlyRate * hoursPerWeekAmount), 2);
    }

    public String toString()
    {
        String outputStr = "";
        outputStr += "\n========================================\n";
        outputStr += getName() + "\n";
        outputStr += getFirstName() + "'s Birthday : " + getBirthDate() + "\n";
        outputStr += getFirstName() + "'s Id       : " + getEmployeeId() + "\n";
        outputStr += getFirstName() + "'s Rate     : " + getHourlyRate() + "\n";
        outputStr += getFirstName() + "'s Hour's   : " + getHoursPerWeekAmount() + "\n";
        outputStr += getFirstName() + "'s Pay Stub : " + calculatePayDay() + "\n";
        outputStr += "========================================\n";

        return outputStr;
    }
}
