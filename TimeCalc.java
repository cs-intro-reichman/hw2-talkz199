public class TimeCalc {
    public static void main(String[] args) {
      
	   
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
		int minutesToAdd = Integer.parseInt(args[1]);
		int totalMin = (hours * 60 + minutes + minutesToAdd);
		int totalHours = (totalMin/60);
		hours = totalHours % 24;
		minutes = (totalMin - totalHours * 60);

        if (hours < 10) {
			System.out.print("0" + hours);
		} else {System.out.print(hours);}

        if (hours < 10) {
			System.out.println(":0" + minutes);
		} else {System.out.println(":" + minutes);}


		
	}
}

  
