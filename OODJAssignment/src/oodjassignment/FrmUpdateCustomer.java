/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodjassignment;

import Config.Global;
import Classes.Constant;
import Classes.Customer;
import Classes.Validation;
import Technician.FrmViewCustomer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author kianjun
 */
public class FrmUpdateCustomer extends javax.swing.JFrame {
    protected String gender = "MALE";
    /**
     * Creates new form frmUpdateCustomer
     */
    public FrmUpdateCustomer() {
        Constant con = new Constant();
        initComponents();
        this.setLocationRelativeTo(null);

        jLabel2.setText(con.SystemName);
        jLabel14.setText(con.UpdateCustomer);

        btnActivate.setVisible(false);
        btnDeactivate.setVisible(false);
        if(Global.role.equals("ADMIN")) {
            btnActivate.setVisible(true);
            btnDeactivate.setVisible(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerIC = new javax.swing.JTextField();
        txtCustomerID = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtBookingNo = new javax.swing.JLabel();
        txtDOB = new org.gui.JCalendarCombo();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtRegistrationDate = new javax.swing.JTextField();
        btnActivate = new javax.swing.JButton();
        btnDeactivate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(770, 750));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(770, 750));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 0, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 560, 17);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 200, 0, 0);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 500, 150, 0);

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel14.setText("jLabel4");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 30, 400, 60);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("BACK");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(40, 10, 40, 19);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(640, 10, 120, 40);

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel18.setText("Customer ID");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 120, 110, 17);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Customer IC");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 160, 100, 17);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Customer Name");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 200, 110, 17);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setText("Date of Birth");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 240, 150, 17);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Gender");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 280, 150, 17);

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel17.setText("Phone");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 360, 150, 17);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(180, 310, 300, 40);

        txtCustomerName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCustomerNameFocusLost(evt);
            }
        });
        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtCustomerName);
        txtCustomerName.setBounds(180, 190, 300, 40);

        txtCustomerIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCustomerICtxtUserIDFocusLost(evt);
            }
        });
        jPanel2.add(txtCustomerIC);
        txtCustomerIC.setBounds(180, 150, 300, 40);

        txtCustomerID.setEditable(false);
        txtCustomerID.setForeground(new java.awt.Color(153, 153, 153));
        txtCustomerID.setText("AUTO-GENRATED");
        txtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtCustomerID);
        txtCustomerID.setBounds(180, 110, 300, 40);

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel19.setText("Booking No.");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(500, 160, 110, 17);

        txtBookingNo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtBookingNo.setForeground(new java.awt.Color(255, 0, 0));
        txtBookingNo.setText("N/A");
        jPanel2.add(txtBookingNo);
        txtBookingNo.setBounds(630, 160, 70, 17);
        jPanel2.add(txtDOB);
        txtDOB.setBounds(190, 240, 290, 26);

        buttonGroup1.add(rbtnMale);
        rbtnMale.setSelected(true);
        rbtnMale.setText("Male");
        rbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaleActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnMale);
        rbtnMale.setBounds(180, 280, 61, 23);

        buttonGroup1.add(rbtnFemale);
        rbtnFemale.setText("Female");
        rbtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemaleActionPerformed(evt);
            }
        });
        jPanel2.add(rbtnFemale);
        rbtnFemale.setBounds(320, 280, 76, 23);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel16.setText("Email");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(10, 320, 37, 17);
        jPanel2.add(txtAddress);
        txtAddress.setBounds(180, 390, 300, 40);

        jLabel20.setText("Address");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(10, 400, 51, 16);
        jPanel2.add(txtPhone);
        txtPhone.setBounds(180, 350, 300, 40);

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel22.setText("Status");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(500, 120, 110, 17);

        txtStatus.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtStatus.setForeground(new java.awt.Color(51, 204, 0));
        txtStatus.setText("ACTIVE");
        jPanel2.add(txtStatus);
        txtStatus.setBounds(630, 120, 70, 17);

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(640, 690, 120, 50);

        jLabel23.setText("Registration Date");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(10, 440, 120, 16);
        jPanel2.add(txtRegistrationDate);
        txtRegistrationDate.setBounds(180, 430, 300, 40);

        btnActivate.setBackground(java.awt.Color.green);
        btnActivate.setText("ACTIVATE");
        btnActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivateActionPerformed(evt);
            }
        });
        jPanel2.add(btnActivate);
        btnActivate.setBounds(10, 690, 140, 50);

        btnDeactivate.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.select"));
        btnDeactivate.setText("DEACTIVATE");
        btnDeactivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeactivateActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeactivate);
        btnDeactivate.setBounds(160, 690, 140, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 770, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        new FrmViewCustomer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void txtCustomerNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustomerNameFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtCustomerNameFocusLost

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void txtCustomerICtxtUserIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCustomerICtxtUserIDFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCustomerICtxtUserIDFocusLost

    private void txtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIDActionPerformed

    private void rbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaleActionPerformed
        // TODO add your handling code here:
        gender = "MALE";
    }//GEN-LAST:event_rbtnMaleActionPerformed

    private void rbtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemaleActionPerformed
        // TODO add your handling code here:
        gender = "FEMALE";
    }//GEN-LAST:event_rbtnFemaleActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String CustomerID = txtCustomerID.getText();
        String CustomerIC = txtCustomerIC.getText();
        String CustomerName = txtCustomerName.getText().toUpperCase();
        String DOB = txtDOB.getSelectedDate();
        String Email = txtEmail.getText();
        String Phone = txtPhone.getText();
        String Address = txtAddress.getText();
        String regDate = txtRegistrationDate.getText();
        String BookingNo = txtBookingNo.getText();
        String Status = txtStatus.getText();
        
        if(rbtnMale.isSelected()) {
            gender = "MALE";
        } else {
            gender = "FEMALE";
        }
        
        ArrayList<String> CustomerDetails;
        CustomerDetails = new ArrayList<>();
        CustomerDetails.add(CustomerID);
        CustomerDetails.add(CustomerIC);
        CustomerDetails.add(CustomerName);
        CustomerDetails.add(DOB);
        CustomerDetails.add(gender);
        CustomerDetails.add(Email);
        CustomerDetails.add(Phone);
        CustomerDetails.add(Address);
        CustomerDetails.add(regDate);
        CustomerDetails.add(BookingNo);
        CustomerDetails.add(Status);
        
        Customer customer = new Customer(CustomerDetails);

