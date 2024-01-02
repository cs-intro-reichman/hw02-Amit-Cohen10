/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		double rand =0;
		boolean boy = false;
		boolean girl = false;
		int count = 0;
		int fam2 = 0, fam3 = 0, fam4 =0;
		double averg = 0;
		int T = Integer.parseInt(args[0]);
		int countT = 0;
		while(T != countT){
			boy = false;
			girl = false;
			count = 0;
			while(boy != true || girl != true){
				rand = Math.random();
				if(rand<0.5){
					boy =true;
				}
				else{
					girl = true;
				}
				count++;
			}
			if(count == 2){
				fam2++;
			}
			else if(count == 3){
				fam3++;
			}
			else{
				fam4++;
			}
			averg = averg + count;
			countT++;
		}
		averg = averg / T;
		System.out.println("Average: "+ averg+" children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+fam2);
		System.out.println("Number of families with 3 children: "+fam3);
		System.out.println("Number of families with 4 or more children: "+fam4);
	}
}
