package be.lmgao.bibliotheque;

import java.time.LocalDate;

public class Book {
	private String title;
	private String author;
	private int totalPages;
	Person person;
	private int loanPeriod;
	private int rentalPrice;
	LocalDate borrowingDate;
	private String language;
	
	
	

	public Book(String title, String author, int totalPages, Person person, int loanPeriod, int rentalPrice,
			LocalDate borrowingDate, String language) {
		super();
		this.title = title;
		this.author = author;
		this.totalPages = totalPages;
		this.person = person;
		this.loanPeriod = loanPeriod;
		this.rentalPrice = rentalPrice;
		this.borrowingDate = borrowingDate;
		this.language = language;
	}
	
	public Book() {
		
	}


	public void setTitle(String title) {
		this.title = title;
		
	}


	public void setAuthor(String author) {
		this.author = author;
		
	}


	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
		
	}


	public void setRentalPeriod(byte retalPrice) {
		this.rentalPrice = retalPrice;
		
	}


	public void setLanguage(String language) {
		this.language = language;
		
	}


	public void setLoanPeriod(int loanPeriod) {
		this.loanPeriod = loanPeriod;
		
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}


	public int getTotalPages() {
		return totalPages;
	}


	public Person getPerson() {
		return person;
	}


	public int getLoanPeriod() {
		return loanPeriod;
	}


	public int getRentalPrice() {
		return rentalPrice;
	}


	public LocalDate getBorrowingDate() {
		return borrowingDate;
	}


	public String getLanguage() {
		return language;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", totalPages=" + totalPages + ", person=" + person
				+ ", loanPeriod=" + loanPeriod + ", rentalPrice=" + rentalPrice + ", borrowingDate=" + borrowingDate
				+ ", language=" + language + "]";
	}

	public void setMaxPeople(int maxPeople) {
		OnlineBook.super.maxPeople = maxPeople;
		
	}


	
	
	
	

	
	
	
}
