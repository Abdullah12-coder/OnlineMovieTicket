package com.sunsoft.sprint.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunsoft.sprint.dao.TicketDao;
import com.sunsoft.sprint.entity.Ticket;
import com.sunsoft.sprint.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	
	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	TicketDao ticketDao;
	
	@Override
	public List<Ticket> showTicket() {
		// TODO Auto-generated method stub
		return ticketDao.showTicket();
	}

	@Override
	public void cancelBookings(int ticketId) {
		// TODO Auto-generated method stub
		ticketDao.cancelBookings(ticketId);

		
	}

	@Override
	public void addTicket(Ticket ticket){
		// TODO Auto-generated method stub
		ticketDao.addTicket(ticket);
	}

}
