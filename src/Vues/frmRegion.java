/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import static Vues.frmVerifMofidVisiteur.nom;

/**
 *
 * @author PC
 */
public class frmRegion extends javax.swing.JFrame {

    /**
     * Creates new form frmRegion
     */
    public frmRegion() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegions = new javax.swing.JTable();
        btnAjouter = new javax.swing.JButton();
        btnmodifier = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAnnuler = new javax.swing.JButton();
        cboRegion = new javax.swing.JComboBox<>();
        cboVisiteur = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblRegions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblRegions);

        btnAjouter.setText("Ajouter");
        btnAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAjouterMouseClicked(evt);
            }
        });
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnmodifier.setText("Modifier");
        btnmodifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmodifierMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel4.setText("Les Regions");

        btnAnnuler.setText("Annuler");
        btnAnnuler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnnulerMouseClicked(evt);
            }
        });

        cboRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Région", "lister", "ajouter", "modifier", " " }));
        cboRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboRegionMouseClicked(evt);
            }
        });

        cboVisiteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visiteur", "lister", "ajouter", "modifier", " " }));
        cboVisiteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboVisiteurMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel4)
                        .addGap(62, 62, 62)
                        .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(btnmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboVisiteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnmodifier)
                    .addComponent(btnAnnuler))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjouterMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnAjouterMouseClicked

    private void btnmodifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodifierMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnmodifierMouseClicked

    private void btnAnnulerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnnulerMouseClicked
        // TODO add your handling code here:
        frmMenu frm = new frmMenu();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAnnulerMouseClicked

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        // TODO add your handling code here:
        frmAjoutRegion frm = new frmAjoutRegion();
        frm.setVisible(true);
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void cboRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboRegionMouseClicked
        // TODO add your handling code here:
        if(cboRegion.getSelectedItem().toString().compareTo("Région") ==0){
            frmRegion frm = new frmRegion();
            frm.setVisible(true);
            this.dispose();
        }
        
            if(cboRegion.getSelectedItem().toString().compareTo("lister") ==0){
                frmRegion frm = new frmRegion();
                frm.setVisible(true);
                 this.dispose();
            }
           
                if(cboRegion.getSelectedItem().toString().compareTo("ajouter") ==0){
                    frmAjoutRegion frm = new frmAjoutRegion();
                    frm.setVisible(true);
                    this.dispose();
                }
                
                    if(cboRegion.getSelectedItem().toString().compareTo("modifier") ==0){
                        frmVerifModifRegion frm = new frmVerifModifRegion();
                        frm.setVisible(true);
                        this.dispose();
                    }
    }//GEN-LAST:event_cboRegionMouseClicked

    private void cboVisiteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboVisiteurMouseClicked
        // TODO add your handling code here:
        if(cboVisiteur.getSelectedItem().toString().compareTo("Visiteur") ==0){
            frmVisiteur frm = new frmVisiteur();
            frm.setVisible(true);
            this.dispose();
        }
        
            if(cboVisiteur.getSelectedItem().toString().compareTo("lister") ==0){
                frmVisiteur frm = new frmVisiteur();
                frm.setVisible(true);
                 this.dispose();
            }
           
                if(cboVisiteur.getSelectedItem().toString().compareTo("ajouter") ==0){
                    frmAjoutVisteur frm = new frmAjoutVisteur();
                    frm.setVisible(true);
                    this.dispose();
                }
                
                    if(cboVisiteur.getSelectedItem().toString().compareTo("modifier") ==0){
                        frmVerifMofidVisiteur frm = new frmVerifMofidVisiteur(nom);
                        frm.setVisible(true);
                        this.dispose();
                    }
    }//GEN-LAST:event_cboVisiteurMouseClicked

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
            java.util.logging.Logger.getLogger(frmRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnmodifier;
    private javax.swing.JComboBox<String> cboRegion;
    private javax.swing.JComboBox<String> cboVisiteur;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegions;
    // End of variables declaration//GEN-END:variables
}
