import java.util.Random;
import java.util.Scanner;
class minesweeperGame{
	static int noOfRows = 4;
	static int noOfColumns = 4;
	static int noOfBombs = 4;
	static int[][] minesArray;
	static String[][] storingUserInput;
	static Scanner inputScanner = new Scanner(System.in);
	static int userFlagCount = noOfBombs;
	static int noOfCrtFlags;
	static int squaresToBeOpened = (noOfRows*noOfColumns)-noOfBombs;
	static int TotalCells=((noOfRows*noOfColumns));
	static int OpenedCells=0;
	static int flagged=0;
	static int CorrectFlags=noOfBombs;
	static boolean flag=true;


 
	static void gameLevel(){
		System.out.println("Enter Game Level (Easy,Medium,Hard) :");
		String gameLevel = inputScanner.next();
		if(gameLevel.equalsIgnoreCase("Medium")){
			noOfRows += 4;
			noOfColumns += 4;
			noOfBombs += 4;
		}
		else if(gameLevel.equalsIgnoreCase("Hard")){
			noOfRows += 8;
			noOfColumns += 8;
			noOfBombs += 8;
		}
		minesArray = new int[noOfRows][noOfColumns];
		storingUserInput = new String[noOfRows][noOfColumns];
		for(int i=0;i<noOfRows;i++){
			for(int j=0;j<noOfColumns;j++){
				minesArray[i][j] = 0;
				storingUserInput[i][j] = "*";
			}
		}
	}

	static void conditionsForPlacingNumbers(int row,int column){
		if((column-1>=0) && minesArray[row][column-1]!=-1){
			minesArray[row][column-1]+=1;	
		}
		if((column+1<noOfColumns) && minesArray[row][column+1]!=-1){
			minesArray[row][column+1]+=1;	
		}
		if((row-1>=0) && (column-1>=0) && minesArray[row-1][column-1]!=-1){
			minesArray[row-1][column-1]+=1;	
		}
		if((row-1>=0) && minesArray[row-1][column]!=-1){
			minesArray[row-1][column]+=1;	
		}
		if((row-1>=0) && (column+1<noOfColumns) && minesArray[row-1][column+1]!=-1){
			minesArray[row-1][column+1]+=1;	
		}
		if((row+1<noOfRows) && (column-1>=0) && minesArray[row+1][column-1]!=-1){
			minesArray[row+1][column-1]+=1;	
		}
		if((row+1<noOfRows) && minesArray[row+1][column]!=-1){
			minesArray[row+1][column]+=1;	
		}
		if((row+1<noOfRows) && (column+1<noOfColumns) && minesArray[row+1][column+1]!=-1){
			minesArray[row+1][column+1]+=1;	
		}		
	}
	static void placingNumbersAndBombs(){
		Random randomNumber = new Random();
		for(int i=0;i<noOfBombs;i++){
			int rowRanNum = randomNumber.nextInt(noOfRows);
			int columnRanNum = randomNumber.nextInt(noOfColumns);
			if(minesArray[rowRanNum][columnRanNum]!=-1){
				minesArray[rowRanNum][columnRanNum] = -1;	
			}
			else{
				if(rowRanNum<noOfRows-1 && minesArray[rowRanNum+1][columnRanNum]!=-1){
					minesArray[rowRanNum+1][columnRanNum] = -1;
					rowRanNum+=1;
				}
				else if(columnRanNum<noOfColumns-1 && minesArray[rowRanNum][columnRanNum+1]!=-1){
					minesArray[rowRanNum][columnRanNum+1] = -1;
					columnRanNum+=1;
				}
				else if(columnRanNum>0 && minesArray[rowRanNum][columnRanNum-1]!=-1){
					minesArray[rowRanNum][columnRanNum-1] = -1;
					columnRanNum-=1;
				}
				else if(rowRanNum>0 && minesArray[rowRanNum-1][columnRanNum]!=-1){
					minesArray[rowRanNum-1][columnRanNum] = -1;
					rowRanNum-=1;
				}
			}
			conditionsForPlacingNumbers(rowRanNum,columnRanNum);						
		}	
	}

