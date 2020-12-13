package ca.durhamcollege;

import java.time.LocalDate;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args)
    {
        //Declarations
        LocalDate currentDate = LocalDate.now();
        double totalPay = 0.0;
        //Salary Employees
        SalariedEmployee testSalary = new SalariedEmployee("Nick Sturch", currentDate, "10030376", 50000);
        SalariedEmployee salaryTwo = new SalariedEmployee("Randolph Carter", currentDate, "10764582", 63000);
        SalariedEmployee salaryThree = new SalariedEmployee("Jayjonah Jameson", currentDate, "16458214", 49000);
        //Hourly Employees
        HourlyWorker testHourly = new HourlyWorker("Kaifkhan Vakil", currentDate, "10021423", 18, 40);
        HourlyWorker hourlyTwo = new HourlyWorker("Dennis Nedry", currentDate, "14514587", 32, 36);
        HourlyWorker hourlyThree = new HourlyWorker("War Lock", currentDate, "10256597", 17, 26);
        HourlyWorker hourlyFour = new HourlyWorker("Conan-The Barbarian", currentDate, "41852585", 45, 48);


        try
        {
            //Print the salary worker, then Update
            System.out.println(testSalary.toString());
            System.out.println("Please enter a new yearly salary for " + testSalary.getFirstName());
            testSalary.setYearlySalary();
            System.out.println("New Salary is: " + testSalary.round(testSalary.getYearlySalary(), 2));

            //Print the Hourly Worker, then Update
            System.out.println(testHourly.toString());
            System.out.println("Please enter a new hourly rate for " + testHourly.getFirstName());
            testHourly.setHourlyRate();
            System.out.println("Please enter " + testHourly.getFirstName() + "'s hours this week: ");
            System.out.println("Your new Rate is: " + testHourly.round(testHourly.getHourlyRate(), 2));
            testHourly.setHoursPerWeekAmount();
            System.out.println("Your hours worked is: " + testHourly.round(testHourly.getHoursPerWeekAmount(), 2));

            //Array with both types of employees
            Employee workerArray[] = new Employee[]{testSalary, salaryTwo, salaryThree, testHourly, hourlyTwo, hourlyThree, hourlyFour};


            System.out.println("\nPrinting out the Employee Array");
            for (int i = 0; i < workerArray.length; i++)
            {
                totalPay += workerArray[i].calculatePayDay();
                System.out.println(workerArray[i].getFirstName() + " or Employee " + workerArray[i].getEmployeeId() + " is being paid $" + workerArray[i].calculatePayDay());
            }
            System.out.println("Total Cost this Week : $" + testHourly.round(totalPay,2) );

        }
        catch(ArithmeticException ae)
        {
            System.out.printf("\n INVALID: %s", ae.toString());

        }
        catch(IllegalArgumentException iae)
        {
            System.out.printf("\n INVALID: %s", iae.toString());
           // endFlag = true;
        }
        catch(InputMismatchException ime)
        {
            System.out.print("\nINVALID: Your input was incorrect. Ending Program.");
            //endFlag = true;
        }


    }
}
