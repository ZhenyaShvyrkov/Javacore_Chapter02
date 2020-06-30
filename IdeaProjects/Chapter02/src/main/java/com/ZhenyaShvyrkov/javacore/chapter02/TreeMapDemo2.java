import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());
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
class TComp implements Comparator<String>{
    int i,j,k;
    @Override
    public int compare(String a, String b) {
        i = a.lastIndexOf(' ');
        j = b.lastIndexOf(' ');
        k = a.substring(i).compareTo(b.substring(j));
        if(k == 0) {
            return a.compareTo(b);
        } else return k;
    }
}
