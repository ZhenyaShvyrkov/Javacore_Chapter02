import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("A");
        ts.add("B");
        ts.add("C");
        ts.add("D");
        ts.add("G");
        for(String x : ts){
            System.out.print(x + " ");
        }

    }
}
class MyComp implements Comparator<String>{
    @Override
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr);
    }
}
