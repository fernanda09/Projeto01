/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

/**
 *
 * @author Fernanda Sá
 */
public class JanelaLogin extends Frame{

    public JanelaLogin() {
        setVisible(true);
        setSize(300,300);
        setTitle("Login");
        Panel p = new Panel();
        add(p);
        p.setLayout(null);
        TextField email = new TextField();
        TextField senha = new TextField();
        email.setSize(120,25);
        email.setLocation(80,40);
        senha.setSize(120,25);
        senha.setLocation(80,120);
        p.add(email);
        p.add(senha);
        
        Label lemail = new Label("EMAIL");
        lemail.setSize(80,25);
        lemail.setLocation(80,10);
        Label lsenha = new Label("SENHA");
        lsenha.setSize(80,25);
        lsenha.setLocation(80,90);
        p.add(lemail);
        p.add(lsenha);
        
        
        
        
        Button b = new Button("Entrar no sistema"); 
        b.setSize(120,25);
        b.setLocation(80,180);
        p.add(b);
        EventoFechar ef = new EventoFechar();
        addWindowListener(ef);
    }
    
    
    
    
    
    
}
