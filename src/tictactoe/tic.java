package tictactoe;

import java.util.*;
import javax.swing.*;

public class tic extends javax.swing.JFrame {

    static int playerresponse, cpuresponse, input;
    static String turn, symbol;
    static ArrayList<Integer> arrplayerpos = new ArrayList<>();
    static ArrayList<Integer> arrcpupos = new ArrayList<>();
    static Random rand = new Random();
            
    public tic() {
        initComponents();
    }

public void validate_response(String turn)
{
    check_winner();
    
    if (turn.equals("player"))
    {            
        if(arrplayerpos.contains(playerresponse) || arrcpupos.contains(playerresponse))  
        {
          JOptionPane.showMessageDialog(null, "This space is already occupated!"); 
        }
        else  
        {
          input = playerresponse;
          arrplayerpos.add(playerresponse);  
          display_response("X");
          validate_response("cpu");
        }
    }
    
    else if (turn.equals("cpu"))
    {            
         while(true)
        {
          cpuresponse = rand.nextInt(9)+1;
          
          if(arrplayerpos.contains(cpuresponse) || arrcpupos.contains(cpuresponse))
          {
            cpuresponse = rand.nextInt(9)+1; 
          }                 
          else 
          {
            input = cpuresponse;
            arrcpupos.add(cpuresponse);            
            display_response("O");
            break;  
          }
        }           
    }
} 

public void display_response(String symbol)
{       
    switch(input)
    {
        case 1:
        s1.setText(symbol);
        break;
        
        case 2:
        s2.setText(symbol);
        break;
        
        case 3:
        s3.setText(symbol);
        break;
        
        case 4:
        s4.setText(symbol);
        break;
        
        case 5:
        s5.setText(symbol);
        break;
        
        case 6:
        s6.setText(symbol);
        break;
        
        case 7:
        s7.setText(symbol);
        break;
        
        case 8:
        s8.setText(symbol);
        break;
        
        case 9:
        s9.setText(symbol);
        break;
    }
}

public void check_winner()
{
    List<Integer>row1 = Arrays.asList(1,2,3);
    List<Integer>row2 = Arrays.asList(4,5,6);
    List<Integer>row3 = Arrays.asList(7,8,9);
    List<Integer>col1 = Arrays.asList(1,4,7);
    List<Integer>col2 = Arrays.asList(2,5,8);
    List<Integer>col3 = Arrays.asList(3,6,9);
    List<Integer>cross1 = Arrays.asList(3,5,7);
    List<Integer>cross2 = Arrays.asList(1,5,9);
    
    List<List> winningpos = new ArrayList<List>();
    
    winningpos.add(row1);
    winningpos.add(row2);
    winningpos.add(row3);
    winningpos.add(col1);
    winningpos.add(col2);
    winningpos.add(col3);
    winningpos.add(cross1);
    winningpos.add(cross2);
    
    for(List l: winningpos){
      if(arrplayerpos.containsAll(l)){
        JOptionPane.showMessageDialog(null, "You won!");
        restart();
      }
      else if(arrcpupos.containsAll(l)){
        JOptionPane.showMessageDialog(null, "Cpu won! Sorry!");
        restart();
      }
      else if(arrplayerpos.size() + arrcpupos.size() == 9){
        JOptionPane.showMessageDialog(null, "Draw!");
        restart();
      }
    }
}

public void restart()
{
   s1.setText("");
   s2.setText("");
   s3.setText("");
   s4.setText("");
   s5.setText("");
   s6.setText("");
   s7.setText("");
   s8.setText("");
   s9.setText("");
  
   arrplayerpos.clear();
   arrcpupos.clear();
}


public void single_player()
{
    validate_response("player");
    check_winner();
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        s2 = new javax.swing.JButton();
        s3 = new javax.swing.JButton();
        s1 = new javax.swing.JButton();
        s5 = new javax.swing.JButton();
        s6 = new javax.swing.JButton();
        s4 = new javax.swing.JButton();
        s8 = new javax.swing.JButton();
        s9 = new javax.swing.JButton();
        s7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        s2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        s3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3ActionPerformed(evt);
            }
        });

        s1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        s5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });

        s6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });

        s4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });

        s8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s8ActionPerformed(evt);
            }
        });

        s9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s9ActionPerformed(evt);
            }
        });

        s7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        playerresponse = 1;
        single_player();
    }//GEN-LAST:event_s1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        playerresponse = 2;      
        single_player();
    }//GEN-LAST:event_s2ActionPerformed

    private void s3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3ActionPerformed
        playerresponse = 3;
        single_player();
    }//GEN-LAST:event_s3ActionPerformed

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        playerresponse = 4;
        single_player();
    }//GEN-LAST:event_s4ActionPerformed

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        playerresponse = 5;
        single_player();
    }//GEN-LAST:event_s5ActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        playerresponse = 6;
        single_player();
    }//GEN-LAST:event_s6ActionPerformed

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        playerresponse = 7;
        single_player();
    }//GEN-LAST:event_s7ActionPerformed

    private void s8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s8ActionPerformed
        playerresponse = 8;
        single_player();
    }//GEN-LAST:event_s8ActionPerformed

    private void s9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s9ActionPerformed
        playerresponse = 9;
        single_player();
    }//GEN-LAST:event_s9ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton s1;
    private javax.swing.JButton s2;
    private javax.swing.JButton s3;
    private javax.swing.JButton s4;
    private javax.swing.JButton s5;
    private javax.swing.JButton s6;
    private javax.swing.JButton s7;
    private javax.swing.JButton s8;
    private javax.swing.JButton s9;
    // End of variables declaration//GEN-END:variables
}