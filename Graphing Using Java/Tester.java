
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.utc.MichaelHolloway.LookupTable;
import edu.utc.MichaelHolloway.DataProvider;
import edu.utc.MichaelHolloway.DataProcessor;
import edu.utc.MichaelHolloway.DataDumper;
import javax.swing.*;
public class Main 
{
  
  public static void main(String[] args)
{
Sin sin=new Sin();
// set up provider
DataDumper dumper=new DataDumper();
MathSampler Sampler=new MathSampler(-Math.PI,Math.PI,500,sin);

// set up plotter
SwingPlotter plotter = new SwingPlotter();
// set up Swing frame
JFrame frame = new JFrame();
// add SwingPLotter to frame
frame.add(plotter);
// make frame visible
frame.setSize(400, 400);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
// assuming I have a static run method in a Data class -- this
// is the standard run loop we are using throughout this project
Data.run(Sampler, plotter);

}
}
