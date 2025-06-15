/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import java.sql.Date;
import java.sql.*;
public class record extends javax.swing.JFrame {

    private Connection con;
    private Statement st;
    private ResultSet rs;
    int i = 0;
    public record() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/im-group1", "root", "password");
            st = con.createStatement();
            
            initComponents();

            for (i = 1; i < 11; i++) {
                String query1 = "SELECT SSSNumber, Name FROM extra4 ORDER BY SSSNumber LIMIT " + i ;
                rs = st.executeQuery(query1);
                if(i == 1)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel3.setText(String.valueOf(sssnumber));
                        jTextField6.setText(name);
                    }
                }
                else if(i == 2)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel6.setText(String.valueOf(sssnumber));
                        jTextField9.setText(name);
                    }
                    if(jLabel6.getText().equals(jLabel3.getText())){
                        jLabel6.setVisible(false);
                        jTextField9.setVisible(false);
                        jButton2.setVisible(false);
                    }
                }
                else if(i == 3)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel4.setText(String.valueOf(sssnumber));
                        jTextField13.setText(name);
                    }
                    if(jLabel4.getText().equals(jLabel6.getText())){
                        jLabel4.setVisible(false);
                        jTextField13.setVisible(false);
                        jButton3.setVisible(false);
                    }
                }
                else if(i == 4)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel5.setText(String.valueOf(sssnumber));
                        jTextField14.setText(name);
                    }
                    if(jLabel5.getText().equals(jLabel4.getText())){
                        jLabel5.setVisible(false);
                        jTextField14.setVisible(false);
                        jButton4.setVisible(false);
                    }
                }
                else if(i == 5)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel7.setText(String.valueOf(sssnumber));
                        jTextField15.setText(name);
                    }
                    if(jLabel7.getText().equals(jLabel5.getText())){
                        jLabel7.setVisible(false);
                        jTextField15.setVisible(false);
                        jButton5.setVisible(false);
                    }
                }
                else if(i == 6)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel8.setText(String.valueOf(sssnumber));
                        jTextField16.setText(name);
                    }
                    if(jLabel8.getText().equals(jLabel7.getText())){
                        jLabel8.setVisible(false);
                        jTextField16.setVisible(false);
                        jButton7.setVisible(false);
                    }
                }
                else if(i == 7)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel9.setText(String.valueOf(sssnumber));
                        jTextField17.setText(name);
                    }
                    if(jLabel9.getText().equals(jLabel8.getText())){
                        jLabel9.setVisible(false);
                        jTextField17.setVisible(false);
                        jButton8.setVisible(false);
                    }
                }
                else if(i == 8)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel10.setText(String.valueOf(sssnumber));
                        jTextField18.setText(name);
                    }
                    if(jLabel10.getText().equals(jLabel9.getText())){
                        jLabel10.setVisible(false);
                        jTextField18.setVisible(false);
                        jButton9.setVisible(false);
                    }
                }
                else if(i == 9)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel11.setText(String.valueOf(sssnumber));
                        jTextField19.setText(name);
                    }
                    if(jLabel11.getText().equals(jLabel10.getText())){
                        jLabel11.setVisible(false);
                        jTextField19.setVisible(false);
                        jButton10.setVisible(false);
                    }
                }
                else if(i == 10)
                {
                    while (rs.next()) {
                        int sssnumber = rs.getInt("SSSNumber");
                        String name = rs.getString("Name");
                        jLabel12.setText(String.valueOf(sssnumber));
                        jTextField20.setText(name);
                    }
                    if(jLabel12.getText().equals(jLabel11.getText())){
                        jLabel12.setVisible(false);
                        jTextField20.setVisible(false);
                        jButton11.setVisible(false);
                    }
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
        jLabel2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(910, 720));
        setSize(new java.awt.Dimension(910, 720));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("SSS Number");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Name");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jTextField11.setText("Find a specific record");

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setText("View Information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 255));
        jButton2.setText("View Information");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("View Information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 51, 255));
        jButton4.setText("View Information");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 51, 255));
        jButton5.setText("View Information");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 51, 255));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 255));
        jLabel3.setText("SSS #");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 255));
        jLabel4.setText("SSS #");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 255));
        jLabel5.setText("SSS #");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 255));
        jLabel6.setText("SSS #");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 255, 255));
        jLabel7.setText("SSS #");

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jTextField14.setEditable(false);
        jTextField14.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jTextField15.setEditable(false);
        jTextField15.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jTextField16.setEditable(false);
        jTextField16.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jTextField17.setEditable(false);
        jTextField17.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jTextField18.setEditable(false);
        jTextField18.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jTextField19.setEditable(false);
        jTextField19.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jTextField20.setEditable(false);
        jTextField20.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 255));
        jLabel8.setText("SSS #");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 255));
        jLabel9.setText("SSS #");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 255, 255));
        jLabel10.setText("SSS #");

        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 255));
        jLabel11.setText("SSS #");

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 255));
        jLabel12.setText("SSS #");

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 51, 255));
        jButton7.setText("View Information");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 255, 255));
        jButton8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 51, 255));
        jButton8.setText("View Information");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 255, 255));
        jButton9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 51, 255));
        jButton9.setText("View Information");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 255, 255));
        jButton10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 51, 255));
        jButton10.setText("View Information");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(204, 255, 255));
        jButton11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 51, 255));
        jButton11.setText("View Information");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel3))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addComponent(jButton3)
                                .addComponent(jButton4)
                                .addComponent(jButton5)
                                .addComponent(jButton7)
                                .addComponent(jButton8)
                                .addComponent(jButton9)
                                .addComponent(jButton10)
                                .addComponent(jButton11))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel6)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel4)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jLabel5)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel7)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton7)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton8)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton9)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton10)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButton11)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(57, 57, 57))
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
        int sssnum = Integer.valueOf(jLabel3.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        choose chooseFrame = new choose();
        chooseFrame.setVisible(true); 
        chooseFrame.pack();
        chooseFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        int sssnum = Integer.valueOf(jLabel6.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        int sssnum = Integer.valueOf(jLabel4.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        int sssnum = Integer.valueOf(jLabel5.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        int sssnum = Integer.valueOf(jLabel7.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        int sssnum = Integer.valueOf(jLabel8.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        int sssnum = Integer.valueOf(jLabel9.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        int sssnum = Integer.valueOf(jLabel10.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.dispose();
        int sssnum = Integer.valueOf(jLabel11.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        this.dispose();
        int sssnum = Integer.valueOf(jLabel12.getText());
            
        display displayFrame = new display(sssnum);
        displayFrame.setVisible(true);
        displayFrame.pack();
        displayFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
