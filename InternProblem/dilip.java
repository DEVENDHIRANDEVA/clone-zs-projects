import java.util.Scanner;
    public class Main
    {
    	public static void main(String[] args) {
    		Scanner value= new Scanner(System.in);
    		String inputvalues=value.nextLine();
    		int sum=0;
    		int powar=1;
    		 
    		for (int i=0;i<inputvalues.length() ;i++ )
    		{
    		    
    		    int y=inputvalues.charAt(i);
    		    int numericVal = Character.getNumericValue(y);
    		   sum+=Math.pow(numericVal,powar);
    		   powar++;
    		   
    		} 
    		System.out.println(sum);
    		if(sum==Integer.parseInt(inputvalues))
    		{
    		    System.out.println("Disarium number ");
    		}
    		else
    		{
    		    System.out.println(" not Disarium number");
    		}
    	}
