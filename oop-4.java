Main.java
 
package com.company;
 
import javax.swing.*;
 
public class Main {
    public static void main(String[] args) {
        Gui example = new Gui();
        example.setVisible(true);
        example.setSize(320,240);
        example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        example.setResizable(false);
    }
}
 
Gui.java
 
package com.company;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
;import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Gui extends JFrame implements ActionListener {
    int team1 = 0;
    int team2 = 0;
    String team = "N/A";
    JPanel panel = new JPanel(null);
    JButton Milan = new JButton("FC Milan");
    JButton Real = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: " + team1 + "X" + team2);
    JLabel last_scorer= new JLabel("Last scorer: " + team);
    JLabel winner = new JLabel("DRAW");
 
    public Gui(){
        this.setContentPane(panel);
        Milan.setBounds(40,40,110,20);
        Milan.addActionListener(this);
        Real.setBounds(170,40,110,20);
        Real.addActionListener(this);
        result.setBounds(125,60,80,20);
        last_scorer.setBounds(125,80,140,20);
        winner.setBounds(125,100,70,20);
        panel.add(Milan);
        panel.add(Real);
        panel.add(result);
        panel.add(last_scorer);
        panel.add(winner);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("FC Milan")){
            team = "FC Milan";
            team1++;
            if(team1>team2){
                winner.setText("FC Milan");
            }
            else if(team1==team2){
                winner.setText("DRAW");
            }
            result.setText("Result: " + team1 + "X" + team2);
            last_scorer.setText("Last scorer: " + team);
        }
        else if(command.equals("Real Madrid")){
            team = "Real Madrid";
            team2++;
            if(team2>team1){
                winner.setText("Real Madrid");
            }
            else if(team1==team2){
                winner.setText("DRAW");
            }
            result.setText("Result: " + team1 + "X" + team2);
            last_scorer.setText("Last scorer: " + team);
        }
    }
}