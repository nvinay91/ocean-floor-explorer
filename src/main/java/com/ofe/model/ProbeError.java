package com.ofe.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ProbeError implements Serializable {

	private String errorId;
	private String errorDesc;
	private String severity;

	public String getErrorId() {
		return errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	/*
	 * public ProbeError(String message) { super(message); }
	 * 
	 * public ProbeError() { }
	 * 
	 * @JsonIgnore
	 * 
	 * @Override public StackTraceElement[] getStackTrace() { return
	 * super.getStackTrace(); }
	 * 
	 * @JsonIgnore
	 * 
	 * @Override public Throwable getCause() { return super.getCause(); }
	 */
}
