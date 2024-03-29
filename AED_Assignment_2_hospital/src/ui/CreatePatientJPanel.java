/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Patient;
import model.PatientDirectory;

/**
 *
 * @author mohitha
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientJPanel
     */
    
    PatientDirectory patientDirectory ;
    
    public CreatePatientJPanel(PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory=patientDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitWorkspace = new javax.swing.JPanel();
        employeeId = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        txtAge = new javax.swing.JSpinner();
        txtPatientName = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        gender = new javax.swing.JLabel();
        emailAddress = new javax.swing.JLabel();
        txtPatientEmail = new javax.swing.JTextField();
        txtPatientUserName = new javax.swing.JTextField();
        createEmployeeLabel = new javax.swing.JLabel();
        txtPatientContact = new javax.swing.JTextField();
        drpGender = new javax.swing.JComboBox<>();
        age = new javax.swing.JLabel();
        cellPhoneNumber = new javax.swing.JLabel();
        txtPatientPassword = new javax.swing.JTextField();
        employeeId1 = new javax.swing.JLabel();
        txtPatientDisease = new javax.swing.JTextField();
        emailAddress1 = new javax.swing.JLabel();

        splitWorkspace.setBackground(new java.awt.Color(204, 204, 255));

        employeeId.setText("Username:");

        save.setBackground(new java.awt.Color(255, 119, 0));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Register");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        txtAge.setModel(new javax.swing.SpinnerNumberModel(18, 18, 60, 1));

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        name.setText("Name:");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        gender.setText("Gender:");

        emailAddress.setText("Email Address:");

        txtPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientEmailActionPerformed(evt);
            }
        });

        txtPatientUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientUserNameActionPerformed(evt);
            }
        });

        createEmployeeLabel.setBackground(new java.awt.Color(153, 153, 153));
        createEmployeeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createEmployeeLabel.setForeground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel.setText("Create Patient");
        createEmployeeLabel.setToolTipText("To create new employee");

        txtPatientContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientContactActionPerformed(evt);
            }
        });

        drpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        age.setText("Age:");

        cellPhoneNumber.setText("Cell Phone Number:");

        txtPatientPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientPasswordActionPerformed(evt);
            }
        });

        employeeId1.setText("Password:");

        txtPatientDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientDiseaseActionPerformed(evt);
            }
        });

        emailAddress1.setText("Disease:");

        javax.swing.GroupLayout splitWorkspaceLayout = new javax.swing.GroupLayout(splitWorkspace);
        splitWorkspace.setLayout(splitWorkspaceLayout);
        splitWorkspaceLayout.setHorizontalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                    .addComponent(emailAddress)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                    .addComponent(cellPhoneNumber)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPatientContact, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                    .addComponent(employeeId1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                    .addComponent(emailAddress1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPatientDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addComponent(age)
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addComponent(gender)
                                .addGap(18, 18, 18)
                                .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(472, Short.MAX_VALUE))
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
                                .addComponent(txtPatientUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        splitWorkspaceLayout.setVerticalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeId1)
                    .addComponent(txtPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cellPhoneNumber)
                    .addComponent(txtPatientContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailAddress)
                    .addComponent(txtPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailAddress1)
                    .addComponent(txtPatientDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(reset))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(employeeId)
                        .addComponent(txtPatientUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(453, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(splitWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(splitWorkspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            String name = txtPatientName.getText();
            String username = txtPatientUserName.getText();
            String password = txtPatientPassword.getText();
            int age = Integer.parseInt(txtAge.getValue().toString());
            String gender = (String) drpGender.getSelectedItem();
            long cellPhoneNumber = Long.parseLong(txtPatientContact.getText());
            String emailAddress = txtPatientEmail.getText();
            String disease = txtPatientDisease.getText();
            String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            String phonePattern = "(0|91)?[6-9][0-9]{9}";

            Patient p = new Patient(disease, name, age, gender, emailAddress, cellPhoneNumber, username, password);

            patientDirectory.add(p);
            
            if (txtPatientName.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Enter Patient Name" , "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else if (txtPatientEmail.getText().isEmpty() ){
                JOptionPane.showMessageDialog(this, "Please Enter Patient Email" , "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else if(!txtPatientEmail.getText().matches(emailPattern)){
                JOptionPane.showMessageDialog(this, "Enter valid Email", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else if (txtPatientUserName.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Enter Patient's Username " , "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else if (txtPatientPassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Enter Patient's Password " , "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else if (txtPatientDisease.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Enter Disease " , "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "New Patient Details was created ! ");
            }
            
            txtPatientName.setText("");
            txtPatientUserName.setText("");
            txtAge.setValue(18);
            drpGender.setSelectedItem("Male");
            txtPatientUserName.setText("");
            txtPatientEmail.setText("");
            txtPatientContact.setText("");
            txtPatientUserName.setText("");
            txtPatientPassword.setText("");
            txtPatientDisease.setText("");
            //    }
    }//GEN-LAST:event_saveActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtPatientName.setText("");
        txtPatientUserName.setText("");
        txtAge.setValue(18);
        drpGender.setSelectedItem("Male");
        txtPatientUserName.setText("");
        txtPatientEmail.setText("");
        txtPatientContact.setText("");
        txtPatientUserName.setText("");
        txtPatientPassword.setText("");
        txtPatientDisease.setText("");
        //Reset validation
        //        valName.setText("");
        //        valEmployeeId.setText("");
        //        valDate.setText("");
        //        valTeamInfo.setText("");
        //        valCellPhoneNumber.setText("");
        //        valEmailAddress.setText("");
        //        valPhoto.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void txtPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientEmailActionPerformed

    private void txtPatientUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientUserNameActionPerformed

    private void txtPatientContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientContactActionPerformed

    private void txtPatientPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientPasswordActionPerformed

    private void txtPatientDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientDiseaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientDiseaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel cellPhoneNumber;
    private javax.swing.JLabel createEmployeeLabel;
    private javax.swing.JComboBox<String> drpGender;
    private javax.swing.JLabel emailAddress;
    private javax.swing.JLabel emailAddress1;
    private javax.swing.JLabel employeeId;
    private javax.swing.JLabel employeeId1;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel name;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JPanel splitWorkspace;
    private javax.swing.JSpinner txtAge;
    private javax.swing.JTextField txtPatientContact;
    private javax.swing.JTextField txtPatientDisease;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientPassword;
    private javax.swing.JTextField txtPatientUserName;
    // End of variables declaration//GEN-END:variables
}
