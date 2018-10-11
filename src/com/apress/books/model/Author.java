/**
 * 
 */
package com.apress.books.model;

/**
 * @author diegomora
 *
 */
public class Author {

	/**
	 * @param args
	 */
	private Long id;
	private Long bookId;
	private String firstName;
	private String lastName;
	
	/**Get id**/
	
	public Long getId() {
		
		return id;
	}
	
	/**Set id**/
	
	public void setId(Long id) {
		
		this.id = id;
	}
	
	/**Get BookId**/
	
	public Long getBookId() {
		
		return bookId;
	}
	
	/**Set bookId**/
	
	public void setBookId(Long bookId) {
		
		this.bookId = bookId;
	}
	
	/**Get FirstName**/
	
	public String getFirstName() {
		
		return firstName;
	}
	
	/**Set FirstName**/
	
	public void setFirstName(String firstName) {
	
		this.firstName = firstName;
	}
	
	/**Get LastName**/
	
	public String getLastName() {
		
		return lastName;
	}
	
	/**Set LastName**/
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	/**Publish result**/
	
	public String toString() {
	
		return "Author - Id: " + id + ", Book id: " + bookId + ", First Name: "
				+ firstName + ", Last Name: " +lastName;
	}
	
}


