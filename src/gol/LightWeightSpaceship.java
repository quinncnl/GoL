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
public class LightWeightSpaceship implements Pattern {
    
    
    public int height = 0;
    public int width = 0;
    public List<CellState> patternList = new ArrayList();

    
    public LightWeightSpaceship()
    {
    
        height = 4;
        width = 5;
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
}

    @Override
    public int getHeight() {
       return height;
        
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public List<CellState> getPatternArray() {
        return patternList;
    }
}
