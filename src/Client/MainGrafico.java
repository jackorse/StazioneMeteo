/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import Shared.Settings;
import Shared.SocketUDP;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 * @author Marco
 */
public class MainGrafico extends javax.swing.JFrame {

    int portaServer = Settings.SERVER_PORT;    //porta del server
    String ip = "localhost";//172.16.102.168

    SocketUDP client = new SocketUDP();
    String StringaDelServer = "";

    public MainGrafico() {
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

        jLabelTitoloForm = new javax.swing.JLabel();
        jLabelStatusLed = new javax.swing.JLabel();
        jLabelStatoLedSopra = new javax.swing.JLabel();
        jButtonStatus = new javax.swing.JButton();
        jLabelAccendiLed = new javax.swing.JLabel();
        jButtonAccendi = new javax.swing.JButton();
        jLabelSpegniLed = new javax.swing.JLabel();
        jButtonSpegni = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabelTitoloForm.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelTitoloForm.setText("ESERCIZIO LED C/S+ARDUINO");
        jLabelTitoloForm.setToolTipText("");

        jLabelStatusLed.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabelStatusLed.setText("STATUS");

        jLabelStatoLedSopra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabelStatoLedSopra.setText("STATO LED(ON/OFF)");

        jButtonStatus.setText("VERIFICA STATO");
        jButtonStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonStatusMouseClicked(evt);
            }
        });
        jButtonStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatusActionPerformed(evt);
            }
        });

        jLabelAccendiLed.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabelAccendiLed.setText("ACCENDI LED");

        jButtonAccendi.setBackground(new java.awt.Color(51, 255, 51));
        jButtonAccendi.setText("                           ");
        jButtonAccendi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAccendiMouseClicked(evt);
            }
        });

        jLabelSpegniLed.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabelSpegniLed.setText("SPEGNI LED");

        jButtonSpegni.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSpegni.setText("                          ");
        jButtonSpegni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSpegniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jButtonStatus)
                                                .addGap(90, 90, 90)
                                                .addComponent(jLabelStatusLed))
                                        .addComponent(jLabelStatoLedSopra)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(19, 19, 19)
                                                                        .addComponent(jButtonAccendi))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(27, 27, 27)
                                                                        .addComponent(jLabelAccendiLed)))
                                                        .addGap(75, 75, 75)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jButtonSpegni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(14, 14, 14)
                                                                        .addComponent(jLabelSpegniLed))))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(36, 36, 36)
                                                        .addComponent(jLabelTitoloForm))))
                                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabelTitoloForm)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelStatoLedSopra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelStatusLed)
                                        .addComponent(jButtonStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelAccendiLed)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonAccendi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelSpegniLed)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonSpegni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStatusActionPerformed

    private void jButtonStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonStatusMouseClicked
        // TODO add your handling code here:
        client.send("1", portaServer, ip);//invio il comando
        System.out.println("Mandato richiesta di ON/OFF attesa risposta...");
        StringaDelServer = client.receive();
        jLabelStatusLed.setText(StringaDelServer);
        System.out.println("SERVER: " + StringaDelServer);

    }//GEN-LAST:event_jButtonStatusMouseClicked

    private void jButtonAccendiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAccendiMouseClicked
        // TODO add your handling code here:
        if (jLabelStatusLed.getText().equals("Spento")) {
            client.send("2", portaServer, ip);//invio il comando
            System.out.println("Mandato richiesta di accensione LED");
            StringaDelServer = client.receive();
            jLabelStatusLed.setText(StringaDelServer);//modifico sempre lo stato, il button per vedere lo status serve a vedere
            System.out.println("SERVER: " + StringaDelServer);  //per quando un altro modifica lo stato
        }
    }//GEN-LAST:event_jButtonAccendiMouseClicked

    private void jButtonSpegniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSpegniMouseClicked
        // TODO add your handling code here:
        if (jLabelStatusLed.getText().equals("Acceso")) {
            client.send("3", portaServer, ip);//invio il comando
            System.out.println("Mandato richiesta di spegnimento LED");
            StringaDelServer = client.receive();
            jLabelStatusLed.setText(StringaDelServer);
            System.out.println("SERVER: " + StringaDelServer);
        }
    }//GEN-LAST:event_jButtonSpegniMouseClicked

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
            java.util.logging.Logger.getLogger(MainGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGrafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccendi;
    private javax.swing.JButton jButtonSpegni;
    private javax.swing.JButton jButtonStatus;
    private javax.swing.JLabel jLabelAccendiLed;
    private javax.swing.JLabel jLabelSpegniLed;
    private javax.swing.JLabel jLabelStatoLedSopra;
    private javax.swing.JLabel jLabelStatusLed;
    private javax.swing.JLabel jLabelTitoloForm;
    // End of variables declaration//GEN-END:variables
}
