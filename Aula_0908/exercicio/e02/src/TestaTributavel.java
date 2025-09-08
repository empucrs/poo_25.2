public class TestaTributavel {

    public static void main(String[] args) {

        Conta c = new Conta();
        c.depositar(10);        
        System.out.println(c);
        if(c instanceof Tributavel)
            System.out.println("  Valor tributável: R$"+((Tributavel) c).calculaTributos());

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(20);
        System.out.println(cp);
        if(cp instanceof Tributavel)
            System.out.println("  Valor tributável: R$"+((Tributavel) cp).calculaTributos());

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(30);
        System.out.println(cc);
        if(cc instanceof Tributavel)
            System.out.println("  Valor tributável: R$"+((Tributavel) cc).calculaTributos());

        SeguroDeVida sv = new SeguroDeVida(40);
        System.out.println(sv);
        if(sv instanceof Tributavel)
            System.out.println("  Valor tributável: R$"+((Tributavel) sv).calculaTributos());        
    }
    
}
