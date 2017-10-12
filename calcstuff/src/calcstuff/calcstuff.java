package calcstuff;

import java.util.Scanner;

public class calcstuff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String c = new String(); 
		
		ScientificPart sp = new ScientificPart();
		Arithmatic ap = new Arithmatic();
		
	    double x, y, choice=0;
		double ans = 0, i=0;
	    char op;
	    String str1;
	    
	    System.out.println("Please use space after each word.");
	    
	    while(i==0) {
	    	System.out.println("Enter 1 for basic calculation");
	    	System.out.println("Enter 2 for scientific calculation : ");

	    	choice = sc.nextDouble();
	    	
	    	if(choice==1) {
	    		System.out.println("Enter Expression: ");
	    	
	    		x = sc.nextDouble();
	    		op = sc.next().charAt(0);
	    		y = sc.nextDouble();
	    		
	    		ap.calc(x, y, op, ans);
	    		
	    	}
	    	
	    	else if(choice==2) {
	    		System.out.println("Enter Expression: ");
	    		
	    		str1 = sc.next();
	    		x = sc.nextDouble();
	    		ans = 0;
	    		
	    		sp.calcIt(str1, x, ans);
	    		
	    	}
	    	
	    	else
	    		break;
	    }

	}

}
