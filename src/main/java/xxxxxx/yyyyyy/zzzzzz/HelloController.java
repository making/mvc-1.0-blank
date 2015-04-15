package xxxxxx.yyyyyy.zzzzzz;

import java.time.LocalDateTime;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
@RequestScoped
@Controller
public class HelloController {

    @Inject
    Models models;

    @GET
    public String hello() {
        models.put("message", "Today is " + LocalDateTime.now());
        return "hello.xhtml";
    }
}
