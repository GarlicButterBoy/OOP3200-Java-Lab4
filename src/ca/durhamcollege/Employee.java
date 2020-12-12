package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;
//For round method
import java.math.BigDecimal;
import java.math.RoundingMode;
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
        //if employee id is 8chars then proceed, otherwise throw an error
        if(employeeId.length() == 8)
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
        double payday = 0.00;

        return payday;
    }

    public String toString()
    {
        String outputStr = "";
        outputStr += "\n========================================\n";
        outputStr += getName() + "\n";
        outputStr += getFirstName() + "'s Birthday: " + getBirthDate() + "\n";
        outputStr += getFirstName() + "'s Id: " + getEmployeeId() + "\n";
        outputStr += "========================================\n";

        return outputStr;
    }


    //Got this method from this comment : https://stackoverflow.com/a/2808648
    //Just so you know! :)
    public static double round(double value, int places)
    {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

}
