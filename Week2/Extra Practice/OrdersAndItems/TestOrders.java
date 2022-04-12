import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        ArrayList<String> items=new ArrayList<>();
        
        // Order variables -- order1, order2 etc.
        Orders order1 = new Orders("Alex");
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.getName());
        //System.out.printf("Total: %s\n", order1.total);
        //System.out.printf("Ready: %s\n", order1.ready);
    }
}
