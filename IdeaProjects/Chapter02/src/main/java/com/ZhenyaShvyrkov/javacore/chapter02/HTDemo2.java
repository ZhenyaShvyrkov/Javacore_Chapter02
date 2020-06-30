import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        String str;
        double bal;

        balance.put("Джон Доу", new Double(3434.34));
        balance.put("Том Смит", new Double(123.22));
        balance.put("Джейн Бейкер", new Double(1378));
        balance.put("Тод Холл", new Double(99.22));
        balance.put("Ральф Смит", new Double(-19.08));
        Set<String> set = balance.keySet();

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            str = iterator.next();
            bal = balance.get(str);
            System.out.println(str + ": " + bal);
        }
        System.out.println();

        bal = balance.get("Джон Доу");
        balance.put("Джон Доу", bal + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + balance.get("Джон Доу"));

    }
}
