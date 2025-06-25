package test.main;

public class MainClass10a_for {
	public static void main(String[] args) {
		// for문 예시
		
		String[] names = { "Alice", "Bob", "Charlie" };

		// 전통적인 for문
		for (int i = 0; i < names.length; i++) {
		    String tmp = names[i];
		    System.out.println(tmp);
		}

		// 향상된 for문
		for (String tmp : names) {
		    System.out.println(tmp);
		}

		int[] scores = { 90, 85, 100 };

		// 전통적인 for문
		for (int i = 0; i < scores.length; i++) {
		    int tmp = scores[i];
		    System.out.println(tmp);
		}

		// 향상된 for문
		for (int tmp : scores) {
		    System.out.println(tmp);
		}

		Book[] books = {
		    new Book("자바 입문"),
		    new Book("JPA 완전정복"),
		    new Book("스프링 마스터")
		};

		// 전통적인 for문
		for (int i = 0; i < books.length; i++) {
		    Book tmp = books[i];
		    tmp.printInfo();
		}

		// 향상된 for문
		for (Book tmp : books) {
		    tmp.printInfo();
		}

	}
}
