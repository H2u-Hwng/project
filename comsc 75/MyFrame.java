import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	private JComboBox comboBox;
	private Object service;
	private static double totalCost = 0.0;
 
	public MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout()); 
	  
		String[] animals = {"mowing", "tree removal", "planting"};
	  
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
	  
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount());
		//comboBox.addItem("horse");
		//comboBox.insertItemAt("pig", 0);
		//comboBox.setSelectedIndex(0);
		//comboBox.removeItem("cat");
		//comboBox.removeItemAt(0);
		//comboBox.removeAllItems();
	  
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
 
	public Object getItem() {
		return comboBox.getSelectedItem();
	}
	
	public int getIndex() {
		return comboBox.getSelectedIndex();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			service = comboBox.getSelectedItem();
			System.out.println(service);
//			System.out.println(comboBox.getSelectedIndex());
			if (service == "mowing") {
				System.out.println("Its base charge: $" + 100.0);
				
				totalCost += 100.0;
			}
			else if (service == "tree removal") {
				System.out.println("Its base charge: $" + 1000.0);
				
				totalCost += 1000.0;
			}
			else {
				System.out.println("Its base charge: $" + 300.0);
				
				totalCost += 300.0;
			}
		}
	}
}