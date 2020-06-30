import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Исходное содержимое списочного массива list: " );
        for (int x : list){
            System.out.print(x + " ");
        }
        System.out.println(" ");
        System.out.print("Сумма всех элементов списочного массива: ");
        int sum = 0;
        for (int x : list){
            sum += x;
        }
        System.out.println(sum);
    }
}

