public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String id;


    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {      //седний вес
        this.name = name;
        this.age = age;
    }

    public Cat(int weight, String color) {      //средний возраст
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String id) {    // средний возраст
        this.weight = weight;
        this.color = color;
        this.id = id;
    }
}


