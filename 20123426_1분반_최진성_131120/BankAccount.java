/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/

import java.util.*;

public class BankAccount implements Comparable<BankAccount>
{  
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }

   public double getMeasure()
   {
      return balance;
   }

	public int compareTo(BankAccount other)
	{
		if(balance < other.balance)
			return 1;
		else if(balance > other.balance)
			return -1;
		else
			return 0;
	}
	
	public static void main(String[] args)
	{
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		
		list.add(new BankAccount(1.12));
		list.add(new BankAccount(19.99));
		list.add(new BankAccount(58.49));
		list.add(new BankAccount(12.11));
		list.add(new BankAccount(25.65));

		Collections.sort(list);

		for(BankAccount b : list)
			System.out.println(b.getBalance());
	}

   private double balance;
}
