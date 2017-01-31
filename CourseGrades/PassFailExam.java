package CourseGrades;
public class PassFailExam extends GradedActivity{


public PassFailExam(int q, int miss, int s){
       score = (q - miss) * 5;
}

public char getGrade(){

        char letterGrade;

        if(score >= 70){
        letterGrade = 'P';
        }
        else{
        letterGrade = 'F';
        }
        return letterGrade;
}

public double getScroe()
{
return score;
}
}

