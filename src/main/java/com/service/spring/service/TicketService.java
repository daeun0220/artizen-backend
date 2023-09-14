package com.service.spring.service;

import java.util.List;

import com.service.spring.vo.Ticket;
import com.service.spring.vo.User;

public interface TicketService {
	List<Ticket> showMyTickets(User user); 							  // A9.해당 유저의 보유 티켓 보여주기
	void sendTicket(int sendUserId, int receiveUserId, int ticketId); // C3.티켓선물하기
}