package newteAM;
import java.util.ArrayList;
import java.util.Scanner;

public class Invoice extends Customer{    
    public int totalamount(int product_price,int quantity)
    {
        return product_price*quantity;
    }
    public int discountAmount(int amount,int percentage)
    {
        return (amount*percentage)/100;
    }
    public double taxAmount(int amount,double tax)
    {
        return (amount*tax)/100;
    }
    public double originalAmount(int original_amount,int discount_amount,double tax_amount)
    {
        return (original_amount -discount_amount)+tax_amount;
    }    
    public static void invoiceCreate(Customer customer_details){
        Scanner sc = new Scanner(System.in);
        boolean create_invoice = true;
        int total = 0;        
        while (create_invoice != false) {
            Invoice invoice = new Invoice();
            String products = "";
            int quantitiy = 0;
            int total_amount = 0;
            boolean moreitems = true;
            while (moreitems != false) {
                System.out.println("Enter the product name above :");
                String productname = sc.next();
                for (int i = 0; i < totalproducts.size(); i++) {

                    if (productname.equals(totalproducts.get(i).product_name)) {
                        int amount = totalproducts.get(i).price;
                        System.out.println("Enter how many quantity");
                        quantitiy = sc.nextInt();
                        total_amount += invoice.totalamount(amount, quantitiy);
                        products += ("Product : " + totalproducts.get(i).product_name+"      ");
                        products += ("Quantity : " + quantitiy+"      ");
                        products += ("Price : " + invoice.totalamount(amount, quantitiy)+"\n");
                    }
                }
                System.out.println("Do you want to create add another product(yes/no)");
                if (sc.next().equals("yes")) {
                    moreitems = true;
                } else {
                    moreitems = false;
                }
            }
            int dis_amount = invoice.discountAmount(total_amount, 10);
            double tax_amount = invoice.taxAmount(total_amount, 0.2);
            double original_amount = invoice.originalAmount(total_amount, dis_amount, tax_amount);
            System.out.println("Name : " + customer_details.getCustomer_name());
            System.out.println(products);
            System.out.println("Discount Amount : 10%");
            System.out.println("Tax Amount : " + tax_amount+"%");
            System.out.println("Total amount to pay : " + original_amount+".RS");
            int pay = sc.nextInt();
            total += pay;
            customer_details.setPay(total);  
        }
    }
    
    public static void main(String[] args) {
        int total = 0;
        
        Product product1 = new Product();
        product1.setProduct_name("RealmiX");
        product1.setPrice(1700);
        product1.setProductList(product1);

        Product product2 = new Product();
        product2.setProduct_name("RealmiXT");
        product2.setPrice(1600);
        product2.setProductList(product2);

        Product product3 = new Product();
        product3.setProduct_name("huaweiy9");
        product3.setPrice(1600);
        product3.setProductList(product3);


        Product product4 = new Product();
        product4.setProduct_name("samsungGalaxy");
        product4.setPrice(1000);
        product4.setProductList(product4);


        Product product5 = new Product();
        product5.setProduct_name("oneplus7");
        product5.setPrice(2600);
        product5.setProductList(product5);


        Product product6 = new Product();
        product6.setProduct_name("oneplus8");
        product6.setPrice(2700);
        product6.setProductList(product6);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the customer name : ");
        String customer_name = sc.next();

        Customer customer_details = new Customer();
        customer_details.setCustomer_name(customer_name);
        System.out.print("Address Details : "+"\n"+"  Door No : ");
        String customer_doorno = sc.next();            
        customer_details.setAddress_doorno(customer_doorno);
        System.out.print("  Street : ");
        String customer_Street=sc.next();
        customer_details.setAddress_street(customer_Street);
        System.out.print("  City : ");
        String customer_City=sc.next();
        customer_details.setAddress_city(customer_City);
        System.out.print("  District : ");
        String customer_District=sc.next();
        customer_details.setAddress_district(customer_District);
        System.out.print("  Pincode : ");
        long customer_pincode=sc.nextLong();
        customer_details.setAddress_pinCode(customer_pincode);
        System.out.print("Enter the mobile number : ");
        long customer_number = sc.nextLong();
        customer_details.setMobile_number(customer_number);
        showProducts();
        invoiceCreate(customer_details); 
    }
}
class Product{
    String product_name;
    int price;
    static ArrayList<Product> totalproducts = new ArrayList<>();
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public int getPrice()
    {
        return price;
    }
    public void setProductList(Product product)
    {
        totalproducts.add(product);
    }
    public ArrayList<Product> gettotalproducts()
    {
        return totalproducts;
    }
    public static void showProducts(){
        for (int i = 0; i < totalproducts.size(); i++) {
            String pr_name = totalproducts.get(i).product_name;
            int rs_rate = totalproducts.get(i).getPrice(); 
            System.out.println(pr_name + " =  Rs." + rs_rate);
        }
    }
}

class Customer extends Product{
    String customer_name;
    String address_doorno;
    String address_street;
    String address_city;
    String address_district;
    long address_pinCode;
    long mobile_number;
    int pay;
    
    static ArrayList<Customer> customer_list = new ArrayList<Customer>();
    static int customer_id = 0;
    public void setCustomer_name(String name) {
        this.customer_name = name;
    }
    public String getCustomer_name() {
        return customer_name;
    }
    public void setAddress_doorno(String address_doorno) {
        this.address_doorno = address_doorno;
    }
    public String getAddress_doorno() {
        return address_doorno;
    }
    public void setAddress_street(String address_street) {
        this.address_street = address_street;
    }
    public String getAddress_street() {
        return address_street;
    }
    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }
    public String getAddress_city() {
        return address_city;
    }
    public void setAddress_district(String address_district) {
        this.address_district = address_district;
    }
    public String getAddress_district() {
        return address_district;
    }
    public void setAddress_pinCode(long address_pinCode) {
        this.address_pinCode = address_pinCode;
    }
    public long getAddress_pinCode() {
        return address_pinCode;
    }
    public void setMobile_number(long num){
        this.mobile_number = num;
    }
    public long getMobile_number(){
        return mobile_number;
    }
    public void setPay(int pay){
        this.pay = pay;
    }
    public int getPay(){
        return pay;
    }   
    public void setCustomerInfo(Customer customer){
        customer_list.add(customer);
    }
    public ArrayList<Customer> getCustomerInfo(){
        return customer_list;
    }
}
