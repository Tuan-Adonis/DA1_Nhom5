/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilies;

import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart_AWT extends JFrame{
    
    public LineChart_AWT(String applicationTitle, String chartTitle, List<BigDecimal> tong, List<String> date, String title) {
        super(applicationTitle);
        JFreeChart lineChart = ChartFactory.createLineChart(
                chartTitle,
                title, "Tổng tiền bán sản phẩm",
                createDataset(tong, date),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(900, 400));
        chartPanel.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSED));
        setContentPane(chartPanel);
    }

    private DefaultCategoryDataset createDataset(List<BigDecimal> tong, List<String> date) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = date.size()-1; i >= 0; i--) {
            BigDecimal t = tong.get(i);
            dataset.addValue(Integer.parseInt(t.toString()), "Giá trị triệu vnd", date.get(i));
        }
        return dataset;
    }
}
