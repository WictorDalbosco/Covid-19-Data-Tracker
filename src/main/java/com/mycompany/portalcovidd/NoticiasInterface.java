/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portalcovidd;

import java.awt.Frame;
import java.awt.Desktop;
import java.net.URL;
/**
 *
 * @author mathe
 */
public class NoticiasInterface extends javax.swing.JFrame {

    /**
     * Creates new form NoticiasInterface
     */
    public Noticias[] noticias;
    private Frame frame;
    
    public NoticiasInterface() {
        initComponents();
        
        // Coleta as not�cias
        this.noticias = ColetaDados.coletarNoticias();
     
        
            // Insere as not�cias nas �reas de texto respectivas
            try{
                titulo1.setText(("  " + noticias[0].fonte));
                noticia1.setText(noticias[0].titulo);
                horario1.setText(noticias[0].tempoPublicacao);
            }catch(Exception e) {}
            
            try{
            titulo2.setText(("  " + noticias[1].fonte));
            noticia2.setText(noticias[1].titulo);
            horario2.setText(noticias[1].tempoPublicacao);
            }catch(Exception e){}
            
            try{
            titulo3.setText(("  " + noticias[2].fonte));
            noticia3.setText(noticias[2].titulo);
            horario3.setText(noticias[2].tempoPublicacao);
            }catch(Exception e){}
            
            try{
            titulo4.setText(("  " + noticias[3].fonte));
            noticia4.setText(noticias[3].titulo);
            horario4.setText(noticias[3].tempoPublicacao);
            }catch(Exception e){}
        
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
        titulo1 = new javax.swing.JTextField();
        titulo2 = new javax.swing.JTextField();
        titulo3 = new javax.swing.JTextField();
        horario1 = new javax.swing.JTextField();
        horario2 = new javax.swing.JTextField();
        horario3 = new javax.swing.JTextField();
        titulo4 = new javax.swing.JTextField();
        horario4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        noticia4 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        noticia1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        noticia2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        noticia3 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 1, 119));

        titulo1.setEditable(false);
        titulo1.setBackground(new java.awt.Color(0, 1, 119));
        titulo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        titulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo1ActionPerformed(evt);
            }
        });

        titulo2.setEditable(false);
        titulo2.setBackground(new java.awt.Color(0, 1, 119));
        titulo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        titulo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo2ActionPerformed(evt);
            }
        });

        titulo3.setEditable(false);
        titulo3.setBackground(new java.awt.Color(0, 1, 119));
        titulo3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo3.setForeground(new java.awt.Color(255, 255, 255));
        titulo3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        titulo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo3ActionPerformed(evt);
            }
        });

        horario1.setEditable(false);
        horario1.setBackground(new java.awt.Color(0, 1, 119));
        horario1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        horario1.setForeground(new java.awt.Color(255, 255, 255));
        horario1.setBorder(null);
        horario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario1ActionPerformed(evt);
            }
        });

        horario2.setEditable(false);
        horario2.setBackground(new java.awt.Color(0, 1, 119));
        horario2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        horario2.setForeground(new java.awt.Color(255, 255, 255));
        horario2.setBorder(null);
        horario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario2ActionPerformed(evt);
            }
        });

        horario3.setEditable(false);
        horario3.setBackground(new java.awt.Color(0, 1, 119));
        horario3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        horario3.setForeground(new java.awt.Color(255, 255, 255));
        horario3.setBorder(null);
        horario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario3ActionPerformed(evt);
            }
        });

        titulo4.setEditable(false);
        titulo4.setBackground(new java.awt.Color(0, 1, 119));
        titulo4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titulo4.setForeground(new java.awt.Color(255, 255, 255));
        titulo4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        titulo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titulo4ActionPerformed(evt);
            }
        });

        horario4.setEditable(false);
        horario4.setBackground(new java.awt.Color(0, 1, 119));
        horario4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        horario4.setForeground(new java.awt.Color(255, 255, 255));
        horario4.setBorder(null);
        horario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario4ActionPerformed(evt);
            }
        });

        jButton1.setText("Abrir Not�cia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Abrir Not�cia");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Abrir Not�cia");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        noticia4.setBackground(new java.awt.Color(0, 1, 119));
        noticia4.setColumns(20);
        noticia4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noticia4.setForeground(new java.awt.Color(255, 255, 255));
        noticia4.setLineWrap(true);
        noticia4.setRows(5);
        noticia4.setWrapStyleWord(true);
        jScrollPane1.setViewportView(noticia4);

        noticia1.setEditable(false);
        noticia1.setBackground(new java.awt.Color(0, 1, 119));
        noticia1.setColumns(20);
        noticia1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noticia1.setForeground(new java.awt.Color(255, 255, 255));
        noticia1.setLineWrap(true);
        noticia1.setRows(5);
        noticia1.setWrapStyleWord(true);
        jScrollPane4.setViewportView(noticia1);

        noticia2.setBackground(new java.awt.Color(0, 1, 119));
        noticia2.setColumns(20);
        noticia2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noticia2.setForeground(new java.awt.Color(255, 255, 255));
        noticia2.setLineWrap(true);
        noticia2.setRows(5);
        noticia2.setWrapStyleWord(true);
        jScrollPane5.setViewportView(noticia2);

        noticia3.setBackground(new java.awt.Color(0, 1, 119));
        noticia3.setColumns(20);
        noticia3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        noticia3.setForeground(new java.awt.Color(255, 255, 255));
        noticia3.setLineWrap(true);
        noticia3.setRows(5);
        noticia3.setWrapStyleWord(true);
        jScrollPane6.setViewportView(noticia3);

        jButton2.setText("Abrir Not�cia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botaoVoltar.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(horario3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(horario4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1)
                        .addComponent(jButton3)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(horario1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(horario2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horario3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horario4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo1ActionPerformed

    private void titulo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo2ActionPerformed

    private void titulo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo3ActionPerformed

    private void horario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horario1ActionPerformed

    private void horario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horario2ActionPerformed

    private void horario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horario3ActionPerformed

    private void titulo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titulo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titulo4ActionPerformed

    private void horario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horario4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        Desktop.getDesktop().browse(new URL(noticias[0].link).toURI());
        } catch (Exception e) {}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
        Desktop.getDesktop().browse(new URL(noticias[2].link).toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
        Desktop.getDesktop().browse(new URL(noticias[3].link).toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        Desktop.getDesktop().browse(new URL(noticias[1].link).toURI());
        } catch (Exception e) {}
    }//GEN-LAST:event_jButton2ActionPerformed

    // Bot�o para voltar ao menu principal
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.toBack();
        setVisible(false);
        java.awt.Frame parent = this.frame;
        boolean modal = false;
        Menu menu = new Menu(parent, modal);
        menu.toFront();
        String aux[] = new String[5];
        menu.main(aux);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    
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
            java.util.logging.Logger.getLogger(NoticiasInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoticiasInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoticiasInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoticiasInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoticiasInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField horario1;
    private javax.swing.JTextField horario2;
    private javax.swing.JTextField horario3;
    private javax.swing.JTextField horario4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea noticia1;
    private javax.swing.JTextArea noticia2;
    private javax.swing.JTextArea noticia3;
    private javax.swing.JTextArea noticia4;
    private javax.swing.JTextField titulo1;
    private javax.swing.JTextField titulo2;
    private javax.swing.JTextField titulo3;
    private javax.swing.JTextField titulo4;
    // End of variables declaration//GEN-END:variables
}