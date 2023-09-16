package org.wecancodeit.hometask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.hometask.Models.DurationManager;
import org.wecancodeit.hometask.Models.Household;
import org.wecancodeit.hometask.Models.Task;
import org.wecancodeit.hometask.Services.HouseholdService;
import org.wecancodeit.hometask.Services.TaskService;

@Component
public class Populator implements CommandLineRunner {

   
    HouseholdService householdService;
    @Autowired
    TaskService taskService;

  
    public Populator(HouseholdService householdService) {
        this.householdService = householdService;
    }

    public Populator(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run(String... args) throws Exception {
        // create household table Entries
        Household firstFamily = new Household("first family");
        householdService.save(firstFamily);

        Task task = new Task("task_01", "Task_01_Description");
        //("task_01", "Task_01_Description"
        //taskService.save(task);

    }
}
