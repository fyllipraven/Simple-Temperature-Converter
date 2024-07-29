import javax.swing.*;
import java.awt.event.*;

public class TempGUI extends JFrame implements ActionListener
{
  private JLabel input, result, num;
  private JTextField tf1;
  private JButton FtoC, CtoF;
  
  public TempGUI()
  {
    setTitle("Temp GUI");
    this.setSize(215,150);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);

    input = new JLabel("Input:");
    this.getContentPane().add(input);
    input.setBounds(25,25,75,20);

    result = new JLabel("Result:");
    this.getContentPane().add(result);
    result.setBounds(25,90,75,20);

    num = new JLabel("");
    this.getContentPane().add(num);
    num.setBounds(85,90,75,20);

    tf1 = new JTextField();
    this.getContentPane().add(tf1);
    tf1.setBounds(75,25,75,20);

    FtoC = new JButton("FtoC");
    this.getContentPane().add(FtoC);
    FtoC.setBounds(25,60,75,20);
    FtoC.addActionListener(this);
    
    CtoF = new JButton("CtoF");
    this.getContentPane().add(CtoF);
    CtoF.setBounds(115,60,75,20);
    CtoF.addActionListener(this);

    this.setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource() == FtoC)
    {
      String s = tf1.getText();
      double temp = TempConvert.convertToC(Double.parseDouble(s));
      num.setText(temp + "");
    }
    if(e.getSource() == CtoF)
    {
      String s = tf1.getText();
      double temp = TempConvert.convertToF(Double.parseDouble(s));
      num.setText(temp + "");
    }
  }
  public static void main(String[] args)
  {
    TempGUI gui = new TempGUI();
  }
}