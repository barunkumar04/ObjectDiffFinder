package com.apache.commonlang.demo;

import java.util.List;

import org.apache.commons.lang3.builder.DiffBuilder;
import org.apache.commons.lang3.builder.DiffResult;
import org.apache.commons.lang3.builder.Diffable;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BlogPost implements Diffable<BlogPost> {

	private String title;
	private String content;
	private String excerpt;
	private Author author;
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	private List<String> topics;

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
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

	public String getExcerpt() {
		return excerpt;
	}

	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}

	public DiffResult diff(BlogPost obj) {
		return new DiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE).append("title", this.title, obj.title)
				.append("content", this.content, obj.content).append("excerpt", this.excerpt, obj.excerpt)
				.append("topics", this.topics, obj.topics)
				.append("author", this.author, obj.author).build();
	}
}