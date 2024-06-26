/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.movago.forms;

import com.movago.MainForm;
import com.movago.Trip;
import com.movago.User;
import com.movago.connection.DatabaseConnection;
import com.movago.helper.RatioManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Arca
 */
public class TripPage extends javax.swing.JPanel {
    Trip trip;
    User user;
    String receiverName;
    String receiverBio;
    String receiverPhotoString;
    MainForm mainform;
    
    /**
     * Creates new form TripPage
     */
    public TripPage(Trip trip, User user, MainForm mainForm) {
        this.trip = trip;
        this.user = user;
        this.mainform = mainForm;
        findReceiverUser(trip);
        
        RatioManager rm = new RatioManager();
        int ratio = rm.calculateRatio(user.getUserName(), receiverName);

        
        
       
        
        
        
        String html = "<table style=\"height: 177px; width: 99.0683%; border-collapse: collapse; border-style: dotted; float: left;\" border=\"1\">\n" +
"<tbody>\n" +
"<tr style=\"height: 177px;\">\n" +
"<td style=\"width: 73.3194%; height: 177px;\">"+receiverBio+"</td>\n" +
"<td style=\"width: 48.9028%; height: 177px;\">\n" +
"<img src=\""+receiverPhotoString+"\" alt=\"\" width=\"169\" height=\"169\" /> <p>Name:&nbsp;"+receiverName+" </p><p> Matching Ratio: "+ratio+"</p>\n" +
"</td>\n" +
"</tr>\n" +
"</tbody>\n" +
"</table>\n" +
"<p style=\"text-align: center;\"><strong>"+trip.getFrom()+"</strong>&nbsp; &nbsp; ✈&nbsp; &nbsp; <strong>Arrival: "+trip.getCity()+"</strong>&nbsp; &nbsp; ✈&nbsp; &nbsp; <strong>Arrival: "+trip.getCity2()+"&nbsp;</strong>&nbsp; &nbsp;✈&nbsp; &nbsp;<strong>Final Destination: "+trip.getCity3()+"</strong></p>\n" +
"<p style=\"text-align: left;\">&nbsp;</p>\n" +
"<ul>\n" +
"<li style=\"text-align: left;\"><strong>&nbsp; &nbsp; "+trip.getCity()+":</strong>\n" +
"<ul>\n" +
"<li style=\"text-align: left;\">"+trip.getAccommodation()+" / "+trip.getfirstDate()+" - "+trip.getDate()+"</li>\n" +
"<li style=\"text-align: left;\">Budget: "+trip.getBudget()+"</li>\n" +
"</ul>\n" +
"</li>\n" +
"</ul>\n" +
"<p>&nbsp;</p>\n" +
"<ul>\n" +
"<li>&nbsp;<strong> &nbsp; "+trip.getCity2()+":</strong>\n" +
"<ul>\n" +
"<li>"+trip.getAccommodation2()+" / "+trip.getDate()+" - "+trip.getDate2()+"</li>\n" +
"<li>Budget: "+trip.getBudget2()+"</li>\n" +
"</ul>\n" +
"</li>\n" +
"</ul>\n" +
"<p>&nbsp;</p>\n" +
"<ul>\n" +
"<li>&nbsp; &nbsp; <strong>"+trip.getCity3()+":</strong>\n" +
"<ul>\n" +
"<li>"+trip.getAccommodation3()+" / "+trip.getDate2()+"- "+trip.getDate3()+"/li>\n" +
"<li>Budget: "+trip.getBudget3()+"</li>\n" +
"</ul>\n" +
"</li>\n" +
"</ul>\n" +
"<p>&nbsp;</p>\n" +
"<p><strong>Total Budget: "+trip.getTotalBudget()+"</strong></p>";
        
        initComponents();
        jTextPane1.setContentType("text/html");
        jTextPane1.setText(html);
        enrollTrip.setText(trip.getcurrentCount() + " / " + trip.getParticipantsLimit());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        enrollTrip = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText(trip.getTitle());

        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jTextPane1.setHighlighter(null);
        jScrollPane1.setViewportView(jTextPane1);

        enrollTrip.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        enrollTrip.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arca\\Belgeler\\NetBeansProjects\\movago\\src\\main\\java\\com\\movago\\img\\Travel Diary.png")); // NOI18N
        enrollTrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollTripActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arca\\Belgeler\\NetBeansProjects\\movago\\src\\main\\java\\com\\movago\\img\\People.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enrollTrip, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enrollTrip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void findReceiverUser(Trip trip){
        try {
            Connection con = DatabaseConnection.getDataSource().getConnection();
            Statement s = con.createStatement();
            String sql = "SELECT * FROM movago.usertable WHERE username = '"+trip.getOwnerName()+"'";
            ResultSet rs = s.executeQuery(sql);
            
            while(rs.next()){
                receiverName = rs.getString("username");
                receiverBio = rs.getString("bio");
                receiverPhotoString = rs.getString("photoString");
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private void enrollTripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollTripActionPerformed
        try (Connection con = DatabaseConnection.getDataSource().getConnection();
                Statement s = con.createStatement();){
            
            if(trip.getcurrentCount() < trip.getParticipantsLimit()){
                int currentCount = trip.getcurrentCount() + 1;
                String sql = "INSERT INTO movago.participant_table (username, triptitle) VALUES ('"+user.getUserName()+"', '"+trip.getTitle()+"')";
                s.executeUpdate(sql);
                s.executeUpdate("UPDATE movago.triptable set currentCount = '"+ currentCount +"' WHERE title = '"+trip.getTitle()+"'");
                enrollTrip.setText(trip.getcurrentCount() + " / " + trip.getParticipantsLimit());
                JOptionPane.showMessageDialog(jTextPane1, "You enrolled to this trip. Have fun");
                
            }
            else{
                JOptionPane.showMessageDialog(jTextPane1, "This trip's capacity is full.");
            }
                    
            
      } catch (SQLException e) {
          JOptionPane.showMessageDialog(jTextPane1, "You already enrolled to this trip.");
          System.out.println(e);
        }
    }//GEN-LAST:event_enrollTripActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        seeOthersForm smForm = new seeOthersForm(user, trip, mainform);
        mainform.displayForm(smForm);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton enrollTrip;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
