import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MathEvents implements ActionListener
{
    JFrame frame;
    JLabel lb1,lb2,lb3;
    JButton btn1,btn2,btn3;
    JTextField tf1,tf2,tf3;
    public MathEvents()
    {
    //create JFrame
    frame = new JFrame("Math Events");
    
    //adding labels 
    lb1 = new JLabel("Number 1:");
    lb2 = new JLabel("Number 2:");
    lb3 = new JLabel("Result:");
    btn1 = new JButton("+");
    btn2 = new JButton("-");
    btn3 = new JButton("C");
    
    //adding textfeilds
    tf1 = new JTextField();
    tf2 = new JTextField();
    tf3 = new JTextField();
    
    //setting the size 
    lb1.setBounds(70,70,80,25); //number1
    lb2.setBounds(70,140,80,25); //number2
    lb3.setBounds(70,210,80,25); //result
    tf1.setBounds(140,70,130,25); //number1 textfield
    tf2.setBounds(140,140,130,25); //number2 textfield
    tf3.setBounds(140,210,130,25); //result textfield
    btn1.setBounds(70,280,55,25); //addition button
    btn2.setBounds(140,280,55,25); //subtraction button
    btn3.setBounds(210,280,55,25); //clear button
    
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    
    //adding components in the frame
    frame.add(lb1);
    frame.add(lb2);
    frame.add(lb3);
    frame.add(btn1);
    frame.add(btn2);
    frame.add(btn3);
    frame.add(tf1);
    frame.add(tf2);
    frame.add(tf3);
    
    //frame settings
    frame.setLayout(null);
    frame.setSize(350,450);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
    public void actionPerformed(ActionEvent r){
        int a =Integer.parseInt(tf1.getText());
        int b =Integer.parseInt(tf2.getText());
        if(r.getSource() == btn1){
            int c = a+b;
            tf3.setText(String.valueOf(c));
            JOptionPane.showMessageDialog(frame,"The numbers have been added");
        }
        else if(r.getSource() == btn2){
            int d = a-b;
            tf3.setText(String.valueOf(d));
            JOptionPane.showMessageDialog(frame,"The numbers have been subtracted");
        }
        else{
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            JOptionPane.showMessageDialog(frame,"The results have been cleared out","Warningtype",
            JOptionPane.WARNING_MESSAGE);
            
        }
    }
}
