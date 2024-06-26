/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.movago.forms;

import com.movago.MainForm;
import com.movago.Message;
import com.movago.User;
import com.movago.connection.DatabaseConnection;
import com.movago.helper.ButtonActions;
import com.movago.startFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Arca
 */
public class MessagesFrame extends javax.swing.JFrame {
    MainForm mainForm;
    User user;
    /**
     * Creates new form MessagesFrame
     */
    public MessagesFrame(User user, MainForm mainForm) {
        this.user = user;
        this.mainForm = mainForm;
        initComponents();
        nameLabel.setText("Username: " + user.getUserName());
        retrieveReceivers();
        String photoUrl = user.getPhotoString();
        String htmlContent = "<html><p><img src="+ photoUrl+" \n" +
"        width = \"100\" height = \"100\"alt=\"\" /></p></html>";
        
        
        if (isValidURL(photoUrl)) {
            photoLabel.setText(htmlContent);
        } else {
            // Handle the case where the photo URL is invalid
            System.out.println("Invalid photo URL: " + photoUrl);
        }

        


        

        
    }
    
    public MessagesFrame(){
        initComponents();
        retrieveReceivers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftSidePanel = new javax.swing.JPanel();
        logoHomeButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        receiversjPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        receiverNameLabel = new javax.swing.JLabel();
        textField = new javax.swing.JTextField();
        sendMessageButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        ratioLabel = new javax.swing.JLabel();
        photoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logoHomeButton.setText("Voyago");
        logoHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoHomeButtonActionPerformed(evt);
            }
        });

        nameLabel.setText("test");

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arca\\Belgeler\\NetBeansProjects\\movago\\src\\main\\java\\com\\movago\\img\\Logout Rounded Left.png")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        receiversjPanel.setMaximumSize(new java.awt.Dimension(225, 50));
        receiversjPanel.setMinimumSize(new java.awt.Dimension(225, 50));
        receiversjPanel.setPreferredSize(new java.awt.Dimension(225, 50));
        receiversjPanel.setLayout(new javax.swing.BoxLayout(receiversjPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(receiversjPanel);

        receiverNameLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N

        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        sendMessageButton.setText("-->");
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

        GridBagConstraints gbc = new GridBagConstraints();
        jPanel1.setLayout(new java.awt.GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        jPanel1.add(nameLabel, gbc);
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(receiverNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ratioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ratioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiverNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout leftSidePanelLayout = new javax.swing.GroupLayout(leftSidePanel);
        leftSidePanel.setLayout(leftSidePanelLayout);
        leftSidePanelLayout.setHorizontalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSidePanelLayout.createSequentialGroup()
                        .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftSidePanelLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logoHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(leftSidePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(leftSidePanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftSidePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftSidePanelLayout.setVerticalGroup(
            leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSidePanelLayout.createSequentialGroup()
                .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSidePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(leftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logoHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftSidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftSidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private boolean isValidURL(String url) {
        try {
            new URL(url).toURI();
            return true;
        } catch (MalformedURLException | URISyntaxException e) {
            return false;
        }
    }
    
    public void retrieveReceivers() {
        try (Connection con = DatabaseConnection.getDataSource().getConnection();
                Statement s = con.createStatement();) {
            String sql = "SELECT username FROM movago.usertable";
            ResultSet rs = s.executeQuery(sql);

            receiversjPanel.removeAll(); // Clear existing buttons before adding new ones

            while (rs.next()) {
                String username = rs.getString("username");

                JButton j = new JButton(username);
                Dimension buttonSize = new Dimension(225, 50);
                j.setMinimumSize(buttonSize);
                j.setPreferredSize(buttonSize);
                j.setMaximumSize(buttonSize);
                j.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        receiverNameLabel.setText(username);
                        ratioLabel.setText("" + findRatio(user.getUserName(), username));
                        displayMessages(username);
                        System.out.println(username);
                        textField.setText("");
                        jPanel1.validate();
                        jPanel1.repaint();
                    }
                });
                receiversjPanel.add(j);
            }

            receiversjPanel.revalidate(); // Refresh the panel layout
            receiversjPanel.repaint(); // Repaint the panel to show new buttons

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void displayMessages(String receiverName){
        jPanel1.removeAll();
        ArrayList<Message> messages = new ArrayList<>();
        try {
            Connection con = DatabaseConnection.getDataSource().getConnection();
            Statement s = con.createStatement();
            String sql = "SELECT sender, receiver, message FROM movago.messagetable " +
                         "WHERE (sender = '" + user.getUserName() + "' AND receiver = '" + receiverName + "') " +
                         "OR (receiver = '" + user.getUserName() + "' AND sender = '" + receiverName + "') " +
                         "ORDER BY timestamp ASC";
            System.out.println(receiverName);
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                Message message = new Message(rs.getString("sender"), rs.getString("receiver"), rs.getString("message"));
                messages.add(message);
            }
            
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.insets = new Insets(5, 5, 5, 5); // Padding
            
            for (Message m : messages) {
                String text = m.getSender() + ": " + m.getMessageText();
                JLabel label = new JLabel(text);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // For visibility
                label.setPreferredSize(new Dimension(800,50)); // Initial size
                
                
                if (m.getSender().equals(user.getUserName())) {
                    label.setHorizontalAlignment(SwingConstants.RIGHT); // Align to the right for even indices
                } else {
                    label.setHorizontalAlignment(SwingConstants.LEFT); // Align to the left for odd indices
                }

                jPanel1.add(label, gbc);
                gbc.gridy++;
            }
            

  
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public int findRatio(String user, String usertwo) {
        int ratio = 58;
        try (Connection con = DatabaseConnection.getDataSource().getConnection();
             Statement s = con.createStatement()) {
            String sql = "SELECT ratio FROM movago.ratio_table WHERE (user = '"+user+"' AND usertwo = '"+usertwo+"') OR (user = '"+usertwo+"' AND usertwo = '"+user+"')";
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) { // Move cursor to first row
                ratio = rs.getInt("ratio");
                System.out.println(ratio);
            } else {
                System.out.println("No ratio found for the given users.");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return ratio;
    }

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        startFrame startFrame = new startFrame();
        startFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void logoHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoHomeButtonActionPerformed
        mainForm.displayForm(new homePanel(user, mainForm));
    }//GEN-LAST:event_logoHomeButtonActionPerformed

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        ButtonActions bAction = new ButtonActions();
        bAction.sendMessage(textField, user, receiverNameLabel);
        displayMessages(receiverNameLabel.getText());
        textField.setText("");
        
    }//GEN-LAST:event_sendMessageButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(MessagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessagesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessagesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel leftSidePanel;
    private javax.swing.JButton logoHomeButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel ratioLabel;
    private javax.swing.JLabel receiverNameLabel;
    private javax.swing.JPanel receiversjPanel;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
