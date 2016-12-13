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
 * @author qcai
 */
public class BasePattern implements Pattern {
        
    public int height = 0;
    public int width = 0;
    public List<CellState> patternList = new ArrayList();


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
    
    @Override
    public void verticalReflection() {
            
        List<CellState> newList = new ArrayList();
        for (int i = getHeight() - 1; i >= 0; i--) {            
            for (int j = 0; j < getWidth(); j++) {
                int index = i * getWidth() + j;
                newList.add(getPatternArray().get(index));
            }
        }
        patternList = newList;
    }

    @Override
    public void horizontalReflection() {

        List<CellState> newList = new ArrayList();
        for (int i = 0; i < getHeight(); i++) {
            for (int j = getWidth() - 1; j >= 0; j--) {
                int index = i * getWidth() + j;
                newList.add(getPatternArray().get(index));
            }
        }
        patternList = newList;
    }

}
