package com.example.parseLogs;

import com.example.parseLogs.gateway.Logs;
import com.example.parseLogs.models.LogsEntity;
import com.example.parseLogs.repo.LogsRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import feign.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

@SpringBootTest
class ParseLogsApplicationTests {

	@Autowired
	public Logs logs;

	@Autowired
	private LogsRepository logsRepository;

	@Test
	void contextLoads() {
	}

	@Test
    void getLogs() throws IOException {
        System.out.println(logs.getLogs("20210123").body());
    }

	@Test
	void addToDataBase(){
		Response response = logs.getLogs("20210123");
		String result = response.toString();
		String i = response.body().toString();
		LogsEntity logsEntity = new LogsEntity();
		logsEntity.setLog(i);
		logsEntity.setDate("20.23.2009");
		logsRepository.save(logsEntity);
	}

}
