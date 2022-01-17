	
  package com.objectdiffer.demo;
  
  import java.util.Date;
import java.util.List;
  
  
  public class Item {
  
      private String name;
  
      private int quantity;
  
      private Category category;
  
      private Date updatedAt;
      
      private List<String> itemAvailableAt;

	public List<String> getItemAvailableAt() {
		return itemAvailableAt;
	}

	public void setItemAvailableAt(List<String> itemAvailableAt) {
		this.itemAvailableAt = itemAvailableAt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
      
      
  }