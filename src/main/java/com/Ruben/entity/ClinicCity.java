package com.Ruben.entity;

public class ClinicCity {

	// list Variables
	int id;
	String address1;
	String address2;
	String address3;
	String city;
	String county;
	String email;
	String latitude;
	String clinicName;
	String organisation_code;
	String organisation_id;
	String organisation_status;
	String organisation_type;
	String partial_postcode;
	String phone;
	String postcode;
	String subtype;
	String website;
	String partial_postcodes;
	boolean is_pims_managed;
	boolean isHealthy;

	// constructor
	public ClinicCity(int id, String address1, String address2, String address3, String city, String county,
			boolean isHealthy, String latitude, String name, String organisation_code, String organisation_id,
			String organisation_status, String email, String organisation_type, String partial_postcode, String phone,
			String postcode, String subtype,  String clnickName,String website, boolean is_pims_managed) {

		// Variables initialising
		this.id = id;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.county = county;
		this.email = email;
		this.latitude = latitude;
		this.clinicName = clinicName;
		this.organisation_code = organisation_code;
		this.organisation_id = organisation_id;
		this.organisation_status = organisation_status;
		this.phone = phone;
		this.postcode = postcode;
		this.subtype = subtype;
		this.website = website;
		this.is_pims_managed = is_pims_managed;
		this.isHealthy = isHealthy;

	}

	/*
	 * Method getId
	 * 
	 * @param
	 * 
	 * @return id
	 */
	public int getId() {

		return id;
	}// getId

	/*
	 * Method getIsManaged
	 * 
	 * @param
	 * 
	 * @return is_pims_managed
	 */
	public Boolean getIsManaged() {

		if (is_pims_managed = true) {
			return true;
		} else {

			return false;

		}

	}

	/*
	 * Method getAddress1
	 * 
	 * @param
	 * 
	 * @return address1
	 */
	public String getAddress1() {

		return address1;
	}

	/*
	 * Method getAddress2
	 * 
	 * @param
	 * 
	 * @return address2
	 */
	public String getAddress2() {

		return address2;
	}

	/*
	 * Method getAddress3
	 * 
	 * @param
	 * 
	 * @return address3
	 */
	public String getAddress3() {

		return address3;

	}

	/*
	 * Method getName
	 * 
	 * @param
	 * 
	 * @return name
	 */
	public String getClinicName() {

		return clinicName;

	}

	/*
	 * Method getEmail
	 * 
	 * @param
	 * 
	 * @return email
	 */
	public String getEmail() {

		return email;

	}

	/*
	 * Method getPostCode
	 * 
	 * @param
	 * 
	 * @return postcode
	 */
	public String getPostcode() {

		return postcode;

	}

	/*
	 * Method getCounty
	 * 
	 * @param
	 * 
	 * @return county
	 */
	public String getCounty() {

		return county;

	}

	/*
	 * Method getOrganisation_id
	 * 
	 * @param
	 * 
	 * @return organisation_id
	 */
	public String getOrganisationId() {

		return organisation_id;

	}

	/*
	 * Method getOrganisationType
	 * 
	 * @param
	 * 
	 * @return organisation_type
	 */
	public String getOrganisationType() {

		return organisation_type;

	}

	/*
	 * Method organisation_status
	 * 
	 * @param
	 * 
	 * @return organisation_status
	 */
	public String getOrganisationStatus() {

		return organisation_status;

	}

	/*
	 * Method getPartialPostcode
	 * 
	 * @param
	 * 
	 * @return partial_postcode
	 */
	public String getPartialPostcode() {

		return partial_postcode;

	}

	/*
	 * Method getLatitude
	 * 
	 * @param
	 * 
	 * @return latitude
	 */
	public String getLatitude() {

		return latitude;

	}

	/*
	 * Method getSubType
	 * 
	 * @param
	 * 
	 * @return subtype
	 */
	public String getSubType() {

		return subtype;

	}

	/*
	 * Method getWebsite
	 * 
	 * @param
	 * 
	 * @return website
	 */
	public String getWebsite() {

		return website;

	}

	/*
	 * Method getCity
	 * 
	 * @param
	 * 
	 * @return website
	 */
	public String getCity() {

		return city;

	}

}// end class PostCode
