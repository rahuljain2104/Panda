package com.qc.panda.model;

public class Params {

	private String url ;
	private int size ;
	private String[][] ior = new String[4][size] ;
	private int timeLapse ;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	public int getTimeLapse() {
		return timeLapse;
	}
	
	public void setTimeLapse(int timeLapse) {
		this.timeLapse = timeLapse;
	}
	
	public String[][] getIor() {
		return ior;
	}
	
	public void setIor(String[][] ior) {
		this.ior = ior;
	} 
	
}
