package com.PersonalProject.APIFeign.Feign.Consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.PersonalProject.APIFeign.Feign.Model.Contact;

@FeignClient(name="schedule", url="http://localhost:8080/Contact")
public interface ConsumerAPI {
	@RequestMapping(method = RequestMethod.GET, value="")
	Contact returnContact();
}
