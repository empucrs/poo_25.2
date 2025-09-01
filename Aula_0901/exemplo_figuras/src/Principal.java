public class Principal {
    public static void main(String[] args) {

        //FiguraBidimensional fb = new FiguraBidimensional();
        Circulo c = new Circulo(1, 1, 1);
        System.out.println(c);

        Quadrado q = new Quadrado(1, 1, 1);
        System.out.println(q);

        FiguraBidimensional fb = c;
        System.out.println(fb);

        fb=q;
        System.out.println(fb);
        
    }
    
}
