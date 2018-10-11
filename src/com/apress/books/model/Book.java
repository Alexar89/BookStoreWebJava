/**
 * 
 */
package com.apress.books.model;

/**
 * @author diegomora
 *
 */
import java.util.List;
import com.apress.books.model.Author;

public class Book {

	/**
	 * @param args
	 */
	private Long id;
	private Long categoryId;
	private String bookTitle;
	private List<Author> authors;
	private String publisherName;
	
	/**Get id**/
	
	public Long getId() {
		
		return id;
		
		}
	
	/**Set id**/
	
	public void setId(Long id) {
			
		this.id = id;
		
	}
	
	/**Get Category**/
	
	public Long getCategoryId() {
			
		return categoryId;
		
	}
	
	/**Set Category**/
	
	public void setCategoryId(Long categoryId) {
			
		this.categoryId = categoryId;
		
	}
	
	/**Get BookTitle**/
	
	public String getBookTitle() {
			
		return bookTitle;
	
	}
	
	/**Set BookTitle**/
	
	public void setBookTitle(String bookTitle) {
			
		this.bookTitle = bookTitle;
		
	}
	
	/**Get Author**/
	
	public List<Author> getAuthors() {
			
		return authors;
		
	}
	
	/**Set Author**/
	
	public void setAuthors(List<Author> authors) {
			
		this.authors = authors;
		
	}
	
	/**Get PublisherName**/
	
	public String getPublisherName() {
			
		return publisherName;
		
	}
	
	/**Set PublisherName**/	
	
	public void setPublisherName(String publisherName) {
			
			this.publisherName = publisherName;
			
	}
	
	/**Publish result**/
		
	public String toString() {
				
			return "Book - Id: " + id + ", Book Title: " + bookTitle;
	}
	
}
