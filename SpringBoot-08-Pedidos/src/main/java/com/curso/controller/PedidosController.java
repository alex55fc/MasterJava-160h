package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pedido;
import com.curso.service.PedidosServiceImpl;

@RestController
public class PedidosController {
	
	@Autowired
	PedidosServiceImpl service;
	
	@GetMapping(value="pedidos", produces= MediaType.APPLICATION_JSON_VALUE)
	List<Pedido> allOrders(){
		return service.allOrders();
	}
}
