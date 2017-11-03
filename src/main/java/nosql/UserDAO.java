package nosql;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoException;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Random;

public class UserDAO {
    //TBD - to be initialized in the constructor
    private final DBCollection usersCollection;

    public UserDAO(final DB blogDatabase) {
        //TBD - intialize usersCollection
        usersCollection = null;

    }

    public static boolean validateSignup(String userName, String password, String verify, String email, HashMap<String, String> root){

        //TBD - verify if the username, password and email are valid formats
        //You can assume any format you want

        return true;
    }

    // validates that username is unique and insert into db
    public boolean addUser(String username, String password, String email) {

        //TBD - add the user document to the collection
        // encrypt the password before adding the document
        //email is optional
        return true;
    }

    public DBObject validateLogin(String username, String password) {

        //TBD - validate username and password
        //if valid login return the user object
        return null;
    }


    private String cryptWithMD5(String pass){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] passBytes = pass.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<digested.length;i++){
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return null;


    }
}
