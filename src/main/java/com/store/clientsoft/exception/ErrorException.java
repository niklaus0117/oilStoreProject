package com.store.clientsoft.exception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.store.clientsoft.common.Response;
import com.store.clientsoft.exception.constants.ResConstants;

@ControllerAdvice
public class ErrorException {
	
	private Logger logger = LoggerFactory.getLogger(ErrorException.class);
	
	@ExceptionHandler(value = CustomerException.class)
	@ResponseStatus()
	@ResponseBody
	public Response<String> customerHandler(HttpServletRequest res, Exception e){
		return new Response<String>(ResConstants.RESPONSE_CODE_ERROR, ResConstants.RESPONSE_CODE_ERROR_STATE,
				ResConstants.RESPONSE_CODE_ERROR_MESSAGE, ((CustomerException)e).getMessage());
	}
}
