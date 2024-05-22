/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uaspbo;

/**
 *
 * @author EXPERT-03
 */
public class PenjualanTiketBioskop extends javax.swing.JFrame {
    int reguler,premier,velvet,harga,beli,total,bayar,kembali;

    /**
     * Creates new form PenjualanTiketBioskop
     */
    public PenjualanTiketBioskop() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kursi = new javax.swing.JComboBox<>();
        jt_reguler = new javax.swing.JRadioButton();
        jt_premier = new javax.swing.JRadioButton();
        txt_harga = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_jumlahbeli = new javax.swing.JTextField();
        txt_totalbayar = new javax.swing.JTextField();
        txt_pembayaran = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_input = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        jt_velvet = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Penjualan Tiket Bisokop");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 20));

        jLabel2.setText("Kursi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setText("Jenis Tiket");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setText("Harga Satuan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        kursi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "A", "B", "C", "D" }));
        kursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiActionPerformed(evt);
            }
        });
        jPanel1.add(kursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 70, -1));

        jt_reguler.setText("Reguler");
        jPanel1.add(jt_reguler, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jt_premier.setText("Premier");
        jPanel1.add(jt_premier, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));
        jPanel1.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(null), "Data Pembelian", null, null, new java.awt.Font("Tahoma", 0, 11))); // NOI18N
        jPanel2.setToolTipText("");

        jLabel5.setText("Nama Pembeli");

        jLabel6.setText("Jumlah Beli");

        jLabel7.setText("Total Bayar");

        jLabel8.setText("Pembayaran");

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        txt_jumlahbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahbeliActionPerformed(evt);
            }
        });

        txt_totalbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalbayarActionPerformed(evt);
            }
        });

        txt_pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pembayaranActionPerformed(evt);
            }
        });

        txt_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembalianActionPerformed(evt);
            }
        });

        jLabel9.setText("kembalian");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(24, 24, 24)
                                .addComponent(txt_jumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_jumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel10))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 200, 150));

        btn_input.setText("Input Data");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        jPanel1.add(btn_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        btn_print.setText("Print Data");
        jPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 250, 240));

        jt_velvet.setText("Velvet");
        jt_velvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_velvetActionPerformed(evt);
            }
        });
        jPanel1.add(jt_velvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_jumlahbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahbeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jumlahbeliActionPerformed

    private void txt_totalbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalbayarActionPerformed

    private void txt_pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pembayaranActionPerformed

    private void txt_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kembalianActionPerformed

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void jt_velvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_velvetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_velvetActionPerformed

    private void kursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiActionPerformed
        // TODO add your handling code here:
        // menentukan harga tiket
        if(kursi.getSelectedItem().equals("Pilih Kursi"))
        {
            buttonGroup1.clearSelection();
            txt_harga.setText("");
        } else if (kursi.getSelectedItem().equals("A"))
        {
            reguler = 30000;
            premier = 100000;
            velvet = 160000;
        }else if(kursi.getSelectedItem().equals("B"))
        {
            reguler = 30000;
            premier = 100000;
            velvet = 160000; 
        }else if(kursi.getSelectedItem().equals("C"))
        {
            reguler = 30000;
            premier = 100000;
            velvet = 160000;
        }else if(kursi.getSelectedItem().equals("D"))
        {
            reguler = 30000;
            premier = 100000;
            velvet = 160000;
        }
    }//GEN-LAST:event_kursiActionPerformed

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
            java.util.logging.Logger.getLogger(PenjualanTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenjualanTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenjualanTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenjualanTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenjualanTiketBioskop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jt_premier;
    private javax.swing.JRadioButton jt_reguler;
    private javax.swing.JRadioButton jt_velvet;
    private javax.swing.JComboBox<String> kursi;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlahbeli;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_pembayaran;
    private javax.swing.JTextField txt_totalbayar;
    // End of variables declaration//GEN-END:variables
}
