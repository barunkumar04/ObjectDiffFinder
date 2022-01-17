package com.objectdiffer.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.danielbechler.diff.ObjectDifferBuilder;
import de.danielbechler.diff.node.DiffNode;
import de.danielbechler.diff.node.Visit;

public class ObjectCompare {

	public static void main(String[] args) {
		final Category category1 = new Category();
		  category1.setName("Cat1");
		  category1.setName("The first category");
		  
		  final Category category2 = new Category();
		  category2.setName("Cat2");
		  category2.setName("The second category");
		  
		  final Item item1 = new Item();
		  item1.setName("A");
		  item1.setQuantity(1);
		  item1.setUpdatedAt(new Date());
		  item1.setCategory(category1);
		  
		  List<String> item1AvaialbleAt = new ArrayList<String>();
		  item1AvaialbleAt.add("StoreA");
		  item1.setItemAvailableAt(item1AvaialbleAt);
		  
		  
		  
		  final Item item2 = new Item();
		  item2.setName("B");
		  item2.setQuantity(1);
		  item2.setUpdatedAt(new Date());
		  item2.setCategory(category2);
		  
		  List<String> item2AvaialbleAt = new ArrayList<String>();
		  item2AvaialbleAt.add("StoreB");
		  item2.setItemAvailableAt(item2AvaialbleAt);
		  
		  DiffNode diff = ObjectDifferBuilder.buildDefault().compare(item1, item2);
		  
		  if (diff.hasChanges()) {
		      diff.visit(new DiffNode.Visitor() {
		          public void node(DiffNode node, Visit visit)
		          {
		              if (!node.hasChildren()) { // Only print if the property has no child
		                  final Object oldValue = node.canonicalGet(item1);
		                  final Object newValue = node.canonicalGet(item2);
		 
		                  final String message = node.getPropertyName() + " changed from " +
		                          oldValue + " to " + newValue;
		                  System.out.println(message);
		              }
		          }

				
		      });
		  } else {
		      System.out.println("No differences");
		  }

	}

}
