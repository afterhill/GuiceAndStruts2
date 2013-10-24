package foo.example;

import com.google.inject.Inject;


public class Count {
	final Counter counter;
	
	@Inject
	public Count(Counter counter) {
		this.counter = counter;
	}
	
	public String execute() throws Exception {
		return "success";
	}
	
	public int getCount() {
		return counter.increment();
	}
}
