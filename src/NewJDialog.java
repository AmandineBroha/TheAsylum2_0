
import java.awt.Image;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author poste
 */
public class NewJDialog extends javax.swing.JDialog {
    public static Game game = new Game();
    private boolean porte1 = false;
    private boolean porte2 = false;
    private boolean porte3 = false;
    /**
     * Creates new form NewJDialog
     */
    public NewJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        retryPane = new javax.swing.JDialog(this, true);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        retryButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        scene = new javax.swing.JLabel();
        choicesButton = new javax.swing.JButton();
        itemList = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        downArrow = new javax.swing.JButton();
        leftArrow = new javax.swing.JButton();
        rightArrow = new javax.swing.JButton();
        upArrow = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        instructions = new javax.swing.JTextArea();
        helpButton = new javax.swing.JButton();
        goButton = new javax.swing.JButton();
        hpCounter = new javax.swing.JLabel();

        retryPane.setAlwaysOnTop(true);
        retryPane.setMinimumSize(new java.awt.Dimension(234, 171));

        jLabel2.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel2.setText("YOU ARE DEAD!");

        jLabel3.setFont(new java.awt.Font("Chiller", 0, 24)); // NOI18N
        jLabel3.setText("          Try again?");

        retryButton.setText("Yes!");
        retryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });

        quitButton.setText("No, I quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout retryPaneLayout = new javax.swing.GroupLayout(retryPane.getContentPane());
        retryPane.getContentPane().setLayout(retryPaneLayout);
        retryPaneLayout.setHorizontalGroup(
            retryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retryPaneLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(retryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(retryPaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(retryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quitButton)
                .addGap(46, 46, 46))
        );
        retryPaneLayout.setVerticalGroup(
            retryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retryPaneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(retryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        scene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garden.png"))); // NOI18N

        choicesButton.setText("Choices");
        choicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choicesButtonActionPerformed(evt);
            }
        });

        itemList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        itemList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemListActionPerformed(evt);
            }
        });

        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Rock");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Paper");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Scissors");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        downArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-go-down-icon.png"))); // NOI18N
        downArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downArrowActionPerformed(evt);
            }
        });

        leftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-go-previous-icon.png"))); // NOI18N
        leftArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftArrowActionPerformed(evt);
            }
        });

        rightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-go-next-icon.png"))); // NOI18N
        rightArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightArrowActionPerformed(evt);
            }
        });

        upArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actions-go-up-icon.png"))); // NOI18N
        upArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upArrowActionPerformed(evt);
            }
        });

        instructions.setEditable(false);
        instructions.setColumns(20);
        instructions.setRows(5);
        instructions.setText(game.printWelcome());
        jScrollPane2.setViewportView(instructions);

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        goButton.setVisible(false);
        goButton.setText("Go!");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        hpCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hp4.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(upArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(downArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(rightArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(itemList, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(helpButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(choicesButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(goButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scene, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hpCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scene, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(upArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(downArrow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(leftArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rightArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(choicesButton)
                            .addComponent(itemList, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(helpButton)
                            .addComponent(goButton))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hpCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //returns whether the player is still alive
    private boolean isAlive()
    {
        return game.player.getHealthPoint() > 0;
    }
    
    private boolean isChecked()
    {
         if (game.getCurrentRoom().getDescription()=="in the entry hall")
         {
             return true;
         }
         return false;
    }
    
    private void setChoicesVisible() {
        jRadioButton1.setVisible(true);
        jRadioButton2.setVisible(true);
        jRadioButton3.setVisible(true);
    }
     private void setChoicesInvisible() {
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
    }
     
    public javax.swing.JDialog getRetryPane()
    {
        return retryPane;
    }
    
    
    
    private void setHP() 
    {
        int hp = game.player.getHealthPoint();
        switch(hp)
        
        {
            case 0: hpCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hp0.png")));
                break;
            case 1: hpCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hp1.png")));
                break;
            case 2: hpCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hp2.png")));
                break;
            case 3: hpCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hp3.png")));
                break;
            case 4: hpCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hp4.png")));
                break;
        }
    }
    
    private boolean isThereZombie()
    {
        return game.getCurrentRoom().hasCharacter() && game.getCurrentRoom().getCharacter().isEnemy();
    }
    
    private void zombieWarning() {
        String current = instructions.getText();
        instructions.setText(current + "BEWARE!\nThere's a Zombie in the Room! \n ");
    }
   
    
    private void choicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choicesButtonActionPerformed
        
        if ((game.getCurrentRoom().getDescription()=="in the gardian lounge"))
        {
        setChoicesVisible();
        scene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logegardienzombie.png")));
        goButton.setVisible(true);
        }
        
        else if ((game.getCurrentRoom().getDescription()=="in the entry hall")&&(game.getkeyItem()==true))
        {
            setChoicesVisible();
            goButton.setVisible(true);
        }
        
        else if (game.getCurrentRoom().getDescription()=="in the director office")
        {
            setChoicesVisible();
            goButton.setVisible(true);
        }
        
        else if (jRadioButton1.isVisible())
        { 
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        goButton.setVisible(false);
        }
    }//GEN-LAST:event_choicesButtonActionPerformed

    private void itemListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemListActionPerformed

    private void downArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downArrowActionPerformed
        if (!isThereZombie() && isAlive())
        {
            String text =game.goRoom(new Command("go","south"));
            instructions.setText(text);
            scene.setIcon(new javax.swing.ImageIcon(getClass().getResource(game.getCurrentRoom().getImage()))); 
            if ((game.getCurrentRoom().getDescription()== "in the entry hall") && porte1 && porte2 && porte3)
            {
                instructions.setText(game.player.takeItem(new Item("fairy dust",1))
                    + "Its magical powers have open\none of the doors!");
            }
        }
        else if (isThereZombie())
        {
        zombieWarning();
        instructions.setText("You can't escape!");
        }
    }//GEN-LAST:event_downArrowActionPerformed

    private void rightArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightArrowActionPerformed
        if (!isThereZombie() && isAlive())
        {
        String text = game.goRoom(new Command("go","east"));
        instructions.setText(text);
        scene.setIcon(new javax.swing.ImageIcon(getClass().getResource(game.getCurrentRoom().getImage())));
        porte3=isChecked();
            if ((game.getCurrentRoom().getDescription()=="in the entry hall")&&(game.getkeyItem()==true))
            {
                scene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hallzombie.png")));
                game.getCurrentRoom().addCharacter(new Character(game.getCurrentRoom(), 2, true));
                zombieWarning();
            }
        }
        else if (isThereZombie())
        {
            instructions.setText("You can't escape!");
        }
        
    }//GEN-LAST:event_rightArrowActionPerformed

    private void leftArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftArrowActionPerformed
        if (!isThereZombie() && isAlive())
        {
        String text = game.goRoom(new Command("go","west"));
        instructions.setText(text);
        scene.setIcon(new javax.swing.ImageIcon(getClass().getResource(game.getCurrentRoom().getImage())));
        porte1=isChecked();
            if (game.getCurrentRoom().getDescription() == "in Robert's bedroom")
            {
                String current = instructions.getText();
                instructions.setText(current + game.player.takeItem(new Item("note", 1)));
            }
        }
        else if (isThereZombie())
        {
            instructions.setText("You can't escape!");
        }
        
    }//GEN-LAST:event_leftArrowActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void upArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upArrowActionPerformed
        if (!isThereZombie() && isAlive())
        {
        String text = game.goRoom(new Command("go","north"));
        instructions.setText(text);
        scene.setIcon(new javax.swing.ImageIcon(getClass().getResource(game.getCurrentRoom().getImage()))); 
        porte2=isChecked();
            if ((game.getCurrentRoom().getDescription()=="in the gardian lounge") && isThereZombie())
            {
            scene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logegardienzombie.png")));
            zombieWarning();
            }
            else if (game.getCurrentRoom().getDescription()=="in the stairs")
            {
            game.player.die();
            setHP();
            instructions.setText("Pushed by a strange force, you fall down\nthe stairs and break your neck.\n "
                    + "A black veil falls upon your eyes\n"
                    + "and you're never going to wake up again");
            retryPane.setVisible(true);
            }
        }
        else if (isThereZombie())
        {
            instructions.setText("You can't escape!");
        }

    }//GEN-LAST:event_upArrowActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
        if (isThereZombie())
        {
            String text = instructions.getText()
                    + "\nTo fight it, use the 'Choices'\n"
                    + "button. Once you choose,\n"
                    + "click on 'Go!' \n";
            instructions.setText(text);
        }
        else
        {
            String text = instructions.getText() + game.printHelp();
            instructions.setText(text);
        }
        
    }//GEN-LAST:event_helpButtonActionPerformed

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        goButton.setVisible(false);
        String choix="";
        
        
            for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

                if (button.isSelected()) {
                    choix =button.getText();
                }
            }
            Character enemy = game.getCurrentRoom().getCharacter();
            boolean win= game.player.fight(choix, enemy);
                if (win){                    
                    instructions.setText("You defeated the zombie.\nHe dropped an old key."
                            + "\nYou decided to take it."
                            + "\nThe key has been added to\nyour inventory.");
                    scene.setIcon(new javax.swing.ImageIcon(getClass().getResource(game.getCurrentRoom().getImage())));
                    game.player.takeItem(new Item("key",1));
                }
                else{
                    instructions.setText("You lost.\nThe Zombie has hurt you\nand ran away."
                    + "\nHe dropped an old key.\n You decided to take it."
                    + "\nThe key has been added to\nyou're inventory.");
                    game.player.takeItem(new Item("key",1));
                    scene.setIcon(new javax.swing.ImageIcon(getClass().getResource(game.getCurrentRoom().getImage())));
                }
                buttonGroup1.clearSelection();
                
        game.getCurrentRoom().removeCharacter();
        String currentText = instructions.getText();
        instructions.setText(currentText + "The combat is over");
        setHP();
        setChoicesInvisible();
        if (!isAlive())
        {
            retryPane.setVisible(true);
        }
        
        
    }//GEN-LAST:event_goButtonActionPerformed

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retryButtonActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton choicesButton;
    private javax.swing.JButton downArrow;
    private javax.swing.JButton goButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel hpCounter;
    private javax.swing.JTextArea instructions;
    private javax.swing.JComboBox itemList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton leftArrow;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton retryButton;
    private javax.swing.JDialog retryPane;
    private javax.swing.JButton rightArrow;
    private javax.swing.JLabel scene;
    private javax.swing.JButton upArrow;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jan
 */
class Retry extends javax.swing.JDialog {

    /**
     * Creates new form Retry
     */
    public Retry(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    private boolean retry;
    
    public boolean playAgain()
    {
        return retry;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();
        retryButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Try again?");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("YOU ARE DEAD!");

        quitButton.setText("No, I quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        retryButton.setText("Yes!");
        retryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(retryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(quitButton)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retryButton)
                    .addComponent(quitButton))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        retry = false;
    }                                          

    private void retryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        retry = true;
    }                                           

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
            java.util.logging.Logger.getLogger(Retry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Retry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Retry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Retry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Retry dialog = new Retry(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton retryButton;
    // End of variables declaration                   
}

