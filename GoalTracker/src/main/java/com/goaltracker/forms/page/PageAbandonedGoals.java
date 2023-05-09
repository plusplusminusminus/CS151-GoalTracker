/*
 * PageAbandonedGoals.java
 * - display all abandoned goals
 *
 * Tyler Moquin
 * SJSU Spring 2023
 * CS 151, Sec 6
 * Instructor Gaikwad
 *
 * Final Project, "Group 11"
 *
 * VERSION HISTORY
 * v1.0.0   20230509   TAM   final working version
 * v0.0.1   20230321   TAM   initial implementation
 *
 */

package com.goaltracker.forms.page;

import com.goaltracker.goal.AccumulationGoal;
import com.goaltracker.goal.BinaryGoal;
import com.goaltracker.goal.NumericGoal;
import com.goaltracker.goal.Goal;
import com.goaltracker.GoalTracker;
import com.goaltracker.forms.card.CardAccumulationGoal;
import com.goaltracker.forms.card.CardBinaryGoal;
import com.goaltracker.forms.card.CardNumericGoal;
import com.goaltracker.forms.card.CardTaskListGoal;
import com.goaltracker.goal.TaskListGoal;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PageAbandonedGoals extends JPanel implements Page {

    public PageAbandonedGoals() {
        initComponents();
        ArrayList<Goal> goals = GoalTracker.getGoals();
        int numDisplayed = 0;
        if (goals != null) {
            int count = goals.size();
            if (count > 0) {
                for (int i = count - 1; i >= 0; i--) {
                    Goal g = goals.get(i);
                    if (g.getIsSubGoal() == false && !(g.getIsAbandoned()) && (g.getIsCompleted())) {
                        if (g instanceof AccumulationGoal) {
                            goalsPanel.add(new CardAccumulationGoal(g, false, false, false, true));
                        } else if (g instanceof NumericGoal) {
                            goalsPanel.add(new CardNumericGoal(g, false, false, false, true));
                        }  else if (g instanceof BinaryGoal) {
                            goalsPanel.add(new CardBinaryGoal(g, false, false, false, true));
                        } else if (g instanceof TaskListGoal) {
                            goalsPanel.add(new CardTaskListGoal(g, false, false, false, true));
                        }
                        numDisplayed++;
                    }
                }
                goalsPanel.setSize(goalsPanel.getPreferredSize());
                goalsPanel.repaint();
                goalsPanel.validate();
            }
        } else {
        }
        if (numDisplayed == 0) {
            noGoalsMessagePanel.setVisible(true);
        } else {
            noGoalsMessagePanel.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        newGoalLabel = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        noGoalsMessagePanel = new javax.swing.JPanel();
        noGoalsMessageLabel = new javax.swing.JLabel();
        goalsPanel = new javax.swing.JPanel();
        footer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(229, 244, 252));
        setAlignmentX(0.5F);
        setMinimumSize(new java.awt.Dimension(0, 0));
        setOpaque(false);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        title.setBackground(new java.awt.Color(204, 255, 204));
        title.setMaximumSize(new java.awt.Dimension(32768, 16));
        title.setOpaque(false);

        newGoalLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        newGoalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGoalLabel.setText("Abandoned");
        newGoalLabel.setAlignmentX(0.5F);
        newGoalLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        newGoalLabel.setMaximumSize(new java.awt.Dimension(32768, 32768));
        newGoalLabel.setMinimumSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newGoalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addComponent(newGoalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        add(title);

        header.setBackground(new java.awt.Color(255, 204, 153));
        header.setMaximumSize(new java.awt.Dimension(32767, 16));
        header.setMinimumSize(new java.awt.Dimension(0, 16));
        header.setOpaque(false);

        noGoalsMessagePanel.setOpaque(false);

        noGoalsMessageLabel.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        noGoalsMessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noGoalsMessageLabel.setText("No Goals to Display");
        noGoalsMessageLabel.setAlignmentX(0.5F);

        javax.swing.GroupLayout noGoalsMessagePanelLayout = new javax.swing.GroupLayout(noGoalsMessagePanel);
        noGoalsMessagePanel.setLayout(noGoalsMessagePanelLayout);
        noGoalsMessagePanelLayout.setHorizontalGroup(
            noGoalsMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noGoalsMessagePanelLayout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(noGoalsMessageLabel)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        noGoalsMessagePanelLayout.setVerticalGroup(
            noGoalsMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noGoalsMessagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noGoalsMessageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noGoalsMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noGoalsMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(header);

        goalsPanel.setBackground(new java.awt.Color(0, 204, 204));
        goalsPanel.setAlignmentX(0.5F);
        goalsPanel.setMaximumSize(new java.awt.Dimension(32768, 32768));
        goalsPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        goalsPanel.setOpaque(false);
        goalsPanel.setLayout(new javax.swing.BoxLayout(goalsPanel, javax.swing.BoxLayout.Y_AXIS));
        add(goalsPanel);

        footer.setBackground(new java.awt.Color(0, 255, 204));
        footer.setOpaque(false);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );

        add(footer);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel footer;
    private javax.swing.JPanel goalsPanel;
    private javax.swing.JPanel header;
    private javax.swing.JLabel newGoalLabel;
    private javax.swing.JLabel noGoalsMessageLabel;
    private javax.swing.JPanel noGoalsMessagePanel;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}