package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.GoalModel;

@Controller
@SessionAttributes("goalModel")
public class GoalController {
	
	@RequestMapping(value = "addGoal", method= RequestMethod.GET)
	public String addGoal(Model model) {
		
		GoalModel goal = new GoalModel();
		goal.setMinutes(10);
		goal.setMessage("Default goal set!");
		model.addAttribute("goalModel", goal);
		return "addGoal";
	}
	
	@RequestMapping(value = "updateGoal", method= RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("goalModel") GoalModel goalModel, BindingResult result) {
		
		System.out.println(" Has Errors :: "+result.hasErrors());
		goalModel.setMessage("Goal set to :" + goalModel.getMinutes());
		
		if(result.hasErrors()) {
			return "addGoal";
		}
		//model.addAttribute("goal", goal);
		return "redirect:addMinutes.html";
	}
}
