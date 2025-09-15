public class Utils {

    public static final double ZEROABSOLUTO=-459.67;

    public static double toCelsius(double fahrenheitValue) throws FahrenheitException{

        double result;
        if(fahrenheitValue<ZEROABSOLUTO)
            throw new FahrenheitException("Temperatura inferior ao zero absoluto");

        result = (5*(fahrenheitValue-32))/9;
        return result;
        
    }

    public static double toFahrenheit(double celsiusValue) throws FahrenheitException{
        double result;

        result = ((9*celsiusValue)+(32*5))/5;

        if(result<ZEROABSOLUTO)
            throw new FahrenheitException("Temperatura inferior ao zero absoluto");

        return result;
    }
    
}
