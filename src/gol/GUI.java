/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

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

import java.util.Timer;
import java.util.TimerTask;

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
           
    public List<Cell> cells;
    private Grid grid = new Grid();
    private Timer timer;
    
    public GUI() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < grid.cells.size(); i++) {
                            grid.cells.get(i).goNextState();
                        }
                        for (int i = 0; i < grid.cells.size(); i++) {
                            grid.cells.get(i).settleState();
                        }
            }
        },  2000, 100);

        Pattern pattern = new GliderPattern();
        pattern.horizontalReflection();
        grid.applyPattern(pattern);
                
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
                combo.addItem("10 Row Cell");
                combo.addItem("Exploder"); 
                combo.addItem("LightWeight Spaceship");
                //JTextArea textArea=new JTextArea();
                //textArea.setBounds(10, 100, 200, 30);
                
                
                Start.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        for (int i = 0; i < grid.cells.size(); i++) {
                            grid.cells.get(i).goNextState();
                        }
                        for (int i = 0; i < grid.cells.size(); i++) {
                            grid.cells.get(i).settleState();
                        }
                    }
                });

                
                
                 combo.addItemListener((ItemEvent event) -> {
                     JComboBox comboBox = (JComboBox) event.getSource();
                     
                     // The item affected by the event.
                     Object item = event.getItem();
                     
                     //textArea.setText("Affected items: " + item.toString());
                     
                     if (event.getStateChange() == ItemEvent.SELECTED) {
                        // textArea.setText(item.toString() + " selected.");
                        if(item.toString()=="Glider")
                        {
                               grid.applyPattern(new GliderPattern());
                        
                        }else if(item.toString()=="Exploder")
                        {grid.applyPattern(new ExploderPattern());}
                        
                        else if(item.toString()=="10 Row Cell")
                        {
                            {grid.applyPattern(new TenCellRow());}
                        }
                        else if(item.toString()=="LightWeight Spaceship")
                        {
                            {grid.applyPattern(new LightWeightSpaceship());}
                        }
                     }
                     
                     
                } //
                // Listening if a new items of the combo box has been selected.
                //
                );
                
                frame.add(Start);
                frame.add(Reset);
                frame.add(combo);
                //frame.add(textArea);
            
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(grid);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
            }
        });
    }
}


