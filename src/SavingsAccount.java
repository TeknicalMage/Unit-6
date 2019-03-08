
public class SavingsAccount implements Banking  {

	static double x,y;
	public SavingsAccount(double x, double y) {
		this.x=x;
		this.y=y;
	
	}
	
	public double balance;
	public double interest;	

	public static void main(String[] args) {
	}


	public double withdraw(double i) {
		i = x - i;
		x = i;
		return i;
		}

	public double deposit(double j) {
		x = x + j; 
		j = x;
		return j;
	}
	
	public double getbal(double l) {
		l = x;
		System.out.println("Saving Account " + l + " Interest " +y);
		return l;
	}

}
