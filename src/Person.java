public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + (gender ? "Male" : "Female") + ".";
    }
}
