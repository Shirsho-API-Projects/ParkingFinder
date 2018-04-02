package com.shirsho.parkingfinder.controllers;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shirsho.parkingfinder.model.ParkingFinderInputRequestLayout;

@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return("Hello World!!!");
	}
	
	@RequestMapping(value="/findaddress",method=RequestMethod.GET)
	public String returnHello() {
	//ResponseEntity<?> add(@PathVariable String userID, @RequestBody ParkingFinderInputRequestLayout input) {
		//URI location;
		/*Enter the logic here */
		return "Address Posted";
	}
	
	

}
