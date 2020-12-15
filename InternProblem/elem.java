import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {

	        //get value from user;
        	Scanner UserInputValue = new Scanner(System.in);  
        	
        	System.out.print("Enter the value="+UserInputValue);
        	
            String  numbers=UserInputValue.nextLine();
            
            //get value length;
            int UserInputValuelength=numbers.length();
            
            //convert to Interger;
            int Integernumber=Integer.parseInt(numbers);
            
            //convert to squerValue;
            int squerValue=(Integernumber*Integernumber);
            
            
            //convertto String;
            String StringSquervalue=Integer.toString(squerValue);
            
            //get last digites
            int lastvalue =Integer.parseInt(StringSquervalue.substring(StringSquervalue.length()-UserInputValuelength));
            
            if(lastvalue==Integer.parseInt(numbers))
            {
                System.out.println("Automorphic Number");
            }
            else
            {
                System.out.println("Not Automorphic Number");
            }
             
            
            
            
       
            
            
            
            
    
	}	
}

