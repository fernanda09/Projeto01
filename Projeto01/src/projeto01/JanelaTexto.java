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
public class JanelaTexto extends Frame{
    
    public JanelaTexto(){
        setVisible(true);
        setSize(300, 300);
        setTitle("Informação");
        Panel pa = new Panel();
        add(pa);
        
        
        
        Button bu = new Button("Deseja Cadastrar essas Informações");
        bu.setSize(100,100);
        bu.setLocation(80, 150);
        pa.add(bu);
        
        Button b1 = new Button("Confirmação");
        b1.setSize(125, 150);
        b1.setLocation(200,40);
        pa.add(b1);
        
        
        Button b2 = new Button("Cancelamento");
        b2.setSize(125, 150);
        b2.setLocation(200,40);
        pa.add(b2);
   
    
    
    
    
    }
    
    
}
