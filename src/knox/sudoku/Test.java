package knox.sudoku;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sudoku sudoku = new Sudoku();
		sudoku.load("easy1.txt");
		System.out.println(sudoku);
		
		// check a couple of examples
		// probably someday maybe use JUnit
		// just not when 40 people are watching you
		System.out.println(sudoku.getLegalValues(0, 8));
		System.out.println(sudoku.getLegalValues(6, 8));

	}

}