//        Customer customer = new Customer(CustomerID, CustomerIC, CustomerName, DOB, gender, Email, Phone, Address, regDate, BookingNo, Status);
        Validation check = new Validation();
        try {
            if(!CustomerIC.isEmpty() && !CustomerName.isEmpty() && !DOB.isEmpty() && !Email.isEmpty() && !Phone.isEmpty() && !Address.isEmpty()) {
                if(check.isValid(Email)) {
//                    if(check.checkCustomer(CustomerIC)) {
                        customer.Update();
                        //addCustomer.AddCustomer(CustomerID, CustomerIC, CustomerName, DOB, gender, Email, Phone, CarPlateNo, Address, BookingNo, Status);
                        JOptionPane.showMessageDialog(rootPane, "Customer details is updated.", "Updated Successfully", JOptionPane.INFORMATION_MESSAGE);
                        new FrmViewCustomer().setVisible(true);
                        this.dispose();
//                    } else {
//                        JOptionPane.showMessageDialog(rootPane, "The IC number has been registered into the system. Please have a look in datatabase", "Member IC is duplicated", JOptionPane.WARNING_MESSAGE);
//                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Please enter a valid email address.");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Please make sure that you have entered all the text fields.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Something happened. Please try to login again.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateActionPerformed
        // TODO add your handling code here:
        String CustomerID = txtCustomerID.getText();
        String CustomerIC = txtCustomerIC.getText();
        String CustomerName = txtCustomerName.getText().toUpperCase();
        String DOB = txtDOB.getSelectedDate();
        String Email = txtEmail.getText();
        String Phone = txtPhone.getText();
        String Address = txtAddress.getText();
        String regDate = txtRegistrationDate.getText();
        String BookingNo = txtBookingNo.getText();
        String Status = "ACTIVE";
        if(rbtnMale.isSelected()) {
            gender = "MALE";
        } else {
            gender = "FEMALE";
        }
        
        ArrayList<String> CustomerDetails;
        CustomerDetails = new ArrayList<>();
        CustomerDetails.add(CustomerID);
        CustomerDetails.add(CustomerIC);
        CustomerDetails.add(CustomerName);
        CustomerDetails.add(DOB);
        CustomerDetails.add(gender);
        CustomerDetails.add(Email);
        CustomerDetails.add(Phone);
        CustomerDetails.add(Address);
        CustomerDetails.add(regDate);
        CustomerDetails.add(BookingNo);
        CustomerDetails.add(Status);
        
        Customer customer = new Customer(CustomerDetails);
        
//        Customer customer = new Customer (CustomerID, CustomerIC, CustomerName, DOB, gender, Email, Phone, Address, regDate, BookingID, Status);
        customer.Update();
        
        new FrmViewCustomer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnActivateActionPerformed

    private void btnDeactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeactivateActionPerformed
        // TODO add your handling code here:
        String CustomerID = txtCustomerID.getText();
        String CustomerIC = txtCustomerIC.getText();
        String CustomerName = txtCustomerName.getText().toUpperCase();
        String DOB = txtDOB.getSelectedDate();
        String Email = txtEmail.getText();
        String Phone = txtPhone.getText();
        String Address = txtAddress.getText();
        String regDate = txtRegistrationDate.getText();
        String BookingNo = txtBookingNo.getText();
        String Status = "INACTIVE";
        if(rbtnMale.isSelected()) {
            gender = "MALE";
        } else {
            gender = "FEMALE";
        }
        
        ArrayList<String> CustomerDetails;
        CustomerDetails = new ArrayList<>();
        CustomerDetails.add(CustomerID);
        CustomerDetails.add(CustomerIC);
        CustomerDetails.add(CustomerName);
        CustomerDetails.add(DOB);
        CustomerDetails.add(gender);
        CustomerDetails.add(Email);
        CustomerDetails.add(Phone);
        CustomerDetails.add(Address);
        CustomerDetails.add(regDate);
        CustomerDetails.add(BookingNo);
        CustomerDetails.add(Status);
        
        Customer customer = new Customer(CustomerDetails);
        
//        Customer customer = new Customer (CustomerID, CustomerIC, CustomerName, DOB, gender, Email, Phone, Address, regDate, BookingID, Status);
        customer.Update();
        
        new FrmViewCustomer().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeactivateActionPerformed

    void ClearFields() {
        txtCustomerID.setText("AUTO-GENERATED");
        txtCustomerIC.setText("");
        txtCustomerName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
    }
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
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActivate;
    public javax.swing.JButton btnDeactivate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JRadioButton rbtnFemale;
    public javax.swing.JRadioButton rbtnMale;
    public javax.swing.JTextField txtAddress;
    public javax.swing.JLabel txtBookingNo;
    public javax.swing.JTextField txtCustomerIC;
    public javax.swing.JTextField txtCustomerID;
    public javax.swing.JTextField txtCustomerName;
    public org.gui.JCalendarCombo txtDOB;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtPhone;
    public javax.swing.JTextField txtRegistrationDate;
    public javax.swing.JLabel txtStatus;
    // End of variables declaration//GEN-END:variables
}
