// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
		int minutesToAdd = Integer.parseInt(args[1]);
		int totalMin = (hours * 60 + minutes + minutesToAdd);
		int totalHours = (totalMin/60);
		hours = totalHours % 24;
		minutes = (totalMin - totalHours * 60);
		System.out.println(hours + ":" + minutes);
	}
}
