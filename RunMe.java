package com.mycompany.PresenceApplication;


import javax.swing.JOptionPane;

public class RunMe extends javax.swing.JFrame {

    /** Creates new form FrameUtama */
    public RunMe() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dekstopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();
        EXIT = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dekstopPaneLayout = new javax.swing.GroupLayout(dekstopPane);
        dekstopPane.setLayout(dekstopPaneLayout);
        dekstopPaneLayout.setHorizontalGroup(
            dekstopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        dekstopPaneLayout.setVerticalGroup(
            dekstopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        menu.setText("LOGIN");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        menuLogin.setText("LOGIN");
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });
        menu.add(menuLogin);

        menuLogout.setText("LOGOUT");
        menuLogout.setEnabled(false);
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        menu.add(menuLogout);

        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        menu.add(EXIT);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dekstopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuLoginActionPerformed

        dekstopPane.removeAll();
        LoginForms loginForm = new LoginForms();
        loginForm.setVisible(true);
        dekstopPane.add(loginForm);
        menuLogin.setEnabled(false);
        menuLogout.setEnabled(true);

    }// GEN-LAST:event_menuLoginActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuActionPerformed

    }// GEN-LAST:event_menuActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_EXITActionPerformed

        int pilih = JOptionPane.showConfirmDialog(null, "Keluar aplikasi?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION);

        if (pilih == JOptionPane.OK_OPTION) {

            System.exit(0);

        } else {
            JOptionPane.getRootFrame();
        }

    }// GEN-LAST:event_EXITActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_menuLogoutActionPerformed

        dekstopPane.removeAll();
        LoginForms loginForm = new LoginForms();
        loginForm.setVisible(true);
        dekstopPane.add(loginForm);
        menuLogout.setEnabled(false);
        menuLogin.setEnabled(true);

    }// GEN-LAST:event_menuLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RunMe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunMe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunMe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunMe.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RunMe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EXIT;
    private javax.swing.JDesktopPane dekstopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuLogout;
    // End of variables declaration//GEN-END:variables

}
