package GUI;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;
import java.util.ArrayList;
 
public class PieChart extends JFrame {
   
   public PieChart( String title ) {
      super( title ); 
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setContentPane(createDemoPanel( ));
      
   }
   public static void getDataSet(ArrayList<String> category,ArrayList<Integer> amount)
	{
	   //Get Expenses from the database as per category
		category.add("Food");
		category.add("Education");
		category.add("Party");
		amount.add(100);
		amount.add(500);
		amount.add(100);
	}
   private static PieDataset createDataset( )
   {
      DefaultPieDataset dataset = new DefaultPieDataset( );ArrayList<String> date = new ArrayList<String>();
	  ArrayList<Integer> amount = new ArrayList<Integer>();
	  getDataSet(date,amount);
	  for( int i=0 ; i<amount.size() ; i++ )
	  {
	     dataset.setValue(date.get(i),amount.get(i));
	  }  
      return dataset;         
   }
   
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart("Expenses",dataset,true,true, false);
      return chart;
   }
  
   
   public static JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );
		//((JFrame) chart).setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      return new ChartPanel( chart ); 
   }

}

