package com.megaretail.resource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.megaretail.entity.ImageEntity;
import com.megaretail.service.ImageService;

@Path("images") // resources/products/images
@Produces({MediaType.APPLICATION_OCTET_STREAM, "image/jpg", "image/png", "image/jpeg",
	MediaType.APPLICATION_JSON})
public class ImageResource
{
	@Context
	private UriInfo uriInfo;
	
	@Inject
	ImageService imageService;
	
	// get all product images

	// get a single product image
	@GET
	@Path("image/{id}")
	public Response getProductImage(@PathParam("id") @NotNull Long id) throws IOException 
	{
		ImageEntity image = imageService.getProductImage(id);
		
		if (image != null)
		{
			return Response.ok().entity(Files.write(Paths.get("pic.png"), image.getImage()).toFile()).build();
		}
		
		return Response.noContent().build();
	}
	
	
}
