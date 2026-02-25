package com.aot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mobj")
public class MyView {
	
	@Value("Nandan")
	private String prefix;
	
	@Value("Kumar")
	private String suffix;
	
	

	public MyView() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "MyView [prefix=" + prefix + ", suffix=" + suffix + "]";
	}
	
	

}
