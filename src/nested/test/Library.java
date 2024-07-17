package nested.test;

public class Library {

    private Book[] books;

    private int bookIndex;
    public Library(int size) {
        books = new Book[size];
        bookIndex = 0;
    }

    public void addBook(String name, String author) {
        if (bookIndex == books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        books[bookIndex++] = new Book(name, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + " 저자: " + book.author);
        }
    }

    /**
     * Book 이 Library 의 인스턴스를 사용한다면 static 을 떼야하지만,
     * 현재 Book 에서 Library 의 인스턴스를 사용할만한 요소가 없기 때문에 static 사용
     */
    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
