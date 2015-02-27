package com.example.heroku;


import com.example.MyJaxbBean;
import com.example.heroku.patel.anagramsolver.AnagramSolver;
import com.example.heroku.patel.com.dictionary.Dictionary;
import com.example.heroku.patel.com.dictionary.EnglishDictionary;


import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.Set;


/**
 * Created by callapatel on 2/26/15.
 */
@Path("anagram/{say}")
public class Anagram {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
//    public MyJaxbBean getMyBear(){
//            return new MyJaxbBean("Agamenon", 32);
//    }
    public Set<String> getAnagram(@PathParam("say") String say ) {


        Dictionary dictionary = new EnglishDictionary();
        AnagramSolver solver = new AnagramSolver(dictionary);
        Set<String> myAnagrams = solver.getAnagram(say);





        return new MyJaxbBean(say, myAnagrams.toString() );
    }
}
