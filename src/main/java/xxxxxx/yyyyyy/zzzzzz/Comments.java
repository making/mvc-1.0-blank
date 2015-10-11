package xxxxxx.yyyyyy.zzzzzz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@ApplicationScoped
@Named
public class Comments implements Serializable {
    private final List<String> comments = new CopyOnWriteArrayList<>();

    public void addComment(String comment) {
        this.comments.add(comment);
    }

    public List<String> getComments() {
        return comments;
    }
}
