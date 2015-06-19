package insurance;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class JComboBoxDemo extends JFrame{
public JComboBoxDemo(){
	   
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setBounds(100,100,250,100);
	    JPanel contentPane=new JPanel();
	    contentPane.setBorder(new EmptyBorder(5,5,5,5));
	    this.setContentPane(contentPane);
	    contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
	    JLabel label=new JLabel("证件类型:");
	    contentPane.add(label);
	    JComboBox <String> comboBox=new JComboBox <String> ();
	    comboBox.addItem("2015");
	    comboBox.addItem("2014");
	    comboBox.addItem("2013");
	    contentPane.add(comboBox);
	    this.setVisible(true);
	  }
      public static void main(String[] args) {
    	JComboBoxDemo example=new JComboBoxDemo();
      }  	 
}
