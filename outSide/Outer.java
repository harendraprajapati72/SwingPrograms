package outSide;
import java.awt.event.*;  
class Outer implements ActionListener{  
OutSideClass obj;  
Outer(OutSideClass obj){  
this.obj=obj;  
}  
public void actionPerformed(ActionEvent e){  
obj.tf.setText("Welcome By Harendra");  
}  
} 