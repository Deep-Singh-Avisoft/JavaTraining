<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class libraryManagementSystem {

    //scanner object to take all the user inputs
    Scanner obj = new Scanner(System.in);
    //data structure that stores all the items
    Map<String, Item> inventory = new HashMap<>();
    //data structure that store all the members
    Map<Integer, LibraryMember> members = new HashMap<>();
    //arraylist for menu
    ArrayList<String> menu = new ArrayList<>();


    //check-in and check-out interface
    interface CheckOutable {
        void checkOut();
        void checkIn();
    }

    //Item class
    abstract class Item{
        private String itemID;
        private String author;
        private String title;

        int Qty;

        public Item(String id, String title, String author, int qty) {
            this.itemID = id;
            this.title = title;
            this.author = author;
            this.Qty = qty;
        }
            // Getter methods for encapsulated variables
            public String getItemID() {
                return itemID;
            }
            public String getTitle() {
                return title;
            }
            public String getAuthor() {
                return author;
            }
            public int getQty(){
                return Qty;
            }
            public void setQty(int Qty){
                this.Qty = Qty;
            }

         public void displayItemDetails() {
             System.out.println("Item ID: " + itemID);
             System.out.println("Title: " + title);
             System.out.println("Author: " + author);
             System.out.println("Quantities available : " + Qty);
         }

         // Polymorphism: Abstract method for subclasses to implement
         public abstract void displayAdditionalDetails();

    }

    //class inherited from item class for book type
    class Book extends Item{
        String ISBN;

        public Book(String id, String author, String title, int Qty, String ISBN){
            super(id, author, title, Qty);
            this.ISBN = ISBN;
        }
        public String getISBN(){
            return ISBN;
        }
        // Polymorphism: Override displayAdditionalDetails method
        public void displayAdditionalDetails(){
            System.out.println("Book's ISBN : " + ISBN);
        }
    }

    //class inherited from item class for magazine type
    class Magazine extends Item{
        String issueNo;

        public Magazine(String id, String author, String title, int Qty, String issueNo){
            super(id, author, title, Qty);
            this.issueNo = issueNo;
        }
        public String getIssueNo(){
            return issueNo;
        }
        // Polymorphism: Override displayAdditionalDetails method
        public void displayAdditionalDetails(){
            System.out.println("Magazine's Issue Number : " + issueNo);
        }
    }

    //class for a library member
    class LibraryMember{
        int memberID;
        String memberName;
        long mobileNo;
        String emailID;
        ArrayList<String> booksIssued;

        //constructor
        public LibraryMember(int id, String name, long num, String email){
            this.memberID = id;
            this.memberName = name;
            this.mobileNo = num;
            this.emailID = email;
            this.booksIssued = new ArrayList<>();
        }

        //function to display details of a particular member
        public void displayMembers(){
            System.out.println("Member ID : " + memberID);
            System.out.println("Member Name : " + memberName);
            System.out.println("Mobile No. : " + mobileNo);
            System.out.println("Email Id : " + emailID);
            System.out.print("Books Issued by this member : ");
            for (int i = 0; i < booksIssued.size(); i++){
                System.out.print(booksIssued.get(i));
                if(i != booksIssued.size() - 1){
                    System.out.print(", ");
                }
            }
        }
    }

    //library class that consist of all major functionalities of a library
    class Library implements CheckOutable{

        //function to choose item type
        public int choose(){
            System.out.println("What you want to add..? : ");
            System.out.println("1. Book");
            System.out.println("2. Magazine");
            System.out.println("Enter your Choice : ");
            int choice = obj.nextInt();
            if(choice > 2){
                System.out.println("Invalid Choice...!!");
                System.out.println("Try again..!!");
                return choose();
            }
            return choice;
        }

        //function to input id of an item
        public String inputID(){
            System.out.print("Enter the item id : ");
            String id = obj.next();
            if(inventory.containsKey(id)){
                System.out.println("An Item with same item no. already exist...!!");
                System.out.println("Please Try with a different item id...!!");
                return inputID();
            }
            return id;
        }

        //function to input author of an item
        public String inputAuthor(){
            System.out.print("Enter Author's Name : ");
            return obj.next();
        }

        //function to input title of an item
        public String inputTitle(){
            System.out.print("Enter Title : ");
            return obj.next();
        }

        //function to input ISBN of a book
        public String addISBN(){
            System.out.print("Enter Book's ISBN : ");
            return obj.next();
        }

        //function to input quantity of an item
        public int addQty(){
            System.out.print("Enter Quantity : ");
            return obj.nextInt();
        }

        //function to input issue no. for a magazine
        public String addIssueNo(){
            System.out.print("Enter Magazine's Issue No. : ");
            return obj.next();
        }

        //function to add an item in inventory
        public void addAnItem(){
            String id = inputID();
            String author = inputAuthor();
            String title = inputTitle();
            int qty = addQty();
            int choice = choose();
            switch(choice){
                case 1:
                    String isbn = addISBN();
                    Book b = new Book(id,author, title, qty, isbn);
                    inventory.put(id, b);
                    break;
                case 2:
                    String issueNo = addIssueNo();
                    Magazine m = new Magazine(id, author, title, qty, issueNo);
                    inventory.put(id, m);
                    break;
            }
            System.out.println("Item added successfully...!!");
            mainMenu();
    }

        //function to display all the items
        public void displayAllItemsInInventory(){
            for(Map.Entry<String, Item> e : inventory.entrySet()){
                Item i = e.getValue();
                i.displayItemDetails();
                i.displayAdditionalDetails();
            }
            mainMenu();
        }

        //function to display all the members
        public void displayAllMembers(){
            for(Map.Entry<Integer, LibraryMember> e : members.entrySet()){
                LibraryMember m = e.getValue();
                m.displayMembers();
            }
            mainMenu();
        }

        //function to remove a member
        public void remMember(){
            System.out.print("Enter Member ID : ");
            int memId = obj.nextInt();
            if(members.containsKey(memId)){
                members.remove(memId);
            }
            else{
                System.out.println("Member doesn't exist...!!");
            }
            mainMenu();
        }

        //function to remove an item from the inventory
        public void removeItem(){
            System.out.print("Enter Item id you want to remove : ");
            String itemId = obj.next();
            if(!inventory.containsKey(itemId)){
                System.out.println("Item doesn't exist...!!");
                removeItem();
            }
            inventory.remove(itemId);
            System.out.println("Item removed successfully...!!");
            mainMenu();
        }

        //function to input member id
        public int inputmemID(){
            System.out.print("Enter Member Id (only Integers) : ");
            int mid = obj.nextInt();
            if(members.containsKey(mid)){
                System.out.println("A Member with same item no. already exist...!!");
                System.out.println("Please Try with a different Member id...!!");
                return inputmemID();
            }
            return mid;
        }

        //function to register a new member
        public void registerMember() {
            System.out.println("Hello Be a Member...!!");
            int mid = inputmemID();
            System.out.print("Enter Member Name : ");
            String mName = obj.next();
            System.out.print("Enter Mobile No. : ");
            long mNum = obj.nextLong();
            System.out.print("Enter Email Id : ");
            String mEmail = obj.next();
            LibraryMember m = new LibraryMember(mid, mName, mNum, mEmail);
            members.put(mid, m);
            System.out.println("Member added Successfully");
            mainMenu();
        }

        //function to search details of a particular item
        public void searchItem(){
            System.out.print("Enter Item ID: ");
            String itemId = obj.next();
            if(inventory.containsKey(itemId)){
                Item i = inventory.get(itemId);
                i.displayItemDetails();
                i.displayAdditionalDetails();
            }
            else {
                System.out.println("Item Not Found...!!!");
            }
            mainMenu();
        }

        //function to search details of a particular member
        public void searchMember(){
            System.out.print("Enter Member ID: ");
            int memId = obj.nextInt();
            if(members.containsKey(memId)){
                LibraryMember m  = members.get(memId);
                m.displayMembers();
            }
            else{
                System.out.println("Member Not Found...!!!");
            }
            mainMenu();
        }

        //overriding the checkOut function of CheckOutable interface
        @Override
        public void checkOut() {
            System.out.print("Enter the Item Id : " );
            String itemID = obj.next();
            System.out.print("Enter the Member Id : ");
            int memId = obj.nextInt();
            if(members.containsKey(memId)) {
                LibraryMember mem = members.get(memId);
                if(inventory.containsKey(itemID)){
                    Item it = inventory.get(itemID);
                    int qty = it.getQty();
                    if(qty >= 1){
                        it.setQty(qty-1);
                        inventory.remove(itemID);
                        inventory.put(itemID, it);
                        mem.booksIssued.add(itemID);
                        members.remove(memId);
                        members.put(memId, mem);
                        System.out.println("Check Out successful...!!");
                    }
                    else{
                        System.out.println("Item is Out of Stock...!!!");
                    }
                }
                else{
                    System.out.println("Item not Found...!!");

                }
                mainMenu();
            }
            else{
                System.out.println("You are Not a member..!!");
                System.out.println("Register yourself..!!");
                registerMember();
            }
        }

        //overriding the checkIn function of CheckOutable interface
        @Override
        public void checkIn() {
            System.out.print("Enter the Item Id : " );
            String itemID = obj.next();
            System.out.print("Enter the Member Id : ");
            int memId = obj.nextInt();
            if(inventory.containsKey(itemID)){
                Item it = inventory.get(itemID);
                int qty = it.getQty();
                it.setQty(qty + 1);
                inventory.remove(itemID);
                inventory.put(itemID, it);
                LibraryMember mem = members.get(memId);
                mem.booksIssued.remove(itemID);
                members.remove(memId);
                members.put(memId, mem);
            }
            System.out.println("Check In Successfully...!!");
            mainMenu();
        }
}

//main menu function of library management class
public void mainMenu(){

    //object of library class to access its functions
    Library l = new Library();
    System.out.println("Welcome to the library...!!!");
    System.out.println("Main Menu : ");
    //displaying menu
    for(int i = 0; i < menu.size(); i++){
        System.out.println((i+1) + ". " + menu.get(i));
    }
    //input for choice from user
    int choice = obj.nextInt();
    //calling particular functions from library class according to the choice
    switch(choice){
        case 1:
            l.addAnItem();
            break;
        case 2:
            l.removeItem();
            break;
        case 3:
            l.displayAllItemsInInventory();
            break;
        case 4:
            l.registerMember();
            break;
        case 5:
            l.checkIn();
            break;
        case 6:
            l.checkOut();
            break;
        case 7:
            l.displayAllMembers();
            break;
        case 8:
            l.remMember();
            break;
        case 9:
            l.searchItem();
            break;
        case 10:
            l.searchMember();
            break;
        default:
            System.out.println("Invalid Input, Try Again...!!!");
            mainMenu();
    }
}

    public static void main(String[] args) {
        //creating object of library management class to access its functions
        libraryManagementSystem object = new libraryManagementSystem();
        //adding values to the mainMenu arrayList
        object.menu.add("Add an item in Inventory");
        object.menu.add("Remove an item from Inventory");
        object.menu.add("Display all items of the inventory");
        object.menu.add("Register a new Member");
        object.menu.add("CheckIn");
        object.menu.add("CheckOut");
        object.menu.add("Display All Members");
        object.menu.add("Remove Membership");
        object.menu.add("Search an Item");
        object.menu.add("Search a Member");
        //calling main menu function of the library management class using its object
        object.mainMenu();
    }
}


