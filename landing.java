import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class landing extends Frame implements ActionListener{
    // Create components for the login form
    TextField un,pw;
    Label username,password;
    Button b;
    landing(){
     // Initialize the components
     
     // Add action listener to the login button
     
     // Add components to the frame
     
     
     
     //Set Frame properties
     setTitle("LANDING PAGE");
     setSize(500,700);
     setLocationRelativeTo(null);
     setResizable(false);
     setLayout(null);
     setVisible(true);
     setLayout(new FlowLayout());
 }
    public void actionPerformed(ActionEvent e){
     
 }  
  
 public static void main(String args[]){
     landing lan = new landing();
 }
}    