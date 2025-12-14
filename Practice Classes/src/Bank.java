
public class Bank {
	static double rateOfInterest=5.5;
	
	static void showRate() {
		System.out.println("rate of Interest=" +rateOfInterest+"%");
	}
	
	class Account{
		String name;
		double balance;
	
			Account(String n,double balance){
			
			name=n;
			balance=b;
			}
			void deposit(double amount) {
				balance+=amount;
				System.out.println(name+ "deposited" +amount+ "|| New Balance is" +balance );
				}
			void withdraw(double amount) {
			if(balance>=amount) {
				balace-=amount;
				
			
			}
			}
			
		
	}
	
	
	

}
