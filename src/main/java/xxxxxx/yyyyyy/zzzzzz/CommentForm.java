package xxxxxx.yyyyyy.zzzzzz;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.FormParam;
import java.io.Serializable;

public class CommentForm implements Serializable {
    @NotNull
    @Size(min = 1, max = 10)
    @Pattern(regexp = "[a-zA-Z0-9]+")
    @FormParam("comment")
    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