	// static String checkingSquareOpeningCondition(int row,int column){
	// 	String returnValue = "";
	// 	squaresToBeOpened--;
	// 	if(squaresToBeOpened!=0){
	// 		if(minesArray[row][column] == -1){
	// 		storingUserInput[row][column] = "-1";
	// 		returnValue =  "Loss";
	// 		}
	// 		else if(minesArray[row][column] == 0){
	// 			squaresToBeOpened++;
	// 			for(int i=0;i<noOfRows;i++){
	// 				for(int j=0;j<noOfColumns;j++){
	// 					if(minesArray[i][j] == 0){
	// 						storingUserInput[i][j] = Integer.toString(minesArray[i][j]);
	// 						squaresToBeOpened--;
	// 					}
	// 				}
	// 			}
	// 		}
	// 		else{
	// 			storingUserInput[row][column] = Integer.toString(minesArray[row][column]);
	// 		}
	// 	}

	// 	else if(squaresToBeOpened==0){
	// 		if(minesArray[row][column] == -1){
	// 			storingUserInput[row][column] = "-1";
	// 			returnValue =  "Loss";
	// 		}
	// 		else{
	// 			storingUserInput[row][column] = Integer.toString(minesArray[row][column]);
	// 		}
	// 		if(userFlagCount==0 && noOfCrtFlags==noOfBombs){
	// 			returnValue = "Won";
	// 		}
	// 		else if(userFlagCount==0 && noOfCrtFlags<noOfBombs){
	// 			returnValue = "Loss";
	// 		}	
	// 	}
	// 	return returnValue;
	// }

	// static String checkingSquareFlagCondition(int row,int column){
	// 	String returnValue = "";
	// 	userFlagCount--;		
	// 	if(userFlagCount>0){
	// 		storingUserInput[row][column] = "F";
	// 		if(minesArray[row][column] == -1){
	// 			noOfCrtFlags++;	
	// 		}
	// 	}
	// 	else if(userFlagCount==0){
	// 		storingUserInput[row][column] = "F";
	// 		if(minesArray[row][column] == -1){
	// 			noOfCrtFlags++;	
	// 		}
	// 		if(squaresToBeOpened==0 && noOfCrtFlags==noOfBombs){
	// 			returnValue = "Won";
	// 		}
	// 		else if(squaresToBeOpened==0 && noOfCrtFlags<noOfBombs){
	// 			returnValue = "Loss";
	// 		}
	// 	}
	// 	else{
	// 		System.out.println("You have placed all of your flags");
	// 	}	
	// 	return returnValue;
	// }

	// static boolean checkingInputValues(int row,int column,String squareType){
	// 	String openedSquare = "";
	// 	String flaggedSquare = "";
	// 	boolean returnValue = false;
	// 	if(row>=0 && row<noOfRows && column>=0 && column<noOfColumns && (squareType.equalsIgnoreCase("F") || squareType.equalsIgnoreCase("O"))){
	// 		if(storingUserInput[row][column] == "*"){
	// 			if(squareType.equalsIgnoreCase("O")){
	// 				openedSquare = checkingSquareOpeningCondition(row,column);
	// 				if(openedSquare.equals("Loss")){
	// 					System.out.println("You Loss the game ....");
	// 					returnValue = true;
	// 				}
	// 				else if(openedSquare.equals("Won")){
	// 					System.out.println("You Won the game ....");
	// 					returnValue = true;
	// 				}
	// 			}
	// 			else{
	// 			 	flaggedSquare = checkingSquareFlagCondition(row,column);
	// 			 	if(flaggedSquare.equals("Won")){
	// 			 		System.out.println("You Won the Game .....");
	// 			 		returnValue = true;
	// 			 	}
	// 			 	else if(flaggedSquare.equals("Loss")){
	// 			 		System.out.println("You Loss the Game .... ");
	// 			 		returnValue = true;
	// 			 	}
	// 			}
	// 		}
	// 		else{
	// 			System.out.println("The square is already active");
	// 		}
	// 	}
	// 	else{
	// 		System.out.println("Please enter correct value some of your inputs are not satisfying our constraints ...");
	// 		returnValue = false;
	// 	}
	// 	return returnValue;
	// }

