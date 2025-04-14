package lab5_6.ex1;

public class CounterOutTask implements Task{
    private static int counter = 0;

    @Override
    public void task() {
        counter++;
        System.out.println("Counter: " + counter);
    }
}
