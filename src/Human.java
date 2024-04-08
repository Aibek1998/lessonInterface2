public class Human {
    String name;
    int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n" +
                "name : " + name + "\n" +
                "age : " + age;
    }
}
