package lab5_6.ex1;

public class OutTask implements Task {
    private String mesaj;

    public OutTask(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void task(){
        System.out.println("Mesaj: " + this.mesaj);
    }
}
