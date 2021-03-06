/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica_Galic_4e;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Galic
 */
public class ZaboravljenaLozinka extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public ZaboravljenaLozinka() {
        initComponents();
        conn = JavaConnect.connectDB();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    public void traziLozinku(){
        
        String username = korisnicko_ime_dohvacanjeLozinke_JTextField.getText();
        String sql = "SELECT * FROM korisnik WHERE username_korisnik = '" + username + "'";
        
        /*pretraživanje korisničkog imena, ako postoji, onda zaljepi u textField za sigurnosno
        pitanje njegovo pitanje, ako nema tog imena, onda baci obavijest
        */
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                pitanje_zaboravljenaLozinka_JTextField.setText(rs.getString(5));
                rs.close();
                pst.close();
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Neispravno korisničko ime, pokušajte ponovo!");
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void dohvatiLozinku(){
        
        String odgovor = odgovor_zaboravljenaLozinka_JTextField.getText();
        String username = korisnicko_ime_dohvacanjeLozinke_JTextField.getText();
        String sql = "SELECT * FROM korisnik WHERE odgovor_korisnik = '" + odgovor + "'" + "AND username_korisnik = '" + username + "'";
        
        //int brPokusaja = 0;
        
        /*dohvaćanje lozinke, ako je odgovor na sigurnosno pitanje točan, onda
        baci lozinku u predviđeni textField, ako ne, nemoj bacit lozinku
        */
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                lozinka_zaboravljenaLozinka_JTextField.setText(rs.getString(4));
                rs.close();
                pst.close();
            }
            
            else{
                //brPokusaja++;
                
                /*if(brPokusaja == 3){                  
                JOptionPane.showMessageDialog(null, "Unijeli ste 3 puta pogrešan odgovor, gasim program!");
                    System.exit(0);
                }   */    
                JOptionPane.showMessageDialog(null, "Neispravni odgovor na pitanje, pokušajte ponovo!");
           }                    
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
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

        naslov_dohvacanjeLozinke_JLabel = new javax.swing.JLabel();
        korisnicko_ime_dohvacanjeLozinke_JLabel = new javax.swing.JLabel();
        korisnicko_ime_dohvacanjeLozinke_JTextField = new javax.swing.JTextField();
        trazi_dohvacanjeLozinke_JButton = new javax.swing.JButton();
        pitanje_zaboravljenaLozinka_JLabel = new javax.swing.JLabel();
        pitanje_zaboravljenaLozinka_JTextField = new javax.swing.JTextField();
        odgovor_zaboravljenaLozinka_JLabel = new javax.swing.JLabel();
        odgovor_zaboravljenaLozinka_JTextField = new javax.swing.JTextField();
        lozinka_zaboravljenaLozinka_JLabel = new javax.swing.JLabel();
        lozinka_zaboravljenaLozinka_JTextField = new javax.swing.JTextField();
        dohvatiLozinku_zaboravljenaLozinka_JButton = new javax.swing.JButton();
        natrag_zaboravljenaLozinka_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        naslov_dohvacanjeLozinke_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        naslov_dohvacanjeLozinke_JLabel.setForeground(new java.awt.Color(0, 0, 255));
        naslov_dohvacanjeLozinke_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naslov_dohvacanjeLozinke_JLabel.setText("Dohvaćanje zaboravljene lozinke");
        naslov_dohvacanjeLozinke_JLabel.setToolTipText("");
        naslov_dohvacanjeLozinke_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        naslov_dohvacanjeLozinke_JLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        korisnicko_ime_dohvacanjeLozinke_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        korisnicko_ime_dohvacanjeLozinke_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        korisnicko_ime_dohvacanjeLozinke_JLabel.setText("Korisničko ime");

        korisnicko_ime_dohvacanjeLozinke_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        trazi_dohvacanjeLozinke_JButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trazi_dohvacanjeLozinke_JButton.setText("Traži");
        trazi_dohvacanjeLozinke_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazi_dohvacanjeLozinke_JButtonActionPerformed(evt);
            }
        });

        pitanje_zaboravljenaLozinka_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pitanje_zaboravljenaLozinka_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pitanje_zaboravljenaLozinka_JLabel.setText("Sigurnosno pitanje");

        odgovor_zaboravljenaLozinka_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        odgovor_zaboravljenaLozinka_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        odgovor_zaboravljenaLozinka_JLabel.setText("Odgovor");

        lozinka_zaboravljenaLozinka_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lozinka_zaboravljenaLozinka_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lozinka_zaboravljenaLozinka_JLabel.setText("Lozinka");

        dohvatiLozinku_zaboravljenaLozinka_JButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dohvatiLozinku_zaboravljenaLozinka_JButton.setText("Dohvati lozinku");
        dohvatiLozinku_zaboravljenaLozinka_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dohvatiLozinku_zaboravljenaLozinka_JButtonActionPerformed(evt);
            }
        });

        natrag_zaboravljenaLozinka_JButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        natrag_zaboravljenaLozinka_JButton.setText("Natrag");
        natrag_zaboravljenaLozinka_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natrag_zaboravljenaLozinka_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(korisnicko_ime_dohvacanjeLozinke_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(korisnicko_ime_dohvacanjeLozinke_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(odgovor_zaboravljenaLozinka_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pitanje_zaboravljenaLozinka_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lozinka_zaboravljenaLozinka_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(odgovor_zaboravljenaLozinka_JTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pitanje_zaboravljenaLozinka_JTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lozinka_zaboravljenaLozinka_JTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trazi_dohvacanjeLozinke_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dohvatiLozinku_zaboravljenaLozinka_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(natrag_zaboravljenaLozinka_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(naslov_dohvacanjeLozinke_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(naslov_dohvacanjeLozinke_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(korisnicko_ime_dohvacanjeLozinke_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(korisnicko_ime_dohvacanjeLozinke_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trazi_dohvacanjeLozinke_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pitanje_zaboravljenaLozinka_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pitanje_zaboravljenaLozinka_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odgovor_zaboravljenaLozinka_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odgovor_zaboravljenaLozinka_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dohvatiLozinku_zaboravljenaLozinka_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lozinka_zaboravljenaLozinka_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lozinka_zaboravljenaLozinka_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(natrag_zaboravljenaLozinka_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void natrag_zaboravljenaLozinka_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natrag_zaboravljenaLozinka_JButtonActionPerformed
        setVisible(false);
        new Prijava().setVisible(true);
    }//GEN-LAST:event_natrag_zaboravljenaLozinka_JButtonActionPerformed

    private void trazi_dohvacanjeLozinke_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazi_dohvacanjeLozinke_JButtonActionPerformed
        traziLozinku(); 
    }//GEN-LAST:event_trazi_dohvacanjeLozinke_JButtonActionPerformed

    private void dohvatiLozinku_zaboravljenaLozinka_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dohvatiLozinku_zaboravljenaLozinka_JButtonActionPerformed
        dohvatiLozinku();
    }//GEN-LAST:event_dohvatiLozinku_zaboravljenaLozinka_JButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ZaboravljenaLozinka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZaboravljenaLozinka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZaboravljenaLozinka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZaboravljenaLozinka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ZaboravljenaLozinka().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dohvatiLozinku_zaboravljenaLozinka_JButton;
    private javax.swing.JLabel korisnicko_ime_dohvacanjeLozinke_JLabel;
    private javax.swing.JTextField korisnicko_ime_dohvacanjeLozinke_JTextField;
    private javax.swing.JLabel lozinka_zaboravljenaLozinka_JLabel;
    private javax.swing.JTextField lozinka_zaboravljenaLozinka_JTextField;
    private javax.swing.JLabel naslov_dohvacanjeLozinke_JLabel;
    private javax.swing.JButton natrag_zaboravljenaLozinka_JButton;
    private javax.swing.JLabel odgovor_zaboravljenaLozinka_JLabel;
    private javax.swing.JTextField odgovor_zaboravljenaLozinka_JTextField;
    private javax.swing.JLabel pitanje_zaboravljenaLozinka_JLabel;
    private javax.swing.JTextField pitanje_zaboravljenaLozinka_JTextField;
    private javax.swing.JButton trazi_dohvacanjeLozinke_JButton;
    // End of variables declaration//GEN-END:variables
}
