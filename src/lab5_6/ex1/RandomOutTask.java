package lab5_6.ex1;
import java.util.Random;

public class RandomOutTask implements Task{
    private int number;

    public RandomOutTask() {
        Random random = new Random();
        this.number = random.nextInt(100000);
    }

    @Override
    public void task() {
        System.out.println("numar: " + number);
    }
}
