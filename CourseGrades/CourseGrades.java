package CourseGrades;

public class CourseGrades implements Analyzable{

	private GradedActivity grades[];
	private static final int NUM_GRADES = 4;


	public CourseGrades(){

	grades = new GradedActivity[NUM_GRADES];
	}

	public void setLab(GradedActivity aLab){
	grades[0] = aLab;
	}

	public void setPassFailExam(PassFailExam aPassFailExam){
	grades[1] = aPassFailExam;
	}

	
	public void setEssay(Essay anEssay){
	grades[2] = anEssay;
	}

	public void setFinalExam(FinalExam aFinalExam){
	grades[3] = aFinalExam;
	}

	public String toString(){
	String str = "Lab Score: " + grades[0].getScore() + " Grades: " + grades[0].getGrade()+
		     "\nPass/Fail Exam Score: " + grades[1].getScore() + " Grade: " + grades[1].getGrade()+
		     "\nEssay Score: " + grades[2].getScore() + " Grade: " + grades[2].getGrade()+
		     "\nFinal Exam Score: " + grades[3].getScore() + " Grade: " + grades[3].getGrade();
	return str;
	}

	public double getAverage(){

		double sum = 0.0;
	
		for (GradedActivity g : grades){
		sum += g.getScore();
		}
		return sum/grades.length;
	}

	public GradedActivity getHighest(){
	
		double max = Double.MAX_VALUE;
		GradedActivity output = null;

		for (GradedActivity g : grades){
			if (g.getScore() > max)
			{ output = g;
			  max = g.getScore();		
			}
		}		
		return output;
	}

	public GradedActivity getLowest(){          	
	        double min = Double.MIN_VALUE;
                GradedActivity output2 = null;

                for (GradedActivity g : grades){
                        if (g.getScore() < min)
                        { output2 = g;
                          min = g.getScore();
                        }
                }
                return output2;
                
	}

}

