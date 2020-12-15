import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
        	Scanner UserInput=new Scanner(System.in);
        	System.out.print("Eneter the Values=");
        	int value=UserInput.nextInt(); 
        	ArrayList<Integer> Numberarray = new ArrayList<>();
        	 while(value>0)
        	 {
        	     int remainder=value%10;
        	     Numberarray.add(remainder);
        	     value=Math.round(value/10);
        	 }
        	 Collections.sort(Numberarray);
        	 for (int i=Numberarray.size()-1;i>=0;i-- ){
        	       System.out.print(Numberarray.get(i));    
        	 }
        	 
	}
}

