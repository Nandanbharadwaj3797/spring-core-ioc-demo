package com.aot.beans;

public class MyView {
	
	private String prefix;
	private String suffix;
	
	public MyView() {
		// TODO Auto-generated constructor stub
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public String toString() {
		return "MyView [prefix=" + prefix + ", suffix=" + suffix + "]";
	}
	
	

}
