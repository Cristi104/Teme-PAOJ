package lab7.ex1;
import lab7.ex1.exceptii.DevideByZeroException;
import lab7.ex1.exceptii.NullParameterException;
import lab7.ex1.exceptii.OverflowException;
import lab7.ex1.exceptii.UnderflowException;

public interface Calculator {
    double add(Double a, Double b) throws NullParameterException, OverflowException, UnderflowException;
    double divide(Double a, Double b) throws NullParameterException, DevideByZeroException;
    double average(Double [] numbers) throws NullParameterException, OverflowException, UnderflowException;
}
