package com.app.model;

public class OrderTrack {
	private String orderId;
	private String trackId;
	private String status;
	private String orderUpdateDate;
	public OrderTrack() {
		super();
	}
	public OrderTrack(String orderId, String trackId, String status, String orderUpdateDate) {
		super();
		this.orderId = orderId;
		this.trackId = trackId;
		this.status = status;
		this.orderUpdateDate = orderUpdateDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderUpdateDate() {
		return orderUpdateDate;
	}
	public void setOrderUpdateDate(String orderUpdateDate) {
		this.orderUpdateDate = orderUpdateDate;
	}
	@Override
	public String toString() {
		return "OrderTrack [orderId=" + orderId + ", trackId=" + trackId + ", status=" + status + ", orderUpdateDate="
				+ orderUpdateDate + "]";
	}
	
}
