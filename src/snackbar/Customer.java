package snackbar;

public class Customer {
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;    

    //constructor initialized state
    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //get id
    public int getId() {
        return id;
    }
    
    //get & set name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //get & add to cashOnHand
    public void getCashOnHand() {
        System.out.println(this.name + " cash on hand " + cashOnHand);
    }

    public void addToCashOnHand(double cashToAdd) {
        this.cashOnHand += cashToAdd;
    }

    //buy snacks
    public void buySnacks(Snack snack, int quantity) {
        snack.buyQuantity(quantity);
        this.cashOnHand -= snack.getTotal(quantity);
    }
}