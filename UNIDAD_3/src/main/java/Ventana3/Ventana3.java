/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana3;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
/**
 *
 * @author usuario
 */
public class Ventana3 extends JFrame {
    
    private List <JPanel> jPanelList;
    public Ventana3() throws HeadlessException{
    this.setTitle("Grid Layout");
    this.setSize(800, 100);
    this.setLocation(350, 500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.iniciarPaneles();
    this.setContentPane(this.jPanelList.get(0));
    this.setVisible(true);
    }
    
    public void iniciarPaneles(){
    
    this.jPanelList= new ArrayList<>();
    this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(11).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(12).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(13).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(14).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(15).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(16).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(17).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(18).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(19).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(20).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(21).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(22).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(23).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(24).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(25).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(26).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(27).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(28).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(29).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(30).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(31).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(32).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(33).setBackground(Color.LIGHT_GRAY);
        this.jPanelList.get(34).setBackground(Color.LIGHT_GRAY);
        
        this.jPanelList.get(0).setLayout(new GridLayout(1,6));

        this.jPanelList.get(1).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(1).add(new JLabel("Button 1"));
         this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
         this.jPanelList.get(6).setLayout(new BorderLayout());
         this.jPanelList.get(6).add(this.jPanelList.get(1),BorderLayout.CENTER);
         this.jPanelList.get(6).add(this.jPanelList.get(11),BorderLayout.NORTH);
        this.jPanelList.get(6).add(this.jPanelList.get(12),BorderLayout.EAST);
        this.jPanelList.get(6).add(this.jPanelList.get(13),BorderLayout.SOUTH);
        this.jPanelList.get(6).add(this.jPanelList.get(14),BorderLayout.WEST);
        
         
         this.jPanelList.get(2).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(2).add(new JLabel("2"));
         this.jPanelList.get(2).setBorder(new BevelBorder(BevelBorder.RAISED));
         this.jPanelList.get(7).setLayout(new BorderLayout());
         this.jPanelList.get(7).add(this.jPanelList.get(2),BorderLayout.CENTER);
         this.jPanelList.get(7).add(this.jPanelList.get(15),BorderLayout.NORTH);
        this.jPanelList.get(7).add(this.jPanelList.get(16),BorderLayout.EAST);
        this.jPanelList.get(7).add(this.jPanelList.get(17),BorderLayout.SOUTH);
        this.jPanelList.get(7).add(this.jPanelList.get(18),BorderLayout.WEST);
        
         
         this.jPanelList.get(3).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(3).add(new JLabel("Button 3"));
         this.jPanelList.get(3).setBorder(new BevelBorder(BevelBorder.RAISED));
         this.jPanelList.get(8).setLayout(new BorderLayout());
         this.jPanelList.get(8).add(this.jPanelList.get(3),BorderLayout.CENTER);
         this.jPanelList.get(8).add(this.jPanelList.get(19),BorderLayout.NORTH);
        this.jPanelList.get(8).add(this.jPanelList.get(20),BorderLayout.EAST);
        this.jPanelList.get(8).add(this.jPanelList.get(21),BorderLayout.SOUTH);
        this.jPanelList.get(8).add(this.jPanelList.get(22),BorderLayout.WEST);
        
         
         this.jPanelList.get(4).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(4).add(new JLabel("Long-Named Button 4"));
         this.jPanelList.get(4).setBorder(new BevelBorder(BevelBorder.RAISED));
         this.jPanelList.get(9).setLayout(new BorderLayout());
         this.jPanelList.get(9).add(this.jPanelList.get(4),BorderLayout.CENTER);
         this.jPanelList.get(9).add(this.jPanelList.get(23),BorderLayout.NORTH);
        this.jPanelList.get(9).add(this.jPanelList.get(24),BorderLayout.EAST);
        this.jPanelList.get(9).add(this.jPanelList.get(25),BorderLayout.SOUTH);
        this.jPanelList.get(9).add(this.jPanelList.get(26),BorderLayout.WEST);
         
         
         this.jPanelList.get(5).setBackground(Color.LIGHT_GRAY);
         this.jPanelList.get(5).add(new JLabel("Button 5"));
         this.jPanelList.get(5).setBorder(new BevelBorder(BevelBorder.RAISED));
         this.jPanelList.get(10).setLayout(new BorderLayout());
         this.jPanelList.get(10).add(this.jPanelList.get(5),BorderLayout.CENTER);
         this.jPanelList.get(10).add(this.jPanelList.get(27),BorderLayout.NORTH);
        this.jPanelList.get(10).add(this.jPanelList.get(28),BorderLayout.EAST);
        this.jPanelList.get(10).add(this.jPanelList.get(29),BorderLayout.SOUTH);
        this.jPanelList.get(10).add(this.jPanelList.get(30),BorderLayout.WEST);
         
         
         
         
         this.jPanelList.get(0).add(this.jPanelList.get(6));
         this.jPanelList.get(0).add(this.jPanelList.get(7));
         this.jPanelList.get(0).add(this.jPanelList.get(8));
         this.jPanelList.get(0).add(this.jPanelList.get(9));
         this.jPanelList.get(0).add(this.jPanelList.get(10));
        
        
        
    }
    
}
