/**
 * 
 */
package com.apress.books.model;

/**
 * @author diegomora
 *
 */
public class Category {

	/**
	 * @param args
	 */
	private Long id;
	private String categoryDescription;
	
	/**Get Id**/
	public Long getId() {
		
		return id;
	}
	/**Set Id
	 * @param id **/
	public void setId(Long id) {
		
		this.id = id;
		
	}
	/**Get Category**/
	public String getCategoryDescription() {
		
		return categoryDescription;
		
		}
	/**Set Category**/
	public void setCategoryDescription(String categoryDescription) {
		
		this.categoryDescription = categoryDescription;
		
		}
	/**Publish Result**/
	public String toString() {
		return "Category - Id: " + id + ", Category Description: "
		+ categoryDescription;
		}
	
}
