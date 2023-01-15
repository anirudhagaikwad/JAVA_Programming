package corejava;

public class HAS_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author author=new Author("Chetan Bhagat","22Apr1974","Mumbai");
		Book book=new Book(author,"Meluha","850","PUB001");
		System.out.println("Book Name : "+book.bookName);
		System.out.println("Book Price : "+book.bookPrice);
		System.out.println("Book ID : "+book.pubId);
		System.out.println("Author Name : "+book.auther.authorName);
		System.out.println("Author Birth Date : "+book.auther.birthDate);
		System.out.println("Author Location : "+book.auther.location);
	}

}//HAS_A

class Author{
	String authorName;
	String birthDate;
	String location;
	
	public Author(String authorName,String birthDate,String location) {
		this.authorName=authorName;
		this.birthDate=birthDate;
		this.location=location;
	}
}//Author

class Book{
	Author auther;
	String bookName;
	String bookPrice;
	String pubId;
	public Book(Author auther, String bookName, String bookPrice, String pubId) {
		this.auther = auther;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.pubId = pubId;
	}
	
}//Book








