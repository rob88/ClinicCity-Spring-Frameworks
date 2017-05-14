package com.Ruben.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ruben.dao.ClinicCitesNames;
import com.Ruben.entity.ClinicCity;

@Service
public class ClinicService {

	@Autowired
	private ClinicCitesNames ClinicCitesNames;

	public Collection<ClinicCity> getClinicCity() {
		return this.ClinicCitesNames.getClinicCity();// Calling getClinicCity method  in ClinicCitesNames class
	}

	// get Clinic details by id
	public ClinicCity getClinicById(int id) {

		return this.ClinicCitesNames.getClinicById(id); // Calling getClinicById method in ClinicCitesNames class

	}

}
