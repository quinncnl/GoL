/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol;

import gol.CellState;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author qcai
 */
public class Cell extends JPanel {

    private Color defaultBackground;
    public int posX, posY;
    public CellState state;
    public List<Cell> neighbours = new ArrayList();
    
    public Cell() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                defaultBackground = getBackground();
                setBackground(Color.BLUE);
                
                System.out.println(neighbours.size());
            }

        });
    }
    
    private int getNumberOfLivingNeighbours() {
        int ret = 0;
        
        for(Iterator<Cell> it = neighbours.iterator(); it.hasNext(); ) {
            Cell cell = it.next();
            if (cell.state == CellState.alive) {
                ret ++;
            }
        }
        return ret;
    }
    
    public void goNextState() {
        
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(10, 10);
    }

}
