/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao16_XadrezGame.boardGame;

/**
 *
 * @author Jean
 */
public class Position {
    
    private Integer row;
    private Integer column;

    public Position() {
    }

    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }
    
    public void setValues(int row, int column){
        
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }
    
}
