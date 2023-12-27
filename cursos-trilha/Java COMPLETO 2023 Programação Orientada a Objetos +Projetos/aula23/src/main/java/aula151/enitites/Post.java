package aula151.enitites;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;

    private String title;

    private String content;

    private Integer likes;

    private List<Comment> commentList = new ArrayList<>();

    public Post(){

    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    private void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public void addComment(Comment novoComentario){
        this.commentList.add(novoComentario);
    }

    public void removeComment(Comment comentario){
        this.commentList.remove(comentario);
    }

    @Override
    public String toString() {
        String comentarios = "";

        for (Comment x: commentList) {
            comentarios += x.toString();
        }

        return  title + "\n" +
                likes + " Likes - " +  sdf.format(moment) + "\n" +
                content + "\n" +
                "Comments:  \n" + comentarios ;
    }
}
