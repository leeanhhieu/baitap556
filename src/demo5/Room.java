import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
package demo5;
public class Room {
    private String name;
    private String position;
    private List<Person> people;

    public Room(String name, String position) {
        this.name = name;
        this.position = position;
        this.people = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public void printInfo() {
        System.out.println("Tên phòng: " + name);
        System.out.println("Vị trí: " + position);
        System.out.println("Danh sách người:");
        for (Person person : people) {
            System.out.println("  " + person.getName() + " - " + person.getAge() + " tuổi - " + person.getTelephone() + " - " + person.getAddress());
        }
    }

    public void sortPeopleByName() {
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }
}

