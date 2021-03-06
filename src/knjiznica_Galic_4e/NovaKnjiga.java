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
public class NovaKnjiga extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    
    public NovaKnjiga() {
        initComponents();
        conn = JavaConnect.connectDB();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        naslov_novaKnjiga_JLabel = new javax.swing.JLabel();
        IDKnjige_novaKnjiga_JLabel = new javax.swing.JLabel();
        naslovKnjige_novaKnjiga_JLabel = new javax.swing.JLabel();
        autorKnjige_novaKnjiga_JLabel = new javax.swing.JLabel();
        IDKnjige_novaKnjiga_JTextField = new javax.swing.JTextField();
        naslovKnjige_novaKnjiga_JTextField = new javax.swing.JTextField();
        autorKnjige_novaKnjiga_JTextField = new javax.swing.JTextField();
        godIzdanja_novaKnjiga_JLabel = new javax.swing.JLabel();
        godIzdanja_novaKnjiga_JTextField = new javax.swing.JTextField();
        brojStranica_novaKnjiga_JLabel = new javax.swing.JLabel();
        brojStranica_novaKnjiga_JTextField = new javax.swing.JTextField();
        spremi_novaKnjiga_JButton = new javax.swing.JButton();
        natrag_novaKnjiga_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        naslov_novaKnjiga_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        naslov_novaKnjiga_JLabel.setForeground(new java.awt.Color(0, 0, 255));
        naslov_novaKnjiga_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naslov_novaKnjiga_JLabel.setText("Nova knjiga");
        naslov_novaKnjiga_JLabel.setToolTipText("");
        naslov_novaKnjiga_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        naslov_novaKnjiga_JLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        IDKnjige_novaKnjiga_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        IDKnjige_novaKnjiga_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDKnjige_novaKnjiga_JLabel.setText("ID knjige");

        naslovKnjige_novaKnjiga_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        naslovKnjige_novaKnjiga_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naslovKnjige_novaKnjiga_JLabel.setText("Naslov knjige");

        autorKnjige_novaKnjiga_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        autorKnjige_novaKnjiga_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        autorKnjige_novaKnjiga_JLabel.setText("Autor knjige");

        IDKnjige_novaKnjiga_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        naslovKnjige_novaKnjiga_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        autorKnjige_novaKnjiga_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        godIzdanja_novaKnjiga_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        godIzdanja_novaKnjiga_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        godIzdanja_novaKnjiga_JLabel.setText("Godina izdanja");

        godIzdanja_novaKnjiga_JTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        brojStranica_novaKnjiga_JLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brojStranica_novaKnjiga_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brojStranica_novaKnjiga_JLabel.setText("Broj stranica");

        spremi_novaKnjiga_JButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spremi_novaKnjiga_JButton.setText("Spremi");
        spremi_novaKnjiga_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spremi_novaKnjiga_JButtonActionPerformed(evt);
            }
        });

        natrag_novaKnjiga_JButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        natrag_novaKnjiga_JButton.setText("Natrag");
        natrag_novaKnjiga_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natrag_novaKnjiga_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(naslov_novaKnjiga_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(naslovKnjige_novaKnjiga_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(IDKnjige_novaKnjiga_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(autorKnjige_novaKnjiga_JLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(autorKnjige_novaKnjiga_JTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naslovKnjige_novaKnjiga_JTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDKnjige_novaKnjiga_JTextField))))
                .addGap(137, 137, 137))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(godIzdanja_novaKnjiga_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(godIzdanja_novaKnjiga_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(spremi_novaKnjiga_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(natrag_novaKnjiga_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(brojStranica_novaKnjiga_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(brojStranica_novaKnjiga_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(naslov_novaKnjiga_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDKnjige_novaKnjiga_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(naslovKnjige_novaKnjiga_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(autorKnjige_novaKnjiga_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDKnjige_novaKnjiga_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(naslovKnjige_novaKnjiga_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(autorKnjige_novaKnjiga_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(godIzdanja_novaKnjiga_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(godIzdanja_novaKnjiga_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brojStranica_novaKnjiga_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brojStranica_novaKnjiga_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spremi_novaKnjiga_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(natrag_novaKnjiga_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spremi_novaKnjiga_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spremi_novaKnjiga_JButtonActionPerformed
        
        if(IDKnjige_novaKnjiga_JTextField.getText().isEmpty() || naslovKnjige_novaKnjiga_JTextField.getText().isEmpty() ||
           autorKnjige_novaKnjiga_JTextField.getText().isEmpty() || godIzdanja_novaKnjiga_JTextField.getText().isEmpty() ||
           brojStranica_novaKnjiga_JTextField.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Morate ispuniti sva polja!");
        }
        
        else{
        //upisivanje une??enih podataka za novu knjigu u bazu
        try{ 
            //SQL upit
            String sql = "INSERT INTO knjiga (ID_knjiga, naslov_knjiga, autor_knjiga, godIzdanja_knjiga, broj_stranica_knjiga, brPosudbi_knjiga) VALUES (?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            
            //postavljanje podataka kojih smo upisali u textFields u bazu na njihova predvi??ena mjesta
            pst.setString(1, IDKnjige_novaKnjiga_JTextField.getText());
            pst.setString(2, naslovKnjige_novaKnjiga_JTextField.getText());
            pst.setString(3, autorKnjige_novaKnjiga_JTextField.getText());
            pst.setString(4, godIzdanja_novaKnjiga_JTextField.getText());
            pst.setString(5, brojStranica_novaKnjiga_JTextField.getText());
            pst.setString(6, "0");
            
            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null, "Nova knjiga uspje??no upisana u knji??nicu!");
            
            conn.close();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
      }
    }//GEN-LAST:event_spremi_novaKnjiga_JButtonActionPerformed

    private void natrag_novaKnjiga_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natrag_novaKnjiga_JButtonActionPerformed
        setVisible(false);
        new Glavna().setVisible(true);
    }//GEN-LAST:event_natrag_novaKnjiga_JButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaKnjiga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NovaKnjiga().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDKnjige_novaKnjiga_JLabel;
    private javax.swing.JTextField IDKnjige_novaKnjiga_JTextField;
    private javax.swing.JLabel autorKnjige_novaKnjiga_JLabel;
    private javax.swing.JTextField autorKnjige_novaKnjiga_JTextField;
    private javax.swing.JLabel brojStranica_novaKnjiga_JLabel;
    private javax.swing.JTextField brojStranica_novaKnjiga_JTextField;
    private javax.swing.JLabel godIzdanja_novaKnjiga_JLabel;
    private javax.swing.JTextField godIzdanja_novaKnjiga_JTextField;
    private javax.swing.JLabel naslovKnjige_novaKnjiga_JLabel;
    private javax.swing.JTextField naslovKnjige_novaKnjiga_JTextField;
    private javax.swing.JLabel naslov_novaKnjiga_JLabel;
    private javax.swing.JButton natrag_novaKnjiga_JButton;
    private javax.swing.JButton spremi_novaKnjiga_JButton;
    // End of variables declaration//GEN-END:variables
}
