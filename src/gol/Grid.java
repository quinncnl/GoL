/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

/**
 *
 * @author qcai
 */
public class Grid extends JPanel {

    public int column = 120;
    public int row = 110;
    public List<Cell> cells;

    public Grid() {

        cells = new ArrayList();
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                gbc.gridx = j;
                gbc.gridy = i;

                Cell cellPane = new Cell();
                Border border = null;
                if (i < 4) {
                    if (j < 4) {
                        border = new MatteBorder(1, 1, 0, 0, Color.BLACK);
                    } else {
                        border = new MatteBorder(1, 1, 0, 1, Color.BLACK);
                    }
                } else {
                    if (j < 4) {
                        border = new MatteBorder(1, 1, 1, 0, Color.BLACK);
                    } else {
                        border = new MatteBorder(1, 1, 1, 1, Color.BLACK);
                    }
                }
                cells.add(cellPane);
                cellPane.setBorder(border);
                add(cellPane, gbc);
            }
        }

        setupNeighbours();        
    }
    
    public void applyPattern(Pattern pattern) {
        int index = 0;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//
//                index = i * column + j;
//                Cell c = cells.get(index);
//                c.state = CellState.dead;
//            }
//        }
//        
        int offsetX = new Random().nextInt(column);
        int offsetY = new Random().nextInt(row);

        int indexPatternList = 0;
        for (int i = 0; i < pattern.getHeight(); i++) {
            for (int j = 0; j < pattern.getWidth(); j++) {                            
                indexPatternList = i * pattern.getWidth() + j;
                if (pattern.getPatternArray().get(indexPatternList) == CellState.alive) {
                    index = (i + offsetX) * column + j + offsetY;
                    Cell cell = cells.get(index);
                    cell.state = CellState.alive;
                    cell.setBackground(Color.GRAY);
                }
            }
        }
    }

    private void setupNeighbours() {
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                index = i * column + j;
                Cell c = cells.get(index);

                int i_tl = (i - 1) * column + j - 1;
                int i_t = (i - 1) * column + j;
                int i_tr = (i - 1) * column + j + 1;
                int i_ml = i * column + j - 1;
                int i_mr = i * column + j + 1;
                int i_bl = (i + 1) * column + j - 1;
                int i_b = (i + 1) * column + j;
                int i_br = (i + 1) * column + j + 1;
                if (i == 0) {
                    i_tl = -1;
                    i_t = -1;
                    i_tr = -1;
                }
                if (i == row - 1) {
                    i_bl = -1;
                    i_b = -1;
                    i_br = -1;
                }
                if (j == 0) {
                    i_tl = -1;
                    i_ml = -1;
                    i_bl = -1;
                }
                if (j == column - 1) {
                    i_tr = -1;
                    i_mr = -1;
                    i_br = -1;
                }
                
                
                addNeighbourAtIndex(c, i_tl);
                addNeighbourAtIndex(c, i_t);
                addNeighbourAtIndex(c, i_tr);
                addNeighbourAtIndex(c, i_ml);
                addNeighbourAtIndex(c, i_mr);
                addNeighbourAtIndex(c, i_bl);
                addNeighbourAtIndex(c, i_b);
                addNeighbourAtIndex(c, i_br);

            }
        }
    }

    private void addNeighbourAtIndex(Cell c, int i) {
        if (i >= 0) {
            c.neighbours.add(cells.get(i));
        }
    }

}
