package snackbar;

public class Snack {
    //fields
    private static int maxId = 0; //class field (shared by all Snack class instances)
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    //constructor initialized state
    public Snack(String name, int quantity, double cost, int vendingMachineId){
        //increment maxId on Snack instantiation
        maxId++;
        //Assign this instance of Snack the current maxId
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    //get Id
    public int getId() {
        return id;
    }

    //get & set Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //get & set Cost
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    //get & set Vending Machine Id
    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    //get quantity
    public void getQuantity() {
        System.out.println("Quantity of " + this.name + " is " + quantity);
        System.out.println();
    }

    //add to quantity
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    //buy quantity
    public void buyQuantity(int quantity) {
        this.quantity -= quantity;
    }

    //get total cost
    public double getTotal(int quantity) {
        return this.cost * (double) quantity;
    }
}