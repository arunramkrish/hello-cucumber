package com.abddhospital.bdd.hello_cucumber.day2;

import java.util.Map;

import com.abddhospital.bdd.hello_cucumber.day2.model.User;

import io.cucumber.java.DataTableType;

public class TypeDefinitions {
	@DataTableType
	public User userEntry(Map<String, String> entry) {
		return new User(entry.get("firstName"), entry.get("lastName"), entry.get("title"));
	}
}
