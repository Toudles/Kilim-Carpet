
public class Part1 {
	
	public static void main(String[] args) {
		
		//top of the carpet line
		for(int rows = 1; rows <= 2; rows++) {
			//length of the design of the first 2 rows
			for(int columns = 1; columns <= 37; columns++) {
				
				System.out.print("=");
				}
			//println statement outside of inner for loop so it can 
			//the 2nd row underneath the first (or else it would print 50 @ 1 by 1
			System.out.println();
		
		}
		
		//create the first set of checkerboards
		for(int rows = 1; rows <= 2; rows ++) {
			
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("$");
			}
			
			//creates spacing between squares
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("%");
			}
			
			//creates spacing between squares
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			
			//to match odd # of columns
			for(int columns = 1; columns <= 5; columns++) {
				System.out.print("+");
			}
			
			//creates spacing
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("!");
			}
			
			//creates spacing
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		//second part of checkerboard
		for(int rows = 1; rows <= 2; rows++) {
			
			//spacing so the second part starts in the middle
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			for(int columns = 1; columns <= 4; columns++) {
				
				System.out.print("@");
			}
			
			//creates spacing
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("!");
			}
			//creates spacing (matches the 5 + values in the first row
			for(int spaces = 1; spaces <= 5; spaces++) {
				System.out.print(" ");
			}
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("%");
			}
			//creates spacing
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("$");
			}
			
			
		//println outside of the inner for loop so it can print every row properly
		System.out.println();
		}
		
		//create line for diamond(s)
		for(int rows = 1; rows <= 2; rows++) {
			
			for(int columns = 1; columns <= 37; columns++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
		//create diamond
		for(int row = 1; row < 5; row++) {
			for(int column = row; column <= 5; column++) {
				System.out.print(" ");
			}
			//had some trouble (not quite sure why this creates a diamond)
			//look into it
			//changing this from row to 5 i think adds more stars to the right
			for(int column = 1; column < row; column++) {
				System.out.print("* ");
			}
			//changing this from 1 to 5 i think adds more stars to the right 
			for(int column = 1; column <= 1; column++) {
				System.out.print("* ");
			}
			
			
			
			//creates spacing for 2nd shape to the right of first diamond
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			//experiment with making diff shapes (with rows/numbers)
			for(int column = 1; column < 1; column++) {
				System.out.print("* ");
			}
			for(int column = row; column <= 5; column++) {
				System.out.print("* ");
			}
			
			
			//create 2nd diamond
			for(int column = 1; column <= 8; column++) {
				System.out.print(" ");
			}
			for(int column = 1; column < row; column++) {
				System.out.print("* ");
			}
			for(int column = 1; column <= 2; column++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		//bottom half of shapes
		for(int row = 1; row <= 5; row++) {
			for(int column = 1; column <= row; column++) {
				System.out.print(" ");
			}
			for(int column = 5; column < 5; column++) {
				System.out.print("* ");
			}
			for(int column = row; column <= 5; column++) {
				System.out.print("* ");
			}
			
			
			//creates spacing for 2nd half of 2nd shape to the right of the diamond
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			//experiment with making diff shapes (with rows/numbers)
			for(int column = 5; column < row; column++) {
				System.out.print("* ");
			}
			for(int column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			
			
			//create second diamond
			for(int column = 1; column <= 8; column++) {
				System.out.print(" ");
			}
			for(int column = 5; column < 6; column++) {
				System.out.print("* ");
			}
			for(int column = row; column <= 5; column++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//(SECOND HALF OF CARPET (MIRRORED OF TOP)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//create diamond
		for(int row = 1; row < 5; row++) {
			for(int column = row; column <= 5; column++) {
				System.out.print(" ");
			}
			for(int column = 1; column < row; column++) {
				System.out.print("* ");
			} 
			for(int column = 1; column <= 1; column++) {
				System.out.print("* ");
			}
			
			
			
			//creates spacing for 2nd shape to the right of first diamond
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			for(int column = 1; column < 1; column++) {
				System.out.print("* ");
			}
			for(int column = row; column <= 5; column++) {
				System.out.print("* ");
			}
			
			
			//create 2nd diamond
			for(int column = 1; column <= 8; column++) {
				System.out.print(" ");
			}
			for(int column = 1; column < row; column++) {
				System.out.print("* ");
			}
			for(int column = 1; column <= 2; column++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		//bottom half of shapes
		for(int row = 1; row <= 5; row++) {
			for(int column = 1; column <= row; column++) {
				System.out.print(" ");
			}
			for(int column = 5; column < 5; column++) {
				System.out.print("* ");
			}
			for(int column = row; column <= 5; column++) {
				System.out.print("* ");
			}
			
		
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			for(int column = 5; column < row; column++) {
				System.out.print("* ");
			}
			for(int column = 1; column <= row; column++) {
				System.out.print("* ");
			}
			
			
			//create second diamond
			for(int column = 1; column <= 8; column++) {
				System.out.print(" ");
			}
			for(int column = 5; column < 6; column++) {
				System.out.print("* ");
			}
			for(int column = row; column <= 5; column++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		//back to checkerboard
		for(int rows = 1; rows <= 2; rows++) {
			for(int columns = 1; columns <= 37; columns++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
		for(int rows = 1; rows <= 2; rows++) {
					
			//spacing so the second part starts in the middle
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			for(int columns = 1; columns <= 4; columns++) {
				
				System.out.print("@");
			}
			
			//creates spacing
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("!");
			}
			//creates spacing (matches the 5 + values in the first row
			for(int spaces = 1; spaces <= 5; spaces++) {
				System.out.print(" ");
			}
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("%");
			}
			//creates spacing
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("$");
			}
			System.out.println();
		}
		for(int rows = 1; rows <= 2; rows ++) {
					
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("$");
			}
			
			//creates spacing between squares
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("%");
			}
			
			//creates spacing between squares
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			
			//to match odd # of columns
			for(int columns = 1; columns <= 5; columns++) {
				System.out.print("+");
			}
			
			//creates spacing
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("!");
			}
			
			//creates spacing
			for(int spaces = 1; spaces <= 4; spaces++) {
				System.out.print(" ");
			}
			
			for(int columns = 1; columns <= 4; columns++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for(int rows = 1; rows <= 2; rows++) {
			for(int columns = 1; columns <= 37; columns++) {
				System.out.print("=");
			}
			System.out.println();
		}
		
	}
}


