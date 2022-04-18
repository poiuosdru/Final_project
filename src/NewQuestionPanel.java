import javax.swing.*;
import java.awt.*;

public class NewQuestionPanel extends JFrame{
    private JPanel containerPanel = new JPanel(); // used for the CardLayout

    // START NEW QUESTION PANEL COMPONENTS
    private JPanel newQuestionPaneView = new JPanel();
    private JScrollPane newQuestionPane = new JScrollPane(newQuestionPaneView);

    // Question type panel
    private JPanel newQuestionQTypeLabelPanel = new JPanel();
    private JLabel newQuestionQTypeLabel = new JLabel("Question Type");
    private JPanel newQuestionQTypeSelPanel = new JPanel();
    private JRadioButton multiChoiceOneAns = new JRadioButton();
    private JLabel multiChoiceOneAnsLabel = new JLabel("Multiple Choice");
    private JRadioButton multiChoiceMultiAns = new JRadioButton();
    private JLabel multiChoiceMultiAnsLabel = new JLabel("Many Answers");
    private JRadioButton fillInBlank = new JRadioButton();
    private JLabel fillInBlankLabel = new JLabel("Fill in the Blank");
    private ButtonGroup qTypeButtonGroup = new ButtonGroup();

    // Question text panel
    private JPanel newQuestionQTextLabelPanel = new JPanel();
    private JLabel newQuestionQTextLabel = new JLabel("Question Text");
    private JTextArea newQuestionQText = new JTextArea(10, 10);
    private JScrollPane newQuestionQTextPane = new JScrollPane(newQuestionQText);

    // Question choice panel
    private JPanel newQuestionQChoiceLabelPanel = new JPanel();
    private JLabel newQuestionQChoiceLabel = new JLabel("Question Choices");
    private JPanel newQuestionQChoicePanel = new JPanel();
    private JTextField newQuestionQChoice = new JTextField(20);
    private JPanel newQuestionQChoiceButtonPanel = new JPanel();
    private JButton newQuestionQChoiceAddButton = new JButton("Add");
    private JButton newQuestionQChoiceRemButton = new JButton("Remove");

    // Question answer panel
    private JPanel newQuestionQAnsLabelPanel = new JPanel();
    private JLabel newQuestionQAnsLabel = new JLabel("Question Answers");
    private JPanel newQuestionQAnsPanel = new JPanel();
    private JTextField newQuestionQAns = new JTextField(20);
    private JPanel newQuestionQAnsButtonPanel = new JPanel();
    private JButton newQuestionQAnsAddButton = new JButton("Add");
    private JButton newQuestionQAnsRemButton = new JButton("Remove");

    // Question Save button panel
    private JPanel newQuestionQSavePanel = new JPanel();
    private JButton newQuestionQSaveButton = new JButton("Save");
    private JButton newQuestionQExitButton = new JButton("Exit");
    // END NEW QUESTION PANEL COMPONENTS

    // END QUIZ RESULT COMPONENTS

