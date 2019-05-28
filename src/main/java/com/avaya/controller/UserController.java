package com.avaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaya.modal.User;

@RestController
@RequestMapping("/kafka")
public class UserController {
	@Value("${topic.name}")
	private String TOPIC ;
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	
	
	@PostMapping("/getid")
	public void getUserId(@RequestBody User user) {
	kafkaTemplate.send(TOPIC, user);
		}
	@PostMapping ("/getdetails")
	public void getUserDetails(@RequestBody User user) {
			 kafkaTemplate.send(TOPIC, user);
	}
}
