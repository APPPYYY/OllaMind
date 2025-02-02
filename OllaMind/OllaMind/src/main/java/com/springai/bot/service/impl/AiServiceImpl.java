package com.springai.bot.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

import com.springai.bot.service.AiService;

import reactor.core.publisher.Flux;

@Service
public class AiServiceImpl implements AiService {

	private static final Logger LOG = LoggerFactory.getLogger(AiServiceImpl.class);
	private final ChatClient chatClient;

	public AiServiceImpl(ChatClient.Builder builder) {
		this.chatClient = builder.build();
	}

	@Override
	public String askAi(String query) {
		try {
			LOG.info("Sending query to AI: {}", query);
			String response = chatClient.prompt(query).call().content();
			LOG.info("Received response from AI.");
			return response;
		} catch (Exception e) {
			LOG.error("Exception occurred while querying AI: ", e);
			throw new RuntimeException("Error occurred while calling AI service.");
		}
	}

	@Override
	public Flux<String> askAiWithStream(String query) {
		return this.chatClient.prompt().user(query).stream().content();
	}

}
