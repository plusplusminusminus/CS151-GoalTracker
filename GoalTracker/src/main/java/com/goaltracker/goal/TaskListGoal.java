
package com.goaltracker.goal;

import com.goaltracker.GoalTracker;
import com.goaltracker.PriorityLevel;
import com.goaltracker.forms.input.InputTaskListGoal;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import javax.swing.JPanel;


public class TaskListGoal extends Goal implements Serializable {
    private Boolean countdown;
    public ArrayList<Goal> subgoals;
    private String taskDescriptor;

    public TaskListGoal(String aDescription, PriorityLevel aPriority, Instant aTargetDate, Boolean aCountdown, String aTaskDescriptor, String aTasks, String aNotes) {
        super(aDescription, aTargetDate, aPriority, aNotes);
        taskDescriptor = aTaskDescriptor;
        subgoals = new ArrayList<>();

        String[] tasks = aTasks.split("\\n");
        for (String t: tasks) {
            BinaryGoal a = new BinaryGoal(t, aPriority, aTargetDate, aCountdown, "", true);
            subgoals.add(a);
            GoalTracker.addGoal(a);
        }

    }

    public ArrayList<Goal> getSubgoals() {
        return subgoals;
    }

    public void setSubgoals(ArrayList<Goal> subgoals) {
        this.subgoals = subgoals;
    }

    public String getTaskDescriptor() {
        return taskDescriptor;
    }

    public void setTaskDescriptor(String taskDescriptor) {
        this.taskDescriptor = taskDescriptor;
    }

    public Boolean getCountdown() {
        return countdown;
    }

    public void setCountdown(Boolean countdown) {
        this.countdown = countdown;
    }

    public static JPanel getInputPanel() {
        return new InputTaskListGoal();
    }
}
