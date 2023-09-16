package org.wecancodeit.hometask.Controllers;


    import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.hometask.Models.HouseholdMember;
import org.wecancodeit.hometask.Repositories.HouseholdMemberRepository;

import jakarta.annotation.Resource;

@Controller
public class HouseholdMemberController {

    @Resource
    private HouseholdMemberRepository member;

    @RequestMapping("/householdmembers")
    public String collectAllMembers(Model model) {
        model.addAttribute("householdmembers", member.findAll());
        return "memberView";// add household member view
    }

    @GetMapping("/householdmembers/{memberid}")
    public String collectOneMember(@PathVariable String name, Model model) {
        model.addAttribute("householdmember", member);
        return "memberView";// add household member view
    }

    @PostMapping("/addmember")
    public HouseholdMember addMember(@RequestBody HouseholdMember houseMember) {
        return member.save(houseMember);

    }

}



