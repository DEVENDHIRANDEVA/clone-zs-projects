import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //get Value form user;
	Scanner Inputvalue=new Scanner(System.in);
	
    long Value=Inputvalue.nextInt();
    //copy of value;
    long value_copy=Value;
    //convert to squer
    long Sqervalue=Value*Value;
    //for count of input length;
    int count=0;
    
    while(Value>0)
    {
        Value=Math.round(Value/10);
        count++;
    }
   //get last value;
    long Sqervaluelastnumbers=Sqervalue%(long)Math.pow(10,count);
    if(Sqervaluelastnumbers==value_copy)
    {
            System.out.println(value_copy+"is Automorphic Number");    
    }
    else
    {
       System.out.println(value_copy+"is not Automorphic Number");  
    }
	

	}
}

