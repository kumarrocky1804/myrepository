package com.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController 
{
	@RequestMapping("/showForm")
	public String showForm(Model model)
	{
		// we have model to set the attribute for new student object
		// this object's data will be binded in JSP by Spring
		
		model.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	// model attribute passed by JSP can be received here
	public String processForm(@ModelAttribute("student") Student student)
	{
		System.out.println("The student - " + student.getFirstName() +
			" " + student.getLastName());
		return "student-confirmation";
	}
}
