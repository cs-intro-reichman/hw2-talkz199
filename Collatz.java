// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int N = Integer.parseInt(args[0]);
		char mode = args[1].charAt(0);
		
		

		
			for (int i=1; i <=N;i++){
				int seed = i;
				int count = 1;
				if (mode == 'v'){
			
					System.out.print(seed);
				}
				
				if (seed % 2 ==0 ){
				
					seed = seed/2 ;
					if (mode == 'v'){
					System.out.print(" " + seed);
					}
					count++;
				}else {
					seed = (seed * 3 + 1);
					if (mode == 'v'){
					System.out.print( " " +seed);
					}
					count++;
					
				}

				while (seed>1){
					if (seed % 2 ==0 ){
				
						seed = seed/2 ;
						if (mode == 'v'){
						System.out.print(" " + seed);
						}
						count++;
					}else {
						seed = (seed * 3 + 1);
						if (mode == 'v'){
						System.out.print( " " +seed);
						}
						count++;
						
						}		
					}
					if (mode == 'v'){
					System.out.println(" (" + count + ")");
					
					}
					
				}
				System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
			
			
		}
	}

	
