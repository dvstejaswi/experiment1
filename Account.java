package bank.entity;

public class Account {
	private int id;
	private String name;
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public Account() {}
		public Account(int id, String name, double balance)
		{
			this.id=id;
			this.name=name;
			this.balance=balance;
			
		}
	   public double addAmount(double amt)
		{
			this.balance+=amt;
		return balance;
		}
		public double deduct(double amt)
		{
			this.balance-=amt;
			return balance;
		}
		public String transfer(Account b, double amt)
		{
			this.balance +=amt;
			b.balance -=amt;
			return "The balance after crediting is" + this.balance +  "The balance after debting is" + b.balance;
		}
		}
		
		
	
	


