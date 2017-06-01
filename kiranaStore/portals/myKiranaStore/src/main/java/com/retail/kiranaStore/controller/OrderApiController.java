package com.retail.kiranaStore.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.retail.kiranaStore.domain.Order;

@RestController
@RequestMapping("/api/order")
public class OrderApiController {

	private static final String CLIENT_ORDER = "clientOrder";
/*
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Order getOrder(HttpSession session) {
		Order clientOrder = getOrder(session);
		return clientOrder!=null? clientOrder: new Order();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Order saveOrder(HttpSession session) {
		Order clientOrder = getOrder(session);
		return null;
	}

	private Order getOrder(HttpSession session) {
		return (Order) session.getAttribute(CLIENT_ORDER);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String addItem(String itemCode , HttpSession session) {
		return null;
	}*/
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String deleteItem(String itemCode , HttpSession session) {
		return null;
	}
}
