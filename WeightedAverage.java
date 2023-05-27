import java.util.Scanner;
public class WeightedAverage{
	public static void main(String args[])
	{
		WeightedAverage obj = new WeightedAverage();
		obj.calculateWeightedAverage();
		
	}
	public int calculateWeightedAverage()
	{
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter assignmentWeight");
		 int assignmentWeight = sc.nextInt();
		 System.out.println("enter projectWeight");
		 int projectWeight = sc.nextInt();
		 System.out.println("enter quizWeight");
		 int quizWeight = sc.nextInt();
		 System.out.println("enter midTermWeight");
		 int midTermWeight = sc.nextInt();
		 System.out.println("enter finalExamWeight");
		 int finalExamWeight = sc.nextInt();
		 System.out.println("enter assignmentScore");
		 int assignmentScore = sc.nextInt();
		 System.out.println("enter projectScore");
		 int projectScore = sc.nextInt();
		 System.out.println("enter quizScore");
		 int quizScore = sc.nextInt();
		 System.out.println("enter midTermScore");
		 int midTermScore = sc.nextInt();
		 System.out.println("enter finalExamScore");
		 int finalExamScore = sc.nextInt();
		 float assignmentpercentageScore =(assignmentWeight/100.0f)*assignmentScore;
		 float projectpercentageScore =(projectWeight/100.0f)*projectScore;
		 float quizpercentageScore =(quizWeight/100.0f)*quizScore;
		 float midTermpercentageScore =(midTermWeight/100.0f)*midTermScore;
		 float finalExampercentageScore =(finalExamWeight/100.0f)*finalExamScore;
		 float overallpercentage = (assignmentpercentageScore+projectpercentageScore+quizpercentageScore+midTermpercentageScore+finalExampercentageScore);
		 System.out.println("Weights        % value of Score");
		 System.out.println("Assignments       "  +assignmentpercentageScore);
		 System.out.println("Projects          "  +projectpercentageScore);
		 System.out.println("Quizzers          "  +quizpercentageScore);
		 System.out.println("Mid Term          "  +midTermpercentageScore);
		 System.out.println("Final Exam         "  +finalExampercentageScore);
         System.out.println("The Wighted average score is "+overallpercentage);
		 return calculateWeightedAverage();
	    }
}