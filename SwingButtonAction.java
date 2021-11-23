import java.awt.event.*;
import javax.swing.*;
public class SwingButtonAction{
    public static void main(String[] args) {
        JFrame f=new JFrame("Button with ActionListener");
        final JTextField tf=new JTextField();
        tf.setBounds(50,50,300,30);
        JButton b=new JButton("click here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome here By Harendra Prajapati");
            }     
         });
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
  }
}