import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Adress> ml = new LinkedList<>();
        ml.add(new Adress("J.M.West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Adress("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));

        for(Adress x : ml){
            System.out.println(x + "\n");
        }
    }
}

class Adress{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Adress(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}
