/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypesystem;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Nieto
 */
public class Login extends JFrame implements ActionListener{
    
    
    private JLabel lbname, lbemail, lbpass;
    private JTextField txname, txemail, txpass;
    private JButton btnconfirm;
    Login(){
        setTitle("Login");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lbname = new JLabel("Username:");
        lbname.setBounds(40, 90, 150, 100);
        lbname.setFont(new Font("Lucida Handwriting", Font.BOLD,18));
        add(lbname);
        
        lbemail = new JLabel("Email:");
        lbemail.setBounds(40, 60, 150, 100);
        lbemail.setFont(new Font("Lucida Handwriting", Font.BOLD,18));
        add(lbemail);
        
        lbpass = new JLabel("Password:");
        lbpass.setBounds(40, 120, 150, 100);
        lbpass.setFont(new Font("Lucida Handwriting", Font.BOLD,18));
        add(lbpass);
        
        txname = new JTextField();
        txname.setBounds(160, 131, 150, 20);
        add(txname);
        
        txemail = new JTextField();
        txemail.setBounds(120, 102, 150, 20);
        add(txemail);
        
        txpass = new JTextField();
        txpass.setBounds(150, 161, 150, 20);
        add(txpass);
        
        btnconfirm = new JButton("Confirm");
        btnconfirm.setBounds(250, 200, 100, 20);
        add(btnconfirm);
        
        btnconfirm.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        if(e.getSource() == btnconfirm){
        Splash wp = new Splash();
        wp.setVisible(true);
        }
}
}
