package graficas;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class JFreeXY extends ApplicationFrame {
    
    // Atributtes
    private double array[];
    private int tam;

    /**
     * Descripcion: Constructor recibe una cadena con el nombre de la estacion, un arreglo de
     * con los 
     * @param title
     * @param a
     * @param t
     */
    public JFreeXY(String title, double[] a, int t) {
        super(title);
        // opcional.
        this.array = a;
        this.tam = t;
        final XYSeries s = new XYSeries("Data");
        
        /*for(int i=0; i < t; i++){
            s.add(i,a[i]);
        }*/
        
        for(int i=0; i < this.tam; i++){
            s.add(i+5,this.array[i]);
        }
        final XYSeriesCollection data = new XYSeriesCollection(s);
        final JFreeChart chart = ChartFactory.createXYLineChart(title, "Horas", "# usuarios", data,
                PlotOrientation.VERTICAL, true, true, false);

        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 1200));
        setContentPane(chartPanel);
    }
    
    
    
}
