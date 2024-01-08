/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int perfnum = Integer.parseInt(args[0]);
		int sumdividors = 0; // TODO: sumDividors
		for(int i=1; i<perfnum; i++){
			if(perfnum % i == 0){
				sumdividors = sumdividors + i;
			}
		}
		if(sumdividors == perfnum){
			System.out.print(perfnum+" is a perfect number since "+perfnum+" =");
			for (int i=1; i<perfnum; i++){
				if(perfnum % i == 0){
					if(i == 1){
						System.out.print(" "+i);
					}
					else{
						System.out.print(" + "+i);
					}
				}
			}
			System.out.println("");
		}
		else{
			System.out.println(perfnum +" is not a perfect number");
		}

		/* TODO: see JAVA guidline document in the moodle.
		   It's recommended to write like this:

			if (sumDividors != perfunum){
					System.out.println(perfnum +" is not a perfect number");
					return;
			}
			
			System.out.print(perfnum+" is a perfect number since "+perfnum+" =");
			for (int i=1; i<perfnum; i++){
				if(perfnum % i == 0){
					if(i == 1){
						System.out.print(" "+i);
					}
					else{
						System.out.print(" + "+i);
					}
				}
			}
			System.out.println("");

		*/
		
	}
}
