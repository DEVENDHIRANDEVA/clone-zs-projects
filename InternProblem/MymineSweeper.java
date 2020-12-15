import java.util.Scanner;
import java.util.ArrayList;
class StartGame {

	boolean showuserIndex=true;
	int[][] gameValue={{1,0,-1,0,1},{1,0,0,0,1},{1,0,-1,0,1},{1,0,1,0,1},{-1,0,0,0,1}};
	String [][] StringgameValue={{1,0,-1,0,1},{1,0,0,0,1},{1,0,-1,0,1},{1,0,1,0,1},{-1,0,0,0,1}};
   
	
	public void displayBoard(){
					
			// for(int row=0;row<gameValue.length;row++){
			// 	for(int col=0;col<gameValue.length;col++){
			// 		System.out.print(gameValue[row][col]+" ");
						
			// 	}
			// 	System.out.println();
			// }
			for(int row=0;row<gameValue.length;row++){
				for(int col=0;col<gameValue.length;col++){
						System.out.print("*"+" "+" ");
				}
				System.out.println();
			}


	}
	public void boomChecking(int userrow,int usercol,String option){
			
			System.out.println("user gussing index value"+gameValue[userrow][usercol]);

			if(gameValue[userrow][usercol]==-1 && option.equals("n")){

								for(int row=0;row<gameValue.length;row++){
									for(int col=0;col<gameValue.length;col++){
										if(gameValue[userrow][usercol]==gameValue[row][col]){
													System.out.print(gameValue[userrow][usercol]);
										}
										else{
											System.out.print("*"+" ");
										}
									}
									System.out.println();
								}
							System.out.println("Game Over.......");						
			}
			else{
					if(gameValue[userrow][usercol]!=-1 && option.equals("n")){
							
									Rows.add(userrow);
									Coloums.add(usercol);
								
									for(int row=0;row<gameValue.length;row++){
									for(int col=0;col<gameValue.length;col++){

										
											
										// 		if(){

										// 		}			
										// 		System.out.print(gameValue[Rows.get(oldindex)][Coloums.get(oldindex)]);											
																																		
										// }
										
										 	System.out.print("*");
										
														
											
									}
									System.out.println();
								}	
								getInputs();					


					}



			}


	}
	public void getInputs(){
				Scanner input=new Scanner(System.in);
				System.out.print("Enter row =");	
				int  row=input.nextInt();

				System.out.print("Enter Coloum = ");
				int  col=input.nextInt();
				System.out.print("you wount flag say (y/n):");
				String flag=input.next();
				boomChecking(row,col,flag);

	}

}
class MymineSweeper extends StartGame{
public static void main(String[] args) {
				StartGame start=new StartGame();
				start.displayBoard();
				start.getInputs();
	}	
}