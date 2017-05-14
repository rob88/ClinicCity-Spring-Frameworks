package com.Ruben.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.Ruben.entity.ClinicCity;
import com.Ruben.service.ClinicService;

import java.util.Collection;

/* 
 *Class  ClinicCityController
 *This is the Controller Class , Implement the ClinicService Class
 *@author Ruben Faraj
 *@verson 0.1 
 *@Date 19-04-2017 
 */
@RestController 
@RequestMapping("/clinicCity") // first endpoint to display all data
public class ClinicCityController {
	
	@Autowired
	private ClinicService clinicService;
	
	
	/* 
	 * @getClinicCity 
	 * this method will display all the record in the database
	 * 
	 */
	@RequestMapping(method = RequestMethod.GET)
	public Collection<ClinicCity>getClinicCity(){
		return clinicService.getClinicCity();// Calling getClinicCity method in ClinicCitesNames class
	}
	
	/* 
	 * @methhod getClinicById
	 * @ param id
	 * @return id
	 */ 
	@RequestMapping(value ="{/id}", method = RequestMethod.GET) // second endpoint to display clinic by id
	public ClinicCity getClinicById(@PathVariable("id") int id){   // @pathvariable is gathering id from the url
		
		return this.clinicService.getClinicById(id);
	}

}
