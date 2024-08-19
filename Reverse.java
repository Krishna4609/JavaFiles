
import java.util.*;

public class Reverse {
    public static void main(String[] args) {

        String myString = "Hello World!";
        List<Character> result = new ArrayList<>();

        result = breaker(myString);

        Iterator<Character> itr = result.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next()+",");
        }

        System.out.println("\n------------------------------------------------------------------");

        StringBuilder reverse = new StringBuilder();
        reverse = reverser(result);

        System.err.println(reverse);
    }

    public static <T> List<Character> breaker(String str1){
        List<Character> temp = new ArrayList<Character>();

        for(int i=0;i<str1.length();i++){
            temp.add(str1.charAt(i));
        }
        return temp;
    }

    public static <T> StringBuilder reverser(List<Character> arrayChar){
        StringBuilder reversed = new StringBuilder();

        for(int i=arrayChar.size()-1;i>=0;i--){
            reversed.append(arrayChar.get(i));
        }
        return reversed; 
    }
}
