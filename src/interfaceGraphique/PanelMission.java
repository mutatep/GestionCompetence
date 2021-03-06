/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraphique;

import gestioncompetences.Mission;
import java.text.SimpleDateFormat;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author attma
 */
public class PanelMission extends javax.swing.JPanel {

    /**
     * Creates new form PanelMission
     */
    public PanelMission() {
        initComponents();
        this.initialiserTableMission(Mission.getMapMission());
        
    }
    private void initialiserTableMission(Map<Integer, Mission> map){
        DefaultTableModel model = (DefaultTableModel) TableMissions.getModel();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        for(int s : map.keySet())
            model.addRow(new Object[]{s, map.get(s).getIntitule(), dateFormat.format(map.get(s).getDateDeb()), dateFormat.format(map.get(s).getDateFin())," ???",false});
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editMission = new javax.swing.JButton();
        removeMission = new javax.swing.JButton();
        addMissionButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMissions = new javax.swing.JTable();

        editMission.setText("Éditer");

        removeMission.setText("-");
        removeMission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMissionMouseClicked(evt);
            }
        });

        addMissionButton.setText("+");
        addMissionButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMissionButtonMouseClicked(evt);
            }
        });

        TableMissions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant", "Nom", "Date de debut", "Date de fin", "Phase", " "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableMissions.getTableHeader().setReorderingAllowed(false);
        TableMissions.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TableMissionsInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(TableMissions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editMission, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addMissionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addMissionButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeMission)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editMission)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addMissionButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMissionButtonMouseClicked
        FenetrePrincipale topFrame = (FenetrePrincipale) SwingUtilities.getWindowAncestor(this);
        topFrame.allerA("ajoutMission");
       
    }//GEN-LAST:event_addMissionButtonMouseClicked

    private void removeMissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMissionMouseClicked
        boolean b;
        System.out.println(this.TableMissions.getColumnCount() - 1);
        for(int i =0; i < this.TableMissions.getRowCount(); i++){
            b = (boolean) this.TableMissions.getValueAt(i,this.TableMissions.getColumnCount() - 1);
            System.out.println(b);
            if(b){
                ((DefaultTableModel)this.TableMissions.getModel()).removeRow(i);
            }
        }
        
    }//GEN-LAST:event_removeMissionMouseClicked

    private void TableMissionsInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TableMissionsInputMethodTextChanged
        System.out.println("coucou");
    }//GEN-LAST:event_TableMissionsInputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMissions;
    private javax.swing.JButton addMissionButton;
    private javax.swing.JButton editMission;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeMission;
    // End of variables declaration//GEN-END:variables
}
