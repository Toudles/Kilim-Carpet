
public class Part2 {
	
	//first line
	public static void printFirstLine(int rows, int columns) {
		
		int row = rows;
		int column = columns;
				
		for(row = 1; row <= 2; row++) {
			for(column = 1; column <= 37; column++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
	}
	
	//first part of carpet
	public static void printFirstCarpet(int rows, int columns, int spaces) {
		int row = rows;
		int column = columns;
		int space = spaces;
		
		for(row = 1; row <= 2; row++) {
			for(column = 1; column <= 4; column++) {
				System.out.print("$");
			}
			for(space = 1; space <= 4; space++) {
				System.out.print(" ");
			}
			for(column = 1; column <= 4; column++) {
				System.out.print("%");
			}
			for(space = 1; space <= 4; space++) {
				System.out.print(" ");
			}
			for(column = 1; column <= 5; column++) {
				System.out.print("+");
			}
			for(space = 1; space <= 4; space++) {
				System.out.print(" ");
			}
			for(column = 1; column <= 4; column++) {
				System.out.print("!");
			}
			for(space = 1; space <= 4; space++) {
				System.out.print(" ");
			}
			for(column = 1; column <= 4; column++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	
	//second part of carpet
	public static void printSecondCarpet(int rows, int columns, int spaces) {
		int row = rows;
		int column = columns;
		int space = spaces;
		
		for(row = 1; row <= 2; row++) {
			for(space = 1; space <= 4; space++) {
				System.out.print(" ");
			}
			for(column = 1; column <= 4; column++) {
				
				System.out.print("@");
			}
			for(space = 1; space <= 4; space++) {
				System.out.print(" ");
			}
			for(column = 1; column <= 4; column++) {
				System.out.print("!");
			}
			for(space = 1; space <= 5; space++) {
				System.out.print(" ");
			}
			for(column = 1; column <= 4; column++) {
				System.out.print("%");
			}
			//creates spacing
			for(space = 1; space <= 4; space++) {
				System.out.print(" ");
			}
			for(column = 1; column <= 4; column++) {
				System.out.print("$");
			}
		System.out.println();
		}
	}
	
	//first set of diamonds (first half)
	public static void printTopDiamonds(int rows, int columns, int spaces) {
		int row = rows;
		int column = columns;
		int space = spaces;
		
		for(row = 1; row < 5; row++) {
			for(column = row; column <= 5; column++) {
				System.out.print(" ");
			}
			//had some trouble (not quite sure why this creates a diamond)
			//look into it
			//changing this from row to 5 i think adds more stars to the right
			for(column = 1; column < row; column++) {
				System.out.print("* ");
			}
			//changing this from 1 to 5 i think adds more stars to the right 
			for(column = 1; column <= 1; column++) {
				System.out.print("* ");
			}
			
			
			
			//creates spacing for 2nd shape to the right of first diamond
			for(space = 1; space <= 4; space++) {
				System.out.print(" ");
			}
			for(column = 1; column < 1; column++) {
				System.out.print("* ");
			}
			for(column = row; column <= 5; column++) {
				System.out.print("* ");
			}
			
			
			//create 2nd diamond
			for(column = 1; column <= 8; column++) {
				System.out.print(" ");
			}
			for(column = 1; column < row; column++) {
				System.out.print("* ");
			}
			for(column = 1; column <= 2; column++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	//first set of diamonds (second half)
	public static void printBotDiamonds(int rows, int columns, int spaces) {
		int row = rows;
		int column = columns;
		int space = spaces;
		
		for(row = 1; row <= 5; row++) {
			for(column = 1; column <= row; column++) {
				System.out.print(" ");
			}
			for(column = 5; column < 5; column++) {
				System.out.print("* ");
			}
			for(column = row; column <= 5; column++) {
				System.out.print("* ");
			}
			
			
			//creates spacing for 2nd half of 2nd shape to the right of the diamond
			for(space = 1; space <= 4; space++) {
				System.out.print(" ");
			}
			//experiment with making diff shapes (with rows/numbers)
			for(column = 5; column < row; column++) {
				System.out.print("* ");
			}
			for(column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			
			
			//create second diamond
			for(column = 1; column <= 8; column++) {
				System.out.print(" ");
			}
			for(column = 5; column < 6; column++) {
				System.out.print("* ");
			}
			for(column = row; column <= 5; column++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String [] Args) {
	
		printFirstLine(1, 1);
		
		printFirstCarpet(1, 1, 1);
		printSecondCarpet(1, 1, 1);
		
		printFirstLine(1, 1);
		
		printTopDiamonds(1, 1, 1);
		printBotDiamonds(1, 1, 1);
		
		printTopDiamonds(1, 1, 1);
		printBotDiamonds(1, 1, 1);
		
		printFirstLine(1, 1);
		
		printSecondCarpet(1, 1, 1);
		printFirstCarpet(1, 1, 1);
		
		printFirstLine(1, 1);
	}
}
