/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.company.resume.main;

import com.company.resume.config.Config;
import com.company.dao.inter.UserDaoInter;
import com.company.entity.User;
import com.company.main.Context;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author HP
 */
public class MainUser extends javax.swing.JFrame {

    private UserDaoInter userDao = Context.instanceUserDao();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Creates new form Main
     */
    public MainUser() {
        Config.loggedInUser = userDao.getById(6);
        initComponents();
        fillUserComponents();
        panelProfile.fillUserComponents();
        panelDetails.fillUserComponents();
        skillsPanel1.fillUserComponents();

    }
    public void fillUserComponents(){
        User loggedInUser = Config.loggedInUser;
        txtName.setText(loggedInUser.getName());
        txtSurname.setText(loggedInUser.getSurname());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * * WARNING: Do NOT modify this code. The content of this method is always
     *
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jSeparator1 = new javax.swing.JSeparator();
        panelSkills = new javax.swing.JTabbedPane();
        panelProfile = new com.company.resume.panel.ProfilePanel();
        pnlHistory = new javax.swing.JPanel();
        pnlAddUser = new javax.swing.JPanel();
        pnlDetails1 = new javax.swing.JPanel();
        IblAddAddress = new javax.swing.JLabel();
        txtAddAddress = new javax.swing.JTextField();
        IblAddPhone = new javax.swing.JLabel();
        txtAddPhone = new javax.swing.JTextField();
        IblAddEmail = new javax.swing.JLabel();
        txtAddEmail = new javax.swing.JTextField();
        IblAddBirthdate = new javax.swing.JLabel();
        txtAddBirthdate = new javax.swing.JTextField();
        IblAddBirthplace = new javax.swing.JLabel();
        IblAddNationality = new javax.swing.JLabel();
        cbAddNationality = new javax.swing.JComboBox<>();
        cbAddCountry = new javax.swing.JComboBox<>();
        btnAddSave = new javax.swing.JButton();
        IblAddName = new javax.swing.JLabel();
        txtAddName = new javax.swing.JTextField();
        txtAddSurname = new javax.swing.JTextField();
        IblAddSurname = new javax.swing.JLabel();
        IblProfileDescription = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddAreaProfile = new javax.swing.JTextArea();
        panelDetails = new com.company.resume.panel.DetailsPanel();
        skillsPanel1 = new com.company.resume.panel.SkillsPanel();
        pnlUserInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtSurname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSkills.addTab("Profile", panelProfile);

        javax.swing.GroupLayout pnlHistoryLayout = new javax.swing.GroupLayout(pnlHistory);
        pnlHistory.setLayout(pnlHistoryLayout);
        pnlHistoryLayout.setHorizontalGroup(
            pnlHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        pnlHistoryLayout.setVerticalGroup(
            pnlHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        panelSkills.addTab("EmploymentHistory", pnlHistory);

        IblAddAddress.setText("Address");

        IblAddPhone.setText("Phone");

        txtAddPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddPhoneActionPerformed(evt);
            }
        });

        IblAddEmail.setText("Email");

        txtAddEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddEmailActionPerformed(evt);
            }
        });

        IblAddBirthdate.setText("Birthdate");

        IblAddBirthplace.setText("Birthplace");

        IblAddNationality.setText("Nationality");

        cbAddNationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azerbaijan", "America" }));

        cbAddCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azerbaijan", "American" }));

        btnAddSave.setText("Save");
        btnAddSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSaveActionPerformed(evt);
            }
        });

        IblAddName.setText("Name");

        txtAddName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddNameActionPerformed(evt);
            }
        });

        txtAddSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddSurnameActionPerformed(evt);
            }
        });

        IblAddSurname.setText("Surname");

        IblProfileDescription.setText("Profile Description");

        txtAddAreaProfile.setColumns(20);
        txtAddAreaProfile.setRows(5);
        jScrollPane2.setViewportView(txtAddAreaProfile);

        javax.swing.GroupLayout pnlDetails1Layout = new javax.swing.GroupLayout(pnlDetails1);
        pnlDetails1.setLayout(pnlDetails1Layout);
        pnlDetails1Layout.setHorizontalGroup(
            pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetails1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(IblAddBirthdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IblAddBirthplace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(IblAddNationality)
                    .addComponent(IblAddEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IblAddPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IblAddAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IblAddName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IblAddSurname))
                .addGap(33, 33, 33)
                .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddPhone)
                    .addComponent(txtAddEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddAddress)
                    .addComponent(txtAddBirthdate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbAddNationality, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbAddCountry, javax.swing.GroupLayout.Alignment.TRAILING, 0, 93, Short.MAX_VALUE)
                    .addComponent(txtAddName)
                    .addComponent(txtAddSurname))
                .addGap(105, 105, 105)
                .addComponent(IblProfileDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlDetails1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(btnAddSave, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDetails1Layout.setVerticalGroup(
            pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDetails1Layout.createSequentialGroup()
                .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDetails1Layout.createSequentialGroup()
                        .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IblAddName)
                            .addComponent(txtAddName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IblProfileDescription))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IblAddSurname)
                            .addComponent(txtAddSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IblAddAddress)
                            .addComponent(txtAddAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IblAddPhone)
                            .addComponent(txtAddPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IblAddEmail)
                            .addComponent(txtAddEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IblAddBirthdate)
                            .addComponent(txtAddBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IblAddBirthplace)
                            .addComponent(cbAddCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDetails1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IblAddNationality)
                            .addComponent(cbAddNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetails1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnAddSave)
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout pnlAddUserLayout = new javax.swing.GroupLayout(pnlAddUser);
        pnlAddUser.setLayout(pnlAddUserLayout);
        pnlAddUserLayout.setHorizontalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddUserLayout.createSequentialGroup()
                .addComponent(pnlDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        pnlAddUserLayout.setVerticalGroup(
            pnlAddUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddUserLayout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(pnlDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelSkills.addTab("AddUser", pnlAddUser);
        panelSkills.addTab("Details", panelDetails);
        panelSkills.addTab("Skill", skillsPanel1);

        jLabel1.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Surname");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserInfoLayout = new javax.swing.GroupLayout(pnlUserInfo);
        pnlUserInfo.setLayout(pnlUserInfoLayout);
        pnlUserInfoLayout.setHorizontalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlUserInfoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserInfoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlUserInfoLayout.setVerticalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSkills)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addGap(512, 512, 512))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSkills))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurnameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String name = txtName.getText();
        String surname = txtSurname.getText();

        User user = Config.loggedInUser;
        user.setName(name);
        user.setSurname(surname);

        panelProfile.fillUser(user);
        panelDetails.FillUser(user);
        
        userDao.updateUser(user);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAddPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddPhoneActionPerformed

    private void txtAddEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddEmailActionPerformed

    private void txtAddNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddNameActionPerformed

    private void txtAddSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddSurnameActionPerformed

    private void btnAddSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSaveActionPerformed
        User loggedInUser = Config.loggedInUser;
        try {
            String name = txtAddName.getText();
            String surname = txtAddSurname.getText();
            String profileDescription = txtAddAreaProfile.getText();
            String birthDate = txtAddBirthdate.getText();
            String email = txtAddEmail.getText();
            String address = txtAddAddress.getText();
            String phone = txtAddPhone.getText();
            long l = sdf.parse(birthDate).getTime();
            Date bd = new Date(l);

            loggedInUser.setName(name);
            loggedInUser.setSurname(surname);
            loggedInUser.setProfileDesc(profileDescription);
            loggedInUser.setBirthDate(bd);
            loggedInUser.setEmail(email);
            loggedInUser.setAddress(address);
            loggedInUser.setPhone(phone);

            userDao.addUser(loggedInUser);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnAddSaveActionPerformed

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
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IblAddAddress;
    private javax.swing.JLabel IblAddBirthdate;
    private javax.swing.JLabel IblAddBirthplace;
    private javax.swing.JLabel IblAddEmail;
    private javax.swing.JLabel IblAddName;
    private javax.swing.JLabel IblAddNationality;
    private javax.swing.JLabel IblAddPhone;
    private javax.swing.JLabel IblAddSurname;
    private javax.swing.JLabel IblProfileDescription;
    private javax.swing.JButton btnAddSave;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbAddCountry;
    private javax.swing.JComboBox<String> cbAddNationality;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private com.company.resume.panel.DetailsPanel panelDetails;
    private com.company.resume.panel.ProfilePanel panelProfile;
    private javax.swing.JTabbedPane panelSkills;
    private javax.swing.JPanel pnlAddUser;
    private javax.swing.JPanel pnlDetails1;
    private javax.swing.JPanel pnlHistory;
    private javax.swing.JPanel pnlUserInfo;
    private com.company.resume.panel.SkillsPanel skillsPanel1;
    private javax.swing.JTextField txtAddAddress;
    private javax.swing.JTextArea txtAddAreaProfile;
    private javax.swing.JTextField txtAddBirthdate;
    private javax.swing.JTextField txtAddEmail;
    private javax.swing.JTextField txtAddName;
    private javax.swing.JTextField txtAddPhone;
    private javax.swing.JTextField txtAddSurname;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
