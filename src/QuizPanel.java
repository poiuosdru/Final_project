
import javax.swing.*;
import java.awt.*;


public class QuizPanel extends JFrame {

	private JPanel containerPanel = new JPanel();

	// START QUIZ PANEL COMPONENTS

		private JPanel quizPanel = new JPanel();

		private JPanel quizLabelPanel = new JPanel();
		private JLabel quizLabel = new JLabel("Test Quiz");

		private JPanel quizQuestionLabelPanel = new JPanel();

		private JPanel quizQuestionPanel = new JPanel();
		private JLabel quizQuestionLabel = new JLabel("Question 1");
		private JScrollPane quizQuestionScrollPane = new JScrollPane(quizQuestionPanel);
		private JLabel quizQuestionText = new JLabel();

		private JPanel quizChoicePanel = new JPanel();
		private JScrollPane quizChoiceScrollPane = new JScrollPane(quizChoicePanel);

		private JPanel quizPrevNextButtonPanel = new JPanel();
		private JButton quizExitButton = new JButton("Exit");
		private JButton quizPrevButton = new JButton("Previous");
		private JButton quizNextButton = new JButton("Next");

		// END QUIZ PANEL COMPONENTS
		QuizPanel() {

			// settings for the JFrame
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			setLocation(60, 60);
			setLayout(new FlowLayout());
			setTitle("QuizPanel");

			containerPanel.setLayout(new CardLayout());

		// START QUIZ PANEL CONFIGURATION 
		
				// set layouts
				quizPanel.setLayout(new BoxLayout(quizPanel, BoxLayout.PAGE_AXIS));
				quizLabelPanel.setLayout(new BoxLayout(quizLabelPanel, BoxLayout.LINE_AXIS));
				quizQuestionLabelPanel.setLayout(new BoxLayout(quizQuestionLabelPanel, BoxLayout.LINE_AXIS));
				quizQuestionPanel.setLayout(new BoxLayout(quizQuestionPanel, BoxLayout.LINE_AXIS));
				quizChoicePanel.setLayout(new GridLayout(6, 2));
				((GridLayout) quizChoicePanel.getLayout()).setVgap(10);
				quizPrevNextButtonPanel.setLayout(new BoxLayout(quizPrevNextButtonPanel, BoxLayout.LINE_AXIS));

				// adding components
				quizLabel.setFont(new Font("Serif", Font.BOLD, 21));
				quizLabelPanel.add(quizLabel);

				quizQuestionLabel.setFont(new Font("Serif", Font.BOLD, 17));
				quizQuestionLabelPanel.add(quizQuestionLabel);
				quizQuestionLabelPanel.add(Box.createRigidArea(new Dimension(400, 0)));
				quizQuestionText.setFont(new Font("Serif", Font.BOLD, 15));
				quizPrevNextButtonPanel.add(quizExitButton);
				quizPrevNextButtonPanel.add(Box.createRigidArea(new Dimension(200, 0)));
				quizPrevNextButtonPanel.add(quizPrevButton);
				quizPrevNextButtonPanel.add(Box.createRigidArea(new Dimension(20, 0)));
				quizPrevNextButtonPanel.add(quizNextButton);

				quizPanel.add(quizLabelPanel);
				quizPanel.add(Box.createRigidArea(new Dimension(0, 20)));
				quizPanel.add(quizQuestionLabelPanel);
				quizQuestionPanel.setPreferredSize(new Dimension(450, 100));
				quizQuestionPanel.setMaximumSize(new Dimension(450, 30));
				quizQuestionScrollPane.setPreferredSize(new Dimension(500, 500));
				quizQuestionScrollPane.setMaximumSize(new Dimension(500, 500));
				quizQuestionScrollPane.setBorder(BorderFactory.createEmptyBorder());
				quizPanel.add(quizQuestionScrollPane);
				quizPanel.add(Box.createRigidArea(new Dimension(0, 30)));
				quizChoicePanel.setPreferredSize(new Dimension(450, 100));
				quizChoicePanel.setMaximumSize(new Dimension(450, 100));
				quizChoiceScrollPane.setPreferredSize(new Dimension(500, 500));
				quizChoiceScrollPane.setMaximumSize(new Dimension(500, 500));
				quizChoiceScrollPane.setBorder(BorderFactory.createEmptyBorder());
				quizPanel.add(quizChoiceScrollPane);
				quizPanel.add(Box.createRigidArea(new Dimension(0, 30)));
				quizPanel.add(quizPrevNextButtonPanel);
				
// END QUIZ PANEL CONFIGURATION
				
				quizPanel.setPreferredSize(new Dimension(600, 500));
				quizPanel.setMaximumSize(new Dimension(600, 500));
				containerPanel.add(quizPanel, "quiz");

				add(containerPanel);
				setSize(650, 575);
			}

		public void display() {
				setVisible(true);
			}
}


