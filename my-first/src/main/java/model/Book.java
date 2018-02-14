package model;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Table(name = "BOOK", catalog = "mkyongdb")
public class Book  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long Bookid;
	private String title;
	private String isbn;
	private String publisher;
	
	private Set<Author> stocks = new HashSet<Author>(0);
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "BOOK_ID", unique = true, nullable = false)
	public Long getBookid() {
		return Bookid;
	}
	public void setBookid(Long bookid) {
		Bookid = bookid;
	}
	@Column(name = "TiTLE", nullable = false, length = 20)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Column(name = "ISBN", nullable = false, length = 20)

	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Column(name = "PUBLISHER", nullable = false, length = 20)

	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")

	public Set<Author> getStocks() {
		return stocks;
	}
	public void setStocks(Set<Author> stocks) {
		this.stocks = stocks;
	}
	
	
	
	

}
