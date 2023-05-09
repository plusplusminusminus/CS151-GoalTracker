package com.goaltracker.goal;

import com.goaltracker.PriorityLevel;
import com.goaltracker.forms.input.InputBinaryGoal;
import java.io.Serializable;
import java.time.Instant;
import javax.swing.JPanel;

public class BinaryGoal extends Goal implements Serializable {
    private Boolean countdown;

    public BinaryGoal(String aDescription, PriorityLevel aPriority, Instant aTargetDate, Boolean aCountdown, String aNotes) {
        super(aDescription, aTargetDate,aPriority, aNotes, false);
        countdown = aCountdown;
    }

    public BinaryGoal(String aDescription, PriorityLevel aPriority, Instant aTargetDate, Boolean aCountdown, String aNotes, Boolean aIsSubGoal) {
        super(aDescription, aTargetDate, aPriority, aNotes, aIsSubGoal);
        countdown = aCountdown;
    }

    public Boolean getCountdown() {
        return countdown;
    }

    public void setCountdown(Boolean countdown) {
        this.countdown = countdown;
    }

    public static JPanel getInputPanel() {
        return new InputBinaryGoal();
    }
}
