package testing;

public class gradebook {

	public String grade(int score ){
		if(score < 0)
			throw new IllegalArgumentException("Not Good");
		else if(score <= 60)
			return "F";
		else if(score <= 70)
			return "D";
		else if(score <= 80)
			return "C";
		else if(score <= 90)
			return "B";
		else
			return "A";
	}
}
