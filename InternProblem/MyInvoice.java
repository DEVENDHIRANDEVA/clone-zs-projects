import java.util.ArrayList;
import java.util.Scanner;
class Customer
	{
			String CustomerName;
			String CustomerEmailId;
			long CustomerPhoneNumber;
			double Paidamount;
			double BalanceAmount;
			double discount;
			double tax;
			int numberofCustomers=0;

			static ArrayList customerDetails = new ArrayList<>();
			
			public void setCustomerName(String customerName)
			{
					this.CustomerName=customerName;
			}
			public String getCustomerName() {
				    return CustomerName;
		  	}
		  	public void setCustomerEmailId(String customerEmailid)
			{
					this.CustomerEmailId=customerEmailid;
			}
			public String getCustomerEmailId() {
				    return CustomerEmailId;
		  	}
		  	public void setCustomerPhoneNumber(long customerphonenumber)
			{
					this.CustomerPhoneNumber=customerphonenumber;
			}
			public long getCustomerPhoneNumber() {
				    return CustomerPhoneNumber;
		  	}
		  	public void setPaidamount(double paidamount)
			{
					this.Paidamount=paidamount;
			}
			public  double getPaidamount() {
				    return Paidamount;
		  	}
		  	public void setBalanceAmount(double balanceamount)
			{
					this.BalanceAmount=balanceamount;
			}
			public double getBalanceAmount() {
				    return BalanceAmount;
		  	}
		  	public void setdiscount(double discountamount)
			{
					this.discount=discountamount;
			}
			public  double getdiscount() {
				    return discount;
		  	}
		  	public void settax(double taxamount)
			{
					this.tax=taxamount;
			}
			public  double gettax() {
				    return tax;
		  	}
		  	public void setCustomerCount(int  count)
			{
					this.numberofCustomers+=count;
			}
			public  double setCustomerCount() {
				    return numberofCustomers
				    ;
		  	}
		  	public void setIdem(Customer details)
		  	{
		  			customerDetails.add(details);
		  	}
		  	public ArrayList getIdem()
		  	{
		  		return customerDetails;
		  	}	
		  
		  	

	}
class Products extends Customer
	{
			String ProductName;
			double ProduceRate;
			
			static String[] zohoProducts = { "subcription", "zohobooks", "zohoshow", "chekein" };
			static int[] productsRate={100,200,150,500};		  	
	}

