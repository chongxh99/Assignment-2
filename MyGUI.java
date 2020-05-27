import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyGUI implements ActionListener
{
   static JPanel panel;
   private static JFrame frame;
   public  static JLabel title, cusLabel, icLabel, addrLabel, hpnumLabel, timeLabel;
   private static JTextField cusText, icText, hpnumText;
   private static JTextArea addrText;
   private static JPasswordField passwordText;
   private static JButton nbutton;
   private static JComboBox dateCombo, monthCombo, yearCombo;
   
   private static String dates[] = { "1", "2", "3", "4", "5", 
                              "6", "7", "8", "9", "10", 
                              "11", "12", "13", "14", "15", 
                              "16", "17", "18", "19", "20", 
                              "21", "22", "23", "24", "25", 
                              "26", "27", "28", "29", "30", 
                              "31" }; 
   
   private static String months[] = { "Jan", "Feb", "Mar", "Apr", 
                               "May", "Jun", "July", "Aug", 
                               "Sep", "Oct", "Nov", "Dec" }; 
   
   private static String years[]  = {"1999", "2000", "2001", "2002", 
                              "2003", "2004", "2005", "2006", 
                              "2007", "2008", "2009", "2010", 
                              "2011", "2012", "2013", "2014", 
                              "2015", "2016", "2017", "2018", 
                              "2019" }; 
   
   public static void main (String[] args)
   {
      frame = new JFrame("My Handphone Shop");
      frame.setSize(1000,700);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      
      panel = new JPanel();
      panel.setLayout(null);
      frame.add(panel);
      
      title = new JLabel("Welcome To CXH Handphone Shop");
      title.setBounds(60,10,350,30);
      title.setFont(new Font("Arial", Font.PLAIN, 20)); 
      panel.add(title);
      
      cusLabel = new JLabel("Customer's Name ");
      cusLabel.setBounds(30,50,150,25);
      panel.add(cusLabel);
      
      cusText = new JTextField(20);
      cusText.setBounds(170,50,165,25);
      panel.add(cusText);
      
      icLabel = new JLabel("IC number ");
      icLabel.setBounds(30, 100,80,25);
      panel.add(icLabel);
      
      icText = new JTextField();
      icText.setBounds(170, 100, 165,25);
      panel.add(icText);
      
      addrLabel = new JLabel("Address");
      addrLabel.setBounds(30, 150, 100, 25);
      panel.add(addrLabel);
      
      addrText = new JTextArea();
      addrText.setBounds(170, 150, 165, 80);
      addrText.setLineWrap(true);
      panel.add(addrText);
      
      hpnumLabel = new JLabel("Hp Number");
      hpnumLabel.setBounds(30, 260, 165,25);
      panel.add(hpnumLabel);
      
      hpnumText = new JTextField();
      hpnumText.setBounds(170, 260, 165,25);
      panel.add(hpnumText);
      
      timeLabel = new JLabel("Date");
      timeLabel.setBounds(30, 310, 165,25);
      panel.add(timeLabel);
      
      dateCombo = new JComboBox(dates);
      dateCombo.setBounds(170, 310, 60,20);
      panel.add(dateCombo);
      
      monthCombo = new JComboBox(months);
      monthCombo.setBounds(230, 310, 60,20);
      panel.add(monthCombo);
      
      yearCombo = new JComboBox(years);
      yearCombo.setBounds(300, 310, 60,20);
      panel.add(yearCombo);
      
      nbutton = new JButton("Next");
      nbutton.setBounds(300,360,80,25);
      nbutton.addActionListener(new MyGUI());
      panel.add(nbutton);
      
      frame.setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e)
   {
       JLabel nextLabel =  new JLabel("Choose the type of phone to buy :");
       nextLabel.setBounds(80, 400, 400, 25);
       nextLabel.setFont(new Font("Arial", Font.PLAIN, 15));
       panel.add(nextLabel);
       
       JButton sbutton = new JButton("Smartphone");
       sbutton.setBounds(50, 450, 180, 50);
       sbutton.setFont(new Font("Times new Roman", Font.PLAIN, 18));
       sbutton.addActionListener(new Action());
       panel.add(sbutton);
       
       JButton cbutton = new JButton("Cellphone");
       cbutton.setBounds(260, 450, 180,50);
       cbutton.setFont(new Font("Times new Roman", Font.PLAIN, 18));
       Action2 a2 = new Action2();
       cbutton.addActionListener(a2);
       panel.add(cbutton);
   }}
       