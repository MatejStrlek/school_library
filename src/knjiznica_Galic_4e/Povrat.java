
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knjiznica_Galic_4e;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.Date;

/**
 *
 * @author Galic
 */
public class Povrat extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    private String IDPos;
    private int odabrana = -1;
    
    //setter za odabranu
    public void setOdabrana(int odabrana){  
        this.odabrana = odabrana;    
    }
    
    //getter za odabranu
    public int getOdabrana(){ 
        return odabrana;
    }
    
    //setter za IDPos
    public void setIDPos(String IDPos){  
        this.IDPos = IDPos;    
    }
    
    //getter za IDPos
    public String getIDPos(){ 
        return IDPos;
    }
    
    /**
     * Creates new form Povrat
     */
    public Povrat() {
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

        naslov_povrat_JLabel = new javax.swing.JLabel();
        IDUcenika_povrat_JLabel = new javax.swing.JLabel();
        IDUcenika_povrat_JTextField = new javax.swing.JTextField();
        trazi_povrat_jButton = new javax.swing.JButton();
        vratiKnjigu_povrat_jButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rezultatPretrage_Povrat_JTable = new javax.swing.JTable();
        natrag_Povrat_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        naslov_povrat_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        naslov_povrat_JLabel.setForeground(new java.awt.Color(0, 0, 255));
        naslov_povrat_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        naslov_povrat_JLabel.setText("Povrat");
        naslov_povrat_JLabel.setToolTipText("");
        naslov_povrat_JLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        naslov_povrat_JLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        IDUcenika_povrat_JLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDUcenika_povrat_JLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDUcenika_povrat_JLabel.setText("ID učenika");

        trazi_povrat_jButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        trazi_povrat_jButton.setText("Traži");
        trazi_povrat_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trazi_povrat_jButtonActionPerformed(evt);
            }
        });

        vratiKnjigu_povrat_jButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vratiKnjigu_povrat_jButton.setText("Vrati knjigu");
        vratiKnjigu_povrat_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vratiKnjigu_povrat_jButtonActionPerformed(evt);
            }
        });

        rezultatPretrage_Povrat_JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(rezultatPretrage_Povrat_JTable);

        natrag_Povrat_JButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        natrag_Povrat_JButton.setText("Natrag");
        natrag_Povrat_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natrag_Povrat_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(natrag_Povrat_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDUcenika_povrat_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IDUcenika_povrat_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trazi_povrat_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(vratiKnjigu_povrat_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(naslov_povrat_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(naslov_povrat_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDUcenika_povrat_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDUcenika_povrat_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trazi_povrat_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vratiKnjigu_povrat_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(natrag_Povrat_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trazi_povrat_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trazi_povrat_jButtonActionPerformed
       
        String id = IDUcenika_povrat_JTextField.getText();
        
        //povrat posuđene knjige
        try{
            /*SQL upit, provjeravamo da li je učenik sa unesenim ID-om posudio knjigu, ako je, da li ju je vratio, ako
            nije, onda će se izbaciti u tablici, ako je već vratio, neće se prikazati*/
        String sql = "SELECT ID_posudba AS 'ID posudbe', ime_ucenik AS 'Ime učenika', prezime_ucenik AS 'Prezime učenika', naslov_knjiga AS 'Naslov djela', autor_knjiga AS 'Autor djela' FROM ucenik, knjiga, posudba" +
                " WHERE posudba.ucenik_posudba = ucenik.ID_ucenik" +
                " AND posudba.knjiga_posudba = knjiga.ID_knjiga" +
                " AND posudba.ucenik_posudba = '" + id + "'" +
                " AND datum_povrata_posudba is NULL";
        
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Učenik sa tim ID-om ne mora ništa vratit ili nije pronađen!");
            }
            
            rs = pst.executeQuery();
            rezultatPretrage_Povrat_JTable.setModel(DbUtils.resultSetToTableModel(rs));
            
            //Event Listener koji čeka da mi kliknemo na određeni podatak u tablici
            rezultatPretrage_Povrat_JTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    
                    //postavljanje odabranog reda u varijablu odabrana 
                    setOdabrana(rezultatPretrage_Povrat_JTable.getSelectedRow());
                    
                    try{
                        rs = pst.executeQuery();
                        
                        //brojač koji se miče po tablici rezultata
                        int i = 0;
                        
                        //pomicanje po tablici dok ne dođemo do odabranog retka
                        while(i <= getOdabrana()){
                            rs.next();
                            i++;
                        }
                        
                        /*u odabranom retku dohvaćamo element iz prvog stupca
                        zatim ga pohranjujemo u varijablu IDPos
                        */
                        setIDPos(rs.getString(1));        
                            
                    }
                    catch(SQLException f){
                        JOptionPane.showMessageDialog(null, f);
                    }
                }            
            });
            
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_trazi_povrat_jButtonActionPerformed

    private void natrag_Povrat_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natrag_Povrat_JButtonActionPerformed
        setVisible(false);
        new Glavna().setVisible(true);
    }//GEN-LAST:event_natrag_Povrat_JButtonActionPerformed

    private void vratiKnjigu_povrat_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vratiKnjigu_povrat_jButtonActionPerformed
        
        //instanciranje datuma
        Date date = new Date();
        
        //treba kliknuti redak u tablici
        if(getOdabrana() == -1){
            JOptionPane.showMessageDialog(null, "Odaberite redak u tablici!");
        }
        
        //SQL upit, updateanje podataka u bazi, odnosno samo datuma povrata
        String sql = "UPDATE posudba SET datum_povrata_posudba = '" + date.toString() + "' WHERE ID_posudba = '" + getIDPos() + "'";
        
        try{
            pst = conn.prepareStatement(sql);
            pst.executeUpdate();
            
            //pst.close();
            
            JOptionPane.showMessageDialog(null, "Knjiga vraćena!");
            
            //conn.close();           
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        //postavljanje varijeble odabrana opet u defaultnu vrijednost -1
        setOdabrana(-1);
    }//GEN-LAST:event_vratiKnjigu_povrat_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Povrat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Povrat().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDUcenika_povrat_JLabel;
    private javax.swing.JTextField IDUcenika_povrat_JTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel naslov_povrat_JLabel;
    private javax.swing.JButton natrag_Povrat_JButton;
    private javax.swing.JTable rezultatPretrage_Povrat_JTable;
    private javax.swing.JButton trazi_povrat_jButton;
    private javax.swing.JButton vratiKnjigu_povrat_jButton;
    // End of variables declaration//GEN-END:variables
}