	// static void gettingInputAndShowingResult(){
	// 	boolean startGame = true;
	// 	while(startGame){
	// 		System.out.println("Flag remaining :"+userFlagCount+"\n");
	// 		for(String[] innerArray:storingUserInput){
	// 			for(String arrValues:innerArray){
	// 				System.out.print(arrValues+"\t");
	// 			}
	// 			System.out.println();
	// 		}
	// 		System.out.println("Enter the Row of the square (It should be between 0 to "+noOfRows+")");
	// 		int inputRow = inputScanner.nextInt();
	// 		System.out.println("Enter the Column of the square (It should be between 0 to "+noOfColumns+")");
	// 		int inputColumn = inputScanner.nextInt();
	// 		System.out.println("Do you want OPEN or FLAG the square ('F' for Flag and 'O' for Open ) :");
	// 		String inputSquareType = inputScanner.next();
	// 		if(checkingInputValues(inputRow,inputColumn,inputSquareType)){
	// 			startGame = false;
	// 		}
	// 	}
	// }
	static void getAgainInput(){
		
			System.out.println("Enter the Row of the square (It should be between 0 to "+noOfRows+")");
			int inputRow = inputScanner.nextInt();
			System.out.println("Enter the Column of the square (It should be between 0 to "+noOfColumns+")");
			int inputColumn = inputScanner.nextInt();
			System.out.println("Do you want OPEN or FLAG the square ('F' for Flag and 'O' for Open ) :");
			String inputSquareType = inputScanner.next();

			WinnerOrLosser(inputRow,inputColumn,inputSquareType);


	}
	static void Displaytable(){
							for(int i=0;i<noOfRows;i++){
									for(int j=0;j<noOfColumns;j++){
											System.out.print(storingUserInput[i][j]);
									}
								System.out.println();
							}

	}

	static void WinnerOrLosser(int row,int column,String option ){

			if(storingUserInput[row][column].equals("*")){
							if(option.equals("o")){

								if(minesArray[row][column]==-1){
										System.out.println("Game over....");
								}
								if(minesArray[row][column]==0){

									for(int i=0;i<noOfRows;i++){
										for(int j=0;j<noOfColumns;j++){
											if(minesArray[i][j]==0){
												storingUserInput[row][column]=Integer.toString(minesArray[i][j]);
												OpenedCells++;
											}
										}
									}
									System.out.println("Remaining Flags="+CorrectFlags);
									Displaytable();

								}
								else{
									storingUserInput[row][column]=Integer.toString(minesArray[row][column]);
									OpenedCells++;
									System.out.println("Remaining Flags="+CorrectFlags);
									Displaytable();
								}
							}
							else{
								if(storingUserInput[row][column].equals("F")){
									System.out.println("Ooop Game Over....");
								}
								else{
									if(minesArray[row][column]==-1){
										CorrectFlags=CorrectFlags-1;
										storingUserInput[row][column]="F";
										System.out.println("Remaining Flags="+CorrectFlags);
										Displaytable();
									}
									else{
										flagged=+1;
										storingUserInput[row][column]="F";
										System.out.println("Remaining Flags="+CorrectFlags);
										Displaytable();
									}
								}
							}	

			}
			else{
				if(option.equals("F")){
					if(storingUserInput[row][column].equals("*")){							
								if(minesArray[row][column]==-1){
										CorrectFlags=CorrectFlags-1;
										storingUserInput[row][column]="F";
										System.out.println("Remaining Flags="+CorrectFlags);
										Displaytable();
									}
									else{
										storingUserInput[row][column]="F";
										System.out.println("Remaining Flags="+CorrectFlags);
										Displaytable();
										flagged++;

									}
					}
					else{
							if(storingUserInput[row][column].equals("F")){
										storingUserInput[row][column]="*";
										System.out.println("Remaining Flags="+CorrectFlags);
										if(flagged>0){
												flagged=flagged-1;
										}
										Displaytable();
							}

					}
				}
				
				else if(CorrectFlags==0 && TotalCells==(OpenedCells+CorrectFlags)){
					System.out.println("You win this leavel......");
				}
				else{
					System.out.println("This cell is Already Opened...");
					getAgainInput();
				}
			}		



	}




	public static void main(String[] args) {

		if(flag!=false){
			gameLevel();	
			placingNumbersAndBombs();
				for(int[] innerArray : minesArray){
					for(int values : innerArray){
						System.out.print(values+"\t");	
					}
					System.out.println();	
				}
				flag=true;

		}

		getAgainInput();

		// gettingInputAndShowingResult();
		// for(int[] innerArray : minesArray){
		// 	for(int values : innerArray){
		// 		System.out.print(values+"\t");	
		// 	}
		// 	System.out.println();	
		// }
	}
}