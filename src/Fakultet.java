public class Fakultet {
    public static void main(String[] args) {
        Student ali = new Student("Ali", "Abd Elhameed", "musko", 23, 2);
        Student valentino = new Student("Valentino", "Majrusic", "musko", 24, 3);

        Profesor franjo = new Profesor("Franjo", "Sumanovac", "musko", 100, "geofizicka istrazivanja");
        Profesor sibila = new Profesor("Sibila", "Borojevic Sostaric", "zensko", 40, "opticka mineralogija");

        System.out.println(ali.predstavljanje());
        ali.dohvatiOpisUloge();
        System.out.println(valentino.predstavljanje());
        valentino.dohvatiOpisUloge();
        System.out.println(franjo.predstavljanje());
        franjo.dohvatiOpisUloge();
        System.out.println(sibila.predstavljanje());
        sibila.dohvatiOpisUloge();
    }
}