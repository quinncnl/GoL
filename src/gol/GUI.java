/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JTextArea;
/**
 *
 * @author qcai
 */
// gui class
public class GUI {
       
    public GUI() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Testing");
                JButton Start = new JButton("Start");
                JComboBox combo = new JComboBox();
                JPanel panel = new JPanel();
                Start.setBounds(10, 10, 100, 30);
                
                JButton Reset = new JButton("Reset");
                Reset.setBounds(10, 40, 100, 30);
                combo.setBounds(10, 70, 100, 30);
                combo.addItem("Glider");
                combo.addItem("Small Explorer");
                combo.addItem("Explorer"); 
                JTextArea textArea=new JTextArea();
                textArea.setBounds(10, 100, 200, 30);
                
                 combo.addItemListener((ItemEvent event) -> {
                     JComboBox comboBox = (JComboBox) event.getSource();
                     
                     // The item affected by the event.
                     Object item = event.getItem();
                     
                     textArea.setText("Affected items: " + item.toString());
                     
                     if (event.getStateChange() == ItemEvent.SELECTED) {
                         textArea.setText(item.toString() + " selected.");
                     }
                     
                     if (event.getStateChange() == ItemEvent.DESELECTED) {
                         textArea.setText(item.toString() + " deselected.");
                     }
                } //
                // Listening if a new items of the combo box has been selected.
                //
                );
                
                frame.add(Start);
                frame.add(Reset);
                frame.add(combo);
                frame.add(textArea);
            
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new Grid());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
            }
        });
    }
}


