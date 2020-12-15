import java.util.Scanner; 

public class Main
{
	public static void main(String[] args)
	{ 
	        //get NumberOfElements;
        	Scanner NumberOfElements = new Scanner(System.in);  
        	System.out.print("Enter the NumberOfElements="+NumberOfElements);
            int NoOfElement=NumberOfElements.nextInt();
            
            //get Stratingnumber;
            Scanner Stratingnumber = new Scanner(System.in); 
            System.out.print("Enter the Strating Number="+Stratingnumber);
            int Strat=Stratingnumber.nextInt();
            
            //get Difference;
            Scanner Difference = new Scanner(System.in);  
            System.out.println("Enter the Difference="+Difference);
            int NoOFDifference=Difference.nextInt();
            //loop running count;
            int count=0;
    
            while(true)
            {
                count++;
                if(count<=NoOfElement)
                {
                    System.out.print(Strat);
                    System.out.print(",");
                    Strat+=NoOFDifference;
                }
                else
                {
                  break;  
                }
                
            }
    
    
	}
