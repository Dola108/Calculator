package calcstuff;

public class Arithmatic extends calcstuff{

	public void calc(double x, double y, char op, double ans) {			
		if(op=='+')
			ans = x+y;
		
		else if(op=='-')
			ans = x-y;
		
		else if(op=='*')
			ans = x*y;
		
		else if(op=='/')
			ans = x/y;
		
		else if(op=='^')
			ans = Math.pow(x, y);
		
		System.out.println("Answer: " + ans);
	}

}
