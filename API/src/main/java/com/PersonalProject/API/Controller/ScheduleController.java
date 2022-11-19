package com.PersonalProject.API.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PersonalProject.API.Model.Contact;

@RestController
@RequestMapping("Contact")
public class ScheduleController {
	
	@GetMapping
	public Contact returnContact() {
		return Contact.builder()
				.id(1L)
				.name("Lucas")
				.phone("99 9 9999-9999")
				.build();
	}
	
}
