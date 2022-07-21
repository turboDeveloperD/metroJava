
package graficas;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class JFreeArrays extends ApplicationFrame {
    private double a1[];
    private String t1;
    private double a2[];
    private String t2;
    private double a3[];
    private String t3;
    private int tam;

    public JFreeArrays(String title, double []_a1, String _t1, double []_a2, String _t2, double []_a3, String _t3, int _t) {
        super(title);
        
        // Set attributs
        this.a1 = _a1;
        this.a2 = _a2;
        this.a3 = _a3;
        this.t1 = _t1;
        this.t2 = _t2;
        this.t3 = _t3;
        this.tam = _t;
        
        final XYSeries s1 = new XYSeries(this.t1);
        final XYSeries s2 = new XYSeries(this.t2);
        final XYSeries s3 = new XYSeries(this.t3);
        
        for(int i =0; i < this.tam; i++){
            s1.add(i+5, a1[i]);
            s2.add(i+5, a2[i]);
            s3.add(i+5, a3[i]);
        }
        
        XYSeriesCollection data = new XYSeriesCollection();
        data.addSeries(s1);
        data.addSeries(s2);
        data.addSeries(s3);
        
        final JFreeChart chart = ChartFactory.createXYLineChart(title, "# Horas", "# Usuarios", data,
                PlotOrientation.VERTICAL, true, true, false);
        
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 400));
        setContentPane(chartPanel);
    }
    
        
        
}
