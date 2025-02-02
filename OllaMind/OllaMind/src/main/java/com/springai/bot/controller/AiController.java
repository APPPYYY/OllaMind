package com.springai.bot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springai.bot.service.AiService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/ai/")
public class AiController {

	@Autowired
	private AiService aiService;

	@GetMapping
	public String askAi(
			@RequestParam(value = "query", required = false, defaultValue = "Tell me a joke") String query) {
		return aiService.askAi(query);
	}

	@GetMapping("stream")
	public Flux<String> generateStream(@RequestParam(value = "query", defaultValue = "Tell me a joke") String query) {
		return this.aiService.askAiWithStream(query);
	}
}
