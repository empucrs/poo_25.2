public class Quadrado extends Retangulo{

    public Quadrado(int x, int y, int lado) {
        // x e y são o ponto inferior esquerdo do meu quadrado
        super(x,y, lado, lado);
    }

    public int getLado(){
        return getAltura();
    }
}
