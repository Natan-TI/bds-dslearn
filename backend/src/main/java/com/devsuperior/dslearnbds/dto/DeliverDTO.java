package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;

import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;

public class DeliverDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private DeliverStatus status;
	private String feedback;
	private Integer correctCount;
	
	public DeliverDTO () {}

	public DeliverDTO(DeliverStatus status, String feedback, Integer correctCount) {
		super();
		this.status = status;
		this.feedback = feedback;
		this.correctCount = correctCount;
	}
	
	public DeliverDTO(Deliver entity) {
		status = entity.getStatus();
		feedback = entity.getFeedback();
		correctCount = entity.getCorrectCount();
	}

	public DeliverStatus getStatus() {
		return status;
	}

	public void setStatus(DeliverStatus status) {
		this.status = status;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getCorrectCount() {
		return correctCount;
	}

	public void setCorrectCount(Integer correctCount) {
		this.correctCount = correctCount;
	}
}
