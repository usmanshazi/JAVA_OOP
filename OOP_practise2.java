package javaPractiseCodes;


class GradeCalculator {										/*  "MCQs Grade calculator"  */
	
	private final static String testAnswers = "D,C,A,D,A,B,C,D,B,C,A,B,D,C,A,A,"
			+ "A,C,A,B,B,D,B,D,A,B,B,A,C,B,C,A,C,B,B,C,C,C," + "A,B,A,B,B,C,A,B,A,A,D,C";
	
	private String studentName;
	private String studentId;
	private String studentAnswers;
	
	//Constructor...
	public GradeCalculator(String studentName, String studentID, String studentAnswers) {
		this.studentName = studentName;
		this.studentId = studentID;
		this.studentAnswers = studentAnswers;
		
	}
	
	public String getStudentName() {
		return studentName;
	}
	public String getStudnetId() {
		return studentId;
	}
	
	//method called calculate...
	public String calculate() {
		
		//convert student answers to UPPER case...
		String formattedStudentAnswers = studentAnswers.toUpperCase();
		
		int totalMarks = 0;
		for(int i=0; i<testAnswers.length();i+=2) {
			if(formattedStudentAnswers.charAt(i) == testAnswers.charAt(i)) {
				 totalMarks += 2;
			}
		}
		String answer = "Total marks of " + getStudentName() +" are, " + totalMarks;
		
		return answer;
	
	}
	
}

public class OOP_practise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GradeCalculator result = new GradeCalculator("Usman","219617026","D,C,A,B,A,B,c,D,d,c,A,b,d,C,A,A,A,C,A,B,b,D,B,D,A,B,B,A,C,B,C,A,C,B,B,C,C,C,A,B,A,B,B,C,A,B,A,A,D,C");
		System.out.print(result.calculate());

	}

}
