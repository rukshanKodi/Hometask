package org.wecancodeit.hometask.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.wecancodeit.hometask.Models.HouseholdMember;
import org.wecancodeit.hometask.Models.Task;
import org.wecancodeit.hometask.Repositories.DurationRepository;
import org.wecancodeit.hometask.Repositories.TaskRepository;
import org.wecancodeit.hometask.Services.TaskService;

import jakarta.annotation.Resource;

@Controller
public class TaskController {
    //RK_integration with task and modules
    @Resource
    private DurationRepository durationRepository;
    /////
    @Resource
    private TaskRepository taskRepository;
    @Resource
    private TaskService taskService;
    
    
    @GetMapping("/createTask/{familyMemberId}")
    public String createTask(@PathVariable Long familyMemberId, Model model){
        //add Get Family Member
        
        model.addAttribute("task", null);
        return "createTaskView";
    }

    @GetMapping("/task/{TaskID}")
    public Task retrieveTaskById(@PathVariable Long TaskID)throws Exception{
        return taskService.retrieveTaskById(TaskID);
    }

    /*
     * Save task from user input
     */
    @PostMapping("/saveTask")
    public String saveTask(@ModelAttribute("task") Task task){
        return "redirect:/task";
    }

    @GetMapping("/createTask/{durationId}")
    public String createDuration(@PathVariable Long durationId, Model model){
        //add Get Family Member
        model.addAttribute("duration", null);
        return "createDurationView";
    }

    @PostMapping("/saveDuration")
    public String saveDuration(@ModelAttribute("duration") Task task){
        return "redirect:/task";
    }
}



