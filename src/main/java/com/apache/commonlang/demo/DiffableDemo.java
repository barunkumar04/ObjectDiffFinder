package com.apache.commonlang.demo;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.Diff;
import org.apache.commons.lang3.builder.DiffResult;
 
public class DiffableDemo {
 
	public static void main(String[] args) {
		BlogPost postOne = new BlogPost();
		postOne.setTitle("First Post");
		postOne.setContent("This is my first post");
		postOne.setExcerpt("My Blog Post");
		
		Author postOneAuthor = new Author();
		postOneAuthor.setName("PersonA");
		postOneAuthor.setAddress("Bengaluru");
		postOne.setAuthor(postOneAuthor);
		
		List<String> postOneTopics = new ArrayList<String>();
		postOneTopics.add("Java");
		postOne.setTopics(postOneTopics);
		
		BlogPost postTwo = new BlogPost();
		postTwo.setTitle("Second Post");
		postTwo.setContent("This is my second post");
		postTwo.setExcerpt("My Blog Post");
		
		Author postTwoAuthor = new Author();
		postTwoAuthor.setName("PersonA");
		postTwoAuthor.setAddress("Mumbai");
		postTwo.setAuthor(postTwoAuthor);
		
		List<String> postTwoTopics = new ArrayList<String>();
		postTwoTopics.add("C");
		postTwo.setTopics(postTwoTopics);
		
		
		DiffResult diff = postOne.diff(postTwo);
		List<Diff<?>> diffs = diff.getDiffs();
		for(Diff d: diffs) {
			System.out.println(d.getFieldName() 
                            + "= FROM[" + d.getLeft() + "] TO [" + d.getRight() + "]");
		}
		
		System.out.println();
	}
}