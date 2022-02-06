import java.awt.*;  
import java.awt.event.*;  
public class Program1 {  
public static void main(String[] args) {  
    Frame f=new Frame("first java program of Rachana Sinha mam");  
    final TextField tf=new TextField();  
    tf.setBounds(100,100,300,30);  
    Button b=new Button("Click Here");  
    b.setBounds(200,200,100,30);  
  
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("WELCOME BY HARENDRA");  
    }  
    });  
    f.add(b);f.add(tf);  
    f.setSize(500,500);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  