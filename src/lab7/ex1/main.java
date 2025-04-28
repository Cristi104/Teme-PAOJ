package lab7.ex1;

public class main {
    public static void main(String[] args) {
        CalculatorDouble calculator = new CalculatorDouble();

        try{
            System.out.println(calculator.add(null, 0.5));
        }catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            System.out.println(calculator.add(0.5, 0.5));
        }catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            System.out.println(calculator.add(Double.MAX_VALUE, Double.MAX_VALUE));
        }catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            System.out.println(calculator.divide(null, 0.5));
        }catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            System.out.println(calculator.divide(1.0, 0.0));
        }catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            System.out.println(calculator.average(null));
        }catch (Exception e){
            System.out.println(e.toString());
        }

        try{
            Double [] numere = calculator.readNumbersFromFile("src/lab7/ex1/input.txt");
            System.out.println(calculator.average(numere));
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
