
package form;
import javax.swing.*;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRender1 extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent (JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1){
            Component com = super.getTableCellRendererComponent (jtable, o, bln, bln1, i, i1);
            
            PanelAction1 action = new PanelAction1();
            return action;
    }
}
