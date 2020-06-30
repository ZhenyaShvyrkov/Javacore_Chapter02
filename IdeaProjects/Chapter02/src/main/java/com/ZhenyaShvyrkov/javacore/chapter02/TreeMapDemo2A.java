import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        Comparator<String> CompLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm = new TreeMap<>(CompLastThenFirst);
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> entry : set){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счету Джона Доу: " + tm.get("Джон Доу"));

    }
}
class CompLastNames implements Comparator<String>{
    int i, j, k;
    @Override
    public int compare(String a, String b) {
        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');
        return a.substring(i).compareTo(b.substring(j));
    }
}
class CompThenByFirstName implements Comparator<String>{
    int i, j;
    public int compare(String a, String b){
         return a.compareToIgnoreCase(b);
    }
}
