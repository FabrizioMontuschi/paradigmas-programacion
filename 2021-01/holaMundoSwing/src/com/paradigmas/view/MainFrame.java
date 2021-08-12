package com.paradigmas.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {

    private JLabel miLabel;
    private JButton botonConAccion;
    private JButton botonAbrirOtraVentana;

    public MainFrame() {
        super("Nombre de la ventana principal");
        initComponents();
        // comportamiento: colocar tamaño en X e Y de la ventana (frame)
        setSize(500,500);
        // comportamiento: dejar la ventana al centro de la pantalla
        setLocationRelativeTo(null);
        // comportamiento: termina ejecucion del programa cuando se apreta la X de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonConAccion) {
            String message = "Hola, ejecute una accion";
            JOptionPane.showMessageDialog(this, message);
        }
        if(e.getSource() == botonAbrirOtraVentana) {
            //this.setVisible(false);
            new AnotherFrame().setVisible(true);
        }
    }

    private void initComponents() {
        miLabel = new JLabel("Esto es un label");
        botonConAccion = new JButton("Haz click aqui");
        botonAbrirOtraVentana = new JButton("Click para abrir otra ventana");

        add(miLabel);
        add(botonConAccion);
        add(botonAbrirOtraVentana);

        // Layout es como se ordenan los componentes dentro del frame
        // Tipo de layout: https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
        setLayout(new FlowLayout());

        botonConAccion.addActionListener(this);
        botonAbrirOtraVentana.addActionListener(this);
    }


}
