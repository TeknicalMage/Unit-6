
public class CheckingAccount implements Banking{

	static double x;
	public CheckingAccount(double x) {
		this.x=x;
	}
	
	private static double balance = x;
	
	public void setbalance(double balance) {
		CheckingAccount.balance = balance;
	}
	public double getbalance() {
		return balance;
	}
	

	public static void main(String[] args) {
	}
	
	public double withdraw(double i) {
		x = x - i;
		i = x;
		//System.out.println(i);
		return i;
		}

	public double deposit(double j) {
		x = x + j;
		j = x;
		//System.out.println(j);
		return j;
	}
	
	public double getbal(double l) {
		l = x;
		System.out.println("Checking Account " + l);
		return l;
	}

}
