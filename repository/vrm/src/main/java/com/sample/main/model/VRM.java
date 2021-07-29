package com.sample.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "VRM_JOBCARD_DATA")
public class VRM {
	@Id
	private String emp_ID;
	private String ucic;
	private String suggested_TIME;
	private String suggested_DATE;
	private String current_STATUS;
	private String remarks;
	private String channel;
	private String job_ID;
	private String products;
	private String job_card_type;
	private String taskid;
	private String status;
	private String message;

	public String getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(String emp_ID) {
		this.emp_ID = emp_ID;
	}

	public String getUcic() {
		return ucic;
	}

	public void setUcic(String ucic) {
		this.ucic = ucic;
	}

	public String getSuggested_TIME() {
		return suggested_TIME;
	}

	public void setSuggested_TIME(String suggested_TIME) {
		this.suggested_TIME = suggested_TIME;
	}

	public String getSuggested_DATE() {
		return suggested_DATE;
	}

	public void setSuggested_DATE(String suggested_DATE) {
		this.suggested_DATE = suggested_DATE;
	}

	public String getCurrent_STATUS() {
		return current_STATUS;
	}

	public void setCurrent_STATUS(String current_STATUS) {
		this.current_STATUS = current_STATUS;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getJob_ID() {
		return job_ID;
	}

	public void setJob_ID(String job_ID) {
		this.job_ID = job_ID;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public String getJob_card_type() {
		return job_card_type;
	}

	public void setJob_card_type(String job_card_type) {
		this.job_card_type = job_card_type;
	}

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
