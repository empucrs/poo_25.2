public abstract class FiguraBidimensional {
    private int centrox;
    private int centroy;

    public FiguraBidimensional(int centrox, int centroy) {
        this.centrox = centrox;
        this.centroy = centroy;
    }

    public int getX() {
        return centrox;
    }

    public int getY() {
        return centroy;
    }

    public abstract double area();

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  Objeto =>"+this.getClass().getName()+"\n");
        sb.append("  Área = "+this.area()+"\n");
        sb.append("}\n");
        return sb.toString();
    }
}
