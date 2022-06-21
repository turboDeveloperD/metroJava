/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocsv;

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
        double[] 
                 arrayExample = {5.0,6.1,7.2,8.3,9.4,10.5,11.6,12.7,13.8,14.9,
                         15.11, 16.12, 17.13, 18.14, 19.15, 20.16, 21.17,
                         22.18, 23.19};
        //System.out.println("array="+ Arrays.toString(arrayExample));
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(this.file) );
            int i =0;
            while( (line = br.readLine() ) != null )
            {
                if(i != 0 ){
                    String[] data = line.split(this.delimit);
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
                    Partition par = new Partition(i, Double.parseDouble(data[9]), arrayExample );
                    par.generateData();
                    arrayData.add(item);
                    //arrayPartition.add(par);
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
        
        System.out.println("Tamanio de arrayData: " + arrayData.size());
    }
    
    public double[] generateDistributionNormal(){
        distributionNormal d = new distributionNormal(19);
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
    
    public void optionRandom(){
        Random r = new Random();
        int option = r.nextInt(3) + 1;
        
        switch(option){
            case 1:
                System.out.println("Caso 1");
                
            break;
            
            case 2:
                System.out.println("Caso 1");
            break;
            
            case 3:
                System.out.println("Caso 1");
            break;
        }
    }
}
