
package uem.correcoes.exercicio4;

/**
 * @author João Matambo
 * @author José Seie
 * @author Alfredo Sebastião
 * 
 */
public class Quadrado extends Figura{

    public Quadrado(double lado, String cor, boolean filled) {
        super(lado, cor, filled);
    }

    @Override
    public double area() {
        return Math.pow( super.getLado(), 2);
    }

    @Override
    public double perimetro() {
        return super.getLado() * 4;
    }
       
    
}
