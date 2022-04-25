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

        generatedQuizSet = new ArrayList<Question>();

        qSequence = getRandQuesSeq(questionSet.size());

        for(int i=0; i<questionSet.size(); i++) {
            generatedQuizSet.add(questionSet.get(qSequence.get(i)));
        }

        genQuizCurQuesNum = 0;
    }

    private ArrayList<Integer> getRandQuesSeq(int numOfQuestions) {
        ArrayList<Integer> qSequence = new ArrayList<Integer>();

        while(!(qSequence.size() >= numOfQuestions)){
            if(qSequence.size() >= numOfQuestions) {
                break;
            }else{
                int randNum = rand.nextInt((numOfQuestions));
                if(!(qSequence.contains(randNum))) {
                    qSequence.add(randNum);
                }
            }
        }
        return qSequence;
    }

    public float gradeQuiz(ArrayList<ArrayList<String>> allUserAnswersIn) {

        float userScore = 0;

        ArrayList<ArrayList<String>> allUserAnswers = allUserAnswersIn;

        incorrectQuestionSet = new ArrayList<Question>();
        incorrectUserAnswers = new ArrayList<ArrayList<String>>();

        for(int i=0; i<generatedQuizSet.size(); i++) {

            Question ques = generatedQuizSet.get(i);

            int questionType = ques.getQType();

            ArrayList<String> questionUserAnswer = allUserAnswers.get(i);

            ArrayList<String> questionActualAnswers = generatedQuizSet.get(i).getAnswers();

            ArrayList<String> incorrectAnswer = new ArrayList<String>();

            for(String userAnswer : questionUserAnswer) {

                userAnswer = userAnswer.replace("<html>", "");
                userAnswer = userAnswer.replace("</html>", "");

                if(questionActualAnswers.contains(userAnswer)) {
                    userScore += ((float) 1 / (float) questionActualAnswers.size());
                }else {
                    incorrectQuestionSet.add(ques);
                    incorrectAnswer.add(userAnswer);
                }
            }

            if(incorrectAnswer.size() > 0) {
                incorrectUserAnswers.add(incorrectAnswer);
            }

        }

        userScore = (userScore / generatedQuizSet.size()) * 100;

        return userScore;

    }
}
