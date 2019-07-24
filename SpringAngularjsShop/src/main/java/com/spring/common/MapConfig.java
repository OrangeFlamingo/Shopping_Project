package com.spring.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(locations = {"classpath:aplication.yml"}, prefix = "mapConfig")
public class MapConfig {
	Map<String, String> map1 = new HashMap<>();
	Map<String, String> map2 = new HashMap<>();
	
	public Map<String, String> getMap1() {
		return map1;
	}
	public Map<String, String> getMap2() {
		return map2;
	}
	
	
}
