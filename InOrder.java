/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
import java.util.Random;
public class InOrder {
	public static void main (String[] args) {
		Random rand = new Random();
		int randomnum = rand.nextInt(10); // TODO use camelCase...randomNum
		System.out.print(randomnum+"");
		int newrandom = rand.nextInt(10);
		// TODO: break lines sometimes. It will make the code more readable
		while(newrandom>=randomnum){
			System.out.print(" "+newrandom+"");
			randomnum = newrandom;
			newrandom = rand.nextInt(10);
		}
		System.out.println("");
	}
}
