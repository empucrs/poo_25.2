public class FahrenheitException extends TemperatureException{

    public FahrenheitException() {
        super();
    }
    public FahrenheitException(String msg) {
        super(msg);
    }
    
    public FahrenheitException(Throwable trw) {
        super(trw);
    }
    
    public FahrenheitException(String msg, Throwable trw) {
        super(msg, trw);
    }
    
}