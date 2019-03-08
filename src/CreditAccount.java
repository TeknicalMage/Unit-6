
public class CreditAccount implements Banking{
	
	static double a,b;
	public CreditAccount(double a, double b) {
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args) {
	}


	public double withdraw(double i) {
		
		b = b -i;
		i = b;
		//System.out.println(i);
		return i;
		}

	public double deposit(double j) {
		b = b + j;
		j = b;
		//System.out.println(j);
		return j;
	}
	
	public double getbal(double l) {
		double u = (a/100);
		//double t =(u * b);
		l = b;
		System.out.println("Credit Account " + l + " Interest rate " + u);
		return l;
	}

}
