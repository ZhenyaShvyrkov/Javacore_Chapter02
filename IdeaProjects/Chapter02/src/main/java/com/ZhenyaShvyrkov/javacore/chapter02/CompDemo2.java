import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((a,b) -> b.compareTo(a));
        ts.add("A");
        ts.add("C");
        ts.add("D");
        ts.add("E");
        ts.add("V");

        for (String x : ts){
            System.out.print(x + " ");
        }
    }
}
