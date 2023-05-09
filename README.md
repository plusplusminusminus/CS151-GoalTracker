# GoalTracker
GoalTracker is an application designed to help users maintain and track goals.
## Table of contents
* [Team Number and Members](#Team-#11)
* [Contributions to code](#Contributions-to-code)
* [Issue](#Issue)
* [Operations](#Operations)
* [How to run code](#How-to-run-code)
* [References](#References)
## Team #11
* Tyler Moquin
* (other teammembers deleted my work, so I am posting it here)

## Contributions to presentation:
* Tyler Moquin: Assisted in presenting ScheduleMe; did not have an opportunity to present my work, nor was I informed of anything regarding the presentation until a couple hours prior to the presentation.

## Contributions to code
** Tyler Moquin: With respect to the original project with the team, Iesigned and implemented the original architecture for the project, which was moved by someone else into the Backend folder recently and mostly not used in the final project. Designed and implemented an entire, complete version called Goal Tracker, which was located in the src-v2/ folder in their repository and which satisfies the original design criteria. However, in full awareness of the fact that I had uploaded this work, my teammates maliciously deleted all of it and resubmitted the project with none of my work in it. They also deleted the UML Class Diagram that I had created as part of the proposal phase.  As a result, I have uploaded my prior work as well as all the work I did on Goal Tracker to this repository rather than the team repo, as I cannot trust that it will not simply be deleted again.

## Issue
Goal Tracker assists users in creating and managing various types of goals. The application allows the user to specify the type of goal, any deadline, and the attributes associated with the particular type of goal they are creating. The goal types currently supported are as follows:

*Accumulation Goals* are goals where you are aiming to accrue a certain amount. For example, if your goal was to set aside $500.00 over the next year to pay for a new synthesizer, that would be an Accumulation goal. Goal Tracker lets you add amounts towards your target at any time, and will automatically mark the goal as accomplished when the target is reached.
 
*Binary Goals* are goals that are either done or not done. For example, if you want to visit the Pacific Ocean some day, that would be a Binary goal, since you've either done it or you haven't.

*Numeric Goals* are goals that can be measured by a single numeric value. For example, if you want to work out three times in the next week, or you want to reach a weight of 150 lbs, that would be a Numeric goal. Goal Tracker lets you specify the updated value at any time, and will automatically mark the goal as accomplished when the target is reached.

*Task List Goals* are goals that consist of many done/not-done tasks. For example, if you needed to complete 25 homework problems for your Physics class, you could create a Task List goal, entering the problem numbers on separate lines, and Goal Tracker will treat these tasks as a group of sub-goals. Once you have completed all of the tasks within a Multi-Atomic goal, the goal will be marked as accomplished.


#### Running from terminal
```
1 Clone the repository to a local drive, then build the Maven project located in /GoalTracker/src/
2 cd GoalTracker/src/
3 java GoalTracker

```

#### References
```
All code within this project was created by Tyler Moquin. No AI assistance or borrowing from others was done.




