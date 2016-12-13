/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author benkhtai
 */
public class TenCellRow extends BasePattern {

    public TenCellRow()
    {
    
        height = 1;
        width = 10;
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
       
   }

}
