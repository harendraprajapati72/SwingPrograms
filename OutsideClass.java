package outSide;
import java.awt.*;  
import java.awt.event.*; // import package(all needed )
class OutSideClass extends Frame{  
TextField tf;  
OutSideClass(){  
//create components  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
//register listener  
Outer o=new Outer(this);  
b.addActionListener(o); //passing outer class instance  
 
add(b);add(tf);  //add components 
setSize(300,300);  //set size
setLayout(null);  // set layout
setVisible(true);  // set visibility
}  
public static void main(String args[]){  
new OutSideClass();  
}  
}  
 