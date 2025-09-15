public class TemperatureException extends Exception{

    public TemperatureException() {
        super();
    }
    public TemperatureException(String msg) {
        super(msg);
    }
    
    public TemperatureException(Throwable trw) {
        super(trw);
    }
    
    public TemperatureException(String msg, Throwable trw) {
        super(msg, trw);
    }
    
}