package lab5_6.ex1;

public class main {
    public static void main(String[] args) {
        OutTask t1 = new OutTask("mesaj");
        RandomOutTask t2 = new RandomOutTask();
        CounterOutTask t3 = new CounterOutTask();

        t1.task();
        t2.task();
        t3.task();
        t3.task();
    }
}
