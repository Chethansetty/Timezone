package com.example.helloworld.resources;

import com.example.helloworld.core.Saying;
import com.google.common.base.Optional;
import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;
//timezone

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;



@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;
   
    public HelloWorldResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
       
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
      
    	DateTime now = new DateTime(System.currentTimeMillis(), DateTimeZone.forID(name.or("UTC")));
         String content=now.toString();
         
    	
    	return new Saying(counter.incrementAndGet(),
                          String.format(template, content));
    }
}