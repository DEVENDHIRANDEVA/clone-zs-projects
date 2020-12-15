import sun.font.DelegatingShape;

import java.util.ArrayList;
import java.util.Scanner;

class Product{
    String product_name;
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

    public void setProductList(Product product)
    {
        product_list.add(product);
    }
    public ArrayList<Product> getProduct_list()
    {
        return product_list;
    }
    public static void showProducts(){
        for (int i = 0; i < product_list.size(); i++) {
            String pr_name = product_list.get(i).product_name;
            int rs_rate = product_list.get(i).getRate();
            System.out.println(pr_name + " =  Rs." + rs_rate);
        }
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

    public int getCustomerId(){
        return customer_id;
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
class Invoice extends Customer{

    static int invoice_id = 0;
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
    public static void invoiceCreateForNewCustomer(Customer c1){
        Scanner sc = new Scanner(System.in);
        boolean create_invoice = true;
        int invoice_count = 0;
        int total_paid = 0;
        int total_unpaid = 0;
        while (create_invoice != false) {
            Invoice invoice = new Invoice();
            invoice_count++;
            int quantitiy = 0;
            int total_cost = 0;
            String all_product = "";
            boolean add_product = true;
            int product_match = 1;
            while (add_product != false) {
                System.out.println("Enter the product name above :");
                String productname = new String(sc.next());
                productname = productname.toUpperCase();
                for (int i = 0; i < product_list.size(); i++) {

                    if (productname.equals(product_list.get(i).product_name)) {
                        int amount = product_list.get(i).rate;
                        product_match = 0;
                        System.out.println("Enter how many quantity");
                        quantitiy = sc.nextInt();
                        total_cost += invoice.calculateAmount(amount, quantitiy);
                        all_product += ("Product : " + product_list.get(i).product_name) + "\t\t";
                        all_product += ("Quantity : " + quantitiy) + "\t\t";
                        all_product += ("Initial_cost : " + invoice.calculateAmount(amount, quantitiy)+"\n");
                    }
                    else if(product_match==1 && i==(product_list.size()-1))
                    {
                        System.out.println("Product does not match.");
                    }
                }
                System.out.println("Do you want to create add another product yes or no");
                if (sc.next().equals("yes")) {
                    add_product = true;
                    product_match = 1;
                } else {
                    add_product = false;
                }
            }
            int dis_amount = invoice.discountAmount(total_cost, 5);
            int tax_amount = invoice.taxAmount(total_cost, 0);
            int original_amount = invoice.originalAmount(total_cost, dis_amount, tax_amount);
            System.out.println("Invoice Id : " + "INV-00" + invoice_id);
            System.out.println("Name : " + c1.getCustomer_name());
            System.out.println(all_product);
            System.out.println("Total Amount : "+total_cost);
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
                all_product = "";
            } else {
                create_invoice = false;
                c1.setCustomerDetails(c1);
            }

        }
    }
    public static void createInvoiceForExistingCustomer() {
        int invoice_count = 0;
        int total_paid = 0;
        int total_unpaid = 0;
        Scanner sc = new Scanner(System.in);
        boolean add_customer = true;
        boolean create_invoice = false;
        System.out.println("Enter the mobile Number to check already you customer or not");
        for (int i = 0; i < customer_list.size(); i++) {
            if (sc.nextLong() == customer_list.get(i).getMobile_number()) {
                showProducts();
                invoice_count = customer_list.get(i).getInvoiceCount();
                total_paid = customer_list.get(i).getPaid();
                total_unpaid = customer_list.get(i).getUnpaid();
                Customer c1 = customer_list.get(i);
                add_customer = false;
                create_invoice = true;
                while (create_invoice != false) {
                    Invoice invoice = new Invoice();
                    invoice_count++;
                    int quantitiy = 0;
                    int total_cost = 0;
                    String all_product = "";
                    boolean add_product = true;
                    int product_match = 1;
                    while (add_product != false) {
                        System.out.println("Enter the product name above :");
                        String productname = new String(sc.next());
                        productname = productname.toUpperCase();
                        for (i = 0; i < product_list.size(); i++) {

                            if (productname.equals(product_list.get(i).product_name)){
                                product_match = 0;
                                int amount = product_list.get(i).rate;
                                System.out.println("Enter how many quantity");
                                quantitiy = sc.nextInt();
                                total_cost += invoice.calculateAmount(amount, quantitiy);
                                all_product += ("Product : " + product_list.get(i).product_name) + "\t\t";
                                all_product += ("Quantity : " + quantitiy) + "\t\t";
                                all_product += ("Initial_cost : " + invoice.calculateAmount(amount, quantitiy) + "\n");
                            }
                            else if(product_match==1 && i==(product_list.size()-1))
                            {
                                System.out.println("Product does not match.");
                            }
                        }
                        System.out.println("Do you want to create add another product yes or no");
                        if (sc.next().equals("yes")) {
                            add_product = true;
                            product_match = 1;
                        } else {
                            add_product = false;
                        }
                    }
                    int dis_amount = invoice.discountAmount(total_cost, 0);
                    int tax_amount = invoice.taxAmount(total_cost, 0);
                    int original_amount = invoice.originalAmount(total_cost, dis_amount, tax_amount);
                    System.out.println("Invoice Id : " + "INV-00" + invoice_id);
                    System.out.println("Name : " + c1.getCustomer_name());
                    System.out.println(all_product);
                    System.out.println("Total Amount : "+total_cost);
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
                        all_product = "";
                    } else {
                        create_invoice = false;
                    }
                    System.out.println("Do you want to add another customer yes or no");
                    if (sc.next().equals("yes")) {
                        createInvoiceForExistingCustomer();
                    } else {
                        add_customer = false;
                        showAllInvoices();
                        System.exit(1);
                    }
                }
            }
        }
    }
    public static void showAllInvoices()
    {
        for (int i = 0; i < customer_list.size(); i++) {
            System.out.println("Customer Name :  "+customer_list.get(i).getCustomer_name());
            System.out.println("Customer Email : "+customer_list.get(i).getEmail());
            System.out.println("Customer Mobile Number : "+customer_list.get(i).getMobile_number());
            System.out.println("Total paid Amount : "+customer_list.get(i).getPaid());
            System.out.println("Total unpaid Amount : "+customer_list.get(i).getUnpaid());
            System.out.println("total invoice created  : " + customer_list.get(i).getInvoiceCount());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean create_invoice = true;//ask do you want create invoice or not
        int invoice_count = 0;//count invoice for the customer
        int total_paid = 0;//total paid amount for all invoice by customer
        int total_unpaid = 0;//total unpaid amount for all invoice by customer
        boolean add_customer = true;//ask do you want to add customer or not
        Product pr = new Product();
        pr.setProduct_name("DIARYMILK");//set product name
        pr.setRate(20);
        pr.setProductList(pr);//set product details in arraylist
        Product pr1 = new Product();
        pr1.setProduct_name("MILKYBAR");
        pr1.setRate(10);
        pr1.setProductList(pr1);
        Product pr2 = new Product();
        pr2.setProduct_name("GALAXY");
        pr2.setRate(30);
        pr2.setProductList(pr2);
        while(add_customer!=false) {
            invoice_count = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the customer name");
            String customer_name = sc.nextLine();
            Customer c1 = new Customer();
            c1.setCustomer_name(customer_name);
            System.out.println("Enter the customer email");
            String customer_email = sc.next();
            System.out.println("Enter the mobile number");
            long customer_number = sc.nextLong();
            String nums = ""+customer_number;
            if(nums.length()==10 && (nums.charAt(0)=='9' || nums.charAt(0)=='8' || nums.charAt(0)=='7' || nums.charAt(0)=='6'))
            {
                c1.setMobile_number(customer_number);
            }
            else{
                System.out.println("Enter the mobile number properly");
            }
            customer_number = sc.nextLong();
            c1.setMobile_number(customer_number);
            c1.setEmail(customer_email);

            create_invoice = true;

            showProducts();//method to show all the product details

            invoiceCreateForNewCustomer(c1);//create invoice for new customer

            System.out.println("Do you want to add another customer yes or no");
            if (sc.next().equals("yes")) {
                createInvoiceForExistingCustomer();//create invoice for existing customer if phone number matches else new customer created
            } else {
                add_customer = false;
                showAllInvoices();
            }
        }
    }
}

