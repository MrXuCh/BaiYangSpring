package com.baiyang.serviceimpl.could_impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

	@Autowired
	private TicketServiceImpl ticketService;

	@RequestMapping("/demo")
	public String index() {
		return ticketService.buyTicket();
	}
}
