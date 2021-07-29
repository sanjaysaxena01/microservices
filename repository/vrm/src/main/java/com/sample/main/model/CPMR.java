package com.sample.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VRM_CUST_CPMR_DETAILS")
public class CPMR {
	@Id
	private int UCIC;
	private String Mobile;
	private String Channel;

	public int getUCIC() {
		return UCIC;
	}

	public void setUCIC(int uCIC) {
		UCIC = uCIC;
	}

	public String getMOBILE() {
		return Mobile;
	}

	public void setMOBILE(String mOBILE) {
		Mobile = mOBILE;
	}

	public String getCHANNEL() {
		return Channel;
	}

	public void setCHANNEL(String cHANNEL) {
		Channel = cHANNEL;
	}

	public CPMR() {
		
	}
	public CPMR(int uCIC, String mobile, String channel) {
		super();
		UCIC = uCIC;
		Mobile = mobile;
		Channel = channel;
	}

	@Override
	public String toString() {
		return "CPMR [UCIC=" + UCIC + ", MOBILE=" + Mobile + ", CHANNEL=" + Channel + "]";
	}

}
