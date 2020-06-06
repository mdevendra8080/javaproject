package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.MinutesModel;

@Controller
public class MinutesController {

//	@RequestMapping(value = "/addMinutes")
//	public String addMinutes() {
//		return "addMinutes";
//	}

//	@RequestMapping(value = "/addMinutes")
//	public String addMinutes(@ModelAttribute("minutesModel") MinutesModel minutesModel) {
//		minutesModel.setMessage("Received minutes" + minutesModel.getMinutes());
//		return "addMinutes";
//	}
	
// Chaining View	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("minutesModel") MinutesModel minutesModel) {
		//minutesModel.setMessage("Received minutes" + minutesModel.getMinutes());
		return "redirect:addMoreMinutes.html";
	}
	
	
	@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("minutesModel") MinutesModel minutesModel) {
		minutesModel.setMessage("Received more minutes" + minutesModel.getMinutes());
		return "addMinutes";
	}
	
	@RequestMapping(value = "/activities", method= RequestMethod.GET)
	public @ResponseBody List<Activity> getActivities() {
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		
		activities.add(run);
		activities.add(bike);
		activities.add(swim);	
		
		return activities;
	}
}
