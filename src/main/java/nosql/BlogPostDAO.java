package nosql;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.WriteResult;

import java.util.List;

public class BlogPostDAO {
    //TBD - intialize in the constructor
    DBCollection postsCollection;

    public BlogPostDAO(final DB blogDatabase) {
        //intialize the postsCollection here
    }

    public DBObject findByPermalink(String permalink) {

        //TBD - return the required post
        return null;
    }

    public List<DBObject> findByDateDescending(int limit) {
        //TBD - return the list of posts sorted in descending order of date and limited to the count passed as argument
        return null;
    }

    public List<DBObject> findByTagDateDescending(final String tag) {
        //TBD - return list of posts for a specific tag sorted in the descending order of tag.
        //display the first ten posts
        return null;
    }

    public String addPost(String title, String body, List tags, String username) {

        System.out.println("inserting blog entry " + title + " " + body);

        String permalink = title.replaceAll("\\s", "_"); // whitespace becomes _
        permalink = permalink.replaceAll("\\W", ""); // get rid of non alphanumeric
        permalink = permalink.toLowerCase();

        //TBD - add a new  post.
        //fields required are 'title', 'author', 'body, , 'permalink', 'tags', 'comments' and 'date' in dd-mm-yyyy format

        return permalink;
    }

    public void addPostComment(final String name, final String email, final String body, final String permalink) {
        //TBD - add the new comment for the existing post.
        //comment is a document that has 'author', 'email' which is optional, and a 'body'
        //update the post based on the permalink to add the comment
    }

}
