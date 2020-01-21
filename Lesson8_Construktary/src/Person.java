public class Person {

    //класс состоит из полей и методов
    //т е описание его и что он делает

    String name;
    int age;
    char gender;
    String role;    // ADMIN or USER

    public Person(int age, char gender, String name) {       //дублирует название класса
        if (age < 14 || age > 121) {
            System.out.println("Человек, веди нормальный возраст!");
            throw new IllegalArgumentException();
        } else if (gender != 'M' && gender != 'F') {
            System.out.println("Человек, введи нормальный ПОЛ!");
            throw new IllegalArgumentException();
        } else if (name == null || name.length() == 0) {
            System.out.println("елвоек, укажи имя!");
            throw new IllegalArgumentException();
        }

        this.role = "USER";
        this.age = age;
        this.gender = gender;
        this.name = name;

    }

    public Person(int age, String name) {
        System.out.println("Я был вызван!");
        this.age = age;
        this.name = name;
    }

    public Person() {

    }


}
