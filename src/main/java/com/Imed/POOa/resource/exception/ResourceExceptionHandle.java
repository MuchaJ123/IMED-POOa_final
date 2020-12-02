package com.Imed.POOa.resource.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Imed.POOa.services.exceptio.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandle {

	HttpStatus  status = HttpStatus.NOT_FOUND;
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardErro> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		StandardErro err =  new StandardErro(System.currentTimeMillis(), status.value(), "Nao encontrado", e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);    	
	}
	
}
