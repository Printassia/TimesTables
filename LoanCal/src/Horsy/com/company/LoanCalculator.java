package Horsy.com.company;

//Import Statements
import java.text.NumberFormat;
        import java.util.Scanner;

/**
 * Monthly  Loan Payment Calculator
 */
public class LoanCalculator {
    public static void main(String[] args) {
        //Scanner and Declarations
        Scanner input = new Scanner(System.in);
        int principal, timePeriod;
        byte years;
        final byte PERCENT = 100;
        final byte COMPOUNDED_MONTHLY = 12;
        float interestRate, interestRateByMonths;
        double totalInterestRate, totalInterestWithExponent, numeratorTotal, denominatorTotal,
                monthlyPayment;
        String monthlyMortgageConvertedToString;

        //Input the principal
        System.out.print("Principal: ");

        principal = input.nextInt();
        //Input the Interest rate

        System.out.print("Annual Interest Rate: ");
        interestRate = input.nextFloat() / PERCENT;

        //Input the years
        System.out.print("Period: ");
        years = input.nextByte();

        //Divide Interest Rate By 12
        interestRateByMonths = interestRate / COMPOUNDED_MONTHLY;

        //Formula
        //First Part of the equation
        //Calculate the Month-Period
        timePeriod = years * COMPOUNDED_MONTHLY;
        //Calculate the Total Interest Rate(1 + Interest Rate / 12)
        totalInterestRate = 1 + interestRateByMonths;
        //Calculate the Total Interest Rate raised to the time period
        totalInterestWithExponent = Math.pow(totalInterestRate, timePeriod);
        //Multiply the total interest rate that was raised by the time period
        numeratorTotal = interestRateByMonths * totalInterestWithExponent;

        //Second Part of the equation
        //Calculate the denominator: total interest rate with exponent subtracted from 1
        denominatorTotal = totalInterestWithExponent - 1;
        //Calculate the monthly payment
        monthlyPayment = (principal * (numeratorTotal / denominatorTotal));
        //Convert to String for a currency output
        monthlyMortgageConvertedToString = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println("Mortgage: " + monthlyMortgageConvertedToString);
    }
}