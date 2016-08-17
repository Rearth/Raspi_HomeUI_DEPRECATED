/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rearth.raspi_HomeUI;

import javax.swing.JFrame;

/**
 *
 * @author Darkp
 */
public class HomeUI_main extends javax.swing.JFrame {

    String MONTHS[] ={"Nichts", "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
    String TAGE[] = {null, "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
    
    private void firstInit() {
        System.out.println("Hallo");
        int date[] = rearth.raspi_HomeUI.TimeDate.TimeService.getDate();
        int time[] = rearth.raspi_HomeUI.TimeDate.TimeService.getTime();
        updateTime(date, time);
    }
    
    public HomeUI_main() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
     }
    
    public void updateTime(int Date[], int Time[]) {
        //Zeilenumbruch: "<html>Economy<br>Regularity</html>"
        String day = Integer.toString(Date[0]);
        String time = Integer.toString(Time[0]) + ":" + Integer.toString(Time[1]);
        
        int dayofWeek = rearth.raspi_HomeUI.TimeDate.TimeService.getDayOfWeek(Date);
        
        TimeDisplay.setText("<html><span style='font-size:55px'><font face=\"calibri\"><b></" + time + "</b></font></span><br><font size=\"5\">" + TAGE[dayofWeek] + ", " + day + "." + MONTHS[Date[1]] + "</font></html>");
        
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
        jButton1 = new javax.swing.JButton();
        TimeDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Hallo Welt!");

        jButton1.setText("End now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TimeDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeDisplay.setText("Time and Date");
        TimeDisplay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TimeDisplay.setMaximumSize(new java.awt.Dimension(214, 104));
        TimeDisplay.setMinimumSize(new java.awt.Dimension(214, 104));
        TimeDisplay.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jButton1)))
                .addGap(126, 508, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TimeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addComponent(TimeDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        TimeDisplay.getAccessibleContext().setAccessibleName("Timename");
        TimeDisplay.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeUI_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeUI_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeUI_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeUI_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            HomeUI_main mainUI;
            mainUI = new HomeUI_main();
            mainUI.setVisible(true);
            mainUI.firstInit();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TimeDisplay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