class MyInvoice extends Products{
			static int NumberofInvoice=0;
			static double TotalAmount=0;
			static int NumberofProduct=0;
			static double DiscountAmount=0;
			static double CurrentPaidAmoun=0;
			static double Tax=0;
			static double finalAmount=0;
			public static double Discount(double totalamount,double percentage)
			{
				return (totalamount*percentage)/100;
    
			}
			public static double Balance(double totalamount,double paidamount)
			{
						return totalamount-paidamount;
			}
			public static double taxAmount(double amount,double tax_percentage)
			 {
			        return (amount*tax_percentage)/100;
			  }



			
		public static void main(String[] args) {
			
			
			Scanner input=new Scanner(System.in);			
			System.out.print("You wount create invoice? say yes or no=");
			String createInvoice=input.nextLine();
			boolean newcustomer=false;
			if(createInvoice.equals("yes"))				
				{
					newcustomer=true;
				}
			while(newcustomer!=false)
			{

						System.out.print("Enter the Your Customer Name=");
						String custumername=input.next();
						
						

						System.out.print("Enter the Your Customer EmailId=");
						String custumerEmail=input.next();
						
						

						System.out.print("Enter the Your Customer PhoneNumber=");
						long  custumerphonenumber=input.nextLong();
						
						
						System.out.println("Available Products:");
						for( int i = 0; i < zohoProducts.length; i++)
							{
							    String idems = zohoProducts[i];
							    int price=productsRate[i];
							    System.out.println( idems +"= $"+ price);    
							}

						boolean addmoreproduct=true;
						while(addmoreproduct!=false){
									if(addmoreproduct!=false){
										System.out.println("Enter the product name above:");
										String productname=input.next();
										for( int i = 0; i < zohoProducts.length; i++)			
										{						   

											    if(productname.equals(zohoProducts[i])){

											    	String idems = zohoProducts[i];
								   					int price=productsRate[i];
								   					System.out.println();
								   					 System.out.println( idems +"= $"+ price);
											    	TotalAmount+=price;
											    	NumberofProduct++;

											    }
										}								

									}							 		
									System.out.println("Do you want to create add another product yes or no");
					                if (input.next().equals("yes"))
					                {
					                    addmoreproduct = true;
					                } 
					                else 
					                {
					                    addmoreproduct = false;
					                }
									
						}

						System.out.print("Enter DiscountAmount for All Products % =");						
						DiscountAmount=input.nextInt();
						System.out.print("Enter TaxAmount for All Products % =");						
						Tax=input.nextInt();			

						System.out.print("Now you paid Amount= $");
						CurrentPaidAmoun=input.nextInt();

						finalAmount=TotalAmount+MyInvoice.taxAmount(TotalAmount,Tax);
						finalAmount=(finalAmount-MyInvoice.Discount(finalAmount,DiscountAmount));

						System.out.println();
						System.out.println("Consumer details:");
						System.out.println();
						System.out.println(custumername);
						System.out.println(custumerEmail);
						System.out.println(custumerphonenumber);						
						System.out.println("taxAmount = $"+MyInvoice.taxAmount(TotalAmount,Tax));
						System.out.println("Discount = $"+Math.round(MyInvoice.Discount(finalAmount,DiscountAmount)));
						System.out.println("Total With Tax Amount= $ "+Math.round(finalAmount));
						System.out.println("Now you paid Amount= $ "+CurrentPaidAmoun);
						if(Math.round(MyInvoice.Balance(finalAmount,CurrentPaidAmoun))>0){
							System.out.println("Balnce balabce = $"+Math.round(MyInvoice.Balance(finalAmount,CurrentPaidAmoun)));
						}
						else{
							System.out.println("Credit balnce= $"+Math.round(MyInvoice.Balance(finalAmount,CurrentPaidAmoun)));
						}
						

						System.out.println();
						System.out.print("If you Add this customer in CustomerList say yes=");
						String add=input.next();

								
						if(add.equals("yes"))	
						{
								
								boolean adding=true;
								while(adding!=false)
								{
									Customer customerobj=new Customer();
									customerobj.setCustomerCount(1);
									customerobj.setCustomerName(custumername);
									customerobj.setCustomerEmailId(custumerEmail);
									customerobj.setCustomerPhoneNumber(custumerphonenumber);
									customerobj.setPaidamount(CurrentPaidAmoun);
									customerobj.setBalanceAmount(Math.round(MyInvoice.Balance(finalAmount,CurrentPaidAmoun)));
									customerobj.setdiscount(Math.round(MyInvoice.Discount(finalAmount,DiscountAmount)));
									customerobj.settax(MyInvoice.taxAmount(TotalAmount,Tax));
									customerobj.setIdem(customerobj);
									
									
									TotalAmount=0;
									NumberofProduct=0;
									DiscountAmount=0;
									CurrentPaidAmoun=0;
									Tax=0;

									adding=false;
									System.out.println("Customer Added...."); 

								}
									newcustomer=false;

									System.out.print("You wount to add onemore say yes or no =");
									String onemorecustomer=input.next();

									if(onemorecustomer.equals("yes")){
										newcustomer=true;
									}
									else{
											System.out.print("You wount to see your CustomerDetails say yes or no =");
											String customerdetails=input.next();

											if(customerdetails.equals("yes"))
											{	
												System.out.println("size = "+customerDetails.size());

												for(int i=0;i<customerDetails.size();i++)
												{
														// System.out.println("i value"+i);
														 customerobj c=customerobj.getIdem(i);
														// String cname=c.getCustomerName();
														// System.out.println("name"+cname);
												}
												
											}
										}
						}
			}
		}	
}
