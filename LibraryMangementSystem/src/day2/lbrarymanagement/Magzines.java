package day2.lbrarymanagement;

public class Magzines extends LibraryItem{
	private int issues;
	private boolean isAvailable;

	public Magzines(String author, String title, int issues,boolean isAvailable) {
		super(author, title);
		this.issues = issues;
		this.isAvailable=isAvailable;
	}

	@Override
	public String toString() {
		return "Magzines [booknumber=" + issues + "]";
	}
	public int getIssues() {
		return issues;
	}

	public void setIssues(int issues) {
		this.issues = issues;
	}

	@Override
	public void displayInfo() {
		   System.out.println("Magazine Title: " + getTitle());
	        System.out.println("Author: " + getAuthor());
	        System.out.println("Issue: " + getIssues());
	       System.out.println("Is Available"+ isAvailable());
	
}

@Override
public boolean isAvailable() {
	if(isAvailable) {
		return true;
	}
	return false;
}

@Override
public void checkOut() {
	if(isAvailable) {
		isAvailable=false;
	
	System.out.println("Magzine checked out");
	}
	else {
		System.out.println("Magzine is not available");
	}
	
	
}

@Override
public void returnItem() {
	isAvailable=true;
	System.out.println("Magzine is returned");
	
}

}
