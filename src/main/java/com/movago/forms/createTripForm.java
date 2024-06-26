/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.movago.forms;

import com.movago.MainForm;
import com.movago.User;
import com.movago.helper.ButtonActions;
import java.text.SimpleDateFormat;
import java.sql.Date;

/**
 *
 * @author Arca
 */
public class createTripForm extends javax.swing.JPanel {
    User user;
    MainForm mainform;
    /**
     * Creates new form createTripForm
     */
    public createTripForm() {
        initComponents();
    }
    public createTripForm(User user, MainForm mainform) {
        this.user = user;
        this.mainform = mainform;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cityCountButtonGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        participantsCountLabel = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        participantsCountComboBox = new javax.swing.JComboBox<>();
        fromLabel = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        city1 = new javax.swing.JRadioButton();
        city2 = new javax.swing.JRadioButton();
        city3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cityTextField2 = new javax.swing.JTextField();
        cityTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        budgetTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        accomodationJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cityTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        budgetTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        accomodation2JTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        budgetTextField3 = new javax.swing.JTextField();
        accomodation3JTextField = new javax.swing.JTextField();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        firstDateChooser = new com.toedter.calendar.JDateChooser();
        createTripButton = new javax.swing.JButton();

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane1.setHorizontalScrollBar(null);

        TitleLabel.setText("Title:");

        participantsCountLabel.setText("Participants Count:");

        titleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextFieldActionPerformed(evt);
            }
        });

        participantsCountComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        participantsCountComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participantsCountComboBoxActionPerformed(evt);
            }
        });

        fromLabel.setText("From:");

        fromTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("City Count:");

        cityCountButtonGroup.add(city1);
        city1.setText("1");
        city1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city1ActionPerformed(evt);
            }
        });

        cityCountButtonGroup.add(city2);
        city2.setText("2");
        city2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city2ActionPerformed(evt);
            }
        });

        cityCountButtonGroup.add(city3);
        city3.setText("3");
        city3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city3ActionPerformed(evt);
            }
        });

        jLabel2.setText("First City:");

        cityTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextField2ActionPerformed(evt);
            }
        });

        cityTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Accomodation:");

        jLabel4.setText("Date:");

        jLabel5.setText("Budget:");

        accomodationJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accomodationJTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Second City:");

        jLabel15.setText("Third City:");

        cityTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextField3ActionPerformed(evt);
            }
        });

        jLabel16.setText("Budget:");

        jLabel17.setText("Date:");

        jLabel18.setText("Accomodation:");

        jLabel20.setText("Date:");

        jLabel22.setText("Accomodation:");

        jLabel23.setText("Budget:");

        createTripButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arca\\Belgeler\\NetBeansProjects\\movago\\src\\main\\java\\com\\movago\\img\\Bookmark.png")); // NOI18N
        createTripButton.setText("Create");
        createTripButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTripButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(firstDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(city1)
                                    .addGap(18, 18, 18)
                                    .addComponent(city2)
                                    .addGap(18, 18, 18)
                                    .addComponent(city3))
                                .addComponent(accomodationJTextField)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(cityTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(132, 132, 132))
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(budgetTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cityTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cityTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(budgetTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(accomodation2JTextField))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(participantsCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(participantsCountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(budgetTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accomodation3JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createTripButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(participantsCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(participantsCountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(city1)
                    .addComponent(city2)
                    .addComponent(city3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cityTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accomodationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(budgetTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accomodation2JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(budgetTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accomodation3JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(budgetTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(createTripButton)
                .addGap(291, 291, 291))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextField3ActionPerformed

    private void accomodationJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accomodationJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accomodationJTextFieldActionPerformed

    private void cityTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextField1ActionPerformed

    private void cityTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextField2ActionPerformed

    }//GEN-LAST:event_cityTextField2ActionPerformed

    private void city3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city3ActionPerformed

    }//GEN-LAST:event_city3ActionPerformed

    private void city2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city2ActionPerformed
        cityTextField2.setVisible(city2.isSelected());
    }//GEN-LAST:event_city2ActionPerformed

    private void city1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city1ActionPerformed

    }//GEN-LAST:event_city1ActionPerformed

    private void fromTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromTextFieldActionPerformed

    private void titleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTextFieldActionPerformed

    private void createTripButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTripButtonActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        String titleString = titleTextField.getText();
        double participantsCount = Double.parseDouble(participantsCountComboBox.getSelectedItem().toString());
        String fromString = fromTextField.getText();
        String firstCityString = cityTextField1.getText();
        String secondCityString = cityTextField2.getText();
        String thirdCityString = cityTextField3.getText();
        String accomodationString = accomodationJTextField.getText();
        String accomodation2String = accomodation2JTextField.getText();
        String accomodation3String = accomodation3JTextField.getText();
        
        
        
        java.util.Date firstDate = firstDateChooser.getDate();
        Date sqlfirstDate = new java.sql.Date(firstDate.getTime());
        
        java.util.Date date2 = jDateChooser2.getDate();
        Date sqlDate2 = new java.sql.Date(date2.getTime());
        
        java.util.Date date = jDateChooser1.getDate();
        Date sqlDate = new java.sql.Date(date.getTime());
        
        java.util.Date date3 = jDateChooser3.getDate();
        Date sqlDate3 = new java.sql.Date(date3.getTime());
        
        long budget = 0;
        long budget2 = 0;
        long budget3 = 0;

        if (!budgetTextField1.getText().isEmpty()) {
            budget = Long.parseLong(budgetTextField1.getText());
        }
        if (!budgetTextField2.getText().isEmpty()) {
            budget2 = Long.parseLong(budgetTextField2.getText());
        }
        if(!budgetTextField3.getText().isEmpty()){
            budget3 = Long.parseLong(budgetTextField3.getText());
        }
        ButtonActions bAction = new ButtonActions();
        bAction.createTripAction(titleString,user.getUserName(), participantsCount, fromString, firstCityString, secondCityString, thirdCityString, accomodationString, accomodation2String, accomodation3String, sqlfirstDate, sqlDate, sqlDate2, sqlDate3, budget, budget2, budget3, this, mainform, user);
        //bAction.createTripAction(titleString, PROPERTIES, titleString, titleString, titleString, titleString, titleString, titleString, titleString, titleString, titleString, titleString, titleString, HEIGHT, WIDTH, WIDTH, this);     
    }//GEN-LAST:event_createTripButtonActionPerformed

    private void participantsCountComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participantsCountComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participantsCountComboBoxActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField accomodation2JTextField;
    private javax.swing.JTextField accomodation3JTextField;
    private javax.swing.JTextField accomodationJTextField;
    private javax.swing.JTextField budgetTextField1;
    private javax.swing.JTextField budgetTextField2;
    private javax.swing.JTextField budgetTextField3;
    private javax.swing.JRadioButton city1;
    private javax.swing.JRadioButton city2;
    private javax.swing.JRadioButton city3;
    private javax.swing.ButtonGroup cityCountButtonGroup;
    private javax.swing.JTextField cityTextField1;
    private javax.swing.JTextField cityTextField2;
    private javax.swing.JTextField cityTextField3;
    private javax.swing.JButton createTripButton;
    private com.toedter.calendar.JDateChooser firstDateChooser;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JTextField fromTextField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> participantsCountComboBox;
    private javax.swing.JLabel participantsCountLabel;
    private javax.swing.JTextField titleTextField;
    // End of variables declaration//GEN-END:variables
}
