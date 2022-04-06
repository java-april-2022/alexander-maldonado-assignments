public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready!";
        String displayTotalMessage = " Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;

        int dripCoffee = 4;

        double latte = 4.75;

        double cappucino = 4.5;

        int MochaPrice = 4;

        double DripCoffee = 4.75;

        double Latte = 4.75;

        double Cappucino = 3.5;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        
        String customer2 = "Sam";

        String customer3 = "Jimmy";

        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;

        boolean isReady = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + readyMessage + displayTotalMessage + cappucino);

        
        if(isReadyOrder1) {
            System.out.println(customer4 + pendingMessage);
        }
        else{
            System.out.println(customer4 + readyMessage + displayTotalMessage + cappucino);
        }

        System.out.println(customer2 + displayTotalMessage + latte*2);
        if(isReady){
            System.out.println(customer2 + readyMessage);
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (latte - dripCoffee));

    }
}
