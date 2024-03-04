package org.agoncal.quarkus.microservices.number;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbTransient;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.time.Instant;

@Schema(description = "")
public class IsbnNumbers {

	@Schema(required = true)
	@JsonbProperty("number13")
	public String isbn13;

	@Schema(required = true)
	@JsonbProperty("number10")
	public String isbn10;
	@JsonbTransient
	public Instant generationDate;

	@Override
	public String toString() {
		return "IsbnNumbers [isbn13=" + isbn13 + ", isbn10=" + isbn10 + ", generationDate=" + generationDate + "]";
	}

}
