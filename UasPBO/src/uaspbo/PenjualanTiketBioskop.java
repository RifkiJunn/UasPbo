/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uaspbo;
import javax.swing.JOptionPane;
/**
 *
 * @author EXPERT-03
 */
public class PenjualanTiketBioskop extends javax.swing.JFrame {
    private Ticket reguler, premier, velvet;

    /**
     * Creates new form PenjualanTiketBioskop
     */
    public PenjualanTiketBioskop() {
        initComponents();
        initializeTickets();
    }
    
    private void initializeTickets(){
        reguler = new RegularTicket();
        premier = new PremierTicket();
        velvet = new VelvetTicket();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenistiket = new javax.swing.ButtonGroup();
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
        btn_keluar = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        jt_velvet = new javax.swing.JRadioButton();
        Film = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 30, 20));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setText("Penjualan Tiket Bioskop");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Kursi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Jenis Tiket");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Harga Satuan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        kursi.setBackground(new java.awt.Color(175, 130, 96));
        kursi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "A", "B", "C", "D" }));
        kursi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kursiActionPerformed(evt);
            }
        });
        jPanel1.add(kursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, -1));

        jenistiket.add(jt_reguler);
        jt_reguler.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jt_reguler.setText("Reguler");
        jt_reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_regulerActionPerformed(evt);
            }
        });
        jPanel1.add(jt_reguler, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jenistiket.add(jt_premier);
        jt_premier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jt_premier.setText("Premier");
        jt_premier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_premierActionPerformed(evt);
            }
        });
        jPanel1.add(jt_premier, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        txt_harga.setBackground(new java.awt.Color(175, 130, 96));
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 90, -1));

        jPanel2.setBackground(new java.awt.Color(155, 57, 34));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data Pembelian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11))); // NOI18N
        jPanel2.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Nama Pembeli");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Jumlah Beli");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Total Bayar");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Pembayaran");

        txt_nama.setBackground(new java.awt.Color(175, 130, 96));
        txt_nama.setForeground(new java.awt.Color(51, 51, 51));
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        txt_jumlahbeli.setBackground(new java.awt.Color(175, 130, 96));
        txt_jumlahbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahbeliActionPerformed(evt);
            }
        });
        txt_jumlahbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_jumlahbeliKeyReleased(evt);
            }
        });

        txt_totalbayar.setBackground(new java.awt.Color(175, 130, 96));
        txt_totalbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalbayarActionPerformed(evt);
            }
        });

        txt_pembayaran.setBackground(new java.awt.Color(175, 130, 96));
        txt_pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pembayaranActionPerformed(evt);
            }
        });
        txt_pembayaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pembayaranKeyReleased(evt);
            }
        });

        txt_kembalian.setBackground(new java.awt.Color(175, 130, 96));
        txt_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembalianActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_totalbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 210));

        btn_keluar.setBackground(new java.awt.Color(249, 115, 0));
        btn_keluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        btn_print.setBackground(new java.awt.Color(249, 115, 0));
        btn_print.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_print.setText("Print Data");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel1.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        txt_area.setBackground(new java.awt.Color(155, 57, 34));
        txt_area.setColumns(20);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 250, 270));

        jenistiket.add(jt_velvet);
        jt_velvet.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jt_velvet.setText("Velvet");
        jt_velvet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_velvetActionPerformed(evt);
            }
        });
        jPanel1.add(jt_velvet, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        Film.setBackground(new java.awt.Color(175, 130, 96));
        Film.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih", "Demon Slayer", "HAIKYU!! ", "THE GARFIELD", "TEMURIN" }));
        Film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilmActionPerformed(evt);
            }
        });
        jPanel1.add(Film, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Film");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uaspbo/Panel 3.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 675, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_jumlahbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahbeliActionPerformed
        // TODO add your handling code here:
        // menginputkan jumlah tiket dan total pembayaran
        try {
        int beli = Integer.parseInt(txt_jumlahbeli.getText());
        int harga = Integer.parseInt(txt_harga.getText());
        int total = beli * harga;
        txt_totalbayar.setText(String.valueOf(total));
        }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan jumlah beli dan harga yang valid.");
    }
    }//GEN-LAST:event_txt_jumlahbeliActionPerformed

    private void txt_totalbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalbayarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_totalbayarActionPerformed

    private void txt_pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pembayaranActionPerformed
        // TODO add your handling code here:
        try {
        int bayar = Integer.parseInt(txt_pembayaran.getText());
        int totalBayar = Integer.parseInt(txt_totalbayar.getText());
        int kembali = bayar - totalBayar;
        txt_kembalian.setText(String.valueOf(kembali));
    }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan nilai pembayaran dan total bayar yang valid.");
    }
    }//GEN-LAST:event_txt_pembayaranActionPerformed

    private void txt_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kembalianActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
            int answer=JOptionPane.showConfirmDialog(null,"anda akan keluar","Keluar",JOptionPane.OK_OPTION);
        if(answer==JOptionPane.OK_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void jt_velvetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_velvetActionPerformed
        // TODO add your handling code here:
        if (jt_velvet.isSelected()) {
        txt_harga.setText(String.valueOf(velvet.getPrice()));
    }
    }//GEN-LAST:event_jt_velvetActionPerformed

    private void kursiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kursiActionPerformed
        // TODO add your handling code here:
        // menentukan harga tiket
        if(kursi.getSelectedItem().equals("Pilih Kursi"))
        {
            jenistiket.clearSelection();
            txt_harga.setText("");
        } else if (kursi.getSelectedItem().equals("A")) {
            reguler = new RegularTicket();
            premier = new PremierTicket();
            velvet = new VelvetTicket();
        } else if (kursi.getSelectedItem().equals("B")) {
            reguler = new RegularTicket();
            premier = new PremierTicket();
            velvet = new VelvetTicket();
        }else if (kursi.getSelectedItem().equals("C")) {
            reguler = new RegularTicket();
            premier = new PremierTicket();
            velvet = new VelvetTicket();
        }else if (kursi.getSelectedItem().equals("D")) {
            reguler = new RegularTicket();
            premier = new PremierTicket();
            velvet = new VelvetTicket();
        }
    }//GEN-LAST:event_kursiActionPerformed

    private void jt_regulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_regulerActionPerformed
        // TODO add your handling code here:
        if (jt_reguler.isSelected()) {
        txt_harga.setText(String.valueOf(reguler.getPrice()));
    }
    }//GEN-LAST:event_jt_regulerActionPerformed

    private void jt_premierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_premierActionPerformed
        // TODO add your handling code here:
        if (jt_premier.isSelected()) {
        txt_harga.setText(String.valueOf(premier.getPrice()));
    }
    }//GEN-LAST:event_jt_premierActionPerformed

    private void txt_jumlahbeliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlahbeliKeyReleased
        // Menginputkan jumlah tiket dan total pembayaran
    
        int beli = Integer.parseInt(txt_jumlahbeli.getText());
        int harga = Integer.parseInt(txt_harga.getText());
        int total = beli * harga;
        txt_totalbayar.setText(String.valueOf(total));
        
    
    }//GEN-LAST:event_txt_jumlahbeliKeyReleased

    private void txt_pembayaranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pembayaranKeyReleased
        // TODO add your handling code here:
        
        int bayar = Integer.parseInt(txt_pembayaran.getText());
        int totalBayar = Integer.parseInt(txt_totalbayar.getText());
        int kembali = bayar - totalBayar;
        txt_kembalian.setText(String.valueOf(kembali));
        
    
    }//GEN-LAST:event_txt_pembayaranKeyReleased

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
    if (isInputValid()) {
        int jumlahbayar = Integer.parseInt(txt_totalbayar.getText());
        int pembayaran = Integer.parseInt(txt_pembayaran.getText());
        
        if(pembayaran >= jumlahbayar){
            
        
        // Menampilkan data di txt_area
        txt_area.setText(
            "Nama Pembeli       : " + txt_nama.getText() + "\n" +
            "Nama Film          : " + Film.getSelectedItem() + "\n" +        
            "Tempat Kursi       : " + kursi.getSelectedItem() + "\n" +        
            "Jumlah Pembelian   : " + txt_jumlahbeli.getText() + "\n" +
            "Total Pembayaran   : " + txt_totalbayar.getText() + "\n" +
            "Pembayaran         : " + txt_pembayaran.getText() + "\n" +
            "Kembalian          : " + txt_kembalian.getText() + "\n"
        );
        // Membersihkan input setelah menampilkan data
        clearFields();
        }else {
            JOptionPane.showMessageDialog(this, "Uang anda kurang.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Semua data harus diisi sebelum mencetak.");
    }
    
}
    
    private void clearFields() {
        txt_nama.setText("");
        Film.setSelectedIndex(0);
        kursi.setSelectedIndex(0);
        txt_jumlahbeli.setText("");
        txt_harga.setText("");
        txt_totalbayar.setText("");
        txt_pembayaran.setText("");
        txt_kembalian.setText("");
}
    private boolean isInputValid() {
        return !txt_nama.getText().isEmpty() &&
               Film.getSelectedItem() != null && Film.getSelectedIndex() != 0 &&
               kursi.getSelectedItem() != null && kursi.getSelectedIndex() != 0 &&
               !txt_jumlahbeli.getText().isEmpty() &&
               !txt_harga.getText().isEmpty() &&
               !txt_totalbayar.getText().isEmpty() &&
               !txt_pembayaran.getText().isEmpty() &&
               !txt_kembalian.getText().isEmpty();

    }//GEN-LAST:event_btn_printActionPerformed

    private void FilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilmActionPerformed

    // Method untuk meng-update JTextArea dengan informasi terbaru
private void updateTextArea() {
    String jumlahBeli = txt_jumlahbeli.getText();
    String harga = txt_harga.getText();
    String totalBayar = txt_totalbayar.getText();
    String pembayaran = txt_pembayaran.getText();
    String kembalian = txt_kembalian.getText();
    
    // Update JTextArea dengan data yang relevan
    txt_area.setText("");
    txt_area.append("Jumlah Beli: " + jumlahBeli + "\n");
    txt_area.append("Harga: " + harga + "\n");
    txt_area.append("Total Bayar: " + totalBayar + "\n");
    txt_area.append("Pembayaran: " + pembayaran + "\n");
    txt_area.append("Kembalian: " + kembalian + "\n");
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
    private javax.swing.JComboBox<String> Film;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.ButtonGroup jenistiket;
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
