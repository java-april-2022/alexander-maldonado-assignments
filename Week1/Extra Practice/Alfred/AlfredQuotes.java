import java.text.Format;
import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String g1 =String.format("Hello, %s. Lovely to see you", name);
        return g1;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String voice) {
        if (voice.indexOf("Alexis")>0){
            return "Getting Low-fi beats from streaming service";
        }
        if (voice.indexOf("Alfred")>0){
            return "I'm terribly sorry sir, I must have replaced your yo-yo";
        }
        return "You do know?! I;m always hearing.";
    }
}

