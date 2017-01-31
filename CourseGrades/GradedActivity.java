package CourseGrades;


public class GradedActivity{

        public double score;

        public void setScore(double n)
        {
        score = n;
        }

        public double getScore()
        {
        return score;
        }

        public char getGrade()
        {
        char grade;

        if (score >= 90)
         grade = 'A';
        else if (score >= 80)
         grade = 'B';
        else if (score >= 80)
         grade = 'C';
        else if (score >= 70)
         grade = 'D';
        else grade = 'F';

        return grade;
        }
}
