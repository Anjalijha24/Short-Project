import java.util.Scanner;
public class Banking {
	
	int amount;
	char name;
	Scanner bank = new Scanner(System.in);
	public static void main(String[] args) 
	{
	  Banking obj=new Banking();
	  
	  for(int i=1;i<=3;i++)
	  {
		  obj.accountholdername();
		  obj.account();
		  obj.deposit();
		  obj.withdraw();
	  }
	  
	}
	public void accountholdername()
	{
		System.out.println("Enter the accountHolderName");
		char operation=bank.next().charAt(0);
		
	}
	public void account()
	{
		System.out.println("Enter the account number");
		int acc=bank.nextInt();
		System.out.println("Your available amount is:" + amount);
	}
    public void deposit()
    {
    	System.out.println("Enter the deposit Amount");
    	int deposit=bank.nextInt();
    	amount=deposit+amount;
    	System.out.println("Available balance is:"+amount);
    	
    }
    public void withdraw()
    {
    	System.out.println("Enter the withdraw amount");
    	int withdraw=bank.nextInt();
    	if(amount>=withdraw)
    	{
    		amount= amount-withdraw;
    		System.out.println("your withdrawl Successfully");
    	}
    	else
    	{
    		System.out.println("Insufficient Balance");
    		System.out.println("your available amount is"+amount);
    	}
    	
    }
   
}

