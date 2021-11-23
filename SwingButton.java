import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class SwingButton {
    public static void main(String[] args) {
    JFrame F=new JFrame("My first button");
    JButton B=new JButton("click here");
    B.setBounds(50,100,95,30);
    F.add(B);
    F.setSize(200,400);
    F.setLayout(null);
    F.setVisible(true);
    }
}
