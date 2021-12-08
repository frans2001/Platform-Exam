import java.util.Scanner;
class Main {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("input your annual salary : ");
    int annualsalary = input.nextInt();
    double monthlyrate = annualsalary / 12;
    double dailyrate = monthlyrate / 22;
    double hourlyrate = dailyrate / 8;
    System.out.printf("\nMonthly Rate is : %.2f", monthlyrate);
    System.out.printf("\nDaily Rate is : %.2f", dailyrate);
    System.out.printf("\nHourly Rate is : %.2f", hourlyrate);

    double tax, tax_deduction, annual_tax_deduction = 0;

    if ((annualsalary >= 250000) && (annualsalary <= 400000)) {
      tax = annualsalary-250000;
      tax_deduction = tax * .20;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nAnnual tax is : %.2f", annual_tax_deduction);
    }
    else if ((annualsalary >= 400000) && (annualsalary <= 800000))  {
      tax = annualsalary-30000;
      tax -= 400000;
      tax_deduction = tax * .25 + 30000;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nAnnual tax is : %.2f", annual_tax_deduction);
    }
    else if ((annualsalary >= 800000) && (annualsalary <= 2000000)) {
      tax = annualsalary-130000;
      tax -= 800000;
      tax_deduction = tax * .30 + 130000;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nAnnual tax is : %.2f", annual_tax_deduction);
    }
    else if ((annualsalary >= 2000000) && (annualsalary <= 8000000))  {
      tax = annualsalary-490000;
      tax -= 2000000;
      tax_deduction = tax * .32 + 490000;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nAnnual tax is : %.2f", annual_tax_deduction);
    }
    else if (annualsalary >= 8000000)  {
      tax = annualsalary-2410000;
      tax -= 8000000;
      tax_deduction = tax * .35 + 2410000;
      annual_tax_deduction = tax_deduction;
      System.out.printf("\nAnnual tax is : %.2f", annual_tax_deduction);
    }

    double monthly_tax_deduction = annual_tax_deduction / 12;
    double net_pay = monthlyrate - monthly_tax_deduction;
    System.out.printf("\nMonthly Tax Deduction is : %.2f", monthly_tax_deduction);
    System.out.printf("\nNet Pay is : %.2f ", net_pay);






  }
}