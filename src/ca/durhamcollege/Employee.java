package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;
import java.time.LocalDate;

public abstract class Employee extends Person
{

    //private instance variables
    private String employeeId;

    /**
     * Initializes a person object based on parameters.
     *
     * @param fullName  - the intended full name, in order, separated by spaces.
     * @param birthDate - the intended birth date.
     * @throws IllegalArgumentException when fullName contains less than one
     *                                  character or when fullName contains something other than letters, spaces,
     *                                  hyphens, or apostrophes.
     */
    public Employee(String fullName, LocalDate birthDate,final @NotNull String employeeId)
    {

        super(fullName, birthDate);
        if(!(employeeId.length() < 8 && employeeId.length() > 8))
        {
            this.employeeId = employeeId;
        }
        else
        {
            throw new IllegalArgumentException("Employee ID cannot be less than or greater than 8 digit. An ID can only br of 8 digit");
        }
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public double calculatePayDay()
    {
        return 0 ;
    }



}
