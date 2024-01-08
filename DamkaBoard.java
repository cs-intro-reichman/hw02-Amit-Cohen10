/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int damkarow = Integer.parseInt(args[0]); // TODO: damkaRow..anyway bad naming, what does it mean?
		for(int i=1; i<=damkarow; i++){ // TODO: i and j is very generic names, would be better 'row' and 'col'
			for(int j=1; j<=damkarow; j++){
				if(i%2==1){
					// TODO: hmm...you don't need if and else here, the content inside is the same
					if(i==1){
						System.out.print("* ");
					}
					else{
						System.out.print("* ");
					}
				}
				else{
					System.out.print(" *");
				}
			}
			System.out.println("");
		}
	}
}
