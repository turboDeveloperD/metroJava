/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocsv;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author VILAN
 */
public class MetroCSV {

    public static final String delimiter = ",";
    public static final String csv = "C:\\Users\\VILAN\\Documents\\Tesis\\Metro\\Nuevo con Adalberto y Gerardo\\Afluencia del metro\\afluenciastc_desglosado_02_2022.csv";
    
    public static void main(String[] args) {
        
        fileCSV archivo = new fileCSV(csv, delimiter);
        
        archivo.readFile();
        
        /*System.out.println("Distribution Normal");
        distributionNormal d = new distributionNormal(19);
        d.findCutPointGauss();
        d.imprimirArray();
        System.out.println();
        
        System.out.println("Distribution Poisson");
        distributionPoisson p = new distributionPoisson(19);
        double array[]=p.poissonDis();
        System.out.println("array = "+Arrays.toString(array));
        System.out.println();
        
        System.out.println("Distribution Uniform");
        distributionUniformReal u = new distributionUniformReal(19);
        double array2[] = u.uniformDistribution();
        System.out.println("array2 = "+ Arrays.toString(array2));*/
        
        /*for(int i =0; i < 10; i++){
            double arreglo[];
            
            arreglo = optionRandom();
            System.out.println("arreglo = "+ Arrays.toString(arreglo));
        }*/
    }
    
    public static double[] generateDistributionNormal(){
        distributionNormal d = new distributionNormal(19);
        return d.findCutPointGauss();
    }
    
    public static double[] generateDistributionPoisson(){
        distributionPoisson p = new distributionPoisson(19);
        return p.poissonDis();
    }
    
    public static double[] generateDistributionUniform(){
        distributionUniformReal u = new distributionUniformReal(19);
        return u.uniformDistribution();
    }
    
    public static double[] optionRandom(){
        Random r = new Random();
        int option = r.nextInt(3) + 1;
        double a[];
        if(option == 1){
            System.out.println("Normal");
            a = generateDistributionNormal();
            return a;
        }else{
            if(option == 2)
            {
                System.out.println("Poisson");
                a = generateDistributionPoisson();
                return a;
            }else{
                System.out.println("Uniform");
                a = generateDistributionUniform();
                return a;
            }
        }
    }
}
