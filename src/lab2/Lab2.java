package lab2;
import java.util.Scanner;
public class Lab2 {
    public static void takeQuiz(TrueFalseQuiz quiz )
    {
        Scanner scan = new Scanner(System.in);
        String s = "";
        do
        {
            System.out.println("q\\Q to quit");
            System.out.println("n\\N next question");
            s = scan.next();
            if (s.compareToIgnoreCase("q") == 0)
                break;
            else if ("n".compareToIgnoreCase(s) == 0)
            {
                System.out.println("++++++++++++++++++" + quiz.nextQuestion() + "++++++++++++++++++" );
                String answer = "";
                do
                {
                    System.out.println("\tt\\T for true");
                    System.out.println("\tf\\F for false");
                    answer = scan.next();
                    if ("t".compareToIgnoreCase(answer) != 0 && "f".compareToIgnoreCase(answer) != 0)
                        System.out.println("\t\tInvalid choice");
                }
                while ("t".compareToIgnoreCase(answer) != 0 && "f".compareToIgnoreCase(answer) != 0);
                boolean convertAnswerToBoolean = ("t".compareToIgnoreCase(answer) == 0);
                System.out.println(quiz.isTrue() == convertAnswerToBoolean ? "\t\t--------correct-------":"\t\t--------incorrect----------");
            }
            else 
                System.out.println("Invalid choice, try again");
        }
        while (true);
    }
    public static void main(String[] args) {
        TrueFalseQuiz quiz = new TrueFalseQuiz();
        takeQuiz(quiz);
        for (int i = 0; i < 5; ++i)
            System.out.println(quiz.trueFalseQuestions[i].getWhenLastUsed());
    }
}