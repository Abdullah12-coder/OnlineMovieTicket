package com.sunsoft.sprint.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.sprint.entity.Ticket;
import com.sunsoft.sprint.service.TicketService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	TicketService ticketService;
	
	@GetMapping("/all")
	public List<Ticket> showTicket()
	{
		return ticketService.showTicket();
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("ticketId") int ticketId) {
		
		ticketService.cancelBookings(ticketId);
		System.out.println("delete Done");
       return "Deletion is performed successfully";
	}
	
	@PostMapping("/addTicket")
	public void addTicket(@RequestBody Ticket ticket) {
		ticketService.addTicket(ticket);
	}
	

}
