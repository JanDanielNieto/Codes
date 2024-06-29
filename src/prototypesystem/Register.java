package prototypesystem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Register extends JFrame implements ActionListener{
    
    private JLabel lbname, lbemail, lbpass, lbconfpass;
    private JTextField txname, txemail, txpass, txconfpass;
    public JButton btnconfirm, btnlogin;
    
    Register(){
        
        setTitle("Registration");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lbemail = new JLabel("Email:");
        lbemail.setBounds(40, 60, 150, 100);
        lbemail.setFont(new Font("Lucida Calligraphy", Font.BOLD,18));
        add(lbemail);
        
        lbname = new JLabel("Username:");
        lbname.setBounds(40, 90, 150, 100);
        lbname.setFont(new Font("Lucida Calligraphy", Font.BOLD,18));
        add(lbname);
        
        
        lbpass = new JLabel("Password:");
        lbpass.setBounds(40, 120, 150, 100);
        lbpass.setFont(new Font("Lucida Calligraphy", Font.BOLD,18));
        add(lbpass);
        
        lbconfpass = new JLabel("Confirm Password:");
        lbconfpass.setBounds(40, 150, 200, 100);
        lbconfpass.setFont(new Font("Lucida Calligraphy", Font.BOLD,18));
        add(lbconfpass);
        
        txemail = new JTextField();
        txemail.setBounds(120, 102, 150, 20);
        add(txemail);
        
        txname = new JTextField();
        txname.setBounds(160, 131, 150, 20);
        add(txname);
        
        txpass = new JTextField();
        txpass.setBounds(150, 161, 150, 20);
        add(txpass);
        
        txconfpass = new JTextField();
        txconfpass.setBounds(240, 191, 150, 20);
        add(txconfpass);
        
        btnconfirm = new JButton("Confirm");
        btnconfirm.setBounds(250, 250, 100, 20);
        add(btnconfirm);
        
        btnlogin = new JButton("Login");
        btnlogin.setBounds(120, 250, 100, 20);
        add(btnlogin);
        
       btnlogin.addActionListener(this);
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnlogin){
        Splash wp = new Splash();
        wp.setVisible(true);
        }
}
}
