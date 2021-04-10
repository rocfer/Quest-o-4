package com.acme.tarefaswebspringboot.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


public class Autor {

 String Id ;
 String Nome ;
 String Email ;
 String username ;   
 String phone ; 
 
 String name;
 
 
 public String getName() {
	 return name;
 }


    public String setId(String Id) {
    	return this.Id=Id;
    }
    
    public String setNome(String Nome) {
    	return this.Nome=Nome;
    }
    
    public String setEmail(String Email) {
    	return this.Email=Email;
    }
    
    
    public String setUsername(String Username) {
    	return this.username=Username;
    }
    
    public String setPhone(String phone) {
    	return this.phone=phone;
    }
    
    
    

	public String getId() {
		// TODO Auto-generated method stub
		return Id;
	}
	public String nome() {
		// TODO Auto-generated method stub
		return Nome;
	}
	
	public String Email() {
		// TODO Auto-generated method stub
		return Email;
	}
	public String UserName() {
		// TODO Auto-generated method stub
		return username;
	}
	public String Phone() {
		// TODO Auto-generated method stub
		return phone;
	}
	
}
