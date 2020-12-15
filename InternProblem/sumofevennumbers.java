import java.util.Scanner; 

public class Main
{
	public static void main(String[] args)
	{ 
	        //get value from user;
        	Scanner UserInputValue = new Scanner(System.in);  
        	System.out.print("Enter the NumberOfElements="+UserInputValue);
            String number=UserInputValue.nextLine();
            
            //sum of EvenNumbers;
            int count=0;
            
            if(number.length()>=1)
            {
                for (int i=0;i<number.length() ; i++)
                {
                    if(number.charAt(i)%2==0)
                    {
                        int EvenNumbers=Integer.parseInt(number.charAt(i)+"");
                         count+=EvenNumbers;
                    }
                    
                }
                
                System.out.println("sum of EvenNumbers = "+count);
            }
            else
            {
                System.out.println("Enet the value");    
            }
    
	}
}
