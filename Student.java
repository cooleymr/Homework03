
public class Student {
	String name;
	int totalScore;
	int numTests;
	
	public Student(String name)
	{
		this.name = name;
	}
	
	public void addQuiz(int theScore)
	{
		totalScore += theScore;
		numTests++;
	}
	
	public int getTotalScore()
	{
		return totalScore;
	}
	
	public int getAverageScore() {
		return (totalScore / numTests);
	}
	
	public String getName()
	{
		return name;
	}
}
