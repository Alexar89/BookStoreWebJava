/**
 * 
 */
package com.apress.books.dao;

/**
 * @author diegomora
 *
 */

import java.util.List;
import com.apress.books.model.Book;
import com.apress.books.model.Category;

public interface BookDAO {

	/**
	 * @param args
	 */

		public List<Book>findAllBooks();
		
		public List<Book>searchBooksByKeyword(String keyWord);
		
		public List<Category>findAllCategories();
		
		public void insert(Book book);
		
		public void update(Book book);
		
		public void delete(Long bookId);
	

}
