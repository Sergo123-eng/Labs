
public class MyPyramid {

	public static void main(String[] args) {
		//number of rows neededfor the pyramid
		int rows=6;
		
		/*
		 * loop priting rows
		 * how it works
		 * i starts from zero because java counts from zero so the first row index is zero
		 * i will be less than number of rows so the excuation will stop at row index 7
		 * after that there will be error and the loop will stop excutation
		 * i will icrument until this conidtion makes the error
		 * in this way, the rows are printed
		 */
		
		
		for(int i=0; i<rows;i++) {
			
			/*
			 * loop prints the spaces
			 * the spaces will be horizontally
			 * the spaces will start from row with inex zero
			 * spaces will decrease as i increase 
			 * ex: 8-1+1=8. 8-2+1=7
			 * 
			 */
			for (int j=0;j< rows-i+1;j++) {
				System.out.print("  ");
				
			}
			// loop prints the increasing part of the pyramid( the left side)
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num +" ");
				num *=2;
				
			}
			num/=2;
			for(int j= i-1;j>=0;j--) {
				num /=2;
				System.out.print(num + "  ");
			}
			System.out.println();
		}

	}

}
