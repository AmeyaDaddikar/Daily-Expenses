//package dailyExpenses;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.JFrame;

class JavaJFreeChartLineChartExample extends JFrame {

	public JavaJFreeChartLineChartExample(String title) {
		super(title);
		CategoryDataset dataset = createDataset();
		JFreeChart chart = createChart(dataset,title);
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new Dimension(500, 270));
		setContentPane(chartPanel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void getDataSet(ArrayList<String> date,ArrayList<Integer> amount)
	{
		//Get amount of money the user has when a transaction is made and store it in amount
		//Get the date when a transaction is made 
		date.add("14/12/1998");
		date.add("14/12/2016");
		date.add("14/12/2017");
		amount.add(10);
		amount.add(100);
		amount.add(1000);
	}
	private static CategoryDataset createDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		ArrayList<String> date = new ArrayList<String>();
		ArrayList<Integer> amount = new ArrayList<Integer>();
		getDataSet(date,amount);
		for( int i=0 ; i<amount.size() ; i++ )
		{
			dataset.addValue(amount.get(i),"Classes",date.get(i));
		}
		return dataset;
	}

	private static JFreeChart createChart(CategoryDataset dataset,String title) {
		
		JFreeChart chart = ChartFactory.createLineChart("Daily Expenses","Months", title,dataset,PlotOrientation.VERTICAL,false, true, false);
		
		chart.setBackgroundPaint(Color.white);
		CategoryPlot plot = (CategoryPlot) chart.getPlot();
		plot.setBackgroundPaint(Color.lightGray);
		plot.setRangeGridlinePaint(Color.white);
		
		NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
		rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		
		LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
		renderer.setShapesVisible(true);
		renderer.setDrawOutlines(true);
		renderer.setUseFillPaint(true);
		renderer.setFillPaint(Color.white);
		return chart;
	}

}
