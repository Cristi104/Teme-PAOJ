package lab7.ex1;

import lab7.ex1.exceptii.DevideByZeroException;
import lab7.ex1.exceptii.NullParameterException;
import lab7.ex1.exceptii.OverflowException;
import lab7.ex1.exceptii.UnderflowException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculatorDouble implements Calculator{
    @Override
    public double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException {
        if (a == null || b == null) {
            throw new NullParameterException("Parametrii nu pot fi null");
        }
        double result = a + b;
        if (result == Double.POSITIVE_INFINITY) {
            throw new OverflowException("Overflow");
        }
        if (result == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException("Underflow");
        }
        return result;
    }

    @Override
    public double divide(Double a, Double b) throws NullParameterException, DevideByZeroException {
        if (a == null || b == null) {
            throw new NullParameterException("Parametrii nu pot fi null");
        }
        if (b == 0) {
            throw new DevideByZeroException("Impartire la zero!");
        }
        return a / b;
    }

    @Override
    public double average(Double[] numbers) throws NullParameterException, OverflowException, UnderflowException {
        if (numbers == null) {
            throw new NullParameterException("Vectorul nu poate fi null!");
        }
        double sum = 0.0;
        for (double number : numbers) {
            sum = add(sum, number);
        }
        return divide(sum, (double) numbers.length);
    }

    public Double [] readNumbersFromFile(String filename) throws IOException {
        List<Double> numbers = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            numbers.add(Double.parseDouble(line.trim()));
        }
        return numbers.toArray(new Double[0]);
    }
}
