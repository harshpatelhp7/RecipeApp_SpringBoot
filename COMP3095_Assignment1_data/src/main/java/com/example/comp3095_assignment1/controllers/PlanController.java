package com.example.comp3095_assignment1.controllers;

import com.example.comp3095_assignment1.model.Plan;
import com.example.comp3095_assignment1.repositories.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

@Controller
public class PlanController {

    @Autowired
    PlanRepository planRepository;

    @RequestMapping("/plan/add")
    public String addPlan(@RequestParam(value = "name")String name,
                          @RequestParam(value = "content")String content,
                          Model model){
        Plan plan = new Plan();
        plan.setName(name);
        plan.setContent(content);
        planRepository.save(plan);
        List<Plan> plans = planRepository.findAll();
        model.addAttribute("plan", plans);
        return "user/plan";
    }

    @RequestMapping("/plan/addOrEdit")
    public String editPlan1(@RequestParam(value = "id", required = false)Integer id, Model model){
        if (id != null){
            Plan plan = planRepository.getById(id);
            model.addAttribute("plan", plan);
            return "/user/planEdit";
        }
        return "/user/planAdd";
    }

    @RequestMapping("/plan/edit")
    public String editPlan(@RequestParam(value = "id")Integer id,
                           @RequestParam(value = "name")String name,
                           @RequestParam(value = "content")String content,
                           Model model){
        Plan plan = planRepository.getById(id);
        plan.setName(name);
        plan.setContent(content);
        planRepository.save(plan);
        List<Plan> plans = planRepository.findAll();
        model.addAttribute("plan", plans);
        return "user/plan";
    }

    @RequestMapping("/plan/delete")
    public String deletePlan(@RequestParam(value = "id")Integer id, Model model){
        planRepository.deleteById(id);
        List<Plan> plans = planRepository.findAll();
        model.addAttribute("plan", plans);
        return "user/plan";
    }

    @RequestMapping("/plan/query")
    public String queryPlan(Model model){
        List<Plan> plans = planRepository.findAll();
        model.addAttribute("plan", plans);
        return "user/plan";
    }
}
