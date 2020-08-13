/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author KPROGRAMMER
 */
public class PessoaTableModel extends AbstractTableModel{

    private ArrayList<Pessoa> pessoas=new ArrayList();
    private String[] colunas={"Nome","Idade","Morada","BI"};
    @Override
    public int getRowCount() {
        return pessoas.size();
        
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public int getColumnCount() {
        
        return  colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
        switch(columnIndex){
            
            case 0: return pessoas.get(rowIndex).getNome();
            case 1: return pessoas.get(rowIndex).getIdade();
            case 2: return pessoas.get(rowIndex).getMorada();
            case 3: return pessoas.get(rowIndex).getBi();
            
        }
        return null;
    }

    public void addRow(Object[] object) {
        
    }
    
    
    
    
}
