package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser,HIPAACompliantAdmin {

    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

	public AdminUser(Integer id,String role) {
		super(id);
		this.employeeID=id;
		this.role=role;
		securityIncidents=new ArrayList<String>();
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return securityIncidents;
	}

	@Override
	public boolean assignPin(int pin) {
		if(String.valueOf(pin).length()==6) {
			this.pin=pin;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
//		try {
			if(confirmedAuthID.toString().equals(this.id.toString())) {
				this.employeeID=confirmedAuthID;
				return true;
			}
			else {
				this.authIncident();
				return false;
			
			}
//		}
//		catch(NullPointerException e) {
//			this.authIncident();
//			return false;
//		}
//		
	}
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}


}
