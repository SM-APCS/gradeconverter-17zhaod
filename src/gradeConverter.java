import java.util.Scanner;
public class gradeConverter {
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your numerical grade:");
		int numGrade = keyboard.nextInt();
		String letterGrade;
		if(numGrade>=90)
		{
			letterGrade = "A";
		}
		else if(numGrade>=80)
		{
			letterGrade="B";
		}
		else if(numGrade>=70)
		{
			letterGrade="C";
		}
		else if(numGrade>=60)
		{
			letterGrade="D";
		}
		else
		{
			letterGrade="Try Harder!";
		}
		System.out.println(letterGrade);
		keyboard.close();
	}
	
}