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
    private double array[];
    private int tam;

    public JFreeXY(String title, double[] a, int t) {
        super(title);
        
        final XYSeries s = new XYSeries("Data");
        
        for(int i=0; i < t; i++){
            s.add(i,a[i]);
        }
        
        final XYSeriesCollection data = new XYSeriesCollection(s);
        final JFreeChart chart = ChartFactory.createXYLineChart("XY Data", "X", "Y", data,
                PlotOrientation.VERTICAL, true, true, false);

        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }
    
    
    
}
