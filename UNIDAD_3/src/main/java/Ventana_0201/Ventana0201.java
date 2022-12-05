/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana_0201;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

/**
 *
 * @author usuario
 */
public final class Ventana0201 extends JFrame {

    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFile;
    private List<JComboBox> jComboBox;

    public Ventana0201() throws HeadlessException {
        this.setTitle("Informacion");
        this.setSize(500, 300);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJlabels();
        this.iniciarJComboBox();
        this.iniciarJButtons();
        this.iniciarJTextfile();
      

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPaneles() {
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.get(1).setBackground(Color.WHITE);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);
 
         
     
        this.jPanelList.get(0).setBackground(new Color(32, 167, 218));

        this.jPanelList.get(0).setBorder(new BevelBorder(BevelBorder.RAISED));

        this.jPanelList.get(0).setLayout(new GridLayout(9, 1));
        this.jPanelList.get(0).add(this.jPanelList.get(0));
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));



    }

    public void iniciarJlabels() {
        this.jLabelList = new ArrayList<>();

        this.jLabelList.add(new JLabel("INFORMACION DE CARRERA"));
        this.jLabelList.add(new JLabel("Periodo Académico: *"));
        this.jLabelList.add(new JLabel("Carrera: *"));
        this.jLabelList.add(new JLabel("Modalidad:"));
        this.jLabelList.add(new JLabel("Sede: *"));
        this.jLabelList.add(new JLabel("Campus: *"));
        this.jLabelList.add(new JLabel("Jornada: *"));
        this.jLabelList.add(new JLabel("Fecha de Registro: *"));

        this.jLabelList.get(0).setFont(new Font("Times New Roman", Font.PLAIN, 20));
        this.jPanelList.get(1).add(this.jLabelList.get(0));

        this.jLabelList.get(1).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(2).add(this.jLabelList.get(1));

        this.jLabelList.get(2).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(3).add(this.jLabelList.get(2));

        this.jLabelList.get(3).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(4).add(this.jLabelList.get(3));

        this.jLabelList.get(4).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(5).add(this.jLabelList.get(4));

        this.jLabelList.get(5).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(6).add(this.jLabelList.get(5));

        this.jLabelList.get(6).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(7).add(this.jLabelList.get(6));

        this.jLabelList.get(7).setFont(new Font("Times New Roman", Font.PLAIN, 14));
        this.jPanelList.get(8).add(this.jLabelList.get(7));

    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();

        this.jButtonList.add(new JButton("Siguiente"));
        this.jPanelList.get(8).add(this.jButtonList.get(0));

    }

    public void iniciarJComboBox() {
        this.jComboBox = new ArrayList<>();
        var carreras = new String[4];
        carreras[0] = "Ingenieria en Sistemas";
        carreras[1] = "Ingenieria Automotriz";
        carreras[2] = "Ingenieria Electrica";
        carreras[3] = "Veterinaria";
        this.jComboBox.add(new JComboBox(carreras));
        
        var modalidad = new String[3];
        modalidad[0] = "Presencial";
        modalidad[1] = "Online";
        modalidad[2] = "Semi-Presencial";
        this.jComboBox.add(new JComboBox(modalidad));

        var sedes = new String[3];
        sedes[0] = "MATRIZ CUENCA";
        sedes[1] = "QUITO";
        sedes[2] = "GUAYAQUIL";
        this.jComboBox.add(new JComboBox(sedes));
        
        var campus = new String[2];
        campus[0] = "El vecino";
        campus[1] = "El concecionario";
        this.jComboBox.add(new JComboBox(campus));

        var jornada = new String[3];
        sedes[0] = "Matutina";
        sedes[1] = "Vespertina";
        sedes[2] = "Nocturna";
        this.jComboBox.add(new JComboBox(jornada));

    this.jPanelList.get(2).add(this.jComboBox.get(0));
    this.jPanelList.get(3).add(this.jComboBox.get(1));
    this.jPanelList.get(4).add(this.jComboBox.get(2));
    this.jPanelList.get(5).add(this.jComboBox.get(3));
    this.jPanelList.get(6).add(this.jComboBox.get(4));
   
    
    
    }

    public void iniciarJTextfile() {
        this.jTextFile = new ArrayList<>();
        this.jTextFile.add(new JTextField(15));
        this.jPanelList.get(1).add(this.jTextFile.get(0));
        this.jPanelList.get(7).add(this.jTextFile.get(0));

    }

}
