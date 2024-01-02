/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0];
		String backward = "";
		int i = 0;
		while (i<str.length()){
			backward = backward + str.charAt(str.length()-i -1);
			i++;
		}
		System.out.println(backward);
		System.out.println("The middle character is "+backward.charAt(str.length()/2));
	}
}
