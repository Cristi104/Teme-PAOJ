package lab9_11.ex1;

import java.util.*;

public class Catalog extends TreeMap<Integer, List<Student>> {
    public Catalog(Comparator<Integer> comparator){
        super(comparator);
    }

    private int getMedieRotunjita(float medie) {
        if (medie < 0 || medie > 10) return -1;
        return Math.round(medie);
    }

    public void add(Student student) throws Exception{
        int medieRotunjita = getMedieRotunjita(student.getMedie());

        if (medieRotunjita < 0 || medieRotunjita > 10) {
            throw new Exception("medie invalida");
        }

        super.computeIfAbsent(medieRotunjita, k -> new ArrayList<>());
        super.get(medieRotunjita).add(student);
    }
}
