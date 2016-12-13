/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.util.Iterator;
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
        
        state = CellState.dead;
        setBackground(Color.GRAY);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setBackground(Color.BLUE);
                
                state = CellState.alive;
                System.out.println(getNumberOfLivingNeighbours());
            }

        });
    }
    
    private int getNumberOfLivingNeighbours() {
        int ret = 0;
        
        for(Iterator<Cell> it = neighbours.iterator(); it.hasNext(); ) {
            Cell cell = it.next();
            if (cell.state == CellState.alive || cell.state == CellState.goingDead) {
                ret ++;
            }
        }
        return ret;
    }
    
    
    public void settleState() {
        switch (state) {
            case goingAlive:
                state = CellState.alive;
                break;
            case goingDead:
                state = CellState.dead;
                break;
        }
        if (state == CellState.alive) {
            setBackground(Color.BLUE);
        }
        else if (state == CellState.dead) {
            setBackground(Color.GRAY);
        }
        
    }
    
    public void goNextState() {
        int livingNum = getNumberOfLivingNeighbours();
        
        switch (state) {
            case alive:
                if (livingNum > 3 || livingNum < 2) {
                    state = CellState.goingDead;
                }
                break;
            case dead:
                if (livingNum == 3) {
                    state = CellState.goingAlive;
                }
                break;
            case goingAlive:
                state = CellState.alive;
                break;
            case goingDead:
                state = CellState.dead;
                break;
        }
        if (state == CellState.alive) {
            setBackground(Color.BLUE);
        }
        else if (state == CellState.dead) {
            setBackground(Color.GRAY);
        }
//        else if (state == CellState.goingAlive) {
//            setBackground(Color.GREEN);
//        }
//        else if (state == CellState.goingDead) {
//            setBackground(Color.RED);
//        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(10, 10);
    }

}
