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
public class PulsarPattern implements  Pattern {

    public int height = 0;
    public int width = 0;
    public List<CellState> patternList = new ArrayList();

public PulsarPattern()
{
 
        height = 13;
        width = 13;
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        
        
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        
        //c1
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        
        //c2
         patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        
        //c3
         patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        
       //closing4
        
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        
        
        //new row
        
         patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        
        
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        
        //c1
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        
        //c2
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        
        //c3
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        
        //c4 
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.alive);
        patternList.add(CellState.dead);
        patternList.add(CellState.dead);
       
        
        
        

/*Died 	Died 	Alive 	Alive 	Alive 	Died	 Died	 Died 	Alive	 Alive 	Alive 	Died 	Died 
Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 
Alive 	Died 	Died 	Died 	Died 	Alive 	Died 	Alive 	Died 	Died 	Died 	Died 	Alive
Alive 	Died 	Died 	Died 	Died 	Alive 	Died 	Alive 	Died 	Died 	Died 	Died 	Alive
Alive 	Died 	Died 	Died 	Died 	Alive 	Died 	Alive 	Died 	Died 	Died 	Died 	Alive
Died 	Died 	Alive 	Alive 	Alive 	Died	 Died	 Died 	Alive	 Alive 	Alive 	Died 	Died 
Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 	Died 
Died 	Died 	Alive 	Alive 	Alive 	Died	 Died	 Died 	Alive	 Alive 	Alive 	Died 	Died 
Alive 	Died 	Died 	Died 	Died 	Alive 	Died 	Alive 	Died 	Died 	Died 	Died 	Alive
Alive 	Died 	Died 	Died 	Died 	Alive 	Died 	Alive 	Died 	Died 	Died 	Died 	Alive
Alive 	Died 	Died 	Died 	Died 	Alive 	Died 	Alive 	Died 	Died 	Died 	Died 	Alive
Died 	Died 	Alive 	Alive 	Alive 	Died	 Died	 Died 	Alive	 Alive 	Alive 	Died 	Died 

*/
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

    @Override
    public void verticalReflection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void horizontalReflection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


