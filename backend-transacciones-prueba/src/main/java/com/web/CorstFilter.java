
package com.web;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

@Provider
public class CorstFilter implements ContainerResponseFilter{

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
      MultivaluedMap<String,Object> headers = responseContext.getHeaders();
      headers.add("Acces-Control-Allow-Origin", "*");
      headers.add("Acces-Control-Allow-Credentials", "true");
      headers.add("Acces-Control-Allow-Headers", "Origin, X-Requested-With,Content-Type,Accept,Authorization");
      headers.add("Acces-Control-Methods", "GET,POST,PUT,DELETE,OPTIONS,HEAD");
    }
    
}
