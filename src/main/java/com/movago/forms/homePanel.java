/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.movago.forms;

import com.movago.FormManager;
import com.movago.MainForm;
import com.movago.User;
import com.movago.connection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Arca
 */
public class homePanel extends javax.swing.JPanel {
    User user;
    String ownerUserName;

    /**
     * Creates new form homePanel
     */
    public homePanel() {
        try {
        initComponents();
        Connection con = DatabaseConnection.getDataSource().getConnection();
        String tripSQL = "SELECT title, budget, date FROM movago.triptable";
        String warningMessage = "";
        
        PreparedStatement p = con.prepareStatement(tripSQL);
        ResultSet rs = p.executeQuery();
        
        while (rs.next()) {
            // title, budget, and date are columns in the table
            String title = rs.getString("title");
            double budget = rs.getDouble("budget");
            String date = rs.getString("date");
            this.ownerUserName = rs.getString("ownerUserName");
            
            // filling textFields with retrieved data
            titleEditable.setText(title);
            budgetEditable.setText(budget + "");
            dateEditable.setText(date);
        }
        String photoSQL = "SELECT photoString FROM movago.usertable WHERE username = '"+ownerUserName+"'";
        p = con.prepareStatement(photoSQL);
        rs = p.executeQuery();
        
        while(rs.next()){
            photoLabel.setText("<html><p><img src="+ rs.getString("photoString") +" \n" +
"        width = \"100\" height = \"100\"alt=\"\" /></p></html>");
        }
        
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public homePanel(User user, MainForm mainForm) {
        this.user = user;
        try {
        initComponents();
        Connection con = DatabaseConnection.getDataSource().getConnection();
        String sql = "SELECT title, budget, date, ownerUserName FROM movago.triptable ORDER BY RAND() LIMIT 1";

        String warningMessage = "";
        
        PreparedStatement p = con.prepareStatement(sql);
        ResultSet rs = p.executeQuery();
        
        while (rs.next()) {
            // title, budget, and date are columns in the table
            String title = rs.getString("title");
            double budget = rs.getDouble("budget");
            String date = rs.getString("date");
            this.ownerUserName = rs.getString("ownerUserName");
            
            // filling textFields with retrieved data
            titleEditable.setText(title);
            budgetEditable.setText(budget + "");
            dateEditable.setText(date);
        }
        String photoSQL = "SELECT photoString FROM movago.usertable WHERE username = '"+ownerUserName+"'";
        p = con.prepareStatement(photoSQL);
        rs = p.executeQuery();
        
        while(rs.next()){
            photoLabel.setText("<html><p><img src="+ rs.getString("photoString") +" \n" +
"        width = \"100\" height = \"100\"alt=\"\" /></p></html>");
        }
            
        } catch (SQLException e) {
            System.out.println(e);
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

        createATripButton = new javax.swing.JButton();
        joinATripButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titleEditable = new javax.swing.JLabel();
        budgetEditable = new javax.swing.JLabel();
        dateEditable = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        createATripButton.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        createATripButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arca\\Belgeler\\NetBeansProjects\\movago\\src\\main\\java\\com\\movago\\img\\Create.png")); // NOI18N
        createATripButton.setText("Create a Trip");
        createATripButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createATripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createATripButtonActionPerformed(evt);
            }
        });

        joinATripButton.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        joinATripButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arca\\Belgeler\\NetBeansProjects\\movago\\src\\main\\java\\com\\movago\\img\\Join.png")); // NOI18N
        joinATripButton.setText("Join a Trip");
        joinATripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinATripButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel1.setText("Budget: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 68, 26));

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel2.setText("Title:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 68, 26));

        jLabel3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel3.setText("Start Date:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 68, 26));
        jPanel1.add(titleEditable, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 38, 403, -1));
        jPanel1.add(budgetEditable, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 97, 403, -1));
        jPanel1.add(dateEditable, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 151, 403, -1));
        jPanel1.add(photoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 150, 150));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OUR CHOICE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createATripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(joinATripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createATripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joinATripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createATripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createATripButtonActionPerformed
        MainForm mainForm = FormManager.getMainFormInstance();
        mainForm.displayForm(new createTripForm(user,mainForm));
    }//GEN-LAST:event_createATripButtonActionPerformed

    private void joinATripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinATripButtonActionPerformed
        MainForm mainForm = FormManager.getMainFormInstance();
        mainForm.displayForm(new joinATripA(user, mainForm));
    }//GEN-LAST:event_joinATripButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel budgetEditable;
    private javax.swing.JButton createATripButton;
    private javax.swing.JLabel dateEditable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton joinATripButton;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel titleEditable;
    // End of variables declaration//GEN-END:variables
}
