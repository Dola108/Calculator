package calcstuff;

public class ScientificPart extends calcstuff{

	public void calcIt(String str1, double x, double ans) {
		if(str1.compareTo("sin")==0) {
			ans = Math.sin(x);
    		System.out.println("Answer: " + ans);
		}
		
		else if(str1.compareTo("cos")==0) {
			ans = Math.cos(x);
    		System.out.println("Answer: " + ans);
		}
		
		else if(str1.compareTo("tan")==0) {
			ans = Math.tan(x);
    		System.out.println("Answer: " + ans);
		}

		else if(str1.compareTo("sqrt")==0) {
			ans = Math.sqrt(x);
    		System.out.println("Answer: " + ans);
		}
		
		else
			System.out.println("format: func+space+digit");
	}

}
