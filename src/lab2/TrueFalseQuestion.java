package lab2;
import java.util.Date;
public class TrueFalseQuestion {
    private String question;
    private boolean tru;
    private Date whenLastUsed;

    ////////////////////////////////////////////////////////////////////////////
    /**
     * Creates a new TrueFalseQuestion and all instance variables initialized to
     * default values
     */
    public TrueFalseQuestion() {
    }

    ////////////////////////////////////////////////////////////////////////////
    /**
     * Creates a new TrueFalseQuestion and all instance-variables are
     * initialized to default values
     *
     * @param question question
     * @param tru the question is either true or false
     * @param whenLastUsed the time time question created or used
     */

    public TrueFalseQuestion(String question, boolean tru, Date whenLastUsed) {
        this.question = question;
        this.tru = tru;
        this.whenLastUsed = whenLastUsed;
    }

    ////////////////////////////////////////////////////////////////////////////
    /**
     * Getter of the question
     *
     * @return returns the question
     */
    public String getQuestion() {
        return question;
    }
    ////////////////////////////////////////////////////////////////////////////
    /**
     * Sets the question to a new question.
     *
     * @param question the new question
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    ////////////////////////////////////////////////////////////////////////////
    /** Sets the question to true or false
     * 
     * @return true false
     */
    public boolean isTru() {
        return tru;
    }
    ////////////////////////////////////////////////////////////////////////////
    /** Sets the question to true or false
     * 
     * @param tru can be true or false
     */
    public void setTru(boolean tru) {
        this.tru = tru;
    }
    ////////////////////////////////////////////////////////////////////////////
    /**
     * Description of method in Greek for illustration of writing comments in other languages
     * @return 
     */
    public Date getWhenLastUsed() {
        return whenLastUsed;
    }
    ////////////////////////////////////////////////////////////////////////////
    /**Sets the time new question
     * 
     * @param whenLastUsed the time the question was last used
     */
    public void setWhenLastUsed(Date whenLastUsed) {
        this.whenLastUsed = whenLastUsed;
    }

}
