
package form;
import javax.swing.*;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRender2 extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent (JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1){
            Component com = super.getTableCellRendererComponent (jtable, o, bln, bln1, i, i1);
            
            PanelAction2 action = new PanelAction2();
            return action;
    }
}
