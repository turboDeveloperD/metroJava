/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocsv;


import Partitions.DataCSV;
import Partitions.Partition;
import Distributions.GFG;
import Distributions.distributionPoisson;
import Distributions.distributionUniformReal;
import Distributions.distributionNormal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author VILAN
 */
public class fileCSV {
    private String file;
    private String delimit;
    List<DataCSV> arrayData = new LinkedList<DataCSV>(); // arreglo que guarda todos los datos 
    List<Partition> arrayPartition = new LinkedList<Partition>(); // arreglo  
    //private DataCSV;
    
    public fileCSV(String file, String delimit) {
        this.file = file;
        this.delimit = delimit;
    }
    
    public void readFile(){
        String line;
        double arrayExample[] = {};
                 /*arrayExample = {5.0,6.1,7.2,8.3,9.4,10.5,11.6,12.7,13.8,14.9,
                         15.11, 16.12, 17.13, 18.14, 19.15, 20.16, 21.17,
                         22.18, 23.19};*/
        //System.out.println("array="+ Arrays.toString(arrayExample));
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(this.file) );
            int i =0;
            while( (line = br.readLine() ) != null )
            {
                if(i != 0 ){
                    
                    String[] data = line.split(this.delimit);
                    double afluenciaTotal = Double.parseDouble(data[9]);
                    DataCSV item = new DataCSV(
                                               i,  // Id del registro
                                               data[0], // fecha
                                               Integer.parseInt(data[1]), // dia
                                               data[2], // mes
                                               Integer.parseInt(data[3]), // año
                                               data[4], // nombre de la linea
                                               data[5], // estación
                                               Integer.parseInt(data[6]), // afluencia boleto
                                               Integer.parseInt(data[7]), // afluencia prepago
                                               Integer.parseInt(data[8]), // afluencia gratitud
                                               Integer.parseInt(data[9])); // afluencia total
                    arrayExample = optionRandom(afluenciaTotal);
                    Partition par = new Partition(i, data[5], Integer.parseInt(data[9]), arrayExample );
                    par.generateData();
                    arrayData.add(item);
                    //System.out.println("Generar arreglo");
                    
                    arrayPartition.add(par);
                    //System.out.println(par.toString());
                    
                    //System.out.println(par.toString());
                    //System.out.println("Emp[First Name=" + employee[1] + ", Last Name=" + employee[2] + ", Contact=" + employee[3] + ", City= " + employee[4] + "]");
                    /*System.out.println("i="+ i +" data [fecha=" + data[0] + ", dia=" + data[1] + ",mes =" + data[2] 
                                        + ", anio= " + data[3] + ", linea =" + data[4] +", estacion =" + data[5] 
                                        + ", afluencia_boleto =" + data[6] + ", afluencia_prepago =" + data[7] + ", afluencia_gratuidad =" 
                                        + data[8] + ", afluencia_total =" + data[9] + "]");*/
                    //System.out.println(item.toString());
                }
                i++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        //System.out.println("Tamanio de arrayPartition: " + arrayPartition.size());
        //System.out.println("Tamanio de arrayData: " + arrayData.size());
    }
    
    public double[] generateDistributionNormal(){
        distributionNormal d;
        d = new distributionNormal(19);
        return d.findCutPointGauss();
    }
    
    public double[] generateDistributionPoisson(){
        distributionPoisson p = new distributionPoisson(19);
        return p.poissonDis();
    }
    
    public double[] generateDistributionUniform(){
        distributionUniformReal u = new distributionUniformReal(19);
        return u.uniformDistribution();
    }
    
    public double[] generateDistributionBinomial(){
        int n = 10;
        double p = (double)1.0 / 3;
        double[] a= new double[19]; 
        GFG gfg = new GFG();
            for(int i = 0; i < 19; i++)
            {
                a[i] = gfg.binomialProbability(n,i,p);
            }
        return a;
    }
    
    public double[] optionRandom(double valor){
        Random r = new Random();
        int option = r.nextInt(3) + 1;
        double a[];
        if(option == 1){
            a = generateDistributionNormal();
            a = multiplicationArray(valor, a);
            return a;
        }else{
            if(option == 2)
            {
                // Funciona pero no es muy buena
                //a = generateDistributionPoisson();
                a = generateDistributionBinomial();
                a = multiplicationArray(valor, a);
                return a;
            }else{
                a = generateDistributionUniform();
                a = multiplicationArray(valor, a);
                return a;
            }
        }
    }
    
    public double[] multiplicationArray( double num, double a[] ){
        
        int tam = a.length;
        
            for(int i=0; i<tam; i++)
            {
                a[i] *= num;
            }
            
        return a;
    }
}
