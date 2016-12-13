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
public class GliderPattern implements Pattern {
    
    
    public int height = 0;
    public int width = 0;
    public List<CellState> patternList = new ArrayList();

    
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
        
}

    @Override
    public int getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getWidth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CellState> getPatternArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
