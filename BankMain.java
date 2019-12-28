package bank.ui;
import bank.entity.*;


public class BankMain {
	public static void main(String[] args) {
		Account[] a= new Account [3];
		a[0]=new Account(1,"AISHA",1000);
		a[1]=new Account(12,"Amul",2000);
		a[2]=new Account(21,"Anu",1500);
		
		
		System.out.println(a[0].transfer(a[1],100));
		System.out.println(a[2].transfer(a[1],500));
		
		
	}

}
