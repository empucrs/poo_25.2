public class Principal {

    public static void main(String[] args) {
        Passagem p = new Passagem("908.780.350-87", "Edson Moreno", 1500.76);

        System.out.println(p);
        int bagagens [] = {30, 32, 12};

        p.custoBagagem(bagagens.length, bagagens);
        System.out.println(p);

        p.defineAssento("15F");
        System.out.println(p);

        p.defineAssento(null);
        System.out.println(p);

        Economy e = new Economy();
        System.out.println(e);

        e = new Economy("000.000.000-01", "Adroaldo Pereira", 1234.56);
        System.out.println(e);

        e.custoBagagem(bagagens.length, bagagens);
        System.out.println(e);
        System.out.println(p);

        Executive x = new Executive("111.111.111-12", "Ariovaldo Ernestino", 2133.54);
        x.custoBagagem(bagagens.length, bagagens);
        System.out.println(x);

        Premier r = new Premier("222.222.222-23", "Arlindo Botucatuva", 3127.32);
        r.custoBagagem(bagagens.length, bagagens);
        r.defineAssento("15A");
        System.out.println(r);
        
    }
    
}
