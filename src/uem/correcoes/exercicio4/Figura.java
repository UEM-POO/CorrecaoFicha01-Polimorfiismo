
package uem.correcoes.exercicio4;

/**
 * @author João Matambo
 * @author José Seie
 * @author Alfredo Sebastião
 * 
 */
public class Figura {
    
    private double lado;
    private String cor = "branca";
    private boolean filled = false;

    public Figura() {
    }
    
    public Figura(String cor, boolean filled) {
        this.lado = lado;
        this.cor = cor;
        this.filled = filled;
    }

    public Figura(double lado, String cor, boolean filled) {
        this.lado = lado;
        this.cor = cor;
        this.filled = filled;
    }
    
    public double area(){        
        return 0;
    }
    
    public double perimetro(){        
        return 0;
    }    

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    
    
}
