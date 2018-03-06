/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraphique;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author attma
 */
public abstract class interfaceAddUpDel extends javax.swing.JPanel {
    public static void removeChkRow(JTable j){
        for(int i =0; i < j.getRowCount(); i++){
            boolean b = (boolean) j.getValueAt(i,j.getColumnCount()-1);
            if(b){
                ((DefaultTableModel)j.getModel()).removeRow(i);
            }
        }
    }
}
