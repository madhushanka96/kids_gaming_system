/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddevengame;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ODDEven extends javax.swing.JFrame {
        static int score = 0; // score each corrent question add 1 
        static int count = 0; // number of  question out of 10
        
        //generate random number for each question(number)
        Random r = new Random();
        int randomNum;
        
    /**
     * Creates new form ODDEven
     */
    public ODDEven() {
        initComponents();
        setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
        //first time generate random 
        randomNum = r.nextInt(100);
        lblNumber.setText(String.valueOf(randomNum));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumber = new javax.swing.JLabel();
        btnOdd = new javax.swing.JButton();
        btnEven = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumber.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 0, 51));

        btnOdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnOdd.setText("ODD");
        btnOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOddActionPerformed(evt);
            }
        });

        btnEven.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEven.setText("EVEN");
        btnEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("SCORE");

        lblScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOdd, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEven, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOddActionPerformed
        // TODO add your handling code here:
        //odd operation
        count = count+1; //each button click count question add 1 out of 10
        int num = Integer.parseInt(lblNumber.getText());  //lblnumber is random num and convert to int for odd even operation
        if(count==10){
            //when counter reach last question(number)
            //than it calculate for last number 
            if(num%2!=0){
                // number corret add score 
                score = score+1;
                lblScore.setText(String.valueOf(score)); //set value of score when answer correct
                randomNum = r.nextInt(100); // random number generate for next question number
                
            }else{
                //if not odd number
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum)); //set randomnumber
                               
            }
            
            //result display on 10th question
            JOptionPane.showMessageDialog(this, "Your score is: "+score+"/10");
            //reset values after score
            count=0;
            score =0;
            lblScore.setText("");
            randomNum = r.nextInt(100);
            lblNumber.setText(String.valueOf(randomNum));
            
        }else{
            // if number not reach 10th qestion ( for 1 to 9 )
            if(num%2!=0){
                score = score+1;
                lblScore.setText(String.valueOf(score)); //set score value
                //generate random number for next question
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            }else{
                //if not odd than generate random for next
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            }
        }
        
        
        
    }//GEN-LAST:event_btnOddActionPerformed

    private void btnEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvenActionPerformed
        // TODO add your handling code here:
        // for even do opposite 
        //paste here and change
        
        count = count+1; //each button click count question add 1 out of 10
        int num = Integer.parseInt(lblNumber.getText());  //lblnumber is random num and convert to int for odd even operation
        if(count==10){
            //when counter reach last question(number)
            //than it calculate for last number 
            if(num%2==0){
                // number corret add score 
                score = score+1;
                lblScore.setText(String.valueOf(score)); //set value of score when answer correct
                randomNum = r.nextInt(100); // random number generate for next question number
                
            }else{
                //if not odd number
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum)); //set randomnumber
                               
            }
            
            //result display on 10th question
            JOptionPane.showMessageDialog(this, "Your score is: "+score+"/10");
            //reset values after score
            count=0;
            score =0;
            lblScore.setText("");
            randomNum = r.nextInt(100);
            lblNumber.setText(String.valueOf(randomNum));
            
        }else{
            // if number not reach 10th qestion ( for 1 to 9 )
            if(num%2==0){
                score = score+1;
                lblScore.setText(String.valueOf(score)); //set score value
                //generate random number for next question
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            }else{
                //if not odd than generate random for next
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            }
        }
        
        
    }//GEN-LAST:event_btnEvenActionPerformed

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
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ODDEven().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEven;
    private javax.swing.JButton btnOdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}