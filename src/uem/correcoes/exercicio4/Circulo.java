
package uem.correcoes.exercicio4;

/**
 * @author João Matambo
 * @author José Seie
 * @author Alfredo Sebastião
 * 
 */
public class Circulo extends Figura{
    
    private double raio;

    public Circulo(double raio, String cor, boolean filled) {
        super(cor, filled);
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.raio, 2);  //Aplicando a formula PI*R2
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * this.raio;  //Aplicando a formula 2 * PI * r
    }
    
    
    
}
