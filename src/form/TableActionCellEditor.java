/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.DefaultCellEditor;

public class TableActionCellEditor extends DefaultCellEditor {
    
    private TableActionEvent event;
    public TableActionCellEditor(TableActionEvent event){
        super(new JCheckBox());
        this.event = event;
    }
    
    @Override
    public Component getTableCellEditorComponent (JTable jtable, Object o, boolean bln, int row, int col){ 
        PanelAction action = new PanelAction();
        action.initEvent(event, row);
        return action;  
    }
    
}
