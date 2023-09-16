package org.wecancodeit.hometask.Models;

import jakarta.persistence.*;

@Entity
public class DurationManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Duration_ID")
    private long DurationID;
    @OneToOne
   // @JoinColumn(name = "Task_ID")
    //@Column(name = "Task_ID")
    private Task TheTask; // 
    @Column(name = "Task_Time")
    private long Time;
     @Column(name = "Task_St_Date")
    private long StartDate; // if needed will use in future
    @Column(name = "Task_End_Date")
    private long EndDate; // if needed will use in future

    // Default constructor
    public DurationManager() {
    }
    //

    public DurationManager(long durationID, Task theTask, long time, long startDate, long endDate) {
        DurationID = durationID;
        TheTask = theTask;
        Time = time;
        StartDate = startDate;
        EndDate = endDate;
    }

    public long getDurationID() {
        return DurationID;
    }

    public void setDurationID(long durationID) {
        DurationID = durationID;
    }

    public Task getTheTask() {
        return TheTask;
    }

    public void setTheTask(Task theTask) {
        TheTask = theTask;
    }

    public long getTime() {
        return Time;
    }

    public void setTime(long time) {
        Time = time;
    }

    public long getStartDate() {
        return StartDate;
    }

    public void setStartDate(long startDate) {
        StartDate = startDate;
    }

    public long getEndDate() {
        return EndDate;
    }

    public void setEndDate(long endDate) {
        EndDate = endDate;
    }

    // getter and setters
   
}
