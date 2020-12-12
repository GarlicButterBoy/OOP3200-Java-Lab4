package ca.durhamcollege;

import java.time.LocalDate;

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

    public void setYearlySalary(double yearlySalary)
    {
        if(yearlySalary < 0)
        {
            throw  new ArithmeticException("Salary cannot be negative");
        }
        else
            this.yearlySalary = yearlySalary;
    }

    @Override
    public double calculatePayDay()
    {

        return getYearlySalary();
    }
}
