package Models;

public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat= (Cat) obj;
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Cat| name: " + name + " age: " + age;
    }
}
