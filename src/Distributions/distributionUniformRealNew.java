package distributionuniform2;




public class distributionUniformRealNew {
    // atributos
    private int tam;
    private double array[];
    private int total;

    /**
     * Descripcion:  Genera y retorna un arreglo de elementos tipo double a partir de
     * un objeto UniformRealDistribution
     * @param _tam 
     */
    public distributionUniformRealNew(int _tam, int _total) {
        this.tam   = _tam;
        this.array = new double[this.tam];
        this.total = _total;
    }
    
    /**
     * Descripcion:  Genera y retorna un arreglo de elementos tipo double a partir de
     * un objeto UniformRealDistribution
     * @return this.array
     */
    /*public double[] uniformDistribution(){
        /*UniformRealDistribution u = new UniformRealDistribution(0,1);
        
        for(int i=0; i < this.tam; i++)
        {
            this.array[i] = u.sample();
        }
        
        UniformRealDistribution u = new UniformRealDistribution(0,1.44);

        double val = u.sample();
        for(int i=0; i < this.tam; i++)
        {
            this.array[i] = val;
        }

        return this.array;
    }*/
    
    public double[] uniformDistributionMe(){
    
        int lim = this.tam;
        double u = this.total/lim;
        double t = 0.0;
        for(int i =0; i< lim; i++){
            this.array[i] = u;
            t += u;
        }
        
        //System.out.println("total Uniform = "+ t);
        return this.array;
    }

    public int getTam() {
        return tam;
    }

    public double[] getArray() {
        return array;
    }

    public int getTotal() {
        return total;
    }
            
}
