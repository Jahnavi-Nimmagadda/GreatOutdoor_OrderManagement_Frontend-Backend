package com.greatoutdoor.vieworderstatus.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ControllerAdvice
public class Exception extends Throwable {
	public Exception(String message) {
	}

	public Exception() {
	}

	@ResponseBody
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value={Exception.class })
	protected ErrorInfo handleConflict(Exception ex, HttpServletRequest req)
	{
		String bodyOfResponse=ex.getMessage();//employee with this id is not present
		String url=req.getRequestURL().toString();
		return new ErrorInfo(url,bodyOfResponse);
	}

}