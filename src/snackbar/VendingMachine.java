package snackbar;

public class VendingMachine {
    //fields
    private static int maxId = 0;
    private int id;
    private String name;
        
    //constructor initialized state
    public VendingMachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    //get Id
    public int getId() {
        return id;
    }

    //get & set Name
    public String getName() {
        return name;
    }
    
    public void setId(String name) {
        this.name = name;
    }
}