public class Principal {
    public static void main(String[] args) {
        SuperClasse sp = new SuperClasse();
        System.out.println(sp);

        SubClasse sb = new SubClasse();
        System.out.println(sb);

        sp = new OutraSubClasse();

        System.out.println(sp);
        System.out.println((SuperClasse) sp);
        if(sp instanceof SubClasse)
            System.out.println((SubClasse) sp);
        if(sp instanceof OutraSubClasse)
            System.out.println((OutraSubClasse) sp);

        if(sp instanceof SuperClasse)
            sp.geral();
        if(sp instanceof SubClasse)
            ((SubClasse) sp).soMeu();
        if(sp instanceof OutraSubClasse)
            ((OutraSubClasse) sp).outroMetodo();
    }
}
