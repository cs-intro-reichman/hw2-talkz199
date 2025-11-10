//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String word = args[0];
            int num = Integer.parseInt(args[1]);
            // להעלות את האותיות לאותר גדולהֿ
           word = word.toUpperCase();
           String x ="a "  ;
             


        


            for(int i=0; i < word.length(); i++){
                String anLetters = "AEFHILMNORSX";
                int an = anLetters.indexOf(word.charAt(i));
                if (an == -1) {
                x = "an " ;
                }
                System.out.println("Give me " + x + word.charAt(i) + ": " + word.charAt(i) + "!");
            }

            System.out.println("What does that spell?");

            for(int i=1; i <= num; i++){
                System.out.println(word + "!!!");
            }

        }
}
