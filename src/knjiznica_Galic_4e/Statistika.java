/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica_Galic_4e;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Galic
 */
public class Statistika extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    /**
     * Creates new form Statistika
     */
    public Statistika() {
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

        naslov_Statistika_JLabel = new javax.swing.JLabel();
        natrag_Statistika_JButton = new javax.swing.JButton();
        ucenici_Statistika_JLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ucenici_Statistika_JTable = new javax.swing.JTable();
        knjige_Statistika_JLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        knjige_Statistika_JTable = new javax.swing.JTable();
        prikazi_Statistika_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        naslov_Statistika_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        naslov_Statistika_JLabel.setForeground(new java.awt.Color(0, 0, 255));
        naslov_Statistika_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naslov_Statistika_JLabel.setText("Statistika");

        natrag_Statistika_JButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        natrag_Statistika_JButton.setText("Natrag");
        natrag_Statistika_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natrag_Statistika_JButtonActionPerformed(evt);
            }
        });

        ucenici_Statistika_JLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ucenici_Statistika_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ucenici_Statistika_JLabel.setText("Učenici u knjižnici");

        ucenici_Statistika_JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(ucenici_Statistika_JTable);

        knjige_Statistika_JLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        knjige_Statistika_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        knjige_Statistika_JLabel.setText("Knjige u knjižnici");

        knjige_Statistika_JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(knjige_Statistika_JTable);

        prikazi_Statistika_jButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prikazi_Statistika_jButton.setForeground(new java.awt.Color(0, 0, 255));
        prikazi_Statistika_jButton.setText("Prikaži statistiku");
        prikazi_Statistika_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prikazi_Statistika_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(ucenici_Statistika_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(knjige_Statistika_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prikazi_Statistika_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(natrag_Statistika_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(naslov_Statistika_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(naslov_Statistika_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ucenici_Statistika_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(knjige_Statistika_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(natrag_Statistika_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prikazi_Statistika_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void natrag_Statistika_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natrag_Statistika_JButtonActionPerformed
        setVisible(false);
        new Glavna().setVisible(true);
    }//GEN-LAST:event_natrag_Statistika_JButtonActionPerformed

    private void prikazi_Statistika_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prikazi_Statistika_jButtonActionPerformed
        
        //ispis statistike za ucenike
        try{
           //SQL upit
           String sql_ucenici = "SELECT ime_ucenik AS 'Ime učenika', prezime_ucenik AS 'Prezime učenika', razred_ucenik AS Razred FROM ucenik";          
           
           pst = conn.prepareStatement(sql_ucenici);
           rs = pst.executeQuery();
           
           ucenici_Statistika_JTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        //ispis statistike za knjige
        try{
            //SQL upit
            String sql_knjige = "SELECT naslov_knjiga AS 'Naslov djela', autor_knjiga AS 'Autor djela', godIzdanja_knjiga AS 'Godina izdanja', broj_stranica_knjiga AS 'Broj stranica' FROM knjiga";
            
            pst = conn.prepareStatement(sql_knjige);
            rs = pst.executeQuery();
            
            knjige_Statistika_JTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_prikazi_Statistika_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Statistika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Statistika().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel knjige_Statistika_JLabel;
    private javax.swing.JTable knjige_Statistika_JTable;
    private javax.swing.JLabel naslov_Statistika_JLabel;
    private javax.swing.JButton natrag_Statistika_JButton;
    private javax.swing.JButton prikazi_Statistika_jButton;
    private javax.swing.JLabel ucenici_Statistika_JLabel;
    private javax.swing.JTable ucenici_Statistika_JTable;
    // End of variables declaration//GEN-END:variables
}