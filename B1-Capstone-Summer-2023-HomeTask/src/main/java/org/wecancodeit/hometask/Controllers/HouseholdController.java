package org.wecancodeit.hometask.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.hometask.Repositories.HouseholdRepository;
import org.wecancodeit.hometask.Services.HouseholdService;

import jakarta.annotation.Resource;

@Controller
public class HouseholdController {
    @Resource
    private HouseholdRepository householdRepository;
    private HouseholdService householdService;

    public HouseholdController(HouseholdService householdService) {
        this.householdService = householdService;
    }

    @RequestMapping ({"", "/", "/household"})
    public String retrieveAllHouseholds(Model model) {
        model.addAttribute("households", householdService.retrieveAllHouseholds());
        return "HouseholdsView";
    }

    @RequestMapping ("/household/{name}")
    public String displayHousehold(@PathVariable String name, Model model) throws Exception {
        model.addAttribute("household", householdService.retrieveHouseholdByName(name));
        return "householdView";
    }


    // @GetMapping({"/RegisterHousehold/{HouseholdId}"})
    // public String RegisterHousehold(@PathVariable Long HouseholdId, Model model) {
    //     model.addAttribute("household", null);
    //     return "RegisterHousehold";
    // }


}
