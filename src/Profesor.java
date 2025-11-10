public class Profesor extends Osoba {
    private String kolegij;

    public Profesor(String firstName, String lastName, String sex, int age, String kolegij) {
        super(firstName, lastName, sex, age);
        this.kolegij = kolegij;
    }

    @Override
    public String predstavljanje() {
        return super.predstavljanje() + ", predaje: " + kolegij;
    }

    @Override
    public void dohvatiOpisUloge() {
        System.out.println("Ja sam " + super.getFullName() + " profesor kolegija: " + kolegij);
    }
}
