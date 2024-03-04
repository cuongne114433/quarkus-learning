package org.agoncal.quarkus.microservices.number;

import org.agoncal.quarkus.microservices.number.service.IsbnNumberService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.jboss.logging.Logger;


@Path("api/numbers")
@Tag(name = "Number get endpoint")
public class NumberResource {

    @Inject
    Logger logger;
	@Inject
	IsbnNumberService isbnNumberService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "",
            description = ""
    )
    public Response generateIsbnNumber() {
    	logger.info("generate info number: " + isbnNumberService);
        return Response.ok(isbnNumberService.getIsbnNumbers()).build();
    }
}
