package com.mycompany.pindahvscode;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jengb
 */
public class InDataForm extends javax.swing.JInternalFrame {

        public InDataForm() {
                initComponents();

        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        txt_nama = new javax.swing.JTextField();
        DelleteButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txt_NIM1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txt_kelas = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Pil_Jur1 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        Pil_Ket = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setTitle("Form Presensi");

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        DelleteButton.setText("HAPUS");
        DelleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelleteButtonActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setText("NIM :");

        txt_NIM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NIM1ActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Kelas :");

        txt_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kelasActionPerformed(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("Jurusan :");

        Pil_Jur1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==PILIH==", "Informatika", "Sistem Informasi", "" }));

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Keterangan :");

        Pil_Ket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==PILIH==", "Hadir", "Bolos" }));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setText("Nama :");

        SaveButton.setText("SIMPAN");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel24)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel22)
                    .addComponent(SaveButton))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Pil_Ket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_NIM1)
                        .addComponent(Pil_Jur1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DelleteButton))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NIM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pil_Jur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pil_Ket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(DelleteButton))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_namaActionPerformed

        }// GEN-LAST:event_txt_namaActionPerformed

        private void DelleteButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DelleteButtonActionPerformed

                txt_nama.setText("");
                txt_NIM1.setText("");
                txt_kelas.setText("");
                Pil_Jur1.setSelectedIndex(0);
                Pil_Ket.setSelectedIndex(0);

        }// GEN-LAST:event_DelleteButtonActionPerformed

        private void txt_NIM1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_NIM1ActionPerformed

        }// GEN-LAST:event_txt_NIM1ActionPerformed

        private void txt_kelasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt_kelasActionPerformed

        }// GEN-LAST:event_txt_kelasActionPerformed

        private void ShowDataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ShowDataActionPerformed

                ShowData TD = new ShowData(null);
                TD.setVisible(true);
                this.getDesktopPane().add(TD);
                this.dispose();

        }// GEN-LAST:event_ShowDataActionPerformed

        /**
         * @param evt
         */
        private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_SaveButtonActionPerformed

                if (txt_nama.getText().isEmpty() || txt_NIM1.getText().isEmpty() || txt_kelas.getText().isEmpty()
                                || Pil_Jur1.getSelectedIndex() == 0 || Pil_Ket.getSelectedIndex() == 0) {

                        JOptionPane.showMessageDialog(this, "Semua data harus diisi sebelum menyimpan!");

                } else {

                       
                    
                        JOptionPane.showMessageDialog(this, "Data telah disimpan!");

                        try {

                                String sql = "INSERT INTO mahasiswa (Nama, NIM, Kelas, Jurusan, Keterangan) VALUES ('"
                                                + txt_nama.getText() + "','"
                                                + txt_NIM1.getText() + "','"
                                                + txt_kelas.getText() + "','"
                                                + Pil_Jur1.getSelectedItem() + "','"
                                                + Pil_Ket.getSelectedItem() + "')";

                                Connection conn = (Connection) ConnectDB.connectDatabase();
                                PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);

                                pst.execute();

                        } catch (SQLException ex) {

                                Logger.getLogger(InDataForm.class.getName()).log(Level.SEVERE, null, ex);

                        }
                        
                       FormNav formPil = new FormNav();
                       formPil.setVisible(true);
                       this.getDesktopPane().add(formPil);
                       this.dispose();

                }

        }// GEN-LAST:event_SaveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelleteButton;
    private javax.swing.JComboBox<String> Pil_Jur1;
    private javax.swing.JComboBox<String> Pil_Ket;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txt_NIM1;
    private javax.swing.JTextField txt_kelas;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
