import java.util.Scanner;
import java.util.ArrayList;
import java. util. Iterator;
import java.util.HashMap;
class Contact{
		private int ContactId=0;
		private String ContactName;
		private long ContactNumber;
		static HashMap<Integer,Object> AllContactDetails = new HashMap<Integer, Object>();
		static ArrayList customerDetailsArralist = new ArrayList();

		public void setContactName(String name){
				this.ContactName=name;
		}
		public String getContactName(){
			return ContactName;
		}
		public void setContactNumber(long number){
				this.ContactNumber=number;
		}
		public long getContactNumber(){
			return ContactNumber;
		}
		public int contactId(){
			ContactId=ContactId++;
			return ContactId;
		}

		public void AddCoontact(String Cname,long Cnumber){
			Contact newcontact=new Contact();
			newcontact.setContactName(Cname);
			newcontact.setContactNumber(Cnumber);
			AllContactDetails.put(contactId(),newcontact);
			customerDetailsArralist.add(newcontact);
			System.out.println("Cuastomer Added NewCostomer Id="+ContactId);
		}
}
class MapingClass extends Contact {
	public static void main(String[] args) {
		System.out.println("hellow ");
	}
}
// 		// public void getDetails(){

// 		// 		Iterator itr=customerDetails.iterator();  
// 		// 	 		 while(itr.hasNext()){  
// 		// 		   	WhatsApp dt=(WhatsApp)itr.next();  
// 		// 	    	System.out.println(dt.getName()+" "+dt.getPhoneNumber()); 
// 		// 		 } 
// 		// }
		
// 		// public void Getparticulare(String name){

// 		// 	  Iterator itr=customerDetails.iterator();  
// 		// 	 	 while(itr.hasNext()){  
// 		// 		   	WhatsApp dt=(WhatsApp)itr.next();  
// 		// 		   	if(dt.getName().equals(name)){
// 		// 		   		currentName=dt.getName();
// 		// 		   		currentNumber=dt.getPhoneNumber();
// 		// 		   		System.out.println(dt.getName()+" "+dt.getPhoneNumber()); 	
// 		// 		   	}
			    	
// 		// 		 }
// 		// }

// 		// public void postmethod(String cname,long cnumber){
// 		// 		WhatsApp newcontact=new WhatsApp();
// 		// 		newcontact.setName(cname);
// 		// 		newcontact.setPhoneNumber(cnumber);
// 		// 		customerDetails.add(newcontact);
// 		// 		System.out.println("contact Added.........");
// 		// }	
// 		//  public void putmethod(String name){
// 		//  	Getparticulare(name);
// 		//  }

// 		public static void main(String[] args) {
// 		// 	Scanner input=new Scanner(System.in);
// 		// 	String method="get";
// 		// 	String resource="contact";
// 		// 	String particularid="dev";
// 		// 	boolean id=false;
// 		// 	boolean flag=true;
// 		// 	String currentName;
// 		// 	long currentNumber;


// 		// 	WhatsApp whatsApp=new WhatsApp();
// 		// 	whatsApp.setName("dev");
// 		// 	whatsApp.setPhoneNumber(1234567890);
// 		// 	customerDetails.add(whatsApp);

// 		// 	WhatsApp whatsApp2=new WhatsApp();
// 		// 	whatsApp2.setName("dilip");
// 		// 	whatsApp2.setPhoneNumber(1234890);
// 		// 	customerDetails.add(whatsApp2);

// 		// 	WhatsApp whatsApp3=new WhatsApp();
// 		// 	whatsApp3.setName("mohan");
// 		// 	whatsApp3.setPhoneNumber(1237890);
// 		// 	customerDetails.add(whatsApp3);

// 		// 	WhatsApp whatsApp4=new WhatsApp();
// 		// 	whatsApp4.setName("elam");
// 		// 	whatsApp4.setPhoneNumber(12347890);
// 		// 	customerDetails.add(whatsApp4);


// 		// 	while(true){				
						

// 		// 						System.out.print("Enter the url patten / formate=");
// 		// 						String url=input.next();
// 		// 						String[] splitobject=url.split("/");
								
// 		// 						for(int splitindex=0;splitindex<splitobject.length;splitindex++){
// 		// 							if(splitindex==0){
// 		// 								method=splitobject[splitindex];
// 		// 								System.out.println(method);
// 		// 							}
// 		// 							if(splitindex==1){
// 		// 								resource=splitobject[splitindex];
// 		// 								System.out.println(resource);
// 		// 							}
// 		// 							if(splitindex==2){
// 		// 								id=true;
// 		// 								particularid=splitobject[splitindex];
// 		// 								// System.out.println(particularid);
// 		// 							}
// 		// 						}
// 		// 							if(method.equals("get")){
// 		// 								if(resource.equals("contact")){
// 		// 										if(id){
// 		// 											whatsApp.Getparticulare(particularid);

// 		// 											id=false;	
// 		// 										}	
// 		// 										else{
// 		// 											whatsApp.getDetails();
// 		// 										}
// 		// 								}				
// 		// 							}				

// 		// 							if(method.equals("post")){
// 		// 									if(resource.equals("contact")){
// 		// 											System.out.print("Enter contact Name=");
// 		// 											String newcontactname=input.next();
// 		// 											System.out.print("Enter contact Number=");
// 		// 											long newContactNumber=input.nextLong();
// 		// 											String string=String.valueOf(newContactNumber);
// 		// 											if(newcontactname!="" &&  string.length()>0){
// 		// 												whatsApp.postmethod(newcontactname,newContactNumber);	
// 		// 											}
// 		// 									}
											

// 		// 							}
// 		// 							if (method.equals("put")) {
// 		// 								if(resource.equals("contact")){
// 		// 									System.out.println("Ente changing contact Name=");
// 		// 									String changeContactname=input.next();
// 		// 									System.out.println(whatsApp.currentName+" "+currentNumber);
// 		// 								}
// 		// 							}







// 		// 	}
			
			

// 		}


// }