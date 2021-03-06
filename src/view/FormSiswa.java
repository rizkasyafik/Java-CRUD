/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
    import java.sql.Connection; 
    import java.sql.ResultSet;
    import java.sql.Statement; 
    import javax.swing.JOptionPane; 
    import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class FormSiswa extends javax.swing.JFrame {

    public Statement st;   
    public ResultSet rs;    
    public DefaultTableModel tabModel;     
    Connection cn = koneksi.Koneksi.Koneksi();

   public void crud(){
       Object[] crud = {
           "NIS", "Nama", "Jurusan", "JK", "Alamat"
       };
       tabModel = new DefaultTableModel (null, crud);
       tableSiswa.setModel(tabModel);
   }
   
   public void tampilData(String where) {
       try {  
           st = cn.createStatement();
           tabModel.getDataVector().removeAllElements();   
           tabModel.fireTableDataChanged();    
           rs = st.executeQuery("SELECT * FROM siswa " + where);    
           
           while (rs.next()) {
                Object[] data = {      
                    rs.getString("nis"),  
                    rs.getString("nama"),        
                    rs.getString("jurusan"),      
                    rs.getString("jk"),      
                    rs.getString("alamat"),
                };
                 tabModel.addRow(data); 
           }
        } catch(Exception e) {
             e.printStackTrace();
            }
        }
   
    public void reset(){
        inputUsername.setText("");
        inputNama.setText("");
        inputAlamat.setText("");
        inputJurusan.setSelectedItem("");
        inputJK.setSelectedItem("");
        
         inputUsername.setEnabled(true);
         btnSimpan.setEnabled(true);
         btnUpdate.setEnabled(false);
         btnHapus.setEnabled(false);
    }
    /**
     * Creates new form FormSiswa
     */
    public FormSiswa() {
        initComponents();
        crud();  
        tampilData(""); 
        
        btnHapus.setEnabled(false);  
        btnUpdate.setEnabled(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputJurusan = new javax.swing.JComboBox<>();
        inputJK = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputAlamat = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Form Siswa");

        tableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSiswa);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NIS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Jurusan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("JK");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Alamat");

        inputJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RPL", "TKJ", "MM", "MKT", "TPM", "TKR", "TL", "BO", "APHP", "ATPH" }));

        inputJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        inputAlamat.setColumns(20);
        inputAlamat.setRows(5);
        jScrollPane2.setViewportView(inputAlamat);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputUsername)
                            .addComponent(inputNama)
                            .addComponent(inputJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputJK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHapus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReset)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(inputJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnHapus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnReset)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try{
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO siswa VALUES('" + inputUsername.getText() + "','"
                + inputNama.getText() + "','"
                + inputJurusan.getSelectedItem() + "','"
                + inputJK.getSelectedItem() + "','"
                + inputAlamat.getText() + "')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");    
            inputUsername.setText("");
            inputNama.setText("");
            inputAlamat.setText("");
            inputJurusan.setSelectedItem("");
            inputJK.setSelectedItem("");
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiswaMouseClicked
        inputUsername.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 0).toString());
        inputNama.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 1).toString());
        inputAlamat.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 4).toString());
        inputJurusan.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 2).toString());
        inputJK.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 3).toString());
        
        inputUsername.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnHapus.setEnabled(true);
    }//GEN-LAST:event_tableSiswaMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
          try{
            st = cn.createStatement();
            st.executeUpdate("UPDATE siswa SET " 
                +"nis='"     + inputUsername.getText() + "',"
                +"nama='"    + inputNama.getText() + "',"
                +"jurusan='" + inputJurusan.getSelectedItem() + "',"
                +"jk='"      + inputJK.getSelectedItem() + "',"
                +"alamat='"  + inputAlamat.getText()+"' WHERE nis='"
                +tabModel.getValueAt(tableSiswa.getSelectedRow(), 0)+"'");  
            tampilData("");
            JOptionPane.showMessageDialog(null, "Berhasil Mengubah");    
            reset();
             inputUsername.setEnabled(true);
             btnSimpan.setEnabled(true);
             btnUpdate.setEnabled(false);
             btnHapus.setEnabled(false);
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
      try{
          int jawab;
          
          if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus Data?", "Konfirmasi", JOptionPane.YES_NO_OPTION))==0){
                st = cn.createStatement();
                    st.executeUpdate("DELETE FROM siswa WHERE nis='"
                    + tabModel.getValueAt(tableSiswa.getSelectedRow(), 0)+"'");
                    tampilData("");
                    reset();
                    inputUsername.setEnabled(true);
                    btnSimpan.setEnabled(true);
                    btnUpdate.setEnabled(false);
                    btnHapus.setEnabled(false);
          }
      } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextArea inputAlamat;
    private javax.swing.JComboBox<String> inputJK;
    private javax.swing.JComboBox<String> inputJurusan;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableSiswa;
    // End of variables declaration//GEN-END:variables
}
