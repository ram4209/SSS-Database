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
public class moderatequery extends javax.swing.JFrame {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    private int moderate;
    public moderatequery(int query) {
        this.moderate = query;
        ImageIcon logo = new ImageIcon("C:\\Users\\Abram\\Documents\\2nd Sem (2nd Year College)\\Information Management\\Java\\updated 4.0-20240705T234047Z-001\\updated 4.0\\Form\\src\\resources\\sss logo.png");
        Image resizedLogo = logo.getImage().getScaledInstance(350, 240, java.awt.Image.SCALE_SMOOTH);
        setIconImage(resizedLogo);
        initComponents();
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/im-group1", "root", "password");
            st = con.createStatement();
            
            if(moderate == 1){
                jLabel1.setText("Query 1 (Moderate)");
                jTextArea1.setText("SELECT Nationality, COUNT(*) AS RecordCount\n" +
                                    "FROM applicant\n" +
                                    "WHERE CivilStatus = 'Single'\n" +
                                    "GROUP BY Nationality\n" +
                                    "ORDER BY RecordCount DESC;");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnIdentifiers(new String[] {"Nationality", "Number of Records (Single Applicants)"});
                
                String query1 = "SELECT Nationality, COUNT(*) AS RecordCount\n" +
                                "FROM applicant\n" +
                                "WHERE CivilStatus = 'Single'\n" +
                                "GROUP BY Nationality\n" +
                                "ORDER BY RecordCount DESC;";
                rs = st.executeQuery(query1);
                while (rs.next()) {
                    String nationality = rs.getString("Nationality");
                    int count = rs.getInt("RecordCount");
                    Object[] data = {nationality, count};
                    model.addRow(data);
                }
                
            }
            else if (moderate == 2){
                jLabel1.setText("Query 2 (Moderate)");
                jTextArea1.setText("SELECT BenRelationship, COUNT(*) AS RecordCount\n" +
                                "FROM beneficiaries\n" +
                                "GROUP BY BenRelationship\n" +
                                "HAVING COUNT(*) >= 5;");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnIdentifiers(new String[] {"Relationship", "Number of Beneficiaries"});
                
                String query1 = "SELECT BenRelationship, COUNT(*) AS RecordCount\n" +
                                "FROM beneficiaries\n" +
                                "GROUP BY BenRelationship\n" +
                                "HAVING RecordCount >= 5";
                rs = st.executeQuery(query1);
                while (rs.next()) {
                    String relationship = rs.getString("BenRelationship");
                    int count = rs.getInt("RecordCount");
                    Object[] data = {relationship, count};
                    model.addRow(data);
                }
            }
            else if (moderate == 3){
                jLabel1.setText("Query 3 (Moderate)");
                jTextArea1.setText("SELECT CivilStatus, Sex, COUNT(*) AS RecordCount\n" +
                                "FROM applicant\n" +
                                "WHERE sex = 'Male'\n" +
                                "GROUP BY CivilStatus, Sex\n" +
                                "HAVING COUNT(*) >= 5;");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnIdentifiers(new String[] {"Civil Status", "Sex", "Number of Male Applicants"});
                
                String query1 = "SELECT CivilStatus, Sex, COUNT(*) AS RecordCount\n" +
                                "FROM applicant\n" +
                                "WHERE sex = 'Male'\n" +
                                "GROUP BY CivilStatus, Sex\n" +
                                "HAVING RecordCount >= 5";
                rs = st.executeQuery(query1);
                while (rs.next()) {
                    String cv = rs.getString("CivilStatus");
                    String sex = rs.getString("Sex");
                    int count = rs.getInt("RecordCount");
                    Object[] data = {cv, sex, count};
                    model.addRow(data);
                }
                
            }
            else if (moderate == 4){
                jLabel1.setText("Query 4 (Moderate)");
                jTextArea1.setText("SELECT MONTH(BenBirthday) AS BirthMonth, COUNT(*) AS RecordCount\n" +
                                "FROM beneficiaries\n" +
                                "WHERE MONTH(BenBirthday) IN (2, 4, 6, 8, 10, 12)\n" +
                                "GROUP BY BirthMonth\n" +
                                "ORDER BY BirthMonth;");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setColumnIdentifiers(new String[] {"Beneficiary Birth Month", "Number of Beneficiaries (Birthday on Even Months)"});
                
                String query1 = "SELECT MONTH(BenBirthday) AS BirthMonth, COUNT(*) AS RecordCount\n" +
                                "FROM beneficiaries\n" +
                                "WHERE MONTH(BenBirthday) IN (2, 4, 6, 8, 10, 12)\n" +
                                "GROUP BY BirthMonth\n" +
                                "ORDER BY BirthMonth";
                rs = st.executeQuery(query1);
                while (rs.next()) {
                    int month = rs.getInt("BirthMonth");
                    int count = rs.getInt("RecordCount");
                    Object[] data = {month, count};
                    model.addRow(data);
                }
            }
            
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
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
        setTitle("Moderate Query");

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Query # (Moderate)");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
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
        moderate moderateFrame = new moderate();
        moderateFrame.setVisible(true); 
        moderateFrame.pack();
        moderateFrame.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(moderatequery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moderatequery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moderatequery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moderatequery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moderatequery(0).setVisible(true);
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
