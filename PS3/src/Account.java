//Winston Zhong
import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account()
	{
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
	}
	
	Account(int id, double balnce, double annualInterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate/12);
	}
	
	public double withdraw(double amount)
	{
		return (balance -= amount);
	}
	
	public double deposit(double amount)
	{
		return (balance += amount);
	}
	
	public static void main (String[]args) {
		Account Test = new Account(1122,20000, .045);
		Test.withdraw(2500);
		Test.deposit(3000);
		System.out.println("Balance: " + Test.balance);
		System.out.println("Monthly Interest: " + Test.getMonthlyInterestRate());
		System.out.println("Account created on: " + Test.getDateCreated());
	}
	
}
