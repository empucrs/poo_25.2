public class Teste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(10,10,10);
        System.out.println(c1.area());

        Circulo c2 = new Circulo(1,1,1);
        System.out.println(c2.area());

        try {
            Circulo c3 = new Circulo(0, 0, 0);
            System.out.println(c3);
//        } catch (IllegalArgumentException e) {
        } 
        catch (NullPointerException e) {
            System.out.println("NullPointerException:"+e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception Geral: "+e.getMessage());
        }
        finally{
            System.out.println("E rodou o finally");
        }
        System.out.println("Será que continuará funcionando?");

        try {
            c1.copia(null);
            System.out.println(c1.getRaio());
        } catch (IllegalArgumentException e) {
//        } catch (CirculoInvalidoException e) {
    System.out.println(e.getMessage());
        }
    }
}
