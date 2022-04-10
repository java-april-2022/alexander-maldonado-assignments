import java.util.ArrayList;

public class CafeUtil { 

    public int getStreakGoal(int numWeeks) {
        int i = 0; // starting at 0 at initial week
        for (int count = 0; count < numWeeks + 1; count++) {
            i+=count; //count is added to initial after numWeeks go by
        }
        return (i); // grabbing sum
    }
    
    public double getOrderTotal(double[] prices){
        double sum = 0; // original sum at 0
        for (double value:prices){ //value is given 3.5, 1.5, 4.0, 4.5
            sum+=value; //sum plus values added
        }
        return sum; // total is returned
    }

    public void displayMenu(ArrayList<String> menuItems){
        System.out.println(menuItems.get(0)); //returning drip coffee
        System.out.println(menuItems.get(1)); //returning cappuccino
        System.out.println(menuItems.get(2)); // returning latte
        System.out.println(menuItems.get(3)); // returning mocha
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people in front of you. \n", customers.size());
        customers.add(userName); // array list is being created for each customer added
        System.out.println(customers);
    }
}
