import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Action extends MyGUI implements ActionListener
{
   private JLabel label1, label2, iPhoneLabel, camLabel, proLabel, sizeLabel;
   private JButton qbutton;
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
      
      qlabel = new JLabel("The price of 0 iPhone 12 Pro Max is RM 0");
      qlabel.setBounds(550, 290, 500,30);
      qlabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
      panel.add(qlabel);
      
      iPhoneLabel = new JLabel("iPhone 12 Pro Max");
      iPhoneLabel.setFont(new Font("Cooper Black", Font.PLAIN, 20));
      iPhoneLabel.setBounds(550,80, 200, 50);
      panel.add(iPhoneLabel);
      
      camLabel = new JLabel("Number of Camera : 4");
      camLabel.setBounds(550, 120, 200, 25);
      panel.add(camLabel);
      
      proLabel = new JLabel("Processor : A13 Bionic");
      proLabel.setBounds(550,130,200,25);
      panel.add(proLabel);
      
      sizeLabel = new JLabel("Size : 6.5-inch");
      sizeLabel.setBounds(550,140,200,25);
      panel.add(sizeLabel);
      
      qbutton = new JButton("+");
      qbutton.setBounds(850, 100, 50,25);
      
      Qaction qa = new Qaction(qlabel);
      qbutton.addActionListener(qa);
      panel.add(qbutton);
         
      JButton conbutton = new JButton("COMFIRM");
      conbutton.setBounds(750, 380, 120,40);
      conbutton.addActionListener(new Caction());
      panel.add(conbutton);
         
    }
}
    
class Qaction extends Action implements ActionListener 
{
   int count = 0;
   double total = 0;
   private JLabel label;
   JLabel totalLabel, priceLabel;
   
    public Qaction(JLabel label)
    {  this.label = label;  } 
    
    public void actionPerformed (ActionEvent e)
    {
         count++;
         total = count * 4500;
         label.setText("The total price of "+ count +" iPhone 12 Pro Max is : RM " + total);
         
    }
    
    
    public JLabel getLabel()
    {  return label; }
}

class Caction extends Action implements ActionListener
{
   public void actionPerformed (ActionEvent e)
   {
      JLabel clabel = new JLabel("Purchase successfully!!!");
      clabel.setBounds(550, 450, 300, 50);
      clabel.setFont(new Font("Arial", Font.PLAIN, 25));
      panel.add(clabel);
   }
}