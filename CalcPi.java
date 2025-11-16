// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   
		int num = Integer.parseInt(args[0]);
		double p = 0.0;
		for (int i=0; i<num; i++) {
			if (i % 2==0 ){
				p = p + (double)(1.0/(1.0+2.0*(double)i));
			}else{
				p = p + -(double)(1.0/(1.0+2.0*(double)i));
			}
			 

		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (4 * (p)));
	}
}
