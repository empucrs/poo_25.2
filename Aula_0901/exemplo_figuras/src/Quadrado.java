public class Quadrado extends FiguraBidimensional{

    private int lado;

    public Quadrado(int x, int y, int lado) {
        // x e y são o ponto inferior esquerdo do meu quadrado
        super(x,y);
        this.lado=lado;
    }

    @Override
    public double area() {        
        return lado*lado;
    }

    //Ponto inferior esquerdo
    public int getXInferiorEsquerdo(){
        return getX();
    }
    public int getYInferiorEsquerdo(){
        return getY();
    }

    //Ponto inferior direito
    public int getXInferiorDireito(){
        return getX()+lado;
    }
    public int getYInferiorDireito(){
        return getY();
    }

    //Ponto superior esquerdo
    public int getXSuperiorEsquerdo(){
        return getX();        
    }
    public int getYSuperiorEsquerdo(){
        return getY()+lado;
    }

    //Ponto superior direito
    public int getXSuperiorDireito(){
        return getXInferiorDireito();
    }
    public int getYSuperiorDireito(){
        return getYSuperiorEsquerdo();
    }
}
