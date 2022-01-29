/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao13_Enum_Composicao_02.Application;

import java.util.Date;
import secao13_Enum_Composicao_02.entities.Comment;
import secao13_Enum_Composicao_02.entities.Post;

/**
 *
 * @author Jean
 */
public class Program {

    public static void main(String[] args) {
        String title01 = "Traveling to New Zealand";
        String content = "I'm goingo to visit this wonderfull country!";
        Integer likes = 12;
        Post post = new Post(new Date(), title01, content, likes);
        Comment comment01 = new Comment("Have a nice trip");
        Comment comment02 = new Comment("Wow that's awesome!");
        post.addComments(comment01);
        post.addComments(comment02);
        System.out.print(post);

    }
}
