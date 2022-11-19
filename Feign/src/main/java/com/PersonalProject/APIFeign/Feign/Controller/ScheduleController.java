package com.PersonalProject.APIFeign.Feign.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PersonalProject.APIFeign.Feign.Consumer.ConsumerAPI;
import com.PersonalProject.APIFeign.Feign.Model.Contact;

@RestController
@RequestMapping("Schedule")
public class ScheduleController {
	@Autowired
	private ConsumerAPI consumer;
	
	@GetMapping
	public Contact returnContact() {
		return consumer.returnContact();
	}
}
