package springcore7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class book {
	
	@Component
	public class Book {
	@Value("SpringMasterclass")
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	}

}
