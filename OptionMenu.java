package hellotest;
import java.util.*;
import java.util.Map.Entry;
import java.text.DecimalFormat;
import java.io.IOException;
public class OptionMenu extends account 
{
	Scanner menuinput=new Scanner(System.in);
			DecimalFormat moneyFormat=new DecimalFormat(" '$' ###,##0.00") ;
	HashMap<Integer, Integer> data=new HashMap<Integer,Integer >();
	public void getLogin() throws IOException
	{
		int x=1;
		do
		{
			try
			{
				data.put(9876345,9876);
				data.put(9876345,9876);
				data.put(99120078, 5674);
				System.out.println("welcome to ATM Project!");
				System.out.println("Enter your customer number: ");
				setCustomerNumber(menuinput.nextInt());
				System.out.println("Enter your pin Number: ");
				setPinNumber(menuinput.nextInt());
			}catch(Exception e)
			{
				System.out.println("\n" +" Invalid character(s). Only numbers."+ "\n");
				x=2;
			}
			for(Entry<Integer, Integer> entry :data.entrySet())
			{
				
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
				{
					getAccountType();
				}
			}
			System.out.println("\n"+"wrong customer number or pin number."+"\n");
		}while(x==1);
	}
	
		public void getAccountType()
		{
			
			System.out.println("select the account you want to access:");
			System.out.println("Type 1-Checking Account");
			System.out.println("Type 2-Saving Account");
			System.out.println("Type 3-Exit");
			System.out.println("choice");
			 selection=menuinput.nextInt();
			switch(selection)
			{
			case 1:
				getChecking();
				break;
			case 2:
				getSaving();
				break;
			case 3:
				System.out.println("Thank you for using this ATM, bye.");
				break;
				default:
					System.out.println("\n"+"Invalid choice."+"\n");
					getAccountType();
			}
		}
		public void getChecking()
		{

			System.out.println("checking account");
			System.out.println("Type 1-view balance");
			System.out.println("Type 2-withdraw funds");
			System.out.println("Type 3-deposit funds");
			System.out.println("Type 4-exit");
			System.out.println("Choice: ");
			selection=menuinput.nextInt();
			switch(selection)
			{
			case 1:
				System.out.println("checking account balance:"+moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
			case 2:
				getCheckingWithdrawInput();	
				getAccountType();
				break;
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you for using this ATM, bye.");
				break;
			default:
				System.out.println("\n"+"Invalid choice."+"\n");
				getChecking();				
			}
		}
		public void getSaving()
		{

			System.out.println("saving account");
			System.out.println("Type 1-view balance");
			System.out.println("Type 2-withdraw funds");
			System.out.println("Type 3-deposit funds");
			System.out.println("Type 4-exit");
			System.out.println("Choice: ");
			selection=menuinput.nextInt();
			switch(selection)
			{
			case 1:
				System.out.println("saving account balance:"+moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
			case 2:
				getSavingWithdrawInput();	
				getAccountType();
				break;
			case 3:
				getSavingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you for using this ATM, bye.");
				break;
			default:
				System.out.println("\n"+"Invalid choice."+"\n");
				getChecking();				
			}
		}
		int selection;
		
	}

	
	

