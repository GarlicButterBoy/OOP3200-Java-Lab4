package ca.durhamcollege;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        LocalDate currentDate = LocalDate.now();
        SalariedEmployee test = new SalariedEmployee("Nick Sturch", currentDate, "10030376", 50000);
        HourlyWorker testhour = new HourlyWorker("Kaifkhan Vakil", currentDate, "10025845", 18, 40);


	    System.out.println(test.toString());
        System.out.println(testhour.toString());

    }
}
