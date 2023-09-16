package org.wecancodeit.hometask.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Task {
    

    @Id
    @GeneratedValue
     @Column(name = "Task_ID")
    private long TaskID; //id; changed due to one to one relationship with Duration
     @Column(name = "Task_Name")
    private String taskName;
    @Column(name = "Task_Desc")
    private String taskDescription;

    @ManyToOne
   // @Column(name = "Task_HH_Member")
    private HouseholdMember member;

    @OneToOne(mappedBy = "task")
    //  @Column(name = "Task_Reward")
    private Reward reward;
    
    @OneToOne
  //   @Column(name = "Task_Duration")
    private DurationManager duration;

    public Task() {
    }


    public Task(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }


    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (TaskID ^ (TaskID >>> 32));
        result = prime * result + ((taskName == null) ? 0 : taskName.hashCode());
        result = prime * result + ((taskDescription == null) ? 0 : taskDescription.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Task other = (Task) obj;
        if (TaskID != other.TaskID)
            return false;
        if (taskName == null) {
            if (other.taskName != null)
                return false;
        } else if (!taskName.equals(other.taskName))
            return false;
        if (taskDescription == null) {
            if (other.taskDescription != null)
                return false;
        } else if (!taskDescription.equals(other.taskDescription))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Task [taskName=" + taskName + ", taskDescription=" + taskDescription + "]";
    }

    


    
}
