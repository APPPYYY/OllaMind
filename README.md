# SpringBoot DeepSeek Ollama Spring AI Project

This project is a Spring Boot application that integrates DeepSeek, Ollama, and Spring AI to create two APIs—one for data streaming and one without data streaming. The project showcases how to use these technologies together for AI-powered solutions in Spring-based environments.

## Project Overview

This project contains two main APIs:

1. **Non-Streaming API**: A standard API that processes data and returns a response without streaming. // http://127.0.0.1:1773/api/v1/ai/?query=What is spring
2. **Streaming API**: An API that processes and streams data in real-time to the client. // http://127.0.0.1:1773/api/v1/ai/stream?query=what is springboot

The project utilizes Spring Boot as the backend framework, DeepSeek for advanced AI functionalities, Ollama for language models, and Spring AI to facilitate integration with machine learning models.

## Features

- **Spring Boot Integration**: Built with Spring Boot for creating RESTful APIs.
- **DeepSeek AI**: Leveraging DeepSeek for intelligent data processing.
- **Ollama AI**: Using Ollama's language models for text generation and understanding.
- **Streaming Support**: Provides a real-time streaming API for continuous data flow.
- **Non-Streaming Support**: Offers a simple API for standard request-response processing.

## Technologies Used

- **Spring Boot**: Backend framework to build REST APIs.
- **DeepSeek**: AI-powered data analysis and search.
- **Ollama**: Natural language processing using Ollama's models.
- **Spring AI**: Integration layer for machine learning models with Spring Boot.
- **Java**: The primary programming language.

## Setup and Installation

### Prerequisites

Before running the project, make sure you have the following installed:

- [Java 17+] (or higher)
- [Maven]
- [Git]
- [Ollama](https://ollama.com/download) (Install ollama and download deepseek model by running cmd: ollama run deepseek-r1)

### Steps to Run the Project Locally

1. **Clone the repository:**
   git clone https://github.com/APPPYYY/OllaMind.git

2.Build the project

3.Run the Spring Boot application

