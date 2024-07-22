

package assign2;
import java.util.Scanner;

class Publication {
    int copies;
    String title;
    float price;
    int order;
    
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title:");
        title = sc.nextLine();
        System.out.println("Enter no of copies:");
        copies = sc.nextInt();
        System.out.println("Enter price:");
        price = sc.nextFloat();
    }

    void display() {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("No of copies: " + copies);
        System.out.println("No.of Orders : ");
        order= sc.nextInt();
        System.out.println("Total Cost: "+order*price);
        
    }
    
    void salecopy() {
    	System.out.println("Total Sales of "+title+" are "+(order));
    	System.out.println("Cost:"+(order*price));
      	System.out.println("No.of copies remaining are "+(copies-order));
      	
    	
    }
    
  
}

class Book extends Publication {
    private String author;

    void ordercopies() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter author name:");
        author = sr.nextLine();
    }
}

class Magazine extends Book {
    int quantity;

    void orderquantity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("No.of issue received");
        quantity = sc.nextInt();	
    }

    void currentissue() {
        System.out.println("Magazine CUrrent Issue: " + super.title);
    }

    void recieveissue() {
        System.out.println("Received issued Magazine: " + super.title);
        System.out.println("Magazine issue recieved" + this.quantity);
        
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Publication p = new Publication();
        System.out.println("----Entering details for a Publication----");
        p.accept();
        System.out.println("----Displaying Publication details----");
        p.display();
        System.out.println("\n");
        Book b = new Book();
        System.out.println("----Entering details for a Book----");
        b.accept(); // Inherits from Publication
        b.ordercopies();
        System.out.println("----Displaying Book details----");
        b.display(); // Inherits from Publication
        System.out.println("\n");
        Magazine m = new Magazine();
        System.out.println("----Entering details for a Magazine----");
        m.accept(); // Inherits from Publication
        m.ordercopies(); // Inherits from Book
      
        m.currentissue();
        m.orderquantity();
      
        System.out.println("\n");
        m.recieveissue();
        System.out.println("\n");
        p.salecopy();
        System.out.println("\n");
        b.salecopy();
     /*   System.out.println("\n");
        m.salecopy();*/
        
    }
}

