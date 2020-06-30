import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> ht = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;
        ht.put("Джон Доу", new Double(3434.34));
        ht.put("Том Смит", new Double(123.22));
        ht.put("Джейн Бейкер", new Double(1378));
        ht.put("Тод Холл", new Double(99.22));
        ht.put("Ральф Смит", new Double(-19.08));
        names = ht.keys();
        while(names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(str + ": " + ht.get(str));
        }
        System.out.println();

        bal = ht.get("Джон Доу");
        ht.put("Джон Доу", bal + 1000);
        System.out.println("Новый остаток на счету Джона Доу: " + ht.get("Джон Доу"));
    }
}
