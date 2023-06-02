import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class login extends Frame implements ActionListener{
    // Create components for the login form
    TextField un,pw;
    Label username,password;
    Button b;
    login(){
     // Initialize the components
     Label username = new Label("Username:");
     Label password = new Label("Password:");
     b = new Button("Login");
     un = new TextField(20);
     pw = new TextField(20);
     pw.setEchoChar('*');
     
     // Add action listener to the login button
     b.addActionListener(this);
     
     // Add components to the frame
     add(username);add(un);
     add(password);add(pw);
     add(b);
     
     
     
     //Set Frame properties
     setTitle("LOGIN PAGE");
     setSize(300,200);
     setLocationRelativeTo(null);
     setResizable(false);
     setLayout(null);
     setVisible(true);
     setLayout(new FlowLayout());
 }
    public void actionPerformed(ActionEvent e){
     if(e.getSource() == b){
     String username = un.getText();
     String password = pw.getText();
     if(username.equals("administrator") && password.equals("admin")){ 
     landing frame = new landing();
     dispose();
     }
    else{
     JOptionPane.showMessageDialog(null,"Login Failed");
     }
    }
 }  
  
 public static void main(String args[]){
     login l = new login();
 }
}    