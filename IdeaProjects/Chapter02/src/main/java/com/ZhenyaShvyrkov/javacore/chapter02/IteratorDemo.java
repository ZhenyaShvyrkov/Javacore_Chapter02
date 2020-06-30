import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("E");
        list.add("D");
        list.add("F");

        System.out.print("Исходное содержимое списочного массива list: ");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        ListIterator<String>  listIterator = list.listIterator();
        while(listIterator.hasNext()){
            listIterator.set(listIterator.next() + "+");
        }
        System.out.println("");
        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("");
        while(listIterator.hasPrevious()){
            String element = listIterator.previous();
            System.out.print(element + " ");
        }

    }
}
