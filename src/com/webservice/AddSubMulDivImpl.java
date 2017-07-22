package com.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.webservice.IAddSubMulDiv")
public class AddSubMulDivImpl implements IAddSubMulDiv{

	@Override
	public int addition(int x, int y) {
		int z = x + y;
		return z;
	}

	@Override
	public int subtraction(int x, int y) {
		int z = x - y;
		return z;
	}
	
	@Override
	public int multiplication(int x, int y) {
		int z = x * y;
		return z;
	}
	
	@Override
	public int division(int x, int y) {
		int z = x / y;
		return z;
	}
}
