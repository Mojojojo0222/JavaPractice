package revature.Day3;
public class CheckExceptions {
	public static void validateChecked(int age) throws InvalidInput, InvalidAge  {
	
	if(age<=0 || age>=150) {
		 throw new InvalidInput();
	}
	if(age<18) {
			throw new InvalidAge();
		}
	}


}
