public class Friend {
    String name;
    int age;
    char floor;     // пол 'F'  or  'M'

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, char floor) {
        this.name = name;
        this.age = age;
        this.floor = floor;
    }
}
