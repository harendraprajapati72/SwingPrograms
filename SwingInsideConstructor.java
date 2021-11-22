import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
public class SwingInsideConstructor {
    JFrame f;
    SwingInsideConstructor(){
        f=new JFrame();
        JButton B=new JButton("click me");
        B.setBounds(130,100,100,40);
        f.add(B);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
}
public static void main(String[] args) {
    new SwingInsideConstructor();
    
}
    
    
}
