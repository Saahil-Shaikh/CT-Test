package com.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	
	@RequestMapping("/notificationFallback")
	public Mono<String> notificationFallback() {
		
		return Mono.just("Payment service is taking too much time to respond please wait");
	}

}