    NewQuestionPanel() {
        setTitle("Quiz Maker");
        // settings for the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(60, 60);
        setLayout(new FlowLayout());

        containerPanel.setLayout(new CardLayout());

        // START NEW QUESTION PANEL CONFIGURATION
        // set layouts
        newQuestionQTypeLabelPanel.setLayout(new BoxLayout(newQuestionQTypeLabelPanel, BoxLayout.LINE_AXIS));
        newQuestionQTypeSelPanel.setLayout(new BoxLayout(newQuestionQTypeSelPanel, BoxLayout.LINE_AXIS));
        newQuestionQTextLabelPanel.setLayout(new BoxLayout(newQuestionQTextLabelPanel, BoxLayout.LINE_AXIS));
        newQuestionQChoiceLabelPanel.setLayout(new BoxLayout(newQuestionQChoiceLabelPanel, BoxLayout.LINE_AXIS));
        newQuestionQChoicePanel.setLayout(new BoxLayout(newQuestionQChoicePanel, BoxLayout.PAGE_AXIS));
        newQuestionQChoiceButtonPanel.setLayout(new BoxLayout(newQuestionQChoiceButtonPanel, BoxLayout.LINE_AXIS));
        newQuestionQAnsLabelPanel.setLayout(new BoxLayout(newQuestionQAnsLabelPanel, BoxLayout.LINE_AXIS));
        newQuestionQAnsPanel.setLayout(new BoxLayout(newQuestionQAnsPanel, BoxLayout.PAGE_AXIS));
        newQuestionQAnsButtonPanel.setLayout(new BoxLayout(newQuestionQAnsButtonPanel, BoxLayout.LINE_AXIS));
        newQuestionQSavePanel.setLayout(new BoxLayout(newQuestionQSavePanel, BoxLayout.LINE_AXIS));
        newQuestionPaneView.setLayout(new BoxLayout(newQuestionPaneView, BoxLayout.PAGE_AXIS));

        // add components
        newQuestionQTypeLabelPanel.add(newQuestionQTypeLabel);
        multiChoiceOneAns.setName("Multiple Choice");
        qTypeButtonGroup.add(multiChoiceOneAns);
        multiChoiceMultiAns.setName("Many Answers");
        qTypeButtonGroup.add(multiChoiceMultiAns);
        fillInBlank.setName("Fill in the blank");
        qTypeButtonGroup.add(fillInBlank);
        multiChoiceOneAns.setSelected(true);
        newQuestionQTypeSelPanel.add(multiChoiceOneAns);
        newQuestionQTypeSelPanel.add(multiChoiceOneAnsLabel);
        newQuestionQTypeSelPanel.add(Box.createRigidArea(new Dimension(20, 0)));
        newQuestionQTypeSelPanel.add(multiChoiceMultiAns);
        newQuestionQTypeSelPanel.add(multiChoiceMultiAnsLabel);
        newQuestionQTypeSelPanel.add(Box.createRigidArea(new Dimension(20, 0)));
        newQuestionQTypeSelPanel.add(fillInBlank);
        newQuestionQTypeSelPanel.add(fillInBlankLabel);
        newQuestionQTextLabelPanel.add(newQuestionQTextLabel);
        newQuestionQText.setLineWrap(true);
        newQuestionQText.setWrapStyleWord(true);
        newQuestionQChoiceLabelPanel.add(newQuestionQChoiceLabel);
        newQuestionQChoicePanel.add(newQuestionQChoice);
        newQuestionQChoiceButtonPanel.add(Box.createRigidArea(new Dimension(300, 0)));

        // we're setting the name on these so that we can target the right one in the action listener when they are clicked
        newQuestionQChoiceAddButton.setName("Choice Add");
        newQuestionQChoiceButtonPanel.add(newQuestionQChoiceAddButton);
        newQuestionQChoiceButtonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        newQuestionQChoiceRemButton.setName("Choice Remove");
        newQuestionQChoiceRemButton.setEnabled(false);
        newQuestionQChoiceButtonPanel.add(newQuestionQChoiceRemButton);
        newQuestionQAnsLabelPanel.add(newQuestionQAnsLabel);
        newQuestionQAnsPanel.add(newQuestionQAns);
        newQuestionQAnsButtonPanel.add(Box.createRigidArea(new Dimension(300, 0)));
        newQuestionQAnsAddButton.setName("Answer Add");
        newQuestionQAnsAddButton.setEnabled(false);
        newQuestionQAnsButtonPanel.add(newQuestionQAnsAddButton);
        newQuestionQAnsButtonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        newQuestionQAnsRemButton.setName("Answer Remove");
        newQuestionQAnsRemButton.setEnabled(false);
        newQuestionQAnsButtonPanel.add(newQuestionQAnsRemButton);
        newQuestionQSavePanel.add(newQuestionQSaveButton);
        newQuestionQSavePanel.add(Box.createRigidArea(new Dimension(10, 0)));
        newQuestionQSavePanel.add(newQuestionQExitButton);
        newQuestionQSavePanel.add(Box.createRigidArea(new Dimension(300, 0)));
        newQuestionPaneView.add(Box.createRigidArea(new Dimension(0, 10)));
        newQuestionPaneView.add(newQuestionQTypeLabelPanel);
        newQuestionPaneView.add(Box.createRigidArea(new Dimension(0, 10)));
        newQuestionPaneView.add(newQuestionQTypeSelPanel);
        newQuestionPaneView.add(Box.createRigidArea(new Dimension(0, 20)));
        newQuestionPaneView.add(newQuestionQTextLabelPanel);
        newQuestionPaneView.add(newQuestionQTextPane);
        newQuestionPaneView.add(Box.createRigidArea(new Dimension(0, 20)));
        newQuestionPaneView.add(newQuestionQChoiceLabelPanel);
        newQuestionPaneView.add(newQuestionQChoicePanel);
        newQuestionPaneView.add(Box.createRigidArea(new Dimension(0, 10)));
        newQuestionPaneView.add(newQuestionQChoiceButtonPanel);
        newQuestionPaneView.add(Box.createRigidArea(new Dimension(0, 20)));
        newQuestionPaneView.add(newQuestionQAnsLabelPanel);
        newQuestionPaneView.add(newQuestionQAnsPanel);
        newQuestionPaneView.add(Box.createRigidArea(new Dimension(0, 10)));
        newQuestionPaneView.add(newQuestionQAnsButtonPanel);
        newQuestionPaneView.add(Box.createRigidArea(new Dimension(0, 20)));
        newQuestionPaneView.add(newQuestionQSavePanel);
        newQuestionPaneView.add(Box.createRigidArea(new Dimension(0, 20)));
        // END NEW QUESTION PANEL CONFIGURATION

        newQuestionPane.setPreferredSize(new Dimension(600, 500));
        newQuestionPane.setMaximumSize(new Dimension(600, 500));
        containerPanel.add(newQuestionPane, "newQuestion");

        add(containerPanel);

        setSize(650, 575);
    }

    public void display() {
        setVisible(true);
    }
}


