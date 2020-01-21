public class Runner {
    public static void main(String[] args) {

        Person p = new Person(25, 'M', "Alex");
        Person p2 = new Person(25, "Bob");
        Person p3 = new Person();

        Card user1 = new Card("BelarusBank", "1234567891234567", 457,
                "Marharyta Lapinskaya", 123, "Visa");
        Card user2 = new Card("12345678912345", 45897, 13);

        Card user3 = new Card("12345678912345676565656", 457,
                "Marharyta Lapinskaya", 16263, "Visa");

        Computer comp1 = new Computer("HP", "Black", "White", 2019,
                "Linux", "Core i7", 4, 299,
                88, 271.3, "WiFi", 1000);
        Computer comp2 = new Computer("Asus", "White", "Core i7", 4, 250,
                70, 265.0, "WiFi", 1000);
        Computer comp3 = new Computer("HP", 4, "WiFi", 2017, "Linux",
                "Core i5", 1000);
        Computer comp4 = new Computer();

        Friend friend1 = new Friend("Katya");
        Friend friend2 = new Friend("Vasya", 25);
        Friend friend3 = new Friend("Masha", 26, 'M');

        Cat cat1 = new Cat("Musya");
        Cat cat2 = new Cat("Pusya", 10, 5);
        Cat cat3 = new Cat("Busya", 7);
        Cat cat4 = new Cat(5, "Grey");
        Cat cat5 = new Cat(4, "Black", "Lisovskaya-8");

        Dog dog1 = new Dog("Boobs");
        Dog dog2 = new Dog("Groom", 25);
        Dog dog3 = new Dog("Kost", 30, "Black");

        Circle circle1 = new Circle(11.4, 21.0, 7);
        Circle circle2 = new Circle(16.8, 14.4, 6, 9);
        Circle circle3 = new Circle(19.6, 21, 11, 11, "Black");

        Rectangle rectangle1 = new Rectangle(15, 10, 13, 7);
        Rectangle rectangle2 = new Rectangle(19, 11);
        Rectangle rectangle3 = new Rectangle(15, 10, 13);

    }
}
