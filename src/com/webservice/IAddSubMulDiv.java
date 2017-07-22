package com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "IAddSubMulDiv", targetNamespace = "http://webservice.com/")
public interface IAddSubMulDiv {

	@WebMethod(operationName = "addition", action = "urn:Addition")
	public int addition(int x, int y);
	@WebMethod(operationName = "subtraction", action = "urn:Subtraction")
	public int subtraction(int x, int y);
	@WebMethod(operationName = "multiplication", action = "urn:Multiplication")
	public int multiplication(int x, int y);
	@WebMethod(operationName = "division", action = "urn:Division")
	public int division(int x, int y);
}
