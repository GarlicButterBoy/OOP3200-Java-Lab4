package ca.durhamcollege;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

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

    public void setHourlyRate(double hourlyRate)
    {
        if (hourlyRate >= 17)
        {
            this.hourlyRate = hourlyRate;
        }
    }

    public double getHoursPerWeekAmount() {
        return hoursPerWeekAmount;
    }

    public void setHoursPerWeekAmount(double hoursPerWeekAmount)
    {
        if (hoursPerWeekAmount <= 48)
        {
            this.hoursPerWeekAmount = hoursPerWeekAmount;
        }

    }
    @Override
    public double calculatePayDay()
    {
        return (hourlyRate * hoursPerWeekAmount);
    }
}
