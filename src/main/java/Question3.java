import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by renajing on 6/26/18.
 */
public class Question3 {

    //Generate 500 random numbers and print the nth smallest number in a programming language of your choice.
    public static int nthSmallest(int n){
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < 500; i++){
            int random = (int) (Math.random() * 100);
            System.out.println(random);
            set.add(random);
        }
        System.out.println("getting" + n);
        Iterator<Integer> itr = set.iterator();
        int i = 1;
        while(i < n){
            itr.next();
            i++;
        }
        return itr.next();
    }

    public static void main(String [] args){
        System.out.println(nthSmallest(2));
    }
}
