import java.util.ArrayList;
import java.util.Random;

public class QuizEngine {

    private ArrayList<Question> questionSet;

    private ArrayList<Question> generatedQuizSet;

    private ArrayList<Question> incorrectQuestionSet;

    private ArrayList<ArrayList<String>> incorrectUserAnswers;

    private Random rand = new Random();

    private int genQuizCurQuesNum = 0;

    private ArrayList<Integer> qSequence;

    QuizEngine() {
        generatedQuizSet = new ArrayList<Question>();
        incorrectQuestionSet = new ArrayList<Question>();
        incorrectUserAnswers = new ArrayList<ArrayList<String>>();
        qSequence = new ArrayList<Integer>();
    }

    public void setQuestionSet(ArrayList<Question> qSetIn) {
        this.questionSet = qSetIn;
    }

    public ArrayList<Question> getIncorrectQuestionSet() {
        return this.incorrectQuestionSet;
    }

    public ArrayList<ArrayList<String>> getIncorrectUserAnswers() {
        return this.incorrectUserAnswers;
    }

    public ArrayList<Question> getQuestionSet() {
        return this.questionSet;
    }

    public ArrayList<Question> getQuizSet() {
        return this.generatedQuizSet;
    }

    public ArrayList<Integer> getQuestionSequence() {
        return this.qSequence;
    }

    // prints all of the questions, mostly for testing purposes
    public void displayQuiz() {
        for(int i=0; i<generatedQuizSet.size(); i++) {
            System.out.println(generatedQuizSet.get(i).getQuesText());
        }
    }
    public Question getQuestion(int qIndex) {
        return generatedQuizSet.get(qIndex);
    }

    public void incrementCurQuesNum() {
        genQuizCurQuesNum++;
    }

    public void decrementCurQuesNum() {
        genQuizCurQuesNum--;
    }

    public int getCurQuesNum() {
        return genQuizCurQuesNum;
    }

    public void generateQuiz() {
    }

    private ArrayList<Integer> getRandQuesSeq(int numOfQuestions) {
    }

    public float gradeQuiz(ArrayList<ArrayList<String>> allUserAnswersIn) {
    }
}
