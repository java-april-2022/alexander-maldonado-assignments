import java.util.HashMap;
import java.util.Set;
public class HashMapIceCream {
    public static void main(String[] args) {
        HashMap<String, String> iceCream = new HashMap<String, String>();
        iceCream.put("Alex", "Rocky Road");
        iceCream.put("Ellie", "Mango");
        iceCream.put("Herlan", "Chocolate Chip");
        iceCream.put("Chris", "Strawberry Cheesecake");
        iceCream.put("Sam", "Chunky Monkey");
        // get the keys by using the keySet method
        Set<String> keys = iceCream.keySet();
        for(String key : keys) {
            // System.out.println(key);
            System.out.printf("%s's favorite ice cream flavor is %s\n", key, iceCream.get(key));
        }
        int students = iceCream.size();
        System.out.printf("There are %s students who have a favorite Ice Cream in this zoom room", students);
    }
}