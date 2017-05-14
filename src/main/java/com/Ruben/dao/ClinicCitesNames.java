package com.Ruben.dao;

import org.springframework.*;
import org.springframework.stereotype.Repository;

import com.Ruben.entity.ClinicCity;

import java.util.*;
import java.util.HashMap;
import java.io.*;

@Repository 
public class ClinicCitesNames {

	private static Map<Integer, ClinicCity> clinicCity;// Creating a Hashmap

	static {

		clinicCity = new HashMap<Integer, ClinicCity>() {

			{
				// adding Fake records
				put(1, new ClinicCity(1, "address1", "address2", "address3", "city", "county", true, "latitude", "Ruben Clinic",
						"organisation_code", "organisation_id", "organisation_status", "email", "organisation_type",
						"partial_postcode", "phone", "subtype", "postcode","clinicName", "website", true));

			
			}

		};
		
	}
		public Collection<ClinicCity>getClinicCity(){
			return this.clinicCity.values();
		}
		
		
		//get Clinic details by id 
		public ClinicCity getClinicById(int id){
			
			return this.clinicCity.get(id);
			
		}

	
}// end class
