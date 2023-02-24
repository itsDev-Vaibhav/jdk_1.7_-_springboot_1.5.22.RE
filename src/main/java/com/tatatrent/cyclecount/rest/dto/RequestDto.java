package com.tatatrent.cyclecount.rest.dto;

public class RequestDto {
	
	private String whseId;
	private String ccKey;
	private String ccDetailKey;
	private String storerKey;
	private String sku;
	private String altSku;
	private Integer qty;
	private String user;
	
	public RequestDto() {
		
	}

	public RequestDto(String whseId, String ccKey, String ccDetailKey, String storerKey, String sku, String altSku,
			Integer qty, String user) {
		this.whseId = whseId;
		this.ccKey = ccKey;
		this.ccDetailKey = ccDetailKey;
		this.storerKey = storerKey;
		this.sku = sku;
		this.altSku = altSku;
		this.qty = qty;
		this.user = user;
	}

	public String getWhseId() {
		return whseId;
	}

	public void setWhseId(String whseId) {
		this.whseId = whseId;
	}

	public String getCcKey() {
		return ccKey;
	}

	public void setCcKey(String ccKey) {
		this.ccKey = ccKey;
	}

	public String getCcDetailKey() {
		return ccDetailKey;
	}

	public void setCcDetailKey(String ccDetailKey) {
		this.ccDetailKey = ccDetailKey;
	}

	public String getStorerKey() {
		return storerKey;
	}

	public void setStorerKey(String storerKey) {
		this.storerKey = storerKey;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getAltSku() {
		return altSku;
	}

	public void setAltSku(String altSku) {
		this.altSku = altSku;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
}
