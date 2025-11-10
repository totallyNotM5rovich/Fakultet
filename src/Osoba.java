public abstract class Osoba {
    private String firstName;
    private String lastName;
    private int age;
    private String sex;

    public Osoba(String firstName, String lastName, String sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String predstavljanje() {
        return firstName + " " + lastName + ", " + age + " god., " + sex;
    }

    public abstract void dohvatiOpisUloge();

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
