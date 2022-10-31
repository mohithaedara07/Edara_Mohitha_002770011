/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Community;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;

/**
 *
 * @author mohitha
 */
public class CreateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorJPanel
     */
    
    DoctorDirectory doctorDirectory;
    CommunityDirectory communityDirectory;
    public CreateDoctorJPanel(DoctorDirectory doctorDirectory,CommunityDirectory communityDirectory) {
        initComponents();
         this.communityDirectory=communityDirectory;
         this.doctorDirectory = doctorDirectory;
         
         for(Community c:communityDirectory.getHistory()){
             drpCommunityName.addItem(String.valueOf(c.getCommunityName()));
             drpCityName.addItem(String.valueOf(c.getCityName()));
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

        splitWorkspace = new javax.swing.JPanel();
        employeeId = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        txtAge = new javax.swing.JSpinner();
        txtCreateDoctorName = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        gender = new javax.swing.JLabel();
        emailAddress = new javax.swing.JLabel();
        txtCreateDoctorEmail = new javax.swing.JTextField();
        txtCreateDoctorUsername = new javax.swing.JTextField();
        createEmployeeLabel = new javax.swing.JLabel();
        txtCellPhoneNumber = new javax.swing.JTextField();
        drpGender = new javax.swing.JComboBox<>();
        age = new javax.swing.JLabel();
        cellPhoneNumber = new javax.swing.JLabel();
        txtCreateDoctorPassword = new javax.swing.JTextField();
        employeeId1 = new javax.swing.JLabel();
        txtCreateDoctorSpecialization = new javax.swing.JTextField();
        emailAddress1 = new javax.swing.JLabel();
        cellPhoneNumber1 = new javax.swing.JLabel();
        cellPhoneNumber2 = new javax.swing.JLabel();
        drpCommunityName = new javax.swing.JComboBox<>();
        drpCityName = new javax.swing.JComboBox<>();

        splitWorkspace.setBackground(new java.awt.Color(153, 204, 255));

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

        txtCreateDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateDoctorNameActionPerformed(evt);
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

        txtCreateDoctorEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateDoctorEmailActionPerformed(evt);
            }
        });

        txtCreateDoctorUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateDoctorUsernameActionPerformed(evt);
            }
        });

        createEmployeeLabel.setBackground(new java.awt.Color(153, 153, 153));
        createEmployeeLabel.setFont(new java.awt.Font("Myanmar MN", 1, 24)); // NOI18N
        createEmployeeLabel.setForeground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel.setText("Create Doctor");
        createEmployeeLabel.setToolTipText("To create new employee");

        txtCellPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNumberActionPerformed(evt);
            }
        });

        drpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        age.setText("Age:");

        cellPhoneNumber.setText("Cell Phone Number:");

        txtCreateDoctorPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateDoctorPasswordActionPerformed(evt);
            }
        });

        employeeId1.setText("Password:");

        txtCreateDoctorSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreateDoctorSpecializationActionPerformed(evt);
            }
        });

        emailAddress1.setText("Specialization:");

        cellPhoneNumber1.setText("Community Name:");

        cellPhoneNumber2.setText("City Name:");

        javax.swing.GroupLayout splitWorkspaceLayout = new javax.swing.GroupLayout(splitWorkspace);
        splitWorkspace.setLayout(splitWorkspaceLayout);
        splitWorkspaceLayout.setHorizontalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addComponent(employeeId)
                        .addGap(18, 18, 18)
                        .addComponent(txtCreateDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addComponent(employeeId1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCreateDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addComponent(emailAddress1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCreateDoctorSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addComponent(cellPhoneNumber1)
                        .addGap(18, 18, 18)
                        .addComponent(drpCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                        .addComponent(emailAddress)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCreateDoctorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                        .addComponent(cellPhoneNumber)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(41, Short.MAX_VALUE))
                            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                                .addComponent(cellPhoneNumber2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(drpCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splitWorkspaceLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gender, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(213, 213, 213))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splitWorkspaceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splitWorkspaceLayout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splitWorkspaceLayout.createSequentialGroup()
                        .addComponent(reset)
                        .addGap(383, 383, 383))))
            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(createEmployeeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(splitWorkspaceLayout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addComponent(name)
                            .addGap(18, 18, 18)
                            .addComponent(txtCreateDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 471, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        splitWorkspaceLayout.setVerticalGroup(
            splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(splitWorkspaceLayout.createSequentialGroup()
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCreateDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeId)
                            .addComponent(gender)
                            .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCreateDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeId1)
                            .addComponent(cellPhoneNumber)
                            .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(splitWorkspaceLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCreateDoctorSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreateDoctorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailAddress)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splitWorkspaceLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailAddress1)))
                .addGap(32, 32, 32)
                .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drpCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellPhoneNumber1)
                    .addComponent(cellPhoneNumber2)
                    .addComponent(drpCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(save)
                .addGap(39, 39, 39)
                .addComponent(reset)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(splitWorkspaceLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(splitWorkspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name)
                        .addComponent(txtCreateDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(482, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(splitWorkspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
             try {
            String name = txtCreateDoctorName.getText();
            String username = txtCreateDoctorUsername.getText();
            String password = txtCreateDoctorPassword.getText();
            int age = Integer.parseInt(txtAge.getValue().toString());
            String gender = (String) drpGender.getSelectedItem();
            long cellPhoneNumber = Long.parseLong(txtCellPhoneNumber.getText());
            String emailAddress = txtCreateDoctorEmail.getText();
            String specialization = txtCreateDoctorSpecialization.getText();
            String communityName = String.valueOf(drpCommunityName.getSelectedItem());
            String cityName = String.valueOf(drpCityName.getSelectedItem());
            String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            String phonePattern = "(0|91)?[6-9][0-9]{9}";
            Community c= new Community(communityName, cityName);
            
            Doctor d = new Doctor(specialization,c, name, age, gender, emailAddress, cellPhoneNumber, username, password);

            doctorDirectory.add(d);
            
             }
             
             catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Please enter all values and try again");
    
            }
             ArrayList message = null;
                message = new ArrayList(0);
            if (txtCreateDoctorName.getText().isEmpty()){
               
                message.add("Name cannot be blank, contain digits or special characters. Please enter a valid name and try again");
            }
            if (txtCreateDoctorEmail.getText().isEmpty() ){
               
                message.add("Please enter a valid Email Address and try again");
            }
            if (txtCreateDoctorUsername.getText().isEmpty()){
                message.add("Please Enter Doctor's Username ");
            }
            if (txtCreateDoctorPassword.getText().isEmpty()){
                message.add("Please Enter Doctor's Password ");
            }
            if (txtCreateDoctorSpecialization.getText().isEmpty()){
                message.add("Please Enter Specialization ");
            }
           
            if(!(message.isEmpty())){
            JOptionPane.showMessageDialog(this, message.toArray());
            message.clear();
            }
        else{
                JOptionPane.showMessageDialog(this, "New Doctor Details was created ! ");
            }
             
             
            
        
            
            
            txtCreateDoctorName.setText("");
            txtCreateDoctorUsername.setText("");
            txtAge.setValue(18);
            drpGender.setSelectedItem("Male");
            txtCreateDoctorUsername.setText("");
            txtCreateDoctorEmail.setText("");
            txtCellPhoneNumber.setText("");
            txtCreateDoctorUsername.setText("");
            txtCreateDoctorPassword.setText("");
            txtCreateDoctorSpecialization.setText("");
            
            //System.out.println("Creating DOctor -> "+d);
            //    }
    }//GEN-LAST:event_saveActionPerformed

    private void txtCreateDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreateDoctorNameActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        txtCreateDoctorName.setText("");
        txtCreateDoctorUsername.setText("");
        txtAge.setValue(18);
        drpGender.setSelectedItem("Male");
        txtCreateDoctorUsername.setText("");
        txtCreateDoctorEmail.setText("");
        txtCellPhoneNumber.setText("");
        txtCreateDoctorUsername.setText("");
        txtCreateDoctorPassword.setText("");
        txtCreateDoctorSpecialization.setText("");
        //Reset validation
        //        valName.setText("");
        //        valEmployeeId.setText("");
        //        valDate.setText("");
        //        valTeamInfo.setText("");
        //        valCellPhoneNumber.setText("");
        //        valEmailAddress.setText("");
        //        valPhoto.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void txtCreateDoctorEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateDoctorEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreateDoctorEmailActionPerformed

    private void txtCreateDoctorUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateDoctorUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreateDoctorUsernameActionPerformed

    private void txtCellPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNumberActionPerformed

    private void txtCreateDoctorPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateDoctorPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreateDoctorPasswordActionPerformed

    private void txtCreateDoctorSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreateDoctorSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreateDoctorSpecializationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel cellPhoneNumber;
    private javax.swing.JLabel cellPhoneNumber1;
    private javax.swing.JLabel cellPhoneNumber2;
    private javax.swing.JLabel createEmployeeLabel;
    private javax.swing.JComboBox<String> drpCityName;
    private javax.swing.JComboBox<String> drpCommunityName;
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
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtCreateDoctorEmail;
    private javax.swing.JTextField txtCreateDoctorName;
    private javax.swing.JTextField txtCreateDoctorPassword;
    private javax.swing.JTextField txtCreateDoctorSpecialization;
    private javax.swing.JTextField txtCreateDoctorUsername;
    // End of variables declaration//GEN-END:variables
}