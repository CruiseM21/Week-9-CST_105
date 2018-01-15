/*
 * Program: Pro Draft List
 * File: Main_Window.java
 * Summary: Display Defensive Player by Position window of GUI for Pro Draft List
 * Author: Vincent Christaldi
 * Date: 01/14/18
*/
package pro_draft_list;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Cruise McClarren
 */
public class DefensePosition extends javax.swing.JFrame
{

    private ArrayList Roster;

    /**
     * Creates new form OffensePosition
     */
    public DefensePosition()
    {
        initComponents();
        this.getContentPane().setBackground(Color.pink);
        ArrayList<NFL_Player> Players = new ArrayList<>();
        pro_draft_list.PlayerManager.createPlayers(Players);

         
        rdb_Player1.setText(Players.get(5).getName() + "                   " + Players.get(5).getPosition());
        rdb_Player2.setText(Players.get(6).getName() + "               " + Players.get(6).getPosition());
        rdb_Player3.setText(Players.get(7).getName() + "                 " + Players.get(7).getPosition());
        rdb_Player4.setText(Players.get(8).getName() + "                        " + Players.get(8).getPosition());
        rdb_Player5.setText(Players.get(9).getName() + "                " + Players.get(9).getPosition());
    }
    public DefensePosition(ArrayList Roster)
    {
        initComponents();
        this.getContentPane().setBackground(Color.pink);
        ArrayList<NFL_Player> Players = new ArrayList<>();
        pro_draft_list.PlayerManager.createPlayers(Players);

         
        rdb_Player1.setText(Players.get(5).getName() + "                   " + Players.get(5).getPosition());
        rdb_Player2.setText(Players.get(6).getName() + "               " + Players.get(6).getPosition());
        rdb_Player3.setText(Players.get(7).getName() + "                 " + Players.get(7).getPosition());
        rdb_Player4.setText(Players.get(8).getName() + "                        " + Players.get(8).getPosition());
        rdb_Player5.setText(Players.get(9).getName() + "                " + Players.get(9).getPosition());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        bgp_Selection = new javax.swing.ButtonGroup();
        lbl_Position = new java.awt.Label();
        rdb_Player1 = new javax.swing.JRadioButton();
        rdb_Player2 = new javax.swing.JRadioButton();
        rdb_Player3 = new javax.swing.JRadioButton();
        rdb_Player4 = new javax.swing.JRadioButton();
        rdb_Player5 = new javax.swing.JRadioButton();
        btn_Exit = new java.awt.Button();
        btn_Previous = new java.awt.Button();
        btn_ViewStats = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Offensive Players");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        lbl_Position.setAlignment(java.awt.Label.CENTER);
        lbl_Position.setBackground(new java.awt.Color(0, 0, 255));
        lbl_Position.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_Position.setText("Defensive Players");

        rdb_Player1.setBackground(java.awt.Color.pink);
        bgp_Selection.add(rdb_Player1);
        rdb_Player1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdb_Player1.setSelected(true);
        rdb_Player1.setText("Player 1");

        rdb_Player2.setBackground(java.awt.Color.pink);
        bgp_Selection.add(rdb_Player2);
        rdb_Player2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdb_Player2.setText("Player 2");

        rdb_Player3.setBackground(java.awt.Color.pink);
        bgp_Selection.add(rdb_Player3);
        rdb_Player3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdb_Player3.setText("Player 3");

        rdb_Player4.setBackground(java.awt.Color.pink);
        bgp_Selection.add(rdb_Player4);
        rdb_Player4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdb_Player4.setText("Player 4");

        rdb_Player5.setBackground(java.awt.Color.pink);
        bgp_Selection.add(rdb_Player5);
        rdb_Player5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rdb_Player5.setText("Player 5");

        btn_Exit.setBackground(new java.awt.Color(255, 0, 0));
        btn_Exit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Exit.setLabel("Exit Program");
        btn_Exit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_ExitActionPerformed(evt);
            }
        });

        btn_Previous.setBackground(new java.awt.Color(0, 255, 204));
        btn_Previous.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_Previous.setLabel("Previous");
        btn_Previous.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_PreviousActionPerformed(evt);
            }
        });

        btn_ViewStats.setBackground(new java.awt.Color(0, 255, 0));
        btn_ViewStats.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_ViewStats.setLabel("View Stats");
        btn_ViewStats.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_ViewStatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Position, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdb_Player5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdb_Player4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdb_Player3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdb_Player2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdb_Player1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btn_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_ViewStats, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_Position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdb_Player1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdb_Player2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdb_Player3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdb_Player4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdb_Player5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btn_Previous, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ViewStats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ViewStatsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_ViewStatsActionPerformed
    {//GEN-HEADEREND:event_btn_ViewStatsActionPerformed
        ArrayList<NFL_Player> Players = new ArrayList<>();
        pro_draft_list.PlayerManager.createPlayers(Players);
        double avgYards = 0.0;
        String name = "", position = "", height = "", seasons1 = "";
        int age = 0, weight = 0, year = 0, seasons = 0;
        int tacks = 0;
        int TDS = 0;
        int f_Fmbs = -1;        
        int intcepts =0;
        int index;
        
        if (rdb_Player1.isSelected() == true)
        {
        
        tacks = 122;
        f_Fmbs = 3;
        avgYards = 2.5;
        intcepts = 1;
        year = 2016;
        index = 5;
        name = (Players.get(index).getName());
        position = (Players.get(index).getPosition());
        height = (Players.get(index).getHeight());
        age = (Players.get(index).getAge());
        weight = (Players.get(index).getWeight());
        
        }
        if (rdb_Player2.isSelected() == true)
        {
        
        tacks = 49;
        f_Fmbs = 2;
        avgYards = 14.0;
        intcepts = 0;
        year = 2012;
        index = 6;
        name = (Players.get(index).getName());
        position = (Players.get(index).getPosition());
        height = (Players.get(index).getHeight());
        age = (Players.get(index).getAge());
        weight = (Players.get(index).getWeight());
        
        }
        
        if (rdb_Player3.isSelected() == true)
        {
        tacks = 102;
        f_Fmbs = 1;
        avgYards = 0.0;
        intcepts = 2;
        year = 2015;
        index = 7;
        name = (Players.get(index).getName());
        position = (Players.get(index).getPosition());
        height = (Players.get(index).getHeight());
        age = (Players.get(index).getAge());
        weight = (Players.get(index).getWeight());
        }
        
        if (rdb_Player4.isSelected() == true)
        {
        tacks = 47;
        f_Fmbs = 0;
        avgYards = 0.0;
        intcepts = 5;
        year = 2013;
        index = 8;
        name = (Players.get(index).getName());
        position = (Players.get(index).getPosition());
        height = (Players.get(index).getHeight());
        age = (Players.get(index).getAge());
        weight = (Players.get(index).getWeight());
        
        }
        
        if (rdb_Player5.isSelected() == true)
        {
        
        tacks = 51;
        f_Fmbs = 0;
        avgYards = 0.0;
        intcepts = 4;
        year = 2012;
        index = 9;
        name = (Players.get(index).getName());
        position = (Players.get(index).getPosition());
        height = (Players.get(index).getHeight());
        age = (Players.get(index).getAge());
        weight = (Players.get(index).getWeight());
        }
        
        Defensive_Player DP = new Defensive_Player(name, position, height, age, weight, year, tacks, f_Fmbs, avgYards, intcepts);
        DP.setTackles(tacks);
        tacks = DP.getTackles();
        DP.setForced_Fumbles(f_Fmbs);
        f_Fmbs = DP.getForced_Fumbles();
        DP.setAvg_Yards(avgYards);
        avgYards = DP.getAvg_Yards();
        DP.setInterceptions(intcepts);
        intcepts = DP.getInterceptions();
        DP.setSeasons(year);
        seasons = DP.getSeasons();
        
        seasons1 = (Integer.toString(seasons));
        String age1 = (Integer.toString(age));
        String weight1 = (Integer.toString(weight));
        String year1 = (Integer.toString(year));
        String tackles = (Integer.toString(tacks));
        String f_fumbles = (Integer.toString(f_Fmbs));
        String avg_Yards1 = (Double.toString(avgYards));
        String intcpts = (Integer.toString(intcepts));
        
        
        Player_Stats_Window psw = new Player_Stats_Window(name, position, height, age1, weight1, year1, tackles, f_fumbles, avg_Yards1, intcpts, seasons1,Roster);
        this.dispose();
        psw.setVisible(true);
    }//GEN-LAST:event_btn_ViewStatsActionPerformed

    private void btn_PreviousActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_PreviousActionPerformed
    {//GEN-HEADEREND:event_btn_PreviousActionPerformed
        Position_Window pw = new Position_Window();
        this.dispose();
        pw.setVisible(true);
    }//GEN-LAST:event_btn_PreviousActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_ExitActionPerformed
    {//GEN-HEADEREND:event_btn_ExitActionPerformed
        Exit_Window ew = new Exit_Window();
        this.dispose();
        ew.setVisible(true);
               
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        Exit_Window ew = new Exit_Window();
        this.dispose();
        ew.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(DefensePosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(DefensePosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(DefensePosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(DefensePosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                
                new DefensePosition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgp_Selection;
    private java.awt.Button btn_Exit;
    private java.awt.Button btn_Previous;
    private java.awt.Button btn_ViewStats;
    private java.awt.Label lbl_Position;
    private javax.swing.JRadioButton rdb_Player1;
    private javax.swing.JRadioButton rdb_Player2;
    private javax.swing.JRadioButton rdb_Player3;
    private javax.swing.JRadioButton rdb_Player4;
    private javax.swing.JRadioButton rdb_Player5;
    // End of variables declaration//GEN-END:variables
}
