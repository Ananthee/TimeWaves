package com.times.model;

public class Product {
public String productId;
public String productName;
public String sellerId;
public int quantity;
public int price;
public String description;
public String category;

public Product(String productId, String productName, String sellerId, int quantity, int price, String description,
		String category) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.sellerId = sellerId;
	this.quantity = quantity;
	this.price = price;
	this.description = description;
	this.category = category;
}
public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getSellerId() {
	return sellerId;
}
public void setSellerId(String sellerId) {
	this.sellerId = sellerId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}

}
