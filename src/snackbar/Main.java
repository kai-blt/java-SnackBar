package snackbar;

public class Main {
    private static void initializeData() {
        //instantiate Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        //instantiate Vending Machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        //instantiate Snacks tied to Food Vending Machine
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack Pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        //instantiate Snacks tied to Drink Vending Machine
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());
    }

    public static void main(String[] args) {
       initializeData();
    }
}