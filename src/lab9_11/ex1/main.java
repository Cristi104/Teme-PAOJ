package lab9_11.ex1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog(new ComparatorMedii());

        try{
            catalog.add(new Student("Ana", 9.45f));
            catalog.add(new Student("Mihai", 8.45f));
            catalog.add(new Student("Bogdan", 8.0f));
            catalog.add(new Student("Cristi", 7.4f));
            catalog.add(new Student("Andrei", 9.51f));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for (Map.Entry<Integer, List<Student>> entry : catalog.entrySet()) {
            List<Student> lista = entry.getValue();
            lista.sort(Comparator.comparing(Student::getNume));
            System.out.println(entry.getKey() + " " + lista);
        }
    }
}
