import java.util.ArrayList;

public class Fakultet {
    public static void main(String[] args) {
        ArrayList<Osoba> osobe = new ArrayList<>();
        osobe.add(new Student("Ali", "Abd Elhameed", "musko", 23, 2));
        osobe.add(new Student("Valentino", "Majrusic", "musko", 24, 3));
        osobe.add(new Profesor("Franjo", "Sumanovac", "musko", 100, "geofizicka istrazivanja"));
        osobe.add(new Profesor("Sibila", "Borojevic Sostaric", "zensko", 40, "opticka mineralogija"));

        for (Osoba osoba : osobe) {
            System.out.println(osoba.predstavljanje());
            osoba.dohvatiOpisUloge();
        }
    }
}