package proiect_intref;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		String value1= (String) View.box1.getSelectedItem();
		String value2= (String) View.box2.getSelectedItem();
		
		if( value1==value2)
		{
			String suma= View.text1.getText();
			View.text2.setText(suma);
		}
		
		if( value1=="RON" &&  value2=="EUR")
		{
			String suma= View.text1.getText();
			Double d =Double.valueOf(suma)/4.7794;
			d = Double.parseDouble(String.format("%.4f", d)); 
			View.text2.setText(d.toString());
		}
		if( value1=="EUR" &&  value2=="RON")
		{
			String suma= View.text1.getText();
			Double d =Double.valueOf(suma)*4.7794;
			d = Double.parseDouble(String.format("%.4f", d)); 
			View.text2.setText(d.toString());
		}
			
		if( value1=="RON" &&  value2=="USD")
		{
			String suma= View.text1.getText();
			Double d =Double.valueOf(suma)/4.3124;
			d = Double.parseDouble(String.format("%.4f", d)); 
			View.text2.setText(d.toString());
		}
		if( value1=="USD" &&  value2=="RON")
		{
			String suma= View.text1.getText();
			Double d =Double.valueOf(suma)*4.3124;
			d = Double.parseDouble(String.format("%.4f", d)); 
			View.text2.setText(d.toString());
		}
			
		if( value1=="USD" &&  value2=="EUR")
		{
			String suma= View.text1.getText();
			Double d =Double.valueOf(suma)*0.9;
			d = Double.parseDouble(String.format("%.4f", d)); 
			View.text2.setText(d.toString());
		}
		if( value1=="EUR" &&  value2=="USD")
		{
			String suma= View.text1.getText();
			Double d =Double.valueOf(suma)*1.1089;
			d = Double.parseDouble(String.format("%.4f", d)); 
			View.text2.setText(d.toString());
		} 
			
			
			
	
		
	}

}
