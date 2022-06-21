package metrocsv;
import org.apache.commons.math3.distribution.UniformRealDistribution;
public class distributionUniformReal {
    // atributos
    private int tam;
    private double array[];

    distributionUniformReal(int _tam) {
        this.tam = _tam;
        this.array = new double[tam];
    }
    
    public double[] uniformDistribution(){
        UniformRealDistribution u = new UniformRealDistribution(0,1);
        
        for(int i=0; i < this.tam; i++)
        {
            this.array[i] = u.sample();
        }

        return this.array;
    }
    
            
}
