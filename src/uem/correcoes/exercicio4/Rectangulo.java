
package uem.correcoes.exercicio4;

/**
 * @author João Matambo
 * @author José Seie
 * @author Alfredo Sebastião
 * 
 */
public class Rectangulo extends Figura{
   
    private double ladoMaior;

    public Rectangulo(double ladoMaior, double ladoMenor, String cor, boolean filled) {
        super(ladoMenor, cor, filled);
        this.ladoMaior = ladoMaior;
    }

    @Override
    public double area() {
        return super.getLado() * this.ladoMaior; //consideraos o lado da classe super como o lado menor, visto que o menor encontra-se nesta classe.
    }

    @Override
    public double perimetro() {
        return 2 * (super.getLado() + this.ladoMaior); //Consideramos o lado da classe super como o lado menor.
    }

    public double getLadoMaior() {
        return ladoMaior;
    }

    public void setLadoMaior(double ladoMaior) {
        this.ladoMaior = ladoMaior;
    }
     
    
    
}
