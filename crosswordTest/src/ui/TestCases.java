package ui;

public class TestCases {
	String [][] small;
	String [][] medium;
	String [][] big;
	
	public TestCases() {
		createSmall();
		createMedium();
		createBig();
	}
	private void createBig() {
		//15 letters
		String[][] big = 
			{
					{"S", "O", "T", "A", "N", "0", " ", 
						"O", "R", "C", "A", " ",
						"A", "S", "A"
					},
					{"I", " ", 
					 "U", "S", "A", "R", "A", "N", " ",
					 "A", "M", "A","N","A","L"
					 },
					{"L", "T", " ", " ", " ",
				     "O", "R", "D", "E", "N", "A", "R", " ", " ", "A"}
		};
		this.big = big;
		
	}
	private void createMedium() {

		//10 letters

		String [][] medium = {

			{"B", "R", "I", "A", "N", "D", "A", "G", "U", "A"},
			{"A", "C", "C", "I", "O","N", "I", "S", "T", "A"},
			{"A", "F", "I", "R", "M", "A", "T", "I", "V","O"},
			{"D", "E", "P", "O", "R", " ", "C", "A", "S", "I"}

		};

		this.medium = medium;
		
	}
	private void createSmall() {
		
		//4 letters

		String[][] small = 
			{
					{"a", "n", "a", " "},
					{" ", "o", "l", "a"},
					{"a", "t", "a", "r"},
					{" ", "a", " ", "o"}
		};
		this.small = small;
		
	}
	public String[][] getSmall() {
		return small;
	}
	public void setSmall(String[][] small) {
		this.small = small;
	}
	public String[][] getMedium() {
		return medium;
	}
	public void setMedium(String[][] medium) {
		this.medium = medium;
	}
	public String[][] getBig() {
		return big;
	}
	public void setBig(String[][] big) {
		this.big = big;
	}
	
	

}
