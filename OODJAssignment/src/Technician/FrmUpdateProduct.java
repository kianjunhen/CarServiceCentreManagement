/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Technician;

import Config.Global;
import DataAccess.DataAccess;
import Classes.Constant;
import Classes.Initials;
import Classes.Product;
import Classes.User;
import Manager.MfrmDashboard;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import oodjassignment.FrmLogin;

/**
 *
 * @author kianjun
 */
public class FrmUpdateProduct extends javax.swing.JFrame {
    DataAccess da = new DataAccess();
    /**
     * Creates new form frmUpdateProduct
     */
    public FrmUpdateProduct() {
        DataAccess da = new DataAccess();
        ArrayList<String> data=null;
        Constant con = new Constant();
        Initials GetInitials = new Initials();
        initComponents();
        this.setLocationRelativeTo(null);
        getCategoryName();

        jLabel2.setText(con.SystemName);
        jLabel14.setText(con.ManageProduct);
        
        txtProductID.setText(GetInitials.ProductID());
 
    }
    
    public void getCategoryName()
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try
        {
            da.setFileName("Category.txt");
            ArrayList<String> data = da.readAll();
            for(String rec: data) {
                String[] split = rec.split("\\|");
                if(split[5].equals("ACTIVE")){
                    model.addElement(split[1]);
                    cmbCategoryName.setModel(model);
                }
            }
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Can't load data from database");
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtProductDescription = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbCategoryName = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDateAdded = new javax.swing.JTextField();
        btnActivate = new javax.swing.JButton();
        btnDeactivate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

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
        jLabel4.setBounds(40, 10, 50, 19);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(640, 10, 120, 40);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Product Name");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 160, 130, 17);

        txtProductID.setEditable(false);
        txtProductID.setForeground(new java.awt.Color(153, 153, 153));
        txtProductID.setText("AUTO-GENRATED");
        jPanel2.add(txtProductID);
        txtProductID.setBounds(180, 110, 240, 40);

        txtProductName.setForeground(new java.awt.Color(153, 153, 153));
        txtProductName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProductNametxtUserIDFocusLost(evt);
            }
        });
        jPanel2.add(txtProductName);
        txtProductName.setBounds(180, 150, 240, 40);

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel18.setText("Product ID");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(10, 120, 110, 17);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Product Description");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 200, 160, 17);

        txtProductDescription.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(txtProductDescription);
        txtProductDescription.setBounds(180, 190, 240, 40);

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel19.setText("Category Name");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(10, 240, 110, 17);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 0));
        jLabel5.setText("ACTIVE");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(530, 120, 70, 17);

        jPanel2.add(cmbCategoryName);
        cmbCategoryName.setBounds(180, 240, 240, 27);

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel21.setText("Status");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(440, 120, 70, 17);

        txtQuantity.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(txtQuantity);
        txtQuantity.setBounds(520, 190, 230, 40);

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel22.setText("Price");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(440, 160, 70, 17);

        txtPrice.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(txtPrice);
        txtPrice.setBounds(520, 150, 230, 40);

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel24.setText("Quantity");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(440, 200, 70, 17);

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel15.setText("Date Added");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(10, 280, 150, 17);

        txtDateAdded.setEditable(false);
        txtDateAdded.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(txtDateAdded);
        txtDateAdded.setBounds(180, 270, 240, 40);

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

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(640, 690, 120, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 770, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductNametxtUserIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProductNametxtUserIDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNametxtUserIDFocusLost

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        if(Global.role.equals("MANAGER")) {
            new MfrmDashboard().setVisible(true);
        } else {
            new TfrmDashboard().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void btnActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateActionPerformed
        // TODO add your handling code here:
        String ProductID = txtProductID.getText();
        String CategoryName = cmbCategoryName.getSelectedItem().toString();
        String ProductName = txtProductName.getText();
        String ProductDescription = txtProductDescription.getText();
        String Price = txtPrice.getText();
        String Quantity = txtQuantity.getText();
        String DateAdded = txtDateAdded.getText();
        
        ArrayList<String> ProductDetails;
        ProductDetails = new ArrayList<>();
        ProductDetails.add(ProductID);
        ProductDetails.add(CategoryName);
        ProductDetails.add(ProductName);
        ProductDetails.add(ProductDescription);
        ProductDetails.add(DateAdded);
        ProductDetails.add(Price);
        ProductDetails.add(Quantity);
        ProductDetails.add("ACTIVE");
        Product product = new Product(ProductDetails);
        
//        Product product = new Product(ProductID, CategoryName, ProductName, ProductDescription, DateAdded, Price, Quantity, "ACTIVE");
        product.Update();
        
        if(Global.role.equals("MANAGER")) {
            new MfrmDashboard().setVisible(true);
        } else {
            new TfrmDashboard().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btnActivateActionPerformed

    private void btnDeactivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeactivateActionPerformed
        // TODO add your handling code here:
        String ProductID = txtProductID.getText();
        String CategoryName = cmbCategoryName.getSelectedItem().toString();
        String ProductName = txtProductName.getText();
        String ProductDescription = txtProductDescription.getText();
        String Price = txtPrice.getText();
        String Quantity = txtQuantity.getText();
        String DateAdded = txtDateAdded.getText();
        
        ArrayList<String> ProductDetails;
        ProductDetails = new ArrayList<>();
        ProductDetails.add(ProductID);
        ProductDetails.add(CategoryName);
        ProductDetails.add(ProductName);
        ProductDetails.add(ProductDescription);
        ProductDetails.add(DateAdded);
        ProductDetails.add(Price);
        ProductDetails.add(Quantity);
        ProductDetails.add("INACTIVE");
        Product product = new Product(ProductDetails);
        
//        Product product = new Product(ProductID, CategoryName, ProductName, ProductDescription, DateAdded, Price, Quantity, "INACTIVE");
        product.Update();
        
        if(Global.role.equals("MANAGER")) {
            new MfrmDashboard().setVisible(true);
        } else {
            new TfrmDashboard().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btnDeactivateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        String ProductID = txtProductID.getText();
        String CategoryName = cmbCategoryName.getSelectedItem().toString();
        String ProductName = txtProductName.getText();
        String ProductDescription = txtProductDescription.getText();
        String Price = txtPrice.getText();
        String Quantity = txtQuantity.getText();
        String DateAdded = txtDateAdded.getText();
        String Status = jLabel5.getText();
        
        ArrayList<String> ProductDetails;
        ProductDetails = new ArrayList<>();
        ProductDetails.add(ProductID);
        ProductDetails.add(CategoryName);
        ProductDetails.add(ProductName);
        ProductDetails.add(ProductDescription);
        ProductDetails.add(DateAdded);
        ProductDetails.add(Price);
        ProductDetails.add(Quantity);
        ProductDetails.add(Status);
        Product product = new Product(ProductDetails);
        
//        Product product = new Product(ProductID, CategoryName, ProductName, ProductDescription, DateAdded, Price, Quantity, Status);
        product.Update();

        if(Global.role.equals("MANAGER")) {
            new MfrmDashboard().setVisible(true);
        } else {
            new TfrmDashboard().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActivate;
    public javax.swing.JButton btnDeactivate;
    private javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox<String> cmbCategoryName;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField txtDateAdded;
    public javax.swing.JTextField txtPrice;
    public javax.swing.JTextField txtProductDescription;
    public javax.swing.JTextField txtProductID;
    public javax.swing.JTextField txtProductName;
    public javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}