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
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        //instantiate Snacks tied to Drink Vending Machine
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        //Jane buys snacks
        jane.buySnacks(soda, 3);
        jane.getCashOnHand();
        soda.getQuantity();

        jane.buySnacks(pretzel, 1);
        jane.getCashOnHand();
        pretzel.getQuantity();

        //Bob buys snacks
        bob.buySnacks(soda, 2);
        bob.getCashOnHand();
        soda.getQuantity();

        //Jane finds $10
        jane.addToCashOnHand(10.00);
        jane.getCashOnHand();

        //Jane buys snacks
        jane.buySnacks(chocolateBar, 1);
        jane.getCashOnHand();
        chocolateBar.getQuantity();

        //Adding 12 pretzels
        pretzel.addQuantity(12);
        pretzel.getQuantity();

        //Bob buys snacks
        bob.buySnacks(pretzel, 3);
        bob.getCashOnHand();
        pretzel.getQuantity();
    }

    public static void main(String[] args) {
       initializeData();
    }
}