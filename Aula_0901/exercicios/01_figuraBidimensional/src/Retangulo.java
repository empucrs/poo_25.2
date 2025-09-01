public class Retangulo extends FiguraBidimensional{

    private int base, altura;

    public Retangulo(int x, int y, int base, int altura) {
        // x e y são o ponto inferior esquerdo do meu quadrado
        super(x,y);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double area() {        
        return base*altura;
    }

    //Ponto inferior esquerdo
    public int getXInferiorEsquerdo(){
        return getX();
    }
    public int getYInferiorEsquerdo(){
        return getY();
    }

    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }

    //Ponto inferior direito
    public int getXInferiorDireito(){
        return getX()+getBase();
    }
    public int getYInferiorDireito(){
        return getY();
    }

    //Ponto superior esquerdo
    public int getXSuperiorEsquerdo(){
        return getX();        
    }
    public int getYSuperiorEsquerdo(){
        return getY()+getAltura();
    }

    //Ponto superior direito
    public int getXSuperiorDireito(){
        return getXInferiorDireito();
    }
    public int getYSuperiorDireito(){
        return getYSuperiorEsquerdo();
    }
}
