
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double hourlyPayRate = 12.75;
        final double fedTax = 0.2;
        final double stateTax = 0.09;
        String employeeName;
        double weeklyHoursWorked;

        System.out.print("Enter Employee Name: ");
        employeeName = input.nextLine();

        System.out.print("Enter Hours worked this week: ");
        weeklyHoursWorked = input.nextDouble();

        double grossPay = hourlyPayRate * weeklyHoursWorked;


        double fedTaxPay = grossPay * fedTax;


        double stateTaxPay = grossPay * stateTax;



        double totalTax = stateTaxPay + fedTaxPay;


        double netPay = grossPay - totalTax;


        System.out.println(" ");

        System.out.println(employeeName + ", you have worked " + weeklyHoursWorked
                + " hours this week with an hourly pay of " + hourlyPayRate + " per hour.");

        System.out.print("Your gross pay was $" + grossPay
                + ", after a federal tax deduction of $" + fedTaxPay + " and a state tax deduction of $"
                + stateTaxPay + ", your net pay is $" + netPay + ".");

        System.out.println(" ");
    }

}
