import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava {
    
    public static void main(String[] args) {
        System.out.println(getTenRolls());

        System.out.println("\nThis is your random letter from the alphabet:");
        System.out.println(getRandomLetter());

        System.out.println("\nThis is you random 8 characters for your password: ");
        System.out.println(generatePassword()); 

        System.out.println("\nYour new passwords has been generated:");
        System.out.println(getNewPasswordSet(3));
    }

    public static ArrayList getTenRolls() {
        ArrayList<Integer> num = new ArrayList<Integer>();
        Random randMachine = new Random();
        for(int i=0;i<10;i++){
            num.add(randMachine.nextInt(20));
        }
        System.out.println("These are your random 10 rolls:");
        return num;
    }

    public static Character getRandomLetter(){
        ArrayList<Character> letter = new ArrayList<Character>();
        Random a = new Random();
        for (char let = 'a'; let <= 'z'; let++){
            letter.add(let);
        }
        return letter.get(a.nextInt(26));
    }

    public static String generatePassword() {
        String password = "";
        for (int p =0;p<8;p++){
            password = password +getRandomLetter();
        }
        return password;
    }

    public static ArrayList getNewPasswordSet(int length){
        ArrayList<String> newPassword = new ArrayList<String>();
        for(int i = 0; i <length; i++){
            newPassword.add(generatePassword());
        }
        return newPassword;
    }
}
