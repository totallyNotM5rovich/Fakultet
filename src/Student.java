public class Student extends Osoba {
    private int godinaStudija;

    public Student(String firstName, String lastName, String sex, int age, int godinaStudija) {
        super(firstName, lastName, sex, age);
        this.godinaStudija = godinaStudija;
    }

    @Override
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam " + super.getFullName() + " student: " + godinaStudija + ". godine studija");
    }

    @Override
    public String predstavljanje() {
        return super.predstavljanje() + ", " + godinaStudija + ". godina studija";
    }
}
