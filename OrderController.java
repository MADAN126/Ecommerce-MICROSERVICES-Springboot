package com.OrderService.main.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OrderService.main.OrderDTO.OrderInfo;
import com.OrderService.main.ProductDTO.ProductDetails;

@RestController
public class Controller {

	@PostMapping("/create")
	public String createOrder(@RequestBody OrderInfo order) {
		System.out.println("Order creation request for " + order.getEmailId());
		return "order created : " + UUID.randomUUID();
	}

	@GetMapping("/info/{orderId}")
	public OrderInfo createOrder(@PathVariable String orderId) {
		System.out.println("Order information for Order id : " + orderId);
		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setEmailId("madan@gmail.com");
		ProductDetails p1 = new ProductDetails();
		p1.setName("School Bag");
		p1.setPrice("1000");
		p1.setRating("10");
		List<ProductDetails> list = new ArrayList<ProductDetails>();
		list.add(p1);
		orderInfo.setProductInfo(list);
		orderInfo.setTotalAmount(10000);
		orderInfo.setProductInfo(List.of(p1));
		return orderInfo;

	}
}
