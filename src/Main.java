public class Main {
    public static void main(String[] args) {
        QuizResult quizResult = new QuizResult();
        quizResult.display();

        QuizPanel quizPanel = new QuizPanel();
        quizPanel.display();

        EditPanel editPanel = new EditPanel();
        editPanel.display();

        NewQuestionPanel newQuestionPanel = new NewQuestionPanel();
        newQuestionPanel.display();

        MainPanel mainPanel = new MainPanel();
        mainPanel.display();
    }
}
