
public class Practicing {

	public static void main(String[] args) {
		int rows=8; // number of rows in the pyramid
		// loop to print rows
		for(int i=0;i<rows;i++) {
			// loop to make the spaces between rows
			/*
			 * ␣␣␣␣␣␣␣ (7 spaces)
			 * This is what rows-i-1 do because number of rows needs 7 spaces            
			 *                               
			 */
			for(int j=0; j<rows-i-1;j++) {
				System.out.print(" ");
			}
			// we done setup the pyramid next step is printing the numbers
			
			// print the increasing part of the pattern
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num + "  ");
				
				num*=2;
			}
			 num/=2; 
			 for(int j=i-1;j>=0;j--) {
				 num/=2;
				 System.out.print(num + "  ");
			 }
			 System.out.println();
		}
		
}
}
