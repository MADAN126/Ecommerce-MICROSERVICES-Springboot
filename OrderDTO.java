package com.OrderService.main.OrderDTO;

import java.util.List;

import com.OrderService.main.ProductDTO.ProductDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class OrderInfo {

	private String emailId;

	private List<ProductDetails> productInfo;

	private double totalAmount;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public List<ProductDetails> getProductInfo() {
		return productInfo;
	}

	public void setProductInfo(List<ProductDetails> productInfo) {
		this.productInfo = productInfo;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public OrderInfo(String emailId, List<ProductDetails> productInfo, double totalAmount) {
		super();
		this.emailId = emailId;
		this.productInfo = productInfo;
		this.totalAmount = totalAmount;
	}

	public OrderInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderInfo [emailId=" + emailId + ", productInfo=" + productInfo + ", totalAmount=" + totalAmount + "]";
	}

}
