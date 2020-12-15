import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner Inputs = new Scanner (System.in);
        System.out.print("Enter the Sentance=");
        String Sentace = Inputs.nextLine();
    
        System.out.print("Enter the Removing Sentance=");
		String RemovingSecntace=Inputs.nextLine();
		
		
		String outputSentance="";
        if(Sentace.contains(RemovingSecntace))
        {
                String[] Array=Sentace.split(" ");
                
                for (int i=0;i<Array.length ;i++ )
                {
                    if(Array[i].equals(RemovingSecntace)){
                        
                    }
                    else
                    {
                       outputSentance+=Array[i]; 
                       outputSentance+=" "; 
                    }
                }
                System.out.println(outputSentance);
        }
        else
        {
            System.out.println("Enter the Correct RemovingSecntace");
        }

  }
}

