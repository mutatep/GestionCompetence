/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraphique;

import gestioncompetences.Mission;
import java.util.Date;
import javax.swing.SwingUtilities;

/**
 *
 * @author attma
 */
public class PanelAjoutMission extends javax.swing.JPanel {

    /**
     * Creates new form PanelAjoutMission
     */
    public PanelAjoutMission() {
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

        validerAjoutMission = new javax.swing.JButton();
        erreurAjoutMission = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DateFinMission = new javax.swing.JFormattedTextField();
        DateDebMission = new javax.swing.JFormattedTextField();
        NomDeMission = new javax.swing.JTextField();

        validerAjoutMission.setText("Valider");
        validerAjoutMission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                validerAjoutMissionMouseClicked(evt);
            }
        });
        validerAjoutMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerAjoutMissionActionPerformed(evt);
            }
        });

        erreurAjoutMission.setText(" ");

        jLabel1.setText("Nom");

        jLabel2.setText("Date de début");

        jLabel3.setText("Date de fin");

        DateFinMission.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        DateDebMission.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        NomDeMission.setText("Nom");
        NomDeMission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomDeMissionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(validerAjoutMission)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(58, 58, 58)
                            .addComponent(NomDeMission, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(erreurAjoutMission, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DateFinMission, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DateDebMission, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomDeMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateDebMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DateFinMission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(erreurAjoutMission)
                .addGap(14, 14, 14)
                .addComponent(validerAjoutMission)
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void validerAjoutMissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_validerAjoutMissionMouseClicked
        if(NomDeMission.getText() != "" && DateDebMission.getValue() != null && DateFinMission.getValue() != null){
            Mission m = new Mission("2",NomDeMission.getText(),(Date) DateDebMission.getValue(),(Date) DateFinMission.getValue());
            FenetrePrincipale topFrame = (FenetrePrincipale) SwingUtilities.getWindowAncestor(this);
            topFrame.allerA("missions");
        }else{
            erreurAjoutMission.setText("Veuillez compléter tous les champs");
        }
    }//GEN-LAST:event_validerAjoutMissionMouseClicked

    private void validerAjoutMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerAjoutMissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validerAjoutMissionActionPerformed

    private void NomDeMissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomDeMissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomDeMissionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DateDebMission;
    private javax.swing.JFormattedTextField DateFinMission;
    private javax.swing.JTextField NomDeMission;
    private javax.swing.JLabel erreurAjoutMission;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton validerAjoutMission;
    // End of variables declaration//GEN-END:variables
}
