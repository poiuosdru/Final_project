import javax.swing.*;
import javax.swing.UIManager.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;

public class QuizResult extends JFrame {
    
    private JPanel containerPanel = new JPanel(); // used for the CardLayout



    private JPanel quizResultPanel = new JPanel();

    private JPanel quizResultQuizLabelPanel = new JPanel();
    private JLabel quizResultQuizLabel = new JLabel("Test Quiz");

    private JPanel quizResultLabelPanel = new JPanel();
    private JLabel quizResultLabel = new JLabel("Quiz Results");

    private JPanel quizResultScoreLabelPanel = new JPanel();
    private JLabel quizResultScoreLabel = new JLabel("Score: ");
    private JLabel quizResultAveScoreLabel = new JLabel("Average Score: ");

    private JPanel quizResultMissedQuestionLabelPanel = new JPanel();
    private JLabel quizResultMissedQuestionLabel = new JLabel("Missed Questions");
    private JPanel quizResultMissedQuestionPanel = new JPanel();
    private JScrollPane quizResultMissedQuestionScrollPane = new JScrollPane(quizResultMissedQuestionPanel);

    private JPanel quizResultButtonPanel = new JPanel();
    private JButton restartButton = new JButton("Restart");
    private JButton mainMenuButton = new JButton("Main Menu");

    // END QUIZ RESULT COMPONENTS

    QuizResult() {

        // settings for the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(60, 60);
        setLayout(new FlowLayout());
        setTitle("Quizresult");

        containerPanel.setLayout(new CardLayout());

        // set layouts
        quizResultPanel.setLayout(new BoxLayout(quizResultPanel,
                BoxLayout.PAGE_AXIS));
        quizResultQuizLabelPanel.setLayout(new BoxLayout(quizResultQuizLabelPanel,
                BoxLayout.LINE_AXIS));
        quizResultLabelPanel.setLayout(new BoxLayout(quizResultLabelPanel,
                BoxLayout.LINE_AXIS));
        quizResultScoreLabelPanel.setLayout(new BoxLayout(quizResultScoreLabelPanel,
                BoxLayout.LINE_AXIS));
        quizResultMissedQuestionLabelPanel
                .setLayout(new BoxLayout(quizResultMissedQuestionLabelPanel, BoxLayout.LINE_AXIS));
        quizResultMissedQuestionPanel.setLayout(new BoxLayout(quizResultMissedQuestionPanel, BoxLayout.PAGE_AXIS));
        quizResultButtonPanel.setLayout(new BoxLayout(quizResultButtonPanel,
                BoxLayout.LINE_AXIS));

        quizResultQuizLabel.setFont(new Font("Serif", Font.BOLD, 21));
        quizResultQuizLabelPanel.add(quizResultQuizLabel);

        quizResultLabel.setFont(new Font("Serif", Font.BOLD, 18));
        quizResultLabelPanel.add(quizResultLabel);
        quizResultLabelPanel.add(Box.createRigidArea(new Dimension(400, 0)));
        quizResultScoreLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        quizResultScoreLabelPanel.add(quizResultScoreLabel);
        quizResultScoreLabelPanel.add(Box.createRigidArea(new Dimension(40, 0)));
        quizResultAveScoreLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        quizResultScoreLabelPanel.add(quizResultAveScoreLabel);

        quizResultMissedQuestionLabel.setFont(new Font("Serif", Font.BOLD, 18));
        quizResultMissedQuestionLabelPanel.add(quizResultMissedQuestionLabel);
        quizResultMissedQuestionLabelPanel.add(Box.createRigidArea(new Dimension(400,
                0)));

//        restartButton.addActionListener(this);
        quizResultButtonPanel.add(restartButton);
        quizResultButtonPanel.add(Box.createRigidArea(new Dimension(50, 0)));
//        mainMenuButton.addActionListener(this);
        quizResultButtonPanel.add(mainMenuButton);

        quizResultPanel.add(quizResultQuizLabelPanel);
        quizResultPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        quizResultPanel.add(quizResultLabelPanel);
        quizResultPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        quizResultPanel.add(quizResultScoreLabelPanel);
        quizResultPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        quizResultPanel.add(quizResultMissedQuestionLabelPanel);

        quizResultPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        quizResultPanel.add(quizResultMissedQuestionScrollPane);
        quizResultPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        quizResultPanel.add(quizResultButtonPanel);

        // END QUIZ RESULT PANEL CONFIGURATION

        quizResultPanel.setPreferredSize(new Dimension(600, 500));
        quizResultPanel.setMaximumSize(new Dimension(600, 500));
        containerPanel.add(quizResultPanel, "results");

        add(containerPanel);

        setSize(650, 575);
    }

    public void display() {
        setVisible(true);
    }
}
