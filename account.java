package hellotest;
import java.util.*;
import java.text.DecimalFormat;
public class account 
{

	
		Scanner input=new Scanner(System.in);
		DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
		/* setting the customer number*/
		int setCustomerNumber(int customerNumber)
		{
			this.customerNumber=customerNumber;
			return customerNumber;
		}
		/* getting the customer number*/
		public int getCustomerNumber()
		{
			return customerNumber;
		}
		/* Set the pin number*/
		public int setPinNumber(int pinNumber)
		{
			this.pinNumber=pinNumber;
			return pinNumber;
		}
		/* Get the pin number*/
		public int getPinNumber()
		{
			return pinNumber;
		}
		/* Get checking Account balance*/
		public double getCheckingBalance()
		{
			return checkingBalance;
		}
		/* Get saving Account balance*/
		public double getSavingBalance()
		{
			return savingBalance;
		}
		/* Calculate checking account withdrawal*/
		public double calcCheckingWithdraw(double amount)
		{
			checkingBalance=(checkingBalance -amount);
			return checkingBalance;
		}
		/* Calculate saving account withdrawal*/
		public double calcSavingWithdraw(double amount)
		{
			savingBalance=(savingBalance -amount);
			return savingBalance;
		}
		/* Calculate checking account withdrawal*/
		public double calcCheckingDeposit(double amount)
		{
			checkingBalance=(checkingBalance +amount);
			return checkingBalance;
		}
		/* Calculate saving account withdrawal*/
		public double calcSavingDeposit(double amount)
		{
			savingBalance=(savingBalance +amount);
			return savingBalance;
		}
		/* Customer checking account withdraw input*/
		public void getCheckingWithdrawInput()
		{
			System.out.println("checking account balance"+moneyFormat.format(checkingBalance));
			System.out.println("amount you want to withdraw from checking account");
			double amount=input.nextDouble();
			if((checkingBalance-amount)>=0)
			{
				calcCheckingWithdraw(amount);
				System.out.println("new checking account balance:" +moneyFormat.format(checkingBalance));
				
			}
			else
			{
				System.out.println("balance cannot be negative"+"\n");
			}
		
		}
		/* Customer saving account withdraw input*/
		public void getSavingWithdrawInput()
		{
			System.out.println("saving account balance"+moneyFormat.format(savingBalance));
			System.out.println("amount you want to withdraw from saving account");
			double amount=input.nextDouble();
			if((savingBalance-amount)>=0)
			{
				calcSavingWithdraw(amount);
				System.out.println("new saving account balance:" +moneyFormat.format(savingBalance));
				
			}
			else
			{
				System.out.println("balance cannot be negative"+"\n");
			}
		
		}
		/* Customer checking account deposit input*/
		public void getCheckingDepositInput()
		{
			System.out.println("checking account balance"+moneyFormat.format(checkingBalance));
			System.out.println("amount you want to deposit in checking account");
			double amount=input.nextDouble();
			if((checkingBalance+amount)>=0)
			{
				calcCheckingDeposit(amount);
				System.out.println("new checking account balance:" +moneyFormat.format(checkingBalance));
				
			}
			else
			{
				System.out.println("balance cannot be negative"+"\n");
			}
		
		}
		
		/* Customer saving account withdraw input*/
		public void getSavingDepositInput()
		{
			System.out.println("saving account balance"+moneyFormat.format(savingBalance));
			System.out.println("amount you want to deposit in saving account");
			double amount=input.nextDouble();
			if((savingBalance+amount)>=0)
			{
				calcSavingDeposit(amount);
				System.out.println("new checking account balance:" +moneyFormat.format(savingBalance));
				
			}
			else
			{
				System.out.println("balance cannot be negative"+"\n");
			}
		
		}
		private int customerNumber;
		private int pinNumber;
		private double checkingBalance=0;
		private double savingBalance=0;
	
	

}