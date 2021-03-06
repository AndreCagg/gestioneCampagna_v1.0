/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionecampagna;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Logger;

/**
 *
 * @author caggi
 */
public class Aratura extends javax.swing.JFrame {

    private Integer id;
    private String proprieta;
    private String campo;
    private String dataTab;
    private String macchina;
    private String attrezzo;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    

    public String getMacchina() {
        return macchina;
    }

    public void setMacchina(String macchina) {
        this.macchina = macchina;
    }

    public String getAttrezzo() {
        return attrezzo;
    }

    public void setAttrezzo(String attrezzo) {
        this.attrezzo = attrezzo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProprieta() {
        return proprieta;
    }

    public void setProprieta(String proprieta) {
        this.proprieta = proprieta;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getDataTab() {
        return dataTab;
    }

    public void setDataTab(String dataTab) {
        this.dataTab = dataTab;
    }

    /**
     * Creates new form Aratura
     */
    public Aratura() {
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

        jLabel1 = new javax.swing.JLabel();
        p = new javax.swing.JComboBox<>();
        t = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        m = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        att = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        modifica = new javax.swing.JButton();
        salva = new javax.swing.JButton();
        err = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("PROPRIETA'");

        p.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("TERRENO");

        m.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MACCHINA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("ATTREZZO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("DATA");

        modifica.setText("MODIFICA");
        modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaActionPerformed(evt);
            }
        });

        salva.setText("SALVA");
        salva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaActionPerformed(evt);
            }
        });

        err.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(att, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(salva, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(err, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(att, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifica)
                    .addComponent(salva))
                .addGap(18, 18, 18)
                .addComponent(err, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        salva.setVisible(false);
        Connection conn = null;
        String url = "jdbc:postgresql://localhost/campagna";
        String user = "postgres";
        String pass = "root";

        //aggiunta delle proprieta
        this.addProprieta();
        p.setSelectedItem(this.getProprieta());
        p.setEditable(false);
        p.setEnabled(false);
        t.setEnabled(false);
        att.setEnabled(false);

        //aggiunta delle macchine
        this.addMacchine(url, user, pass, conn);

        //aggiunta degli attrezzi
        //stampa della data
        data.setText(this.getDataTab());
        data.setEditable(false);

        //stampa della macchina e dell attrezzo
        try {
            conn = DriverManager.getConnection(url, user, pass);
            String query = "SELECT macchina FROM aratura WHERE id=" + this.getId();
            Statement state = conn.createStatement();
            ResultSet ris = state.executeQuery(query);

            while (ris.next()) {
                this.setMacchina(ris.getString("macchina"));
            }
        } catch (SQLException sql) {

        }
        m.setSelectedItem(this.getMacchina());
        m.setEnabled(false);

        //attrezzo
        this.addAttrezzo(url, user, pass, conn, this.getMacchina());

    }//GEN-LAST:event_formComponentShown

    public void addMacchine(String url, String user, String pass, Connection conn) {
        String macchina;
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                String find = "SELECT * FROM macchine";
                Statement trova = conn.createStatement();
                ResultSet ris = trova.executeQuery(find);
                while (ris.next()) {
                    macchina = ris.getString("nome");
                    m.addItem(macchina);
                }
            }
            conn.close();
        } catch (SQLException sql) {
        }
    }

    private void pItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pItemStateChanged
        // TODO add your handling code here:
        this.addTerreni();
        t.setSelectedItem(this.getCampo());
        //t.setEnabled(false);
    }//GEN-LAST:event_pItemStateChanged

    private void mItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mItemStateChanged
        // TODO add your handling code here:
        Connection conn = null;
        String url = "jdbc:postgresql://localhost/campagna";
        String user = "postgres";
        String pass = "root";
        this.addAttrezzo(url, user, pass, conn, m.getSelectedItem().toString());
        att.setSelectedItem(this.getAttrezzo());
        //att.setEnabled(false);

    }//GEN-LAST:event_mItemStateChanged

    private void modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaActionPerformed
        // TODO add your handling code here:
        salva.setVisible(true);
        p.setEnabled(true);
        t.setEnabled(true);
        m.setEnabled(true);
        att.setEnabled(true);
        data.setEditable(true);
    }//GEN-LAST:event_modificaActionPerformed

    private void salvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaActionPerformed
        // TODO add your handling code here:
        if (p.getSelectedItem() != null
                && t.getSelectedItem() != null
                && m.getSelectedItem() != null
                && att.getSelectedItem() != null
                && !data.getText().isBlank()) {
            err.setText("");

            //controllo della data
            try {
                try {
                    err.setText("");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate lc = LocalDate.parse(this.checkData(data.getText()), formatter);
                    data.setText(this.checkData(data.getText()));
                } catch (DateTimeParseException dt) {
                    err.setText("errore data");
                }
            } catch (NumberFormatException nf) {
                err.setText("formato errato");
            }
        } else {
            err.setText("?? necessario inserire tutti i campi");
        }

        //update del record
        Connection conn = null;
        String url = "jdbc:postgresql://localhost/campagna";
        String user = "postgres";
        String pass = "root";

        try {
            conn = DriverManager.getConnection(url, user, pass);
            String query = "DELETE FROM "+this.getTipo().toLowerCase()+" WHERE id=?";
            PreparedStatement state = conn.prepareStatement(query);
            
            state.setInt(1, this.getId());
            state.executeUpdate();
            conn.close();
        } catch (SQLException sql) {
            err.setText("DB error. errorcode "+sql.getErrorCode()+", sqlstate "+sql.getSQLState());
        }
        
        try{
            conn=DriverManager.getConnection(url, user, pass);
            String query="INSERT INTO "+this.getTipo().toLowerCase()+" (proprieta,campo,macchina,attrezzo,data) VALUES(?,?,?,?,?)";
            PreparedStatement state=conn.prepareStatement(query);
            
            state.setString(1, p.getSelectedItem().toString().toLowerCase());
            state.setString(2, t.getSelectedItem().toString().toLowerCase());
            state.setString(3, m.getSelectedItem().toString().toLowerCase());
            state.setString(4, att.getSelectedItem().toString().toLowerCase());
            state.setString(5, data.getText());
            state.executeUpdate();
            conn.close();
        }catch(SQLException sql){
            sql.printStackTrace();
            err.setText("DB error. errorcode "+sql.getErrorCode()+", sqlstate "+sql.getSQLState());
        }
    }//GEN-LAST:event_salvaActionPerformed

    public String checkData(String datatxt) {
        String data = "", app[] = datatxt.split("-");
        Boolean b = false;

        if (Integer.parseInt(app[0]) < 10 && app[0].length() < 2) {
            b = true;
            data = "0" + app[0] + "-" + app[1] + "-" + app[2];
        }

        if (Integer.parseInt(app[1]) < 10 && app[1].length() < 2) {
            b = true;
            data = app[0] + "-0" + app[1] + "-" + app[2];
        }
        if (!b) {
            data = app[0] + "-" + app[1] + "-" + app[2];
        }

        return data;
    }

    public void addAttrezzo(String url, String user, String pass, Connection conn, String macchina) {
        att.removeAllItems();
        String attrezzo;
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                String find = "SELECT nome FROM attrezzi WHERE macchina_ass='" + macchina + "'";
                Statement trova = conn.createStatement();
                ResultSet ris = trova.executeQuery(find);
                while (ris.next()) {
                    attrezzo = ris.getString("nome");
                    att.addItem(attrezzo);
                    this.setAttrezzo(attrezzo);
                }
            }
            conn.close();
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
    }

    public void addTerreni() {
        t.removeAllItems();
        Connection conn = null;
        String par, nome;
        String url = "jdbc:postgresql://localhost/campagna";
        String user = "postgres";
        String pass = "root";

        try {
            conn = DriverManager.getConnection(url, user, pass);

            String find = "SELECT * FROM terreni";
            Statement trova = conn.createStatement();
            ResultSet ris = trova.executeQuery(find);

            while (ris.next()) {
                par = ris.getString("proprieta");
                if (par.equals(p.getSelectedItem())) {
                    nome = ris.getString("nome");
                    t.addItem(nome);
                }

            }
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addProprieta() {
        Connection conn = null;
        String nome = "";
        String url = "jdbc:postgresql://localhost/campagna";
        String user = "postgres";
        String pass = "root";

        try {
            conn = DriverManager.getConnection(url, user, pass);

            /*String query="INSERT INTO aziende(nome,indirizzo) VALUES('pantano','null')";
            Statement state=conn.createStatement();
            state.executeUpdate(query);*/
 /*String query="DELETE FROM aziende WHERE id=3";
            Statement state=conn.createStatement();
            state.executeUpdate(query);*/
            String find = "SELECT * FROM aziende";
            Statement trova = conn.createStatement();
            ResultSet ris = trova.executeQuery(find);

            while (ris.next()) {
                nome = ris.getString("nome");
                p.addItem(nome);
            }
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Aratura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aratura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aratura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aratura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aratura().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> att;
    private javax.swing.JTextField data;
    private javax.swing.JTextField err;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> m;
    private javax.swing.JButton modifica;
    private javax.swing.JComboBox<String> p;
    private javax.swing.JButton salva;
    private javax.swing.JComboBox<String> t;
    // End of variables declaration//GEN-END:variables
}
