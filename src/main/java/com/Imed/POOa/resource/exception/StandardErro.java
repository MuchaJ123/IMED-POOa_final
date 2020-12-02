package com.Imed.POOa.resource.exception;

import java.io.Serializable;

public class StandardErro  implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long timestamp;
	private Integer  status;
	private String  erro ;
	private String message;
	private String path; 
	
	
	public StandardErro(){
		}


	public Long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getErro() {
		return erro;
	}


	public void setErro(String erro) {
		this.erro = erro;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}


	public StandardErro(Long timestamp, Integer status, String erro, String message, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.erro = erro;
		this.message = message;
		this.path = path;
	}
}