=======
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class libraryManagementSystem {

    //scanner object to take all the user inputs
    Scanner obj = new Scanner(System.in);
    //data structure that stores all the items
    Map<String, Item> inventory = new HashMap<>();
    //data structure that store all the members
    Map<Integer, LibraryMember> members = new HashMap<>();
    //arraylist for menu
    ArrayList<String> menu = new ArrayList<>();


    //check-in and check-out interface
    interface CheckOutable {
        void checkOut();
        void checkIn();
    }

    //Item class
    abstract class Item{
        private String itemID;
        private String author;
        private String title;

        int Qty;

        public Item(String id, String title, String author, int qty) {
            this.itemID = id;
            this.title = title;
            this.author = author;
            this.Qty = qty;
        }
            // Getter methods for encapsulated variables
            public String getItemID() {
                return itemID;
            }
            public String getTitle() {
                return title;
            }
            public String getAuthor() {
                return author;
            }
            public int getQty(){
                return Qty;
            }
            public void setQty(int Qty){
                this.Qty = Qty;
            }

         public void displayItemDetails() {
             System.out.println("Item ID: " + itemID);
             System.out.println("Title: " + title);
             System.out.println("Author: " + author);
             System.out.println("Quantities available : " + Qty);
         }

         // Polymorphism: Abstract method for subclasses to implement
         public abstract void displayAdditionalDetails();

    }

    //class inherited from item class for book type
    class Book extends Item{
        String ISBN;

        public Book(String id, String author, String title, int Qty, String ISBN){
            super(id, author, title, Qty);
            this.ISBN = ISBN;
        }
        public String getISBN(){
            return ISBN;
        }
        // Polymorphism: Override displayAdditionalDetails method
        public void displayAdditionalDetails(){
            System.out.println("Book's ISBN : " + ISBN);
        }
    }

    //class inherited from item class for magazine type
    class Magazine extends Item{
        String issueNo;

        public Magazine(String id, String author, String title, int Qty, String issueNo){
            super(id, author, title, Qty);
            this.issueNo = issueNo;
        }
        public String getIssueNo(){
            return issueNo;
        }
        // Polymorphism: Override displayAdditionalDetails method
        public void displayAdditionalDetails(){
            System.out.println("Magazine's Issue Number : " + issueNo);
        }
    }

    //class for a library member
    class LibraryMember{
        int memberID;
        String memberName;
        long mobileNo;
        String emailID;
        ArrayList<String> booksIssued;

        //constructor
        public LibraryMember(int id, String name, long num, String email){
            this.memberID = id;
            this.memberName = name;
            this.mobileNo = num;
            this.emailID = email;
            this.booksIssued = new ArrayList<>();
        }

        //function to display details of a particular member
        public void displayMembers(){
            System.out.println("Member ID : " + memberID);
            System.out.println("Member Name : " + memberName);
            System.out.println("Mobile No. : " + mobileNo);
            System.out.println("Email Id : " + emailID);
            System.out.print("Books Issued by this member : ");
            for (int i = 0; i < booksIssued.size(); i++){
                System.out.print(booksIssued.get(i));
                if(i != booksIssued.size() - 1){
                    System.out.print(", ");
                }
            }
        }
    }

    //library class that consist of all major functionalities of a library
    class Library implements CheckOutable{

        //function to choose item type
        public int choose(){
            System.out.println("What you want to add..? : ");
            System.out.println("1. Book");
            System.out.println("2. Magazine");
            System.out.println("Enter your Choice : ");
            int choice = obj.nextInt();
            if(choice > 2){
                System.out.println("Invalid Choice...!!");
                System.out.println("Try again..!!");
                return choose();
            }
            return choice;
        }

        //function to input id of an item
        public String inputID(){
            System.out.print("Enter the item id : ");
            String id = obj.next();
            if(inventory.containsKey(id)){
                System.out.println("An Item with same item no. already exist...!!");
                System.out.println("Please Try with a different item id...!!");
                return inputID();
            }
            return id;
        }

        //function to input author of an item
        public String inputAuthor(){
            System.out.print("Enter Author's Name : ");
            return obj.next();
        }

        //function to input title of an item
        public String inputTitle(){
            System.out.print("Enter Title : ");
            return obj.next();
        }

        //function to input ISBN of a book
        public String addISBN(){
            System.out.print("Enter Book's ISBN : ");
            return obj.next();
        }

        //function to input quantity of an item
        public int addQty(){
            System.out.print("Enter Quantity : ");
            return obj.nextInt();
        }

        //function to input issue no. for a magazine
        public String addIssueNo(){
            System.out.print("Enter Magazine's Issue No. : ");
            return obj.next();
        }

        //function to add an item in inventory
        public void addAnItem(){
            String id = inputID();
            String author = inputAuthor();
            String title = inputTitle();
            int qty = addQty();
            int choice = choose();
            switch(choice){
                case 1:
                    String isbn = addISBN();
                    Book b = new Book(id,author, title, qty, isbn);
                    inventory.put(id, b);
                    break;
                case 2:
                    String issueNo = addIssueNo();
                    Magazine m = new Magazine(id, author, title, qty, issueNo);
                    inventory.put(id, m);
                    break;
            }
            System.out.println("Item added successfully...!!");
            mainMenu();
    }

        //function to display all the items
        public void displayAllItemsInInventory(){
            for(Map.Entry<String, Item> e : inventory.entrySet()){
                Item i = e.getValue();
                i.displayItemDetails();
                i.displayAdditionalDetails();
            }
            mainMenu();
        }

        //function to display all the members
        public void displayAllMembers(){
            for(Map.Entry<Integer, LibraryMember> e : members.entrySet()){
                LibraryMember m = e.getValue();
                m.displayMembers();
            }
            mainMenu();
        }

        //function to remove a member
        public void remMember(){
            System.out.print("Enter Member ID : ");
            int memId = obj.nextInt();
            if(members.containsKey(memId)){
                members.remove(memId);
            }
            else{
                System.out.println("Member doesn't exist...!!");
            }
            mainMenu();
        }

        //function to remove an item from the inventory
        public void removeItem(){
            System.out.print("Enter Item id you want to remove : ");
            String itemId = obj.next();
            if(!inventory.containsKey(itemId)){
                System.out.println("Item doesn't exist...!!");
                removeItem();
            }
            inventory.remove(itemId);
            System.out.println("Item removed successfully...!!");
            mainMenu();
        }

        //function to input member id
        public int inputmemID(){
            System.out.print("Enter Member Id (only Integers) : ");
            int mid = obj.nextInt();
            if(members.containsKey(mid)){
                System.out.println("A Member with same item no. already exist...!!");
                System.out.println("Please Try with a different Member id...!!");
                return inputmemID();
            }
            return mid;
        }

        //function to register a new member
        public void registerMember() {
            System.out.println("Hello Be a Member...!!");
            int mid = inputmemID();
            System.out.print("Enter Member Name : ");
            String mName = obj.next();
            System.out.print("Enter Mobile No. : ");
            long mNum = obj.nextLong();
            System.out.print("Enter Email Id : ");
            String mEmail = obj.next();
            LibraryMember m = new LibraryMember(mid, mName, mNum, mEmail);
            members.put(mid, m);
            System.out.println("Member added Successfully");
            mainMenu();
        }

        //function to search details of a particular item
        public void searchItem(){
            System.out.print("Enter Item ID: ");
            String itemId = obj.next();
            if(inventory.containsKey(itemId)){
                Item i = inventory.get(itemId);
                i.displayItemDetails();
                i.displayAdditionalDetails();
            }
            else {
                System.out.println("Item Not Found...!!!");
            }
            mainMenu();
        }

        //function to search details of a particular member
        public void searchMember(){
            System.out.print("Enter Member ID: ");
            int memId = obj.nextInt();
            if(members.containsKey(memId)){
                LibraryMember m  = members.get(memId);
                m.displayMembers();
            }
            else{
                System.out.println("Member Not Found...!!!");
            }
            mainMenu();
        }

        //overriding the checkOut function of CheckOutable interface
        @Override
        public void checkOut() {
            System.out.print("Enter the Item Id : " );
            String itemID = obj.next();
            System.out.print("Enter the Member Id : ");
            int memId = obj.nextInt();
            if(members.containsKey(memId)) {
                LibraryMember mem = members.get(memId);
                if(inventory.containsKey(itemID)){
                    Item it = inventory.get(itemID);
                    int qty = it.getQty();
                    if(qty >= 1){
                        it.setQty(qty-1);
                        inventory.remove(itemID);
                        inventory.put(itemID, it);
                        mem.booksIssued.add(itemID);
                        members.remove(memId);
                        members.put(memId, mem);
                        System.out.println("Check Out successful...!!");
                    }
                    else{
                        System.out.println("Item is Out of Stock...!!!");
                    }
                }
                else{
                    System.out.println("Item not Found...!!");

                }
                mainMenu();
            }
            else{
                System.out.println("You are Not a member..!!");
                System.out.println("Register yourself..!!");
                registerMember();
            }
        }

        //overriding the checkIn function of CheckOutable interface
        @Override
        public void checkIn() {
            System.out.print("Enter the Item Id : " );
            String itemID = obj.next();
            System.out.print("Enter the Member Id : ");
            int memId = obj.nextInt();
            if(inventory.containsKey(itemID)){
                Item it = inventory.get(itemID);
                int qty = it.getQty();
                it.setQty(qty + 1);
                inventory.remove(itemID);
                inventory.put(itemID, it);
                LibraryMember mem = members.get(memId);
                mem.booksIssued.remove(itemID);
                members.remove(memId);
                members.put(memId, mem);
            }
            System.out.println("Check In Successfully...!!");
            mainMenu();
        }
}

//main menu function of library management class
public void mainMenu(){

    //object of library class to access its functions
    Library l = new Library();
    System.out.println("Welcome to the library...!!!");
    System.out.println("Main Menu : ");
    //displaying menu
    for(int i = 0; i < menu.size(); i++){
        System.out.println((i+1) + ". " + menu.get(i));
    }
    //input for choice from user
    int choice = obj.nextInt();
    //calling particular functions from library class according to the choice
    switch(choice){
        case 1:
            l.addAnItem();
            break;
        case 2:
            l.removeItem();
            break;
        case 3:
            l.displayAllItemsInInventory();
            break;
        case 4:
            l.registerMember();
            break;
        case 5:
            l.checkIn();
            break;
        case 6:
            l.checkOut();
            break;
        case 7:
            l.displayAllMembers();
            break;
        case 8:
            l.remMember();
            break;
        case 9:
            l.searchItem();
            break;
        case 10:
            l.searchMember();
            break;
        default:
            System.out.println("Invalid Input, Try Again...!!!");
            mainMenu();
    }
}

    public static void main(String[] args) {
        //creating object of library management class to access its functions
        libraryManagementSystem object = new libraryManagementSystem();
        //adding values to the mainMenu arrayList
        object.menu.add("Add an item in Inventory");
        object.menu.add("Remove an item from Inventory");
        object.menu.add("Display all items of the inventory");
        object.menu.add("Register a new Member");
        object.menu.add("CheckIn");
        object.menu.add("CheckOut");
        object.menu.add("Display All Members");
        object.menu.add("Remove Membership");
        object.menu.add("Search an Item");
        object.menu.add("Search a Member");
        //calling main menu function of the library management class using its object
        object.mainMenu();
    }
}


>>>>>>> 7ad82ffc657c4a72b792b1c0525534c30609aa10
