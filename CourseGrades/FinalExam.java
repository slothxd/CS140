package CourseGrades;
public class FinalExam extends GradedActivity{

    public FinalExam(int question, int miss){
            score = (question - miss) * 2;
    }

    public double getScore(){

    return score;
    }
}
