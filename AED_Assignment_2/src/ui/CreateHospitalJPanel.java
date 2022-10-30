/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Hospital;
import model.HospitalDirectory;

/**
 *
 * @author mohitha
 */
public class CreateHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHospitalJPanel
     */
    HospitalDirectory hospitalDirectory;

    public CreateHospitalJPanel(HospitalDirectory hospitalDirectory) {
        initComponents();
        this.hospitalDirectory = hospitalDirectory;
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
        splitWorkspace = new javax.swing.JPanel();
        employeeId = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        txtCityName = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        txtCommunityName = new javax.swing.JTextField();
        createEmployeeLabel = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        employeeId1 = new javax.swing.JLabel();

        splitWorkspace.setBackground(new java.awt.Color(204, 204, 255));

        employeeId.setText("Community Name:");

        save.setBackground(new java.awt.Color(255, 119, 0));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Register");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });

        name.setText("City Name:");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        txtCommunityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityNameActionPerformed(evt);
            }
        });

        createEmployeeLabel.setBackground(new java.awt.Color(153, 153, 153));
        createEmployeeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createEmployeeLabel.setForeground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel.setText("Create Hospital");
        createEmployeeLabel.setToolTipText("To create new employee");

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        employeeId1.setText("Hospital Name:");

        javax.swing.GroupLayout splitWorkspaceLayout = new javax.swing.GroupLayout(splitWorkspace);
        splitWorkspace.setLayout(splitWorkspaceLayout);
        splitWorkspaceLayout.setHorizontalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(employeeId1)
                .addGap(18, 18, 18)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addComponent(reset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addContainerGap(466, Short.MAX_VALUE))
            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(createEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(splitWorkspaceLayout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(employeeId, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        splitWorkspaceLayout.setVerticalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeId1)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(reset))
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name)
                        .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(employeeId)
                        .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(453, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(splitWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(splitWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        //Reset validation
        //        valName.setText("");
        //        valEmployeeId.setText("");
        //        valDate.setText("");
        //        valTeamInfo.setText("");
        //        valCellPhoneNumber.setText("");
        //        valEmailAddress.setText("");
        //        valPhoto.setText("");
        //        if(validation()){
        String cityName = txtCityName.getText();
        String communityName = txtCommunityName.getText();
        String hospitalName = txtHospitalName.getText();

        Hospital h = new Hospital(hospitalName, communityName, cityName);

        hospitalDirectory.add(h);
        JOptionPane.showMessageDialog(this, "New Hospital Details was created ! ");
        txtCityName.setText("");
        txtCommunityName.setText("");
        txtHospitalName.setText("");

        //    }
    }//GEN-LAST:event_saveActionPerformed

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtCityName.setText("");
        txtCommunityName.setText("");

        txtHospitalName.setText("");

        //Reset validation
        //        valName.setText("");
        //        valEmployeeId.setText("");
        //        valDate.setText("");
        //        valTeamInfo.setText("");
        //        valCellPhoneNumber.setText("");
        //        valEmailAddress.setText("");
        //        valPhoto.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void txtCommunityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityNameActionPerformed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createEmployeeLabel;
    private javax.swing.JLabel employeeId;
    private javax.swing.JLabel employeeId1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JPanel splitWorkspace;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtHospitalName;
    // End of variables declaration//GEN-END:variables
}
