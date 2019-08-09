package com.app.controller.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.OrderTrack;

@RestController
@RequestMapping("/tracking")
public class TrackRestController {
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/show")
	public ResponseEntity<OrderTrack> showStatus() {
		OrderTrack ot=new OrderTrack();
		ot.setOrderId("1256-swiggy");
		ot.setTrackId("trck-1542");
		ot.setStatus("Process: "+port);
		LocalDateTime dt=LocalDateTime.now();
		ot.setOrderUpdateDate(dt.toString());
		ResponseEntity<OrderTrack> rt=new ResponseEntity<OrderTrack>(ot,HttpStatus.OK);
		return rt;
		
	}
}
