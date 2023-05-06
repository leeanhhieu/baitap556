package demo5;
public class Main {
    public static void main(String[] args) {
        // Tạo danh sách các Person
        ArrayList<Person> personList = new ArrayList<>();
        Person person1 = new Person("John", 25, "123456789", "123 Main St");
        Person person2 = new Person("Mary", 30, "987654321", "456 Oak St");
        Person person3 = new Person("David", 20, "456789123", "789 Pine St");
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        // Tạo phòng và thêm các Person vào phòng
        Room room = new Room("Phòng A", "Tầng 2, Tòa nhà X", personList);
        room.printRoomInfo();

        // Thêm một Person vào phòng
        Person person4 = new Person("Alice", 22, "555555555", "321 Maple St");
        room.addPerson(person4);
        room.printRoomInfo();

        // Xoá một Person khỏi phòng
        room.removePerson(person2);
        room.printRoomInfo();

        // Sắp xếp danh sách Person theo tên (alphabet)
        room.sortPersonByName();
        room.printRoomInfo();
    }
}
