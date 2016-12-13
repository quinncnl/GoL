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

public interface Pattern {
    
    public int getHeight();
    public int getWidth();
    public List<CellState> getPatternArray();
}

    