/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author benkhtai
 */
public class GliderPattern extends BasePattern {
    
    public GliderPattern()
    {
    
        height = 3;
        width = 3;
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        
        Collections.reverse(patternList);
        
}


    @Override
    public List<CellState> getPatternArray() {
        return patternList;
    }

}
