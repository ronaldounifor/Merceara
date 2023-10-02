package adapter;

public abstract class Forma {
    private int numeroLados;
    private double area;

    public abstract void calcularArea();

    public int getNumeroLados() {
        return numeroLados;
    }
    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
}
