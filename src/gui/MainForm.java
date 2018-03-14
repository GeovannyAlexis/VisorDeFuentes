/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Font;
import model.TextoConFormato;

/**
 *
 * @author Windows8
 */
public class MainForm extends javax.swing.JFrame {
    
    //CONSTANTE SIMBOLICA
    private final String TEXTO_PREDET = "Instituto Tecnológico de Campeche";
    //VARIABLE DE INSTANCIA
    TextoConFormato txt;
    
    public MainForm() {
        initComponents();
        //INICIALIZACION DE LA VARIABLE TXT
        txt = new TextoConFormato(TEXTO_PREDET);
        //INVOCACION DE LOS MODELOS
        actualizarModelo();
        actualizarVista();
    }

    //METODO ACTUALIZAR VISTA
    private void actualizarVista() {
        etiquetaTexto.setText(txt.getTexto());
        etiquetaTexto.setFont(txt.getFont());
    }
    //ACTUALIZAR MODELO
    private void actualizarModelo() {
        txt.setTexto(etiquetaTexto.getText());
        txt.setFuente((String) comboBoxFuente.getSelectedItem());
        txt.setEstilo(Font.PLAIN);
        if (checkBoxNegrita.isSelected()) {
            txt.setEstilo(txt.getEstilo() + Font.BOLD);
        }
        if (checkBoxCursiva.isSelected()) {
            txt.setEstilo(txt.getEstilo() + Font.ITALIC);
        }
        if (radioButtonPequenio.isSelected()) {
            txt.setTamanio(TextoConFormato.TAMANIO_PEQUENIO);
        }
        else if (radioButtonMediano.isSelected()) {
            txt.setTamanio(TextoConFormato.TAMANIO_MEDIANO);
        }
        else {
            txt.setTamanio(TextoConFormato.TAMANIO_GRANDE);
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

        grupoTamanio = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTexto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        comboBoxFuente = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        checkBoxNegrita = new javax.swing.JCheckBox();
        checkBoxCursiva = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        radioButtonPequenio = new javax.swing.JRadioButton();
        radioButtonMediano = new javax.swing.JRadioButton();
        radioButtonGrande = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        etiquetaTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTexto.setText("Instituto Tecnologico de Campeche");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTexto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(etiquetaTexto)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fuente"));

        comboBoxFuente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arial", "Times New Roman", "Calibri", "Verdana", "Tahoma", "Consolas" }));
        comboBoxFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFuenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(comboBoxFuente, 0, 142, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBoxFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Estilo"));

        checkBoxNegrita.setSelected(true);
        checkBoxNegrita.setText("Negrita");
        checkBoxNegrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxNegritaActionPerformed(evt);
            }
        });

        checkBoxCursiva.setText("Cursiva");
        checkBoxCursiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxCursivaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxNegrita)
                    .addComponent(checkBoxCursiva))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkBoxNegrita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBoxCursiva)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tamaño"));

        grupoTamanio.add(radioButtonPequenio);
        radioButtonPequenio.setText("Pequeño");
        radioButtonPequenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonPequenioActionPerformed(evt);
            }
        });

        grupoTamanio.add(radioButtonMediano);
        radioButtonMediano.setText("Mediano");
        radioButtonMediano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonMedianoActionPerformed(evt);
            }
        });

        grupoTamanio.add(radioButtonGrande);
        radioButtonGrande.setText("Grande");
        radioButtonGrande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonGrandeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioButtonPequenio)
                    .addComponent(radioButtonMediano)
                    .addComponent(radioButtonGrande))
                .addGap(0, 98, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioButtonPequenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioButtonMediano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioButtonGrande)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxNegritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxNegritaActionPerformed
        actualizarModelo();
        actualizarVista();
    }//GEN-LAST:event_checkBoxNegritaActionPerformed

    private void checkBoxCursivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxCursivaActionPerformed
        actualizarModelo();
        actualizarVista();
    }//GEN-LAST:event_checkBoxCursivaActionPerformed

    private void comboBoxFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFuenteActionPerformed
        actualizarModelo();
        actualizarVista();
    }//GEN-LAST:event_comboBoxFuenteActionPerformed

    private void radioButtonPequenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonPequenioActionPerformed
        actualizarModelo();
        actualizarVista();
    }//GEN-LAST:event_radioButtonPequenioActionPerformed

    private void radioButtonMedianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonMedianoActionPerformed
        actualizarModelo();
        actualizarVista();
    }//GEN-LAST:event_radioButtonMedianoActionPerformed

    private void radioButtonGrandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonGrandeActionPerformed
        actualizarModelo();
        actualizarVista();
    }//GEN-LAST:event_radioButtonGrandeActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxCursiva;
    private javax.swing.JCheckBox checkBoxNegrita;
    private javax.swing.JComboBox comboBoxFuente;
    private javax.swing.JLabel etiquetaTexto;
    private javax.swing.ButtonGroup grupoTamanio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton radioButtonGrande;
    private javax.swing.JRadioButton radioButtonMediano;
    private javax.swing.JRadioButton radioButtonPequenio;
    // End of variables declaration//GEN-END:variables
}
