import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Action2 extends MyGUI implements ActionListener
{
   private JLabel label1, label2, iPhoneLabel, camLabel, proLabel, sizeLabel;
   private JButton qbutton, conbutton;
   JLabel qlabel;
   int count = 0;
   
   public void actionPerformed (ActionEvent e)
   {
      label1 = new JLabel("Product :");
      label1.setBounds(550, 50, 150, 25);
      panel.add(label1);
      
      label2 = new JLabel("Quantity :");
      label2.setBounds(850, 50, 100,25);
      panel.add(label2);
      
      qlabel = new JLabel("The total price of 0 Nokia 3310 is  RM 0");
      qlabel.setBounds(550, 290, 500,30);
      qlabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
      panel.add(qlabel);
      
      iPhoneLabel = new JLabel("Nokia 3310");
      iPhoneLabel.setFont(new Font("Cooper Black", Font.PLAIN, 20));
      iPhoneLabel.setBounds(550,80, 200, 50);
      panel.add(iPhoneLabel);
      
      camLabel = new JLabel("Number of Camera : 1");
      camLabel.setBounds(550, 120, 200, 25);
      panel.add(camLabel);
      
      proLabel = new JLabel("Processor : Graphical User Interface");
      proLabel.setBounds(550,130,200,25);
      panel.add(proLabel);
      
      sizeLabel = new JLabel("Weight : 85g");
      sizeLabel.setBounds(550,140,200,25);
      panel.add(sizeLabel);
      
      qbutton = new JButton("+");
      qbutton.setBounds(850, 100, 50,25);
      
      Faction fa = new Faction(qlabel);
      qbutton.addActionListener(fa);
      panel.add(qbutton);
      
      conbutton = new JButton("CONFIRM");
      conbutton.setBounds(750, 380, 120,40);
      conbutton.addActionListener(new ConAction());
      panel.add(conbutton);
      
    }
    
}

class Faction extends Action2 implements ActionListener
{
   int count = 0;
   double total = 0;
   private JLabel label;
   
    public Faction(JLabel label)
    {  this.label = label;  } 
    
    public void actionPerformed (ActionEvent e)
    {
         count++;
         total = count * 99;
         label.setText("The total price of "+ count +" Nokia 3310 is : RM " + total);
         
    }
    
    
    public JLabel getLabel()
    {  return label; }
}

class ConAction extends Action2 implements ActionListener 
{
   public void actionPerformed (ActionEvent e)
   {
      JLabel clabel = new JLabel("Purchase successfully!!!");
      clabel.setBounds(550, 450, 300, 50);
      clabel.setFont(new Font("Arial", Font.PLAIN, 25));
      panel.add(clabel);
   }
}