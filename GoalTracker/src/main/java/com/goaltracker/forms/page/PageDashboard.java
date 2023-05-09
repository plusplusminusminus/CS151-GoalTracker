/*
 * PageDashboard.java
 * - display dashboard page
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
import com.goaltracker.goal.TaskListGoal;
import com.goaltracker.config.Constants;
import com.goaltracker.forms.card.CardAccumulationGoal;
import com.goaltracker.forms.card.CardBinaryGoal;
import com.goaltracker.forms.card.CardNumericGoal;
import com.goaltracker.forms.card.CardTaskListGoal;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PageDashboard extends JPanel implements Page {

    public PageDashboard() {
        initComponents();
        ArrayList<Goal> goals = GoalTracker.getGoals();
        int numDisplayed = 0;
        if (goals != null) {
            int count = goals.size();
            if (count > 0) {
                for (int i = count - 1; i >= 0; i--) {
                    Goal g = goals.get(i);
                    if (!(g.getIsSubGoal() == true) && !(g.getIsAbandoned()) && !(g.getIsCompleted())) {
                        if (g instanceof AccumulationGoal) {
                            summaryPanel.add(new CardAccumulationGoal(g,true, false, false, false));
                        } else if (g instanceof NumericGoal) {
                            summaryPanel.add(new CardNumericGoal(g, true, false, false, false));
                        } else if (g instanceof BinaryGoal) {
                            summaryPanel.add(new CardBinaryGoal(g, true, false, false, false));
                        } else if (g instanceof TaskListGoal) {
                            summaryPanel.add(new CardTaskListGoal(g, true, false, false, false));
                        }
                        numDisplayed++;
                    }
                }
            }
            summaryPanel.setSize(summaryPanel.getPreferredSize());
            summaryPanel.repaint();
            summaryPanel.validate();
        } else {
        }
        if (numDisplayed > 0) {
            header.setVisible(true);
        } else {
            header.setVisible(false);
        }
        updateSummaries();
    }

    public void updateSummaries() {
        int openGoalsCount = GoalTracker.getOpenGoalsCount();
        openGoalsValue.setText(Integer.toString(openGoalsCount));
        int completedGoalsCount = GoalTracker.getCompletedGoalsCount();
        completedGoalsValue.setText(Integer.toString(completedGoalsCount));
        int priorityGoalsCount = GoalTracker.getPriorityGoalsCount();
        priorityGoalsValue.setText(Integer.toString(priorityGoalsCount));
        repaint();
        validate();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JPanel();
        newGoalLabel = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        ribbon = new javax.swing.JLayeredPane();
        openGoalsBox = new javax.swing.JPanel();
        openGoalsLabel = new javax.swing.JLabel();
        openGoalsValue = new javax.swing.JLabel();
        priorityGoalsBox = new javax.swing.JPanel();
        priorityGoalsLabel = new javax.swing.JLabel();
        priorityGoalsValue = new javax.swing.JLabel();
        completedGoalsBox = new javax.swing.JPanel();
        completedGoalsLabel = new javax.swing.JLabel();
        completedGoalsValue = new javax.swing.JLabel();
        summaryPanel = new javax.swing.JPanel();
        summaryPanel2 = new javax.swing.JPanel();
        footer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(229, 244, 252));
        setAlignmentX(0.5F);
        setMinimumSize(new java.awt.Dimension(576, 0));
        setOpaque(false);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        title.setOpaque(false);

        newGoalLabel.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        newGoalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newGoalLabel.setText("Dashboard");
        newGoalLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(newGoalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newGoalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(title);

        header.setBackground(new java.awt.Color(0, 255, 204));
        header.setOpaque(false);

        ribbon.setBackground(new java.awt.Color(255, 255, 51));

        openGoalsBox.setBackground(new java.awt.Color(137, 231, 255));
        openGoalsBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        openGoalsLabel.setBackground(new java.awt.Color(51, 51, 255));
        openGoalsLabel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        openGoalsLabel.setForeground(new java.awt.Color(255, 255, 255));
        openGoalsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openGoalsLabel.setText("Open Goals Count");
        openGoalsLabel.setOpaque(true);

        openGoalsValue.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        openGoalsValue.setForeground(new java.awt.Color(0, 0, 255));
        openGoalsValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openGoalsValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openGoalsValueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout openGoalsBoxLayout = new javax.swing.GroupLayout(openGoalsBox);
        openGoalsBox.setLayout(openGoalsBoxLayout);
        openGoalsBoxLayout.setHorizontalGroup(
            openGoalsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(openGoalsValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(openGoalsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        openGoalsBoxLayout.setVerticalGroup(
            openGoalsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(openGoalsBoxLayout.createSequentialGroup()
                .addComponent(openGoalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(openGoalsValue, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        priorityGoalsBox.setBackground(new java.awt.Color(255, 204, 204));
        priorityGoalsBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        priorityGoalsLabel.setBackground(new java.awt.Color(255, 51, 51));
        priorityGoalsLabel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        priorityGoalsLabel.setForeground(new java.awt.Color(255, 255, 255));
        priorityGoalsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priorityGoalsLabel.setText("Priority Goals Count");
        priorityGoalsLabel.setOpaque(true);

        priorityGoalsValue.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        priorityGoalsValue.setForeground(new java.awt.Color(255, 0, 0));
        priorityGoalsValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priorityGoalsValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priorityGoalsValueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout priorityGoalsBoxLayout = new javax.swing.GroupLayout(priorityGoalsBox);
        priorityGoalsBox.setLayout(priorityGoalsBoxLayout);
        priorityGoalsBoxLayout.setHorizontalGroup(
            priorityGoalsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(priorityGoalsValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(priorityGoalsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        priorityGoalsBoxLayout.setVerticalGroup(
            priorityGoalsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(priorityGoalsBoxLayout.createSequentialGroup()
                .addComponent(priorityGoalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(priorityGoalsValue, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        completedGoalsBox.setBackground(new java.awt.Color(130, 255, 132));
        completedGoalsBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        completedGoalsLabel.setBackground(new java.awt.Color(0, 153, 153));
        completedGoalsLabel.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        completedGoalsLabel.setForeground(new java.awt.Color(255, 255, 255));
        completedGoalsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completedGoalsLabel.setText("Completed Goals Count");
        completedGoalsLabel.setOpaque(true);

        completedGoalsValue.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        completedGoalsValue.setForeground(new java.awt.Color(0, 153, 102));
        completedGoalsValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        completedGoalsValue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                completedGoalsValueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout completedGoalsBoxLayout = new javax.swing.GroupLayout(completedGoalsBox);
        completedGoalsBox.setLayout(completedGoalsBoxLayout);
        completedGoalsBoxLayout.setHorizontalGroup(
            completedGoalsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(completedGoalsValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(completedGoalsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        completedGoalsBoxLayout.setVerticalGroup(
            completedGoalsBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(completedGoalsBoxLayout.createSequentialGroup()
                .addComponent(completedGoalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(completedGoalsValue, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        ribbon.setLayer(openGoalsBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ribbon.setLayer(priorityGoalsBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ribbon.setLayer(completedGoalsBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ribbonLayout = new javax.swing.GroupLayout(ribbon);
        ribbon.setLayout(ribbonLayout);
        ribbonLayout.setHorizontalGroup(
            ribbonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ribbonLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(openGoalsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(priorityGoalsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(completedGoalsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        ribbonLayout.setVerticalGroup(
            ribbonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ribbonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ribbonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(completedGoalsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openGoalsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityGoalsBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ribbon)
                    .addContainerGap()))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ribbon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(header);

        summaryPanel.setBackground(Constants.GOAL_BGCOLOR);
        summaryPanel.setAlignmentX(0.5F);
        summaryPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        summaryPanel.setOpaque(false);
        summaryPanel.setLayout(new javax.swing.BoxLayout(summaryPanel, javax.swing.BoxLayout.Y_AXIS));

        summaryPanel2.setBackground(new java.awt.Color(0, 255, 102));
        summaryPanel2.setMaximumSize(new java.awt.Dimension(3276, 32768));
        summaryPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        summaryPanel2.setOpaque(false);
        summaryPanel2.setLayout(new javax.swing.BoxLayout(summaryPanel2, javax.swing.BoxLayout.Y_AXIS));
        summaryPanel.add(summaryPanel2);

        add(summaryPanel);

        footer.setBackground(new java.awt.Color(255, 255, 0));
        footer.setMinimumSize(new java.awt.Dimension(0, 0));
        footer.setOpaque(false);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );

        add(footer);
    }// </editor-fold>//GEN-END:initComponents

    private void openGoalsValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openGoalsValueMouseClicked
        GoalTracker.showCurrentGoals();
    }//GEN-LAST:event_openGoalsValueMouseClicked

    private void priorityGoalsValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priorityGoalsValueMouseClicked
        GoalTracker.showPriorityGoals();
    }//GEN-LAST:event_priorityGoalsValueMouseClicked

    private void completedGoalsValueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedGoalsValueMouseClicked
        GoalTracker.showCompletedGoals();
    }//GEN-LAST:event_completedGoalsValueMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel completedGoalsBox;
    private javax.swing.JLabel completedGoalsLabel;
    private javax.swing.JLabel completedGoalsValue;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel newGoalLabel;
    private javax.swing.JPanel openGoalsBox;
    private javax.swing.JLabel openGoalsLabel;
    private javax.swing.JLabel openGoalsValue;
    private javax.swing.JPanel priorityGoalsBox;
    private javax.swing.JLabel priorityGoalsLabel;
    private javax.swing.JLabel priorityGoalsValue;
    private javax.swing.JLayeredPane ribbon;
    private javax.swing.JPanel summaryPanel;
    private javax.swing.JPanel summaryPanel2;
    private javax.swing.JPanel title;
    // End of variables declaration//GEN-END:variables
}
