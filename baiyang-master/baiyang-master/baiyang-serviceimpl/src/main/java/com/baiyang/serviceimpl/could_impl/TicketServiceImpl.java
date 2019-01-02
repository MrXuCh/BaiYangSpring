package com.baiyang.serviceimpl.could_impl;

import com.baiyang.service.could_inteface.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService{

	@Override
	public String buyTicket() {
		System.out.println("我是8002");
		return "《疯狂的石头》";
	}
}
