package test.mypac;

public class PostDto {
	public int id;	
	public String content;	
	public String author;
	public void printData() {
		String data = String.format("번호:%d 내용:%s 작성자:%s ", this.id, this.content, this.author);
		System.out.println(data);
	}
	
	public PostDto(int id, String content, String author) {
		this.id=id;
		this.content=content;
		this.author=author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
