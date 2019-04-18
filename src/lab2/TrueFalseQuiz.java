
package lab2;
import java.util.Date;
public class TrueFalseQuiz {
    int currentQuestion;
    TrueFalseQuestion[] trueFalseQuestions;
    
    public TrueFalseQuiz() 
    {
    trueFalseQuestions = new TrueFalseQuestion[10];
        trueFalseQuestions[0] = new TrueFalseQuestion("The Pacific Ocean is larger than the Atlantic Ocean", true, new Date());
        trueFalseQuestions[1] = new TrueFalseQuestion("The Suez canal connects the Red sea and the Indian Ocean", false, new Date());
        trueFalseQuestions[2] = new TrueFalseQuestion("The source of the Nile River is in Egypt", false, new Date());
        trueFalseQuestions[3] = new TrueFalseQuestion("Lake Baikal is the world's oldest and deepest freshwater lake", true, new Date());
        trueFalseQuestions[4] = new TrueFalseQuestion("The Amazon River is the largest river in the Americas", true, new Date());
        this.currentQuestion = 0;
    }
    
    public TrueFalseQuiz(String[] questions, boolean[] trueFalse)
    {
        //create an array of references of size questions.length
        //the references are initialazied to null
        trueFalseQuestions = new TrueFalseQuestion[questions.length];
        
        //assign to each reference of the array an object of type TrueFalseQuestion
        for (int i=0, j=0; i < questions.length; ++i, ++j)
        {
        trueFalseQuestions[i] = new TrueFalseQuestion( questions[i], trueFalse[j], new Date());
        }
       //set the index of the first question
       this.currentQuestion = 0;
    }
    
    public String nextQuestion(){
        if (this.currentQuestion == 5)
            this.currentQuestion = 0;
        this.trueFalseQuestions[this.currentQuestion].setWhenLastUsed(new Date());
        return this.trueFalseQuestions[this.currentQuestion++].getQuestion();
    }
    public boolean isTrue(){
        int index = this.currentQuestion - 1;
        if(this.currentQuestion == 0)
            index = 4;
        return this.trueFalseQuestions[index].isTru();
    }
    
    
}
