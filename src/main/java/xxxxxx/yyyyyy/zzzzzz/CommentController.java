package xxxxxx.yyyyyy.zzzzzz;

import javax.inject.Inject;
import javax.mvc.Models;
import javax.mvc.annotation.Controller;
import javax.mvc.annotation.CsrfValid;
import javax.mvc.binding.BindingResult;
import javax.validation.Valid;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Controller
@Path("comments")
public class CommentController {
    @Inject
    Comments comments;
    @Inject
    BindingResult bindingResult;
    @Inject
    Models models;

    @GET
    public String show() {
        return "comments.jsp";
    }

    @POST
    @CsrfValid
    @ValidateOnExecution(type = ExecutableType.NONE)
    public String post(@Valid @BeanParam CommentForm commentForm) {
        if (bindingResult.isFailed()) {
            models.put("bindingResult", bindingResult);
            return "comments.jsp";
        }
        comments.addComment(commentForm.getComment());
        return "redirect:/comments";
    }
}
