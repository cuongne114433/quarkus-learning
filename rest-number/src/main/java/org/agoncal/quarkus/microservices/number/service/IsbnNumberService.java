package org.agoncal.quarkus.microservices.number.service;

import java.time.Instant;

import org.agoncal.quarkus.microservices.number.IsbnNumbers;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class IsbnNumberService {
	public IsbnNumbers getIsbnNumbers() {
		IsbnNumbers isbnNumbers = new IsbnNumbers();
		isbnNumbers.isbn13 = "13-";
		isbnNumbers.isbn10 = "10-";
		isbnNumbers.generationDate = Instant.now();
		return isbnNumbers;
	}
}
