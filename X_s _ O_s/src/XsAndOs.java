import java.util.*;

public class XsAndOs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		System.out.println("Please type 2 numbers >= 3 with a space seperating them:");
		//input.useDelimiter(/*"," +*/ " " );
		boolean won = false;
		//int column;
		if(input.hasNextInt())
		{int row = input.nextInt();
		int column = input.nextInt();
		System.out.println("row: "+row);
		System.out.println("column: "+column);
		char[][] board = new char[3][3];
		clearBoard(board);
		printBoard(board);
		if (row<=3 && column<=3){



			while (!won){
				//printBoard(board);

			};
		} else
			System.out.println("That doesn't seem to be a number that is greater than or equal to three.");
		} else 	System.out.println("That doesn't seem to be a number.");
	}


	static void clearBoard (char[][] board){
		System.out.println("hi");		
		for(int columnClear=0; columnClear==2; columnClear++){
			for(int rowClear=0; rowClear==2; rowClear++){
				board[rowClear][columnClear] = '_';
			}
		}
	}

	static void printBoard (char[][] board){
		System.out.println("hi");		
		for(int columnClear=0; columnClear==2; columnClear++){
			System.out.println();
			System.out.print("|");
			for(int rowClear=0; rowClear==2; rowClear++){
				System.out.print(board[rowClear][columnClear]+"|");
			}
		}
	}
	/*static boolean canMakeMove (char[][] board, int row, int column){

	}

	}
	static boolean isBoardFull(char[][] board) {

	}
	static char winner ( char[][] board) {

	} */
}
