/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Tanmay
 */
public class quiz9 extends javax.swing.JFrame {

    /**
     * Creates new form quiz9
     */
    public quiz9() {
        initComponents();
        setSize(600,600);
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("500 points");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(204, 83, 208, 44);

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("You are  killing it !!!!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 30, 335, 66);

        jTextArea1.setBackground(new java.awt.Color(255, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Q6.  \tDuring eleventh Antarctic\n Expedition in Nov. 1991/March 1992\n  ____ was installed ?");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 587, 110);

        jRadioButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(51, 255, 51));
        jRadioButton1.setText("A.SODAR (SOnic Detection And Ranging)");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(30, 300, 520, 30);

        jRadioButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 255, 51));
        jRadioButton2.setText("B. Second Permanent Station 'Maitree'");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(30, 360, 520, 30);

        jRadioButton3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(51, 255, 51));
        jRadioButton3.setText("C. First permanent station 'Dakshin Gangotri'");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(30, 420, 520, 30);

        jRadioButton4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(51, 255, 51));
        jRadioButton4.setText("D. None of the above");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(30, 480, 520, 30);

        jButton1.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 51));
        jButton1.setText("Lock ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 530, 130, 40);

        jLabel3.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\wallpapers n themes\\math-magic-hd-wallpapers.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 610, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
quiz10 ob =new quiz10();
quizw ob11=new quizw();
        if(jRadioButton1.isSelected())
        {
            ob.setVisible(true);
            dispose();
        }// TODO add your handling code here:
        else if(jRadioButton4.isSelected())
        {
        ob11.setVisible(true);
        dispose();
        }
        else if(jRadioButton3.isSelected())
        {
        ob11.setVisible(true);
        dispose();
        }
        else if(jRadioButton2.isSelected())
        {
        ob11.setVisible(true);
        dispose();
        }        // TO        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quiz9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
