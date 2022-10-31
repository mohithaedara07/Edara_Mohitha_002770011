/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.CommunityDirectory;
import model.Doctor;
import model.DoctorDirectory;

/**
 *
 * @author mohitha
 */
public class ViewDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorJPanel
     */
    
    DoctorDirectory doctorDirectory;
    CommunityDirectory communityDirectory;
    public ViewDoctorJPanel(DoctorDirectory doctorDirectory,CommunityDirectory communityDirectory,boolean deleteFlag) {
        initComponents();
        
        this.doctorDirectory=doctorDirectory;
        this.communityDirectory=communityDirectory;
        btnDelete.setVisible(deleteFlag);
        populateTable();
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

        jPanel1 = new javax.swing.JPanel();
        createEmployeeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployeeHistory = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        employeeId = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        employeeId1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        txtAge = new javax.swing.JSpinner();
        gender = new javax.swing.JLabel();
        drpGender = new javax.swing.JComboBox<>();
        cellPhoneNumber = new javax.swing.JLabel();
        txtCellPhoneNumber = new javax.swing.JTextField();
        emailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        emailAddress1 = new javax.swing.JLabel();
        txtSpecialization = new javax.swing.JTextField();
        drpCommunityName = new javax.swing.JComboBox<>();
        cellPhoneNumber1 = new javax.swing.JLabel();
        cellPhoneNumber2 = new javax.swing.JLabel();
        drpCityName = new javax.swing.JComboBox<>();

        createEmployeeLabel.setBackground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createEmployeeLabel.setForeground(new java.awt.Color(0, 71, 119));
        createEmployeeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createEmployeeLabel.setText("View Doctor");
        createEmployeeLabel.setToolTipText("To create new employee");

        tblEmployeeHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Email-ID", "Phone Number", "Username", "Specialization"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployeeHistory);

        btnDelete.setBackground(new java.awt.Color(163, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRead.setBackground(new java.awt.Color(0, 71, 119));
        btnRead.setForeground(new java.awt.Color(255, 255, 255));
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 119, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        name.setText("Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        employeeId.setText("Username:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        employeeId1.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        age.setText("Age:");

        txtAge.setModel(new javax.swing.SpinnerNumberModel(18, 18, 60, 1));

        gender.setText("Gender:");

        drpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        cellPhoneNumber.setText("Cell Phone Number:");

        txtCellPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNumberActionPerformed(evt);
            }
        });

        emailAddress.setText("Email Address:");

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        emailAddress1.setText("Specilaiztion");

        txtSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecializationActionPerformed(evt);
            }
        });

        cellPhoneNumber1.setText("Community Name:");

        cellPhoneNumber2.setText("City Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnDelete)
                                    .addGap(6, 6, 6)
                                    .addComponent(btnRead))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(age)
                        .addGap(18, 18, 18)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(gender)
                        .addGap(18, 18, 18)
                        .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cellPhoneNumber1)
                        .addGap(18, 18, 18)
                        .addComponent(drpCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cellPhoneNumber2)
                        .addGap(18, 18, 18)
                        .addComponent(drpCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailAddress1)
                        .addGap(18, 18, 18)
                        .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(emailAddress)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cellPhoneNumber)
                        .addGap(18, 18, 18)
                        .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(employeeId1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(employeeId)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(273, 273, 273))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(427, 799, Short.MAX_VALUE)
                    .addComponent(btnUpdate)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete)
                    .addComponent(btnRead))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeId)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeId1)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(drpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cellPhoneNumber)
                    .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailAddress)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emailAddress1)
                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellPhoneNumber1)
                    .addComponent(drpCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cellPhoneNumber2)
                    .addComponent(drpCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 564, Short.MAX_VALUE)
                    .addComponent(btnUpdate)
                    .addGap(0, 40, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        } else {
            doctorDirectory.delete(selectedRow);
            populateTable();
            JOptionPane.showMessageDialog(this, "Employee Deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }

        Doctor p = doctorDirectory.getHistory().get(selectedRow);
        
         System.out.println("Viewing Doctor -> "+p);

        txtAge.setValue(p.getAge());
        txtCellPhoneNumber.setText(String.valueOf(p.getPhoneNumber()));
        txtEmailAddress.setText(String.valueOf(p.getEmailId()));
        drpGender.setSelectedItem(String.valueOf(p.getGender()));
        txtName.setText(String.valueOf(p.getName()));
        txtUsername.setText(String.valueOf(p.getUserName()));
        txtSpecialization.setText(p.getSpecialization());
        txtPassword.setText(p.getPassword());
        drpCityName.setSelectedItem(String.valueOf(p.getCommunity().getCityName()));
        drpCommunityName.setSelectedItem(String.valueOf(p.getCommunity().getCommunityName()));
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblEmployeeHistory.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit");
            return;
        }

        Doctor p = doctorDirectory.getHistory().get(selectedRow);

        String name = txtName.getText();
        int age = Integer.parseInt(String.valueOf(txtAge.getValue()));
        String gender = (String) drpGender.getSelectedItem();
        Long cellPhoneNumber = Long.parseLong(txtCellPhoneNumber.getText());
        String emailAddress = txtEmailAddress.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String specialization = txtSpecialization.getText();
        String communityName = String.valueOf(drpCommunityName.getSelectedItem());
            String cityName = String.valueOf(drpCityName.getSelectedItem());
            Community c= new Community(communityName, cityName);

        Doctor temp = new Doctor(specialization,c, name, age, gender, emailAddress, cellPhoneNumber, username, password);

        doctorDirectory.update(temp, selectedRow);

        JOptionPane.showMessageDialog(this, "Row is updated!");

        populateTable();

        txtName.setText("");
        txtUsername.setText("");
        txtAge.setValue(18);
        drpGender.setSelectedItem("Male");
        txtUsername.setText("");
        txtEmailAddress.setText("");
        txtCellPhoneNumber.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtSpecialization.setText("");
        drpCommunityName.setSelectedIndex(0);
        drpCityName.setSelectedIndex(0);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtCellPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNumberActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecializationActionPerformed
    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblEmployeeHistory.getModel();
        model.setRowCount(0);

        for (Doctor p : doctorDirectory.getHistory()) {
            Object row[] = new Object[10];
            row[0] = p.getName();
            row[1] = p.getAge();
            row[2] = p.getGender();
            row[3] = p.getEmailId();
            row[4] = p.getPhoneNumber();
            row[5] = p.getUserName();
            row[6] = p.getSpecialization();

            model.addRow(row);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    private javax.swing.JTable tblEmployeeHistory;
    private javax.swing.JSpinner txtAge;
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSpecialization;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
