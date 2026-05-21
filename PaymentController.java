package com.PaymentService.main.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PaymentService.main.DTO.netBanking;

@RestController
public class Controller {

	@GetMapping("/options")
	public List<String> getAllPaymentOptions() {
		return List.of("UPI", "Net banking", "Credit card", "Debit card");
	}

	@GetMapping("/netBanking")
	public String netBanking(@RequestBody netBanking net) {
		return "Payment success";
	}
}
