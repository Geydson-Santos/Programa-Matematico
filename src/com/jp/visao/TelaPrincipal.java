/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jp.visao;

import com.jp.modelos.Expressao;
import com.jp.modelos.Tempo;
import com.jp.modelos.Texto;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Woly
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    Expressao expressao = null;
    Tempo timer = null;
    
    public TelaPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        setarExpressao();
        adicionarTela(jInternalFrameMenu);
        jTextFieldResultado.setBackground(new Color(0, 0, 0, 0));
    }
    
    public void adicionarTela(JInternalFrame tela){
        tela.setSize(702, 492);
        ((BasicInternalFrameUI)tela.getUI()).setNorthPane(null);
        jDesktopPane1.removeAll();
        jDesktopPane1.add(tela);
        tela.setVisible(true);
    }
    
    public void setarExpressao(){
        expressao = new Expressao();
        jLabelExpressao.setText(expressao.getExpressao());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameGame = new javax.swing.JInternalFrame();
        jPanelJogo = new javax.swing.JPanel();
        jLabelObjetivo = new javax.swing.JLabel();
        jLabelExpressao = new javax.swing.JLabel();
        jTextFieldResultado = new javax.swing.JTextField();
        jButtonEnviar = new javax.swing.JButton();
        jLabelFabricio = new javax.swing.JLabel();
        jLabelMoldura = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();
        jInternalFrameMenu = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFundo1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();

        jInternalFrameGame.setBorder(null);
        jInternalFrameGame.setVisible(true);

        jPanelJogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelObjetivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelObjetivo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObjetivo.setText("Ajude Fabrício, a girafa, com seu dever de casa!");
        jPanelJogo.add(jLabelObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, -1));

        jLabelExpressao.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelExpressao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExpressao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExpressao.setText("7 × 5");
        jPanelJogo.add(jLabelExpressao, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 150, -1));

        jTextFieldResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTextFieldResultado.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldResultado.setBorder(null);
        jTextFieldResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldResultadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldResultadoKeyTyped(evt);
            }
        });
        jPanelJogo.add(jTextFieldResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 70, -1));

        jButtonEnviar.setBackground(new java.awt.Color(156, 109, 65));
        jButtonEnviar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButtonEnviar.setForeground(new java.awt.Color(153, 255, 102));
        jButtonEnviar.setText("Enviar");
        jButtonEnviar.setBorder(null);
        jButtonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        jPanelJogo.add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 110, 30));

        jLabelFabricio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jp/icones/fabricio.png"))); // NOI18N
        jPanelJogo.add(jLabelFabricio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelMoldura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jp/icones/moldura.png"))); // NOI18N
        jPanelJogo.add(jLabelMoldura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jp/icones/tabua.png"))); // NOI18N
        jPanelJogo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jp/icones/fundo.png"))); // NOI18N
        jPanelJogo.add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jInternalFrameGameLayout = new javax.swing.GroupLayout(jInternalFrameGame.getContentPane());
        jInternalFrameGame.getContentPane().setLayout(jInternalFrameGameLayout);
        jInternalFrameGameLayout.setHorizontalGroup(
            jInternalFrameGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrameGameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jInternalFrameGameLayout.setVerticalGroup(
            jInternalFrameGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameGameLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanelJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jInternalFrameMenu.setBorder(null);
        jInternalFrameMenu.setVisible(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Jogar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 260, 190, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CabritoGame");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 702, -1));

        jLabelFundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jp/icones/fundo.png"))); // NOI18N
        jPanel2.add(jLabelFundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jInternalFrameMenuLayout = new javax.swing.GroupLayout(jInternalFrameMenu.getContentPane());
        jInternalFrameMenu.getContentPane().setLayout(jInternalFrameMenuLayout);
        jInternalFrameMenuLayout.setHorizontalGroup(
            jInternalFrameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrameMenuLayout.setVerticalGroup(
            jInternalFrameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        // TODO add your handling code here:
        ActionListener acaoFinal = (e) -> {
            jLabelFabricio.setIcon(new ImageIcon("./src/com/jp/icones/fabricio.png"));
            jLabelObjetivo.setText("Ajude Fabrício, a girafa, com seu dever de casa!");
        };
        
        timer = new Tempo(1000, 0, null, acaoFinal);
        
        if(expressao.resolverExpressao(Integer.parseInt(jTextFieldResultado.getText()))){
            jLabelFabricio.setIcon(new ImageIcon("./src/com/jp/icones/fabricio_feliz.png"));
            jLabelObjetivo.setText("Você acertou!");
            timer.start();
        }else{
            jLabelFabricio.setIcon(new ImageIcon("./src/com/jp/icones/fabricio_triste.png"));
            jLabelObjetivo.setText("Você errou!");
            timer.start();
        }
        setarExpressao();
        jTextFieldResultado.setText("");
        jTextFieldResultado.grabFocus();
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jTextFieldResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldResultadoKeyTyped
        // TODO add your handling code here:
        Texto.validarNumero(jTextFieldResultado, 3, evt, '-');
    }//GEN-LAST:event_jTextFieldResultadoKeyTyped

    private void jTextFieldResultadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldResultadoKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) jButtonEnviar.doClick();
    }//GEN-LAST:event_jTextFieldResultadoKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        adicionarTela(jInternalFrameGame);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        
//        if(!FlatLightLaf.setup()) JOptionPane.showMessageDialog(null, "Falha ao importar o Tema.");
////        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////                }
////            }
////        } catch (ClassNotFoundException ex) {
////            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (InstantiationException ex) {
////            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (IllegalAccessException ex) {
////            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
////            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
////        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrameGame;
    private javax.swing.JInternalFrame jInternalFrameMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelExpressao;
    private javax.swing.JLabel jLabelFabricio;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelFundo1;
    private javax.swing.JLabel jLabelMoldura;
    private javax.swing.JLabel jLabelObjetivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelJogo;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}
