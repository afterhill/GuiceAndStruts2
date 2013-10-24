package foo.example;

import com.google.inject.servlet.SessionScoped;

@SessionScoped
public class Counter {
	int count = 0;
	
	public synchronized int increment() {
		return count++;
	}
}
