package com.service.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.spring.service.TicketService;
import com.service.spring.vo.Ticket;
import com.service.spring.vo.User;

@CrossOrigin(origins = "http://localhost:3000") 
@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/{userId}")
	public ResponseEntity showMyTicket(@PathVariable int userId) {
		try {
			List<Ticket> tickets = ticketService.showMyTickets(new User(userId,0,null,null,null,null,null,null));
			return new ResponseEntity(tickets, HttpStatus.ACCEPTED);
		} catch(Exception e) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
	}
	
	
}