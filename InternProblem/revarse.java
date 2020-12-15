import java.util.Scanner; 

public class Main
{
	public static void main(String[] args)
	{ 
	        //get values;
        	Scanner input= new Scanner(System.in);  
        	System.out.print("Enter the value="+input);
            int value=input.nextInt();
            
            
            int Reverse=0;
    
            while(value!=0)
            {
                    Reverse=Reverse*10;
                    Reverse=Reverse+value%10;
                    value=Math.round(value/10);
                
            }
            System.out.print(Reverse);
    
    
	}
}
