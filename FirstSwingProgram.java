
import javax.swing.*;

public class FirstSwingProgram {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JButton B=new JButton("click here");
        B.setBounds(130,100,100,40);
        f.add(B);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);

        
    }
    
}
