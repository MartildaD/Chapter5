public class Combination{

	public int NumberOfFactorialsOf(int number){
		int factorial = 1;

	for(int index = 1; index <= number; index++){
    factorial = factorial * index;
		}
		return factorial;			
	}
}
