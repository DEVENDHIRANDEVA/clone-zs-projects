import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;[
class Product {	
    private String name;
    private int price;
    private String unit;
    private int productId;
    static int productIdCounter=0;
    public Product() {
        this.productId=++productIdCounter;
    }
    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public String toString(){
    	return productId+". "+name+"- Rs."+price;
    }
}
class CustomerAddress {
    private String Door_no;
    private String Street;
    private String City;
    private String State;
    private String Country;
    private long pin_code;
    public String getDoor_no() {
        return Door_no;
    }
    public void setDoor_no(String door_no) {
        Door_no = door_no;
    }
    public String getStreet() {
        return Street;
    }
    public void setStreet(String street) {
        Street = street;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }
    public String getCountry() {
        return Country;
    }
    public void setCountry(String country) {
        Country = country;
    }
    public long getPin_code() {
        return pin_code;
    }
    public void setPin_code(long pin_code) {
        this.pin_code = pin_code;
    }
    public String toString(){
        return (getDoor_no()+", "+getStreet()+",\n"+getCity()+", \n"+getState()+", \n"+getCountry()+".\nPin-code :"+getPin_code());
    }
}
class Customer {
    private String name;
    private long number;
    private CustomerAddress address;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    public CustomerAddress getAddress() {
        return address;
    }
    public void setAddress(CustomerAddress address) {
        this.address = address;
    }
    public String toString(){
        return ("Customer name : "+getName()+"\nCustomer number : "+getNumber()+"\nCustomer address : \n"+getAddress());
    }
}
class Invoice {
    Customer customer;
    HashMap<Product, Integer> products= new HashMap<>();
    private int totalBillAmount;
    private int payment;
    private int credit;
    private String status;
    private int invoiceId;
    static int invoiceIdCounter=0;
    public Invoice() {
        invoiceId=++invoiceIdCounter;
    }
    public int getPayment() {
        return payment;
    }
    public void setPayment(int payment) {
        this.payment = payment;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getProducts() {
        String productList="";
        Iterator iterator=products.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            Product product = (Product) pair.getKey();
            productList+=product.getName()+" - "+pair.getValue()+"\n";
        }
        return productList;
    }
    public void setProduct(Product product,Integer quantity) {
        products.put(product,quantity);
    }
    public int getInvoiceId() {
        return invoiceId;
    }
    public int getTotalBillAmount() {
        return totalBillAmount;
    }
    public void setTotalBillAmount() {
        Iterator iterator=products.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            Product product = (Product) pair.getKey();
            totalBillAmount += product.getPrice() * (Integer) pair.getValue();
        }
    }
    public int getBalance(){
        if(totalBillAmount-payment>0) {
	    if(payment==0){
	    	setStatus("Unpaid");
	    }
	    else{        
	        setStatus("Partially paid");
	    }
            return totalBillAmount - payment;
        }
        else{
            setStatus("Paid");
            credit=payment-totalBillAmount;
            return 0;
        }
    }
    public String viewInvoice(){
        return "Invoice id : "+getInvoiceId()+"\nCustomer name : "+getCustomer().getName()+"\nTotal Bill : "+getTotalBillAmount()+"\nAmount Paid : "+getPayment()+"\nAmount Unpaid : "+getBalance()+".\nCredit : "+credit+"\nStatus : "+getStatus()+"\n";
    }
    public String toString(){
        return "Invoice id : "+getInvoiceId()+"\n"+getCustomer()+"\nProducts : \n"+getProducts()+"\nTotal Bill : "+getTotalBillAmount()+"\nAmount Paid : "+getPayment()+"\nAmount Unpaid : "+getBalance()+".\nCredit : "+credit+"\nStatus : "+getStatus()+"\n";
    }
}
public class Main {
    public static void main(String[] args) {
        Product[] products =new Product[5];
        products[0]=new Product();
        products[0].setName("Idli");
        products[0].setPrice(10);
        products[0].setUnit("pcs");

        products[1]=new Product();
        products[1].setName("Vada");
        products[1].setPrice(5);
        products[1].setUnit("pcs");
        products[2]=new Product();
        products[2].setName("Dosa");
        products[2].setPrice(20);
        products[2].setUnit("pcs");
        
        products[3]=new Product();
        products[3].setName("Pongal");
        products[3].setPrice(40);
        products[3].setUnit("pcs");
        
        products[4]=new Product();
        products[4].setName("Chappathi");
        products[4].setPrice(15);
        products[4].setUnit("pcs");
        Scanner input = new Scanner(System.in);
        ArrayList<Customer> customerList=new ArrayList<>();
        ArrayList<Invoice> invoiceList=new ArrayList<>();
        char generateInvoice;
        char viewInvoice;
        do {
            Invoice invoice = new Invoice();
            invoiceList.add(invoice);
            Customer customer = new Customer();
            System.out.print("Enter customer mobile number : ");
            long number = input.nextLong();
            for (Customer item : customerList) {
                if (item.getNumber() == number) {
                    customer = item;
                    System.out.println("Customer already exists! \n" + customer);
                }
            }
            if (customer.getName() == null) {
                CustomerAddress address=new CustomerAddress();
                customerList.add(customer);
                customer.setNumber(number);
                input.nextLine();
                System.out.print("Enter customer name : ");
                customer.setName(input.nextLine());
                System.out.print("Enter customer address : \nDoor no : ");
                address.setDoor_no(input.nextLine());
                System.out.print("Street : ");
                address.setStreet(input.nextLine());
                System.out.print("City : ");
                address.setCity(input.nextLine());
                System.out.print("State : ");
                address.setState(input.nextLine());
                System.out.print("Country : ");
                address.setCountry(input.nextLine());
                System.out.print("pin-code : ");
                address.setPin_code(input.nextLong());
                customer.setAddress(address);
            }
            invoice.setCustomer(customer);
            char addProduct='y';
            do {
                Product product = new Product();
                for(Product item : products){
                    System.out.println(item);
                };
                System.out.println("Enter the product id purchased : ");
                int productId = input.nextInt();
                for (Product item : products) {
                    if (item.getProductId() == productId) {
                        product = item;
                    }
                }
                System.out.println("Enter the quantity of "+product.getName()+" : ");
                int quantity = input.nextInt();
                invoice.setProduct(product, quantity);
                System.out.println("Do you want to add another product ? (y/n)");
                addProduct=input.next().charAt(0);
            }
            while(addProduct=='y');
            invoice.setTotalBillAmount();
            System.out.println("Bill Amount : "+invoice.getTotalBillAmount());
            System.out.println("Enter the amount paid : ");
            invoice.setPayment(input.nextInt());
            System.out.println(invoice);
            System.out.println("Do you want to create another invoice ? (y/n)");
            generateInvoice=input.next().charAt(0);
        }
        while (generateInvoice=='y');
        System.out.println("Do you want to view invoices for any customer ? (y/n)");
        viewInvoice=input.next().charAt(0);
        while(viewInvoice=='y'){
            System.out.println("Enter the customer number : ");
            long number = input.nextLong();
            int totalBill = 0;
            for (Invoice item : invoiceList) {
                if (item.getCustomer().getNumber() == number) {
                    System.out.println(item.viewInvoice());
                }
            }
            System.out.println("Do you want to view invoices for any customer ? (y/n)");
            viewInvoice=input.next().charAt(0);
        }
        System.out.println("Do you want to view all the invoices ? (y/n)");
        if (input.next().charAt(0)=='y'){
           for (Invoice item : invoiceList) {
               System.out.println(item.viewInvoice());
           }
        }
    }
}

