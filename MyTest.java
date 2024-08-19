
import java.util.*;
import java.util.stream.*;

public class MyTest {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[20];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        int i = 0;
        while (i < 10) {
            intArr[i] = scan.nextInt();
            i++;
        }

        // Sort using TreeSet removing Duplicate elements
        Set<Integer> uniqueSet = new TreeSet<>();
        for(int j=0; j<10;j++){
            uniqueSet.add(intArr[j]);
        }
        
        //Iterator for iterating over set
        Iterator<Integer> setItr = uniqueSet.iterator();

        //print the numbers in sorted set
        while (setItr.hasNext()) {
            System.err.print("Number = "+setItr.next()+"\n");
        }

        List<Integer> greatArr = uniqueSet.stream()
            .filter(num -> num >= 10)
            .collect(Collectors.toList());
        

        System.out.println("---------------------------------- Filterd using StreamAPI and Lamda expression  ------------------------------");    
        Iterator<Integer> listItr = greatArr.iterator();

        while (listItr.hasNext()) {
            System.out.print("Number = "+listItr.next()+"\n");

        }       
        scan.close();
    }
}