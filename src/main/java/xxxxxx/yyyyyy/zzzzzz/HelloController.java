package xxxxxx.yyyyyy.zzzzzz;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;

@Path("hello")
@RequestScoped
@Controller
public class HelloController {

    @Inject
    Models models;
    @Inject
    Greeting greeting;

    @GET
    public String hello() {
        models.put("title", "Today is " + LocalDateTime.now());
        greeting.setMessage("Hello MVC 1.0!");
        return "hello.xhtml";
    }
}
