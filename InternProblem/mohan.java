import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	
	        
   
    		Scanner value= new Scanner(System.in);
    		String inputvalues=value.nextLine();
    		int factoriyalAns=1;
    		int sum=0;
    		   
    		  
    		for (int i=0;i<inputvalues.length() ;i++ )
    		{
    		  
    		   int CurrentAscciiValue=inputvalues.charAt(i);
    		   int numericVal = Character.getNumericValue(CurrentAscciiValue);
    		   
    		    for(int j=1;j<=numericVal;j++)
    		    {
    		        factoriyalAns=factoriyalAns*j;
    		        
    		    }
    		   sum+=factoriyalAns;
    		   factoriyalAns=1;
    		} 
    		System.out.println(sum);
    		if(sum==Integer.parseInt(inputvalues))
    		{
    		    System.out.println(sum+"is strong number ");
    		}
    		else
    		{
    		    System.out.println(sum+"not a is strong number ");
    		}
    	
	}
}

