
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double rand =0;
		boolean boy = false;
		boolean girl = false;
		int count = 0;
		while(boy != true || girl != true){
			rand = Math.random();
			if(rand<0.5){
				boy =true;
				if(count == 0){
					System.out.print("b");
				}
				else{
					System.out.print(" b");
				}
			}
			else{
				girl = true;
				if(count == 0){
					System.out.print("g");
				}
				else{
					System.out.print(" g");
				}
			}
			count++;
		}
		System.out.println("");
		System.out.println("You made it... and you now have "+count+" children");
	}

}
