package Assign5;

class CustomerImpl implements User, Purchasable{
    String username, email, name;
    double price;
    CustomerImpl(String username, String email, String name, double price){
        this.username = username;
        this.email = email;
        this.name = name;
        this.price = price;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public void displayProfile(){
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void displayProductInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
public class Q10 {
    public static void main(String[] args){
        CustomerImpl c = new CustomerImpl("admin", "admin@admin.com", "shampoo", 100);
        c.displayProfile();
        c.displayProductInfo();
    }
}
