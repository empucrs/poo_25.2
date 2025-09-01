public class Principal {
    public static void main(String[] args) {

        //FiguraBidimensional fb = new FiguraBidimensional();
        Circulo c = new Circulo(1, 1, 1);
        System.out.println(c);

        Retangulo r = new Retangulo(1, 1, 1, 1);
        System.out.println(r);

        Quadrado q = new Quadrado(1, 1, 1);
        System.out.println(q);

        FiguraBidimensional fb = c;
        System.out.println(fb);

        fb=r;
        System.out.println(fb);
        
        fb=q;
        System.out.println(fb);
        
    }
    
}
