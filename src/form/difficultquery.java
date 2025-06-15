/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.Date;
import java.sql.*;
import javax.swing.table.TableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
public class difficultquery extends javax.swing.JFrame {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    private int difficult;
    public difficultquery(int query) {
        this.difficult = query;
        ImageIcon logo = new ImageIcon("C:\\Users\\Abram\\Documents\\2nd Sem (2nd Year College)\\Information Management\\Java\\updated 4.0-20240705T234047Z-001\\updated 4.0\\Form\\src\\resources\\sss logo.png");
        Image resizedLogo = logo.getImage().getScaledInstance(350, 240, java.awt.Image.SCALE_SMOOTH);
        setIconImage(resizedLogo);
        initComponents();
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/im-group1", "root", "password");
            st = con.createStatement();
            
            if(difficult == 1){
                jLabel1.setText("Query 1 (Difficult)");
                jTextArea1.setText("SELECT a.SSSNumber, a.Name, b.BenRelationship, COUNT(*) AS RecordCount\n" +
                                "FROM applicant a, beneficiaries b\n" +
                                "WHERE a.SSSNumber = b.SSSNumber AND b.BenRelationship IN ('Child', 'Father')\n" +
                                "GROUP BY a.SSSNumber, a.Name, b.BenRelationship;");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnIdentifiers(new String[] {"SSS Number", "Applicant Name", "Relationship of Beneficiary", "Number of Beneficiaries (Children or Father)"});
                setColumnWidthByName(jTable1, "Number of Beneficiaries (Children or Father)", 150);
                
                String query1 = "SELECT a.SSSNumber, a.Name, b.BenRelationship, COUNT(*) AS RecordCount\n" +
                                "FROM applicant a, beneficiaries b\n" +
                                "WHERE a.SSSNumber = b.SSSNumber AND b.BenRelationship IN ('Child', 'Father')\n" +
                                "GROUP BY a.SSSNumber, a.Name, b.BenRelationship";
                rs = st.executeQuery(query1);
                while (rs.next()) {
                    int sssnum = rs.getInt("a.SSSNumber");
                    String name = rs.getString("Name");
                    String relationship = rs.getString("BenRelationship");
                    int count = rs.getInt("RecordCount");
                    Object[] data = {sssnum, name, relationship, count};
                    model.addRow(data);
                }
            }
            else if (difficult == 2){
                jLabel1.setText("Query 2 (Difficult)");
                jTextArea1.setText("SELECT Sex, COUNT(*) AS RecordCount\n" +
                                "FROM applicant a, beneficiaries b\n" +
                                "WHERE a.SSSNumber = b.SSSNumber\n" +
                                "GROUP BY Sex;");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnIdentifiers(new String[] {"Sex", "Number of Beneficiaries"});
                
                String query1 = "SELECT Sex, COUNT(*) AS RecordCount\n" +
                                "FROM applicant a, beneficiaries b\n" +
                                "WHERE a.SSSNumber = b.SSSNumber\n" +
                                "GROUP BY Sex";
                rs = st.executeQuery(query1);
                while (rs.next()) {
                    String sex = rs.getString("Sex");
                    int count = rs.getInt("RecordCount");
                    Object[] data = {sex, count};
                    model.addRow(data);
                }
            }
            else if (difficult == 3){
                jLabel1.setText("Query 3 (Difficult)");
                jTextArea1.setText("SELECT DAY(b.BenBirthday) AS DayBirth, COUNT(*) AS RecordCount\n" +
                                "FROM applicant a, beneficiaries b\n" +
                                "WHERE a.SSSNumber = b.SSSNumber AND DAY(b.BenBirthday) <= 15\n" +
                                "GROUP BY DayBirth\n" +
                                "HAVING RecordCount < 3\n" +
                                "ORDER BY DayBirth DESC;");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnIdentifiers(new String[] {"Day of Birth", "Number of Beneficiaries (Birthdays =< 15)"});
                setColumnWidthByName(jTable1, "Number of Beneficiaries (Birthdays =< 15)", 150);
                
                String query1 = "SELECT DAY(b.BenBirthday) AS DayBirth, COUNT(*) AS RecordCount\n" +
                                "FROM applicant a, beneficiaries b\n" +
                                "WHERE a.SSSNumber = b.SSSNumber AND DAY(b.BenBirthday) <= 15\n" +
                                "GROUP BY DayBirth\n" +
                                "HAVING RecordCount < 3\n" +
                                "ORDER BY DayBirth DESC";
                rs = st.executeQuery(query1);
                while (rs.next()) {
                    int day = rs.getInt("DayBirth");
                    int count = rs.getInt("RecordCount");
                    Object[] data = {day, count};
                    model.addRow(data);
                }
            }
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
    
    public static void setColumnWidthByName(JTable table, String columnName, int width) {
        for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
            TableColumn column = table.getColumnModel().getColumn(i);
            if (column.getHeaderValue().toString().equals(columnName)) {
                column.setPreferredWidth(width);
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Difficult Query");

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Query # (Difficult)");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(51, 153, 255));
        jTable1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(204, 255, 255));
        jTable1.setRowHeight(45);
        jTable1.setSelectionBackground(new java.awt.Color(0, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 255));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("SQL Codes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        difficult difficultFrame = new difficult();
        difficultFrame.setVisible(true); 
        difficultFrame.pack();
        difficultFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(difficultquery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(difficultquery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(difficultquery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(difficultquery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new difficultquery(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
