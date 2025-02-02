package com.springai.bot.service;

import reactor.core.publisher.Flux;

public interface AiService {

	String askAi(String query);

	Flux<String> askAiWithStream(String query);
}
