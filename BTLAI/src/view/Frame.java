/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package view;
import java.awt.Image;
import java.awt.List;
import java.awt.Toolkit;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
/**
 *
 * @author Nghia
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    private model puzzle = new model();
    public Frame() {
        initComponents();
        randomNumber();
    }
    
    void EmptyLocationChecker(JButton btn1 , JButton btn2){
         String BtnNumber = btn2.getText();
         if(BtnNumber.isEmpty()){
             btn2.setText(btn1.getText());
             btn1.setText("");
         }
    }
    void randomNumber(){
        int boardSize = puzzle.boardSize;
        ArrayList<String> num = new ArrayList<>();
        for(int i=1;i<=9;i++){
            num.add(String.valueOf(i));
        }
        Collections.shuffle(num);
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                puzzle.board[i][j] = Integer.parseInt(num.get(i*boardSize+j));
                System.out.println(puzzle.board[i][j] + " ");
            }
            System.out.println("");
        }
        for(int i=0;i<9;i++){
            if(num.get(i).equals("1")){
                num.set(i, "");
                break;
            }
        }
        jButtonPiece1.setText(num.get(0));
        jButtonPiece2.setText(num.get(1));
        jButtonPiece3.setText(num.get(2));
        jButtonPiece4.setText(num.get(3));
        jButtonPiece5.setText(num.get(4));
        jButtonPiece6.setText(num.get(5));
        jButtonPiece7.setText(num.get(6));
        jButtonPiece8.setText(num.get(7));
        jButtonPiece9.setText(num.get(8));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTieuDe = new javax.swing.JPanel();
        jLabelTieuDe = new javax.swing.JLabel();
        jPanelKhungHinhAnh = new javax.swing.JPanel();
        jButtonPiece3 = new javax.swing.JButton();
        jButtonPiece1 = new javax.swing.JButton();
        jButtonPiece2 = new javax.swing.JButton();
        jButtonPiece8 = new javax.swing.JButton();
        jButtonPiece7 = new javax.swing.JButton();
        jButtonPiece9 = new javax.swing.JButton();
        jButtonPiece4 = new javax.swing.JButton();
        jButtonPiece5 = new javax.swing.JButton();
        jButtonPiece6 = new javax.swing.JButton();
        jPanelAnhGoc = new javax.swing.JPanel();
        labelSoBuocDiChuyen = new javax.swing.JLabel();
        jButtonDiLui = new javax.swing.JButton();
        jButtonDiToi = new javax.swing.JButton();
        jLabelTongSoDiChuyen = new javax.swing.JLabel();
        jButtonOut = new javax.swing.JButton();
        jButtonPlayAgain = new javax.swing.JButton();
        jButtonSolve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTieuDe.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTieuDe.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(95, 158, 160), 1, true));
        jPanelTieuDe.setForeground(new java.awt.Color(0, 51, 255));

        jLabelTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelTieuDe.setText("                          Puzzle Game in Java");

        javax.swing.GroupLayout jPanelTieuDeLayout = new javax.swing.GroupLayout(jPanelTieuDe);
        jPanelTieuDe.setLayout(jPanelTieuDeLayout);
        jPanelTieuDeLayout.setHorizontalGroup(
            jPanelTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTieuDeLayout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabelTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanelTieuDeLayout.setVerticalGroup(
            jPanelTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelTieuDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1550, -1));

        jPanelKhungHinhAnh.setBackground(new java.awt.Color(255, 255, 255));
        jPanelKhungHinhAnh.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Khung"));
        jPanelKhungHinhAnh.setForeground(new java.awt.Color(0, 51, 255));

        jButtonPiece3.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPiece3.setText("3");
        jButtonPiece3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiece3ActionPerformed(evt);
            }
        });

        jButtonPiece1.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPiece1.setText("1");
        jButtonPiece1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiece1ActionPerformed(evt);
            }
        });

        jButtonPiece2.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPiece2.setText("2");
        jButtonPiece2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiece2ActionPerformed(evt);
            }
        });

        jButtonPiece8.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPiece8.setText("8");
        jButtonPiece8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiece8ActionPerformed(evt);
            }
        });

        jButtonPiece7.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPiece7.setText("7");
        jButtonPiece7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiece7ActionPerformed(evt);
            }
        });

        jButtonPiece9.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPiece9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiece9ActionPerformed(evt);
            }
        });

        jButtonPiece4.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPiece4.setText("4");
        jButtonPiece4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiece4ActionPerformed(evt);
            }
        });

        jButtonPiece5.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPiece5.setText("5");
        jButtonPiece5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiece5ActionPerformed(evt);
            }
        });

        jButtonPiece6.setBackground(new java.awt.Color(204, 204, 255));
        jButtonPiece6.setText("6");
        jButtonPiece6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPiece6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelKhungHinhAnhLayout = new javax.swing.GroupLayout(jPanelKhungHinhAnh);
        jPanelKhungHinhAnh.setLayout(jPanelKhungHinhAnhLayout);
        jPanelKhungHinhAnhLayout.setHorizontalGroup(
            jPanelKhungHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhungHinhAnhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKhungHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKhungHinhAnhLayout.createSequentialGroup()
                        .addComponent(jButtonPiece1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPiece2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPiece3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelKhungHinhAnhLayout.createSequentialGroup()
                        .addComponent(jButtonPiece4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPiece5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPiece6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelKhungHinhAnhLayout.createSequentialGroup()
                        .addComponent(jButtonPiece7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPiece8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPiece9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanelKhungHinhAnhLayout.setVerticalGroup(
            jPanelKhungHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhungHinhAnhLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelKhungHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPiece1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPiece2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPiece3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKhungHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPiece4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPiece5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPiece6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelKhungHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPiece7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPiece8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPiece9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelKhungHinhAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 640, 650));

        jPanelAnhGoc.setBackground(new java.awt.Color(204, 204, 255));
        jPanelAnhGoc.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Anh goc"));

        javax.swing.GroupLayout jPanelAnhGocLayout = new javax.swing.GroupLayout(jPanelAnhGoc);
        jPanelAnhGoc.setLayout(jPanelAnhGocLayout);
        jPanelAnhGocLayout.setHorizontalGroup(
            jPanelAnhGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelAnhGocLayout.setVerticalGroup(
            jPanelAnhGocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelAnhGoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 640, 650));

        labelSoBuocDiChuyen.setBackground(new java.awt.Color(255, 51, 51));
        labelSoBuocDiChuyen.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelSoBuocDiChuyen.setForeground(new java.awt.Color(51, 51, 255));
        labelSoBuocDiChuyen.setText("Số bước di chuyển:");
        getContentPane().add(labelSoBuocDiChuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 830, 220, 70));

        jButtonDiLui.setBackground(new java.awt.Color(255, 204, 153));
        jButtonDiLui.setText("<<Đi lùi");
        jButtonDiLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiLuiActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDiLui, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 850, 130, 40));

        jButtonDiToi.setBackground(new java.awt.Color(255, 204, 153));
        jButtonDiToi.setText(" Đi tới>>");
        jButtonDiToi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiToiActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDiToi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 850, 130, 40));

        jLabelTongSoDiChuyen.setBackground(new java.awt.Color(102, 51, 255));
        jLabelTongSoDiChuyen.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTongSoDiChuyen.setForeground(new java.awt.Color(0, 51, 255));
        jLabelTongSoDiChuyen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelTongSoDiChuyen.setText("0");
        jLabelTongSoDiChuyen.setToolTipText("");
        getContentPane().add(jLabelTongSoDiChuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 850, 100, -1));

        jButtonOut.setText("Out");
        getContentPane().add(jButtonOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 840, 140, 40));

        jButtonPlayAgain.setText("play again");
        jButtonPlayAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayAgainActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPlayAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 840, 140, 40));

        jButtonSolve.setText("Solve");
        getContentPane().add(jButtonSolve, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 840, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPiece3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiece3ActionPerformed
        EmptyLocationChecker(jButtonPiece3, jButtonPiece2);
        EmptyLocationChecker(jButtonPiece3, jButtonPiece6);
    }//GEN-LAST:event_jButtonPiece3ActionPerformed

    private void jButtonPiece1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiece1ActionPerformed
        EmptyLocationChecker(jButtonPiece1, jButtonPiece2);
        EmptyLocationChecker(jButtonPiece1, jButtonPiece4);
    }//GEN-LAST:event_jButtonPiece1ActionPerformed

    private void jButtonPiece2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiece2ActionPerformed
        // TODO add your handling code here:
        EmptyLocationChecker(jButtonPiece2, jButtonPiece1);
        EmptyLocationChecker(jButtonPiece2, jButtonPiece3);
        EmptyLocationChecker(jButtonPiece2, jButtonPiece5);
    }//GEN-LAST:event_jButtonPiece2ActionPerformed

    private void jButtonPiece7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiece7ActionPerformed
        // TODO add your handling code here:
        EmptyLocationChecker(jButtonPiece7, jButtonPiece4);
        EmptyLocationChecker(jButtonPiece7, jButtonPiece8);
    }//GEN-LAST:event_jButtonPiece7ActionPerformed

    private void jButtonPiece8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiece8ActionPerformed
        // TODO add your handling code here:
        EmptyLocationChecker(jButtonPiece8, jButtonPiece5);
        EmptyLocationChecker(jButtonPiece8, jButtonPiece7);
        EmptyLocationChecker(jButtonPiece8, jButtonPiece9);
    }//GEN-LAST:event_jButtonPiece8ActionPerformed

    private void jButtonPiece9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiece9ActionPerformed
        // TODO add your handling code here:
        EmptyLocationChecker(jButtonPiece9, jButtonPiece6);
        EmptyLocationChecker(jButtonPiece9, jButtonPiece8);
    }//GEN-LAST:event_jButtonPiece9ActionPerformed

    private void jButtonPiece4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiece4ActionPerformed
        // TODO add your handling code here:
        EmptyLocationChecker(jButtonPiece4, jButtonPiece1);
        EmptyLocationChecker(jButtonPiece4, jButtonPiece5);
    }//GEN-LAST:event_jButtonPiece4ActionPerformed

    private void jButtonPiece5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiece5ActionPerformed
        // TODO add your handling code here:
        EmptyLocationChecker(jButtonPiece5, jButtonPiece2);
        EmptyLocationChecker(jButtonPiece5, jButtonPiece4);
        EmptyLocationChecker(jButtonPiece5, jButtonPiece6);
        EmptyLocationChecker(jButtonPiece5, jButtonPiece8);
    }//GEN-LAST:event_jButtonPiece5ActionPerformed

    private void jButtonPiece6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPiece6ActionPerformed
        // TODO add your handling code here:
        EmptyLocationChecker(jButtonPiece6, jButtonPiece3);
        EmptyLocationChecker(jButtonPiece6, jButtonPiece5);
        EmptyLocationChecker(jButtonPiece6, jButtonPiece9);
        
    }//GEN-LAST:event_jButtonPiece6ActionPerformed

    private void jButtonDiLuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiLuiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDiLuiActionPerformed

    private void jButtonDiToiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiToiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDiToiActionPerformed

    private void jButtonPlayAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayAgainActionPerformed
        randomNumber();
    }//GEN-LAST:event_jButtonPlayAgainActionPerformed

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDiLui;
    private javax.swing.JButton jButtonDiToi;
    private javax.swing.JButton jButtonOut;
    private javax.swing.JButton jButtonPiece1;
    private javax.swing.JButton jButtonPiece2;
    private javax.swing.JButton jButtonPiece3;
    private javax.swing.JButton jButtonPiece4;
    private javax.swing.JButton jButtonPiece5;
    private javax.swing.JButton jButtonPiece6;
    private javax.swing.JButton jButtonPiece7;
    private javax.swing.JButton jButtonPiece8;
    private javax.swing.JButton jButtonPiece9;
    private javax.swing.JButton jButtonPlayAgain;
    private javax.swing.JButton jButtonSolve;
    private javax.swing.JLabel jLabelTieuDe;
    private javax.swing.JLabel jLabelTongSoDiChuyen;
    private javax.swing.JPanel jPanelAnhGoc;
    private javax.swing.JPanel jPanelKhungHinhAnh;
    private javax.swing.JPanel jPanelTieuDe;
    private javax.swing.JLabel labelSoBuocDiChuyen;
    // End of variables declaration//GEN-END:variables
}
