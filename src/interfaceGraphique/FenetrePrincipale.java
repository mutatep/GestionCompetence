/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGraphique;

import gestioncompetences.Entreprise;

/**
 *
 * @author fatima attmane
 */
public class FenetrePrincipale extends javax.swing.JFrame {
    private String etat;
    private static Entreprise e;
    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        Main m = new Main();
        //PanelMission m = new PanelMission();
        //ModeleEmploye m = new ModeleEmploye();
        this.corps.add(m);
        this.e = new Entreprise("Test");
        this.e.recupererDonnees();
        this.etat = "home";
    }
    public void allerA(String etat){
        this.corps.removeAll();
        switch(etat){
            case "home":
                Main m = new Main();
                this.corps.add(m);
                this.etat = "home";
                break;
            case "missions":
                PanelMission pm = new PanelMission();
                this.corps.add(pm);
                this.etat = "missions";
            case "employes":
                ModeleEmploye me = new ModeleEmploye();
                this.corps.add(me);
                this.etat = "employes";
        }
        this.corps.revalidate();
        this.corps.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConteneur = new javax.swing.JPanel();
        manu = new javax.swing.JPanel();
        homeButtonEmployes = new javax.swing.JButton();
        menuButtonEmployes = new javax.swing.JButton();
        menuButtonMission = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        corps = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelConteneur.setBackground(new java.awt.Color(0, 0, 0));
        panelConteneur.setMinimumSize(new java.awt.Dimension(569, 362));
        panelConteneur.setName(""); // NOI18N

        manu.setBackground(new java.awt.Color(0, 0, 0));
        manu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(240, 240, 240), java.awt.Color.white, java.awt.Color.white));
        manu.setLayout(new java.awt.GridLayout(4, 0));

        homeButtonEmployes.setText("Home");
        homeButtonEmployes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonEmployesMouseClicked(evt);
            }
        });
        manu.add(homeButtonEmployes);

        menuButtonEmployes.setText("Employes");
        menuButtonEmployes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonEmployesMouseClicked(evt);
            }
        });
        menuButtonEmployes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonEmployesActionPerformed(evt);
            }
        });
        manu.add(menuButtonEmployes);

        menuButtonMission.setText("Mission");
        menuButtonMission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMissionMouseClicked(evt);
            }
        });
        manu.add(menuButtonMission);

        jButton5.setText("jButton1");
        manu.add(jButton5);

        corps.setBackground(new java.awt.Color(0, 0, 0));
        corps.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240), new java.awt.Color(240, 240, 240)));
        corps.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout panelConteneurLayout = new javax.swing.GroupLayout(panelConteneur);
        panelConteneur.setLayout(panelConteneurLayout);
        panelConteneurLayout.setHorizontalGroup(
            panelConteneurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConteneurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corps, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelConteneurLayout.setVerticalGroup(
            panelConteneurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConteneurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConteneurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(corps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manu, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConteneur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConteneur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonEmployesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonEmployesMouseClicked
       this.allerA("home");
    }//GEN-LAST:event_homeButtonEmployesMouseClicked

    private void menuButtonEmployesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonEmployesMouseClicked
        this.allerA("employes");
    }//GEN-LAST:event_menuButtonEmployesMouseClicked

    private void menuButtonMissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMissionMouseClicked
        this.allerA("missions");
    }//GEN-LAST:event_menuButtonMissionMouseClicked

    private void menuButtonEmployesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonEmployesActionPerformed
        this.allerA("employes");
    }//GEN-LAST:event_menuButtonEmployesActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel corps;
    private javax.swing.JButton homeButtonEmployes;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel manu;
    private javax.swing.JButton menuButtonEmployes;
    private javax.swing.JButton menuButtonMission;
    private javax.swing.JPanel panelConteneur;
    // End of variables declaration//GEN-END:variables
}
