/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.leoandrew.aula13;

/**
 *
 * @author redwars22
 */
public class Aula13 extends javax.swing.JFrame {
    int start = 0, end = 0, increment = 0;

    /**
     * Creates new form Aula13
     */
    public Aula13() {
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
        startIndexSlider = new javax.swing.JSlider();
        startIndexLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        endIndexSlider = new javax.swing.JSlider();
        incrementIndexSlider = new javax.swing.JSlider();
        endIndexLabel = new javax.swing.JLabel();
        incrementIndexLabel = new javax.swing.JLabel();
        generateResultBtn = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        loopView = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Início");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        startIndexSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                startIndexSliderStateChanged(evt);
            }
        });
        getContentPane().add(startIndexSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        startIndexLabel.setText("0");
        getContentPane().add(startIndexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel3.setText("Fim");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setText("Increm.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        endIndexSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                endIndexSliderStateChanged(evt);
            }
        });
        getContentPane().add(endIndexSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        incrementIndexSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                incrementIndexSliderStateChanged(evt);
            }
        });
        getContentPane().add(incrementIndexSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        endIndexLabel.setText("0");
        getContentPane().add(endIndexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        incrementIndexLabel.setText("0");
        getContentPane().add(incrementIndexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        generateResultBtn.setText("CONTAR");
        generateResultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateResultBtnActionPerformed(evt);
            }
        });
        getContentPane().add(generateResultBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jScrollPane1.setViewportView(loopView);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startIndexSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_startIndexSliderStateChanged
        // TODO add your handling code here:
        int value = startIndexSlider.getValue();
        startIndexLabel.setText(String.valueOf(value));
        start = value;
    }//GEN-LAST:event_startIndexSliderStateChanged

    private void endIndexSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_endIndexSliderStateChanged
        // TODO add your handling code here
        int value = endIndexSlider.getValue();
        endIndexLabel.setText(String.valueOf(value));
        end = value;
    }//GEN-LAST:event_endIndexSliderStateChanged

    private void incrementIndexSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_incrementIndexSliderStateChanged
        // TODO add your handling code here:
        int value = incrementIndexSlider.getValue();
        incrementIndexLabel.setText(String.valueOf(value));
        increment = value;
    }//GEN-LAST:event_incrementIndexSliderStateChanged

    private void generateResultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateResultBtnActionPerformed
        // TODO add your handling code here:
        loopView.setText("");
        
        for(int i = start; i < end; i += increment)
            loopView.setText(loopView.getText() + i + "\n");
    }//GEN-LAST:event_generateResultBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Aula13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aula13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aula13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aula13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aula13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel endIndexLabel;
    private javax.swing.JSlider endIndexSlider;
    private javax.swing.JToggleButton generateResultBtn;
    private javax.swing.JLabel incrementIndexLabel;
    private javax.swing.JSlider incrementIndexSlider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane loopView;
    private javax.swing.JLabel startIndexLabel;
    private javax.swing.JSlider startIndexSlider;
    // End of variables declaration//GEN-END:variables
}
