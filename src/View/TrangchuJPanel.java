/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class TrangchuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrangchuJPanel
     */
    public TrangchuJPanel() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnDMK = new javax.swing.JMenuItem();
        mnThoat = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();

        mnDMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnDMK.setText("Đổi mật khẩu");
        mnDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDMKActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnDMK);

        mnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnThoat.setText("Thoát");
        mnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnThoatActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnThoat);

        setBackground(new java.awt.Color(241, 241, 241));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Coffee.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mnDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDMKActionPerformed
        // TODO add your handling code here:
//        DoiMatKhauJDialog a = new DoiMatKhauJDialog(null, true);
//        a.setVisible(true);
    }//GEN-LAST:event_mnDMKActionPerformed

    private void mnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnThoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mnDMK;
    private javax.swing.JMenuItem mnThoat;
    // End of variables declaration//GEN-END:variables
}
