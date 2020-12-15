import java.util.ArrayList;
import java.util.Scanner;

class Product{
    String setProduct_name;
    int rate;
    static ArrayList<Product> product_list = new ArrayList<>();
    static int product_id = 0;
    public Product(){
        product_id++;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setRate(int rate)
    {
        this.rate = rate;
    }

    public int getRate()
    {
        return rate;
    }

    public void setProductList(ArrayList product)
    {
        product_list.add(product);
    }
    public ArrayList<Product> getProduct_list()
    {
        return product_list;
    }
}
class Customer extends Product{

    String customer_name;
    String email;
    long mobile_number;
    int paid;
    int unpaid;
    int invoice_count;
    static ArrayList<Customer> customer_list = new ArrayList<Customer>();
  
    static int customer_id = 0;

    public Customer(){
        customer_id++;
    }

    public void setCustomer_name(String name) {
        this.customer_name = name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMobile_number(long num)
    {
        this.mobile_number = num;
    }

    public long getMobile_number()
    {
        return mobile_number;
    }

    public void setPaid(int paid)
    {
        this.paid = paid;
    }

    public int getPaid()
    {
        return paid;
    }

    public void setUnpaid(int unpaid)
    {
        this.unpaid = unpaid;
    }

    public int getUnpaid()
    {
        return unpaid;
    }
    public void setCustomerDetails(Customer customer){
        customer_list.add(customer);
    }
    public void setInvoiceCount(int invoice_count)
    {
        this.invoice_count = invoice_count;
    }
    public int getInvoiceCount()
    {
        return invoice_count;
    }
    public ArrayList<Customer> getCustomerDetails()
    {
        return customer_list;
    }


}
public class Invoice extends Customer{

    static int invoice_id = 0;
    int product_id;
    int customer_id;
    public Invoice()
    {
        invoice_id++;
    }
    public int calculateAmount(int product_rate,int quantity)
    {
        return product_rate*quantity;
    }
    public int discountAmount(int amount,int percentage)
    {
        return (amount*percentage)/100;
    }
    public int taxAmount(int amount,int tax_percentage)
    {
        return (amount*tax_percentage)/100;
    }
    public int originalAmount(int original_amount,int discount_amount,int tax_amount)
    {
        return (original_amount -discount_amount)+tax_amount;
    }
    public int unPaidAmount(int original_amount,int paid_amount)
    {
        return original_amount - paid_amount;
    }

    public static void main(String[] args) {
        boolean create_invoice = true;
        int invoice_count = 0;
        int total_paid = 0;
        int total_unpaid = 0;
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name");
	String customer_name = sc.next();
	Customer c1 = new Customer();
        c1.setCustomer_name(customer_name);
	System.out.println("Enter the customer email");
	String customer_email = sc.next();
	System.out.println("Enter the customer mobile number");
	long customer_number = sc.nextLong();
        c1.setEmail(customer_email);
        c1.setMobile_number(customer_number);
        Product pr = new Product();
        pr.setProduct_name("DiaryMilk");
        pr.setRate(20);
        pr.setProductList(pr);
        Product pr1 = new Product();
        pr1.setProduct_name("MilkyBar");
        pr1.setRate(10);
        pr1.setProductList(pr1);
        Product pr2 = new Product();
        pr2.setProduct_name("Galaxy");
        pr2.setRate(30);
        pr2.setProductList(pr2);

        for(int i=0;i<product_list.size();i++)
        {
            String pr_name = product_list.get(i).product_name;
            int rs_rate = product_list.get(i).getRate();
            System.out.println(pr_name+" =  Rs."+rs_rate);
        }
        while(create_invoice!=false) {
            Invoice invoice = new Invoice();
            invoice_count++;
            int quantitiy = 0;
            int total_cost = 0;
            String all_product = "";
            boolean add_product = true;
            while(add_product!=false) {
                System.out.println("Enter the product name above :");
                String productname = sc.next();
                for (int i = 0; i < product_list.size(); i++) {

                    if (productname.equals(product_list.get(i).product_name)) {
                        int amount = product_list.get(i).rate;
                        System.out.println("Enter how many quantity");
                        quantitiy = sc.nextInt();
                        total_cost += invoice.calculateAmount(amount, quantitiy);
                        all_product+=("Product : " + product_list.get(i).product_name)+"\n";
                        all_product+=("Quantity : " + quantitiy)+"\n";
                        all_product+=("Initial_cost : " + invoice.calculateAmount(amount, quantitiy));
                    }
                }
                System.out.println("Do you want to create add another product yes or no");
                if (sc.next().equals("yes")) {
                    add_product = true;
                } else {
                    add_product = false;
                }
            }
                        int dis_amount = invoice.discountAmount(total_cost, 0);
                        int tax_amount = invoice.taxAmount(total_cost, 0);
                        int original_amount = invoice.originalAmount(total_cost, dis_amount, tax_amount);
                        System.out.println("Invoice Id : "+"INV-00"+invoice_id);
                        System.out.println("Name : " + c1.getCustomer_name());
                        System.out.println(all_product);
                        System.out.println("Discount Amount : " + dis_amount);
                        System.out.println("Tax Amount : " + tax_amount);
                        System.out.println("Final amount to pay : " + original_amount);
                        System.out.println("Enter the amount you paid :");
                        int paid = sc.nextInt();
                        total_paid += paid;
                        c1.setPaid(total_paid);
                        int unpaid = invoice.unPaidAmount(original_amount, paid);
                        total_unpaid += unpaid;
                        c1.setUnpaid(total_unpaid);
                        System.out.println("Unpaid amount : " + unpaid);
                        c1.setInvoiceCount(invoice_count);
                        System.out.println("Do you want to create another invoice yes or no");
                        if (sc.next().equals("yes")) {
                            create_invoice = true;
                            all_product="";
                        } else {
                            create_invoice = false;
                            c1.setCustomerDetails(c1);
                        }

            }
        for (int i=0;i<customer_list.size();i++){
            System.out.println("total_paid amount for all invoices  : "+customer_list.get(i).getPaid());
            System.out.println("total invoice created  : "+customer_list.get(i).getInvoiceCount());
        }
    }
}



