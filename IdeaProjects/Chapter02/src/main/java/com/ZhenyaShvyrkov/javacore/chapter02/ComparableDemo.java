import java.util.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Set<Person> set = new TreeSet<>();
        addElements(list);
        addElements(set);

        list.remove(1);
        list.remove(0);
        Collections.rotate(list, 2);
        System.out.println(list);
        System.out.println(set);

    }
    public static void addElements(Collection collection){
        collection.add(new Person(12, "Bill"));
        collection.add(new Person(3, "Arnold"));
        collection.add(new Person(2, "Trinity"));
        collection.add(new Person(1, "John"));
        collection.add(new Person(1, "John"));
        collection.add(new Person(1, "John"));
        collection.add(new Person(1, "John"));
        collection.add(new Person(1, "John"));

    }
}

class Person implements Comparable<Person>{
    private int id;
    private String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getId() > o.getId()){
            return 1;
        } else if (this.getId() < o.getId()) {
            return -1;
        } else {
            return 0;
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}