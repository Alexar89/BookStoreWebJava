/**
 * 
 */
package com.apress.books.dao;

/**
 * @author diegomora
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.apress.books.model.Author;
import com.apress.books.model.Book;
import com.apress.books.model.Category;

public class BookDAOImpl implements BookDAO{


	/**
	 * @param args
	 */
	/**Driver For MySql**/
	static {
		
		try {
			/**Call to .JAR driver in the project**/
			Class.forName("com.mysql.jdbc.Driver");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
		
		}catch (ClassNotFoundException ex) {
		
			
		}
	}

	/**Connection Settings**/
	private Connection getConnection() throws SQLException {
		/** Details of Data Base AWS **/
		System.out.println("Connecting to Data Base");
		return DriverManager.getConnection("jdbc:mysql://bookstore.cemhe8g33h5g.us-east-2.rds.amazonaws.com:3306/books?autoReconnect=true&useSSL=false","admin","1T4LC0Ladmin$$$$");
		
	}
	
	/** Close Connection**/
	private void closeConnection(Connection connection) {
	
		if (connection == null) {
			
			System.out.println("NO connected");
			return;
		}
		
		try {
			System.out.println("Close connection");
			connection.close();	
		
		}catch(SQLException ex){
			
			
		}
	}
	
	/*** Search Books***/
	public List<Book> findAllBooks() {
		
		List<Book> result = new ArrayList<>();
		List<Author> authorList = new ArrayList<>();
		
		String sql = "select * from BOOK inner join AUTHOR on BOOK.ID = AUTHOR.BOOK_ID";
		
		
		Connection connection = null;
		try {
			
			connection = getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			System.out.println("Executing Query to Data Base Find All Books");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				
				Book book = new Book();
				Author author = new Author();
				book.setId(resultSet.getLong("ID"));
				book.setBookTitle(resultSet.getString("BOOK_TITLE"));
				book.setCategoryId(resultSet.getLong("CATEGORY_ID"));
				author.setBookId(resultSet.getLong("BOOK_ID"));
				author.setFirstName(resultSet.getString("FIRTS_NAME"));
				author.setLastName(resultSet.getString("LAST_NAME"));
				authorList.add(author);
				book.setAuthors(authorList);
				book.setPublisherName(resultSet.getString("PUBLISHER"));
				result.add(book);
			}
			
		}catch(SQLException ex) {
			
			ex.printStackTrace();
		}finally {
			closeConnection(connection);
		}
		System.out.println(result);
		return result;
	}
	
	public List<Book> searchBooksByKeyword(String keyWord) {
		List<Book> result = new ArrayList<>();
		List<Author> authorList = new ArrayList<>();
		
		String sql = "select * from BOOK inner join AUTHOR on BOOK.ID = AUTHOR.BOOK_ID"
		+ " where BOOK_TITLE like '%"
		+ keyWord.trim()
		+ "%'"
		+ " or FIRST_NAME like '%"
		+ keyWord.trim()
		+ "%'"
		+ " or LAST_NAME like '%" + keyWord.trim() + "%'";
	
		Connection connection = null;
		try {
		
		connection = getConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		System.out.println("Executing Query to Data Base Find All Books");
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			Book book = new Book();
			Author author = new Author();
			book.setId(resultSet.getLong("ID"));
			book.setBookTitle(resultSet.getString("BOOK_TITLE"));
			book.setPublisherName(resultSet.getString("PUBLISHER"));
			author.setFirstName(resultSet.getString("FIRTS_NAME"));
			author.setLastName(resultSet.getString("LASTA_NAME"));
			author.setBookId(resultSet.getLong("BOOK_ID"));
			authorList.add(author);
			book.setAuthors(authorList);
			result.add(book);
		}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			closeConnection(connection);
		}
		System.out.println(result);
		return result;
		}
		
		public List<Category> findAllCategories() {
			
			List<Category> result = new ArrayList<>();
			String sql = "SELECT * FROM category";
			
			Connection connection = null;
			
			try {
			
				connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(sql);
				System.out.println("Executing Query to Data Base Table Category");
				ResultSet resultSet = statement.executeQuery();
			
			
			while (resultSet.next()) {
				
				Category Category = new Category();
				Category.setId(resultSet.getLong("ID"));
				Category.setCategoryDescription(resultSet.getString("CATEGORY_DESCRIPTION"));
				result.add(Category);
			}
			
			} catch (SQLException ex) {
			
				ex.printStackTrace();
			
			} finally {
			
				closeConnection(connection);
			}
			System.out.println(result);
			return result;
			
			}
			
			public void insert(Book book) {
			
			}
			
			public void update(Book book) {
			
			}
			
			public void delete(Long bookId) {
			
				
			}
			
			
		}
			
	

