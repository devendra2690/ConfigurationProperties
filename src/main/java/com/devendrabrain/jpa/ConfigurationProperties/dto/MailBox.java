package com.devendrabrain.jpa.ConfigurationProperties.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "mail-box.properties")
@ConfigurationProperties(prefix = "mail")
public class MailBox {

	private String city;
	private String state;
	private String country;
	
	private List<Address> address;
	
	Map<String,String> fedx;
	
	private Crendential crendential;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Map<String, String> getFedx() {
		return fedx;
	}

	public void setFedx(Map<String, String> fedx) {
		this.fedx = fedx;
	}

	public Crendential getCrendential() {
		return crendential;
	}

	public void setCrendential(Crendential crendential) {
		this.crendential = crendential;
	}

	@Override
	public String toString() {
		return "MailBox [city=" + city + ", state=" + state + ", country=" + country + ", address=" + address
				+ ", fedx=" + fedx + ", crendential=" + crendential + "]";
	}
	
	
	
}
