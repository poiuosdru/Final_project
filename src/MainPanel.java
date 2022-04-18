import javax.swing.*;
import java.awt.*;


public class MainPanel extends JFrame {
    private JPanel containerPanel = new JPanel(); // used for the CardLayout
    // START MAI PANEL COMPONENTSN
    private JPanel mainPanel = new JPanel();
    private JPanel qSelectDetailPanel = new JPanel();
    private JPanel qSelectPanel = new JPanel();
    private JPanel qSelectSubPanelOne = new JPanel(); // contains q bank table
    private JScrollPane qBankTablePane = new JScrollPane();
    private JPanel qSelectSubPanelTwo = new JPanel(); // contains q bank start edit and delete
    private JButton qSelectStartButton = new JButton("Start");
    private JButton qSelectEditButton = new JButton("Edit");
    private JButton qSelectDeleteButton = new JButton("Delete");
    private JPanel qSelectSubPanelThree = new JPanel(); // contains q bank create new button
    private JButton qSelectCreateButton = new JButton("Create New");
    private JPanel qDetailPanel = new JPanel();
    private Font detailLabelFont = new Font("Serif", Font.PLAIN, 17);
    private JLabel qBankNameLabel = new JLabel("Name: ");
    private JLabel qBankQNumLabel = new JLabel("Number of Questions: ");
    private JLabel qBankLastGradeLabel = new JLabel("Last Grade: ");
    private JLabel qBankAveGradeLabel = new JLabel("Average Grade: ");
    private JPanel previewPanel = new JPanel();
    private JScrollPane previewScrollPane = new JScrollPane();
    // END MAIN PANEL COMPONENTS

    MainPanel() {
        setTitle("Quiz Maker");
        // settings for the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(60, 60);
        setLayout(new FlowLayout());

        containerPanel.setLayout(new CardLayout());

        // START MAIN PANEL CONFIGURATION
        // set layouts for panels
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        qSelectDetailPanel.setLayout(new BoxLayout(qSelectDetailPanel, BoxLayout.LINE_AXIS));
        qSelectPanel.setLayout(new BoxLayout(qSelectPanel, BoxLayout.PAGE_AXIS));
        qSelectSubPanelOne.setLayout(new BoxLayout(qSelectSubPanelOne, BoxLayout.PAGE_AXIS));
        qSelectSubPanelTwo.setLayout(new BoxLayout(qSelectSubPanelTwo, BoxLayout.LINE_AXIS));
        qSelectSubPanelThree.setLayout(new BoxLayout(qSelectSubPanelThree, BoxLayout.LINE_AXIS));
        qDetailPanel.setLayout(new BoxLayout(qDetailPanel, BoxLayout.PAGE_AXIS));
        previewPanel.setLayout(new BoxLayout(previewPanel, BoxLayout.PAGE_AXIS));

        // qSelectDetailPanel and subpanels
        // qSelectPanel
        qBankTablePane.setPreferredSize(new Dimension(300, 175));
        qBankTablePane.setMaximumSize(new Dimension(300, 175));
        qSelectSubPanelOne.add(qBankTablePane);
        qSelectPanel.add(qSelectSubPanelOne);


        qSelectSubPanelTwo.add(qSelectStartButton);
        qSelectSubPanelTwo.add(Box.createRigidArea(new Dimension(5, 0)));


        qSelectSubPanelTwo.add(qSelectEditButton);
        qSelectSubPanelTwo.add(Box.createRigidArea(new Dimension(5, 0)));


        qSelectSubPanelTwo.add(qSelectDeleteButton);

        qSelectPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        qSelectPanel.add(qSelectSubPanelTwo);


        qSelectSubPanelThree.add(qSelectCreateButton);
        qSelectPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        qSelectPanel.add(qSelectSubPanelThree);

        // qDetailPanel
        // add a little bit of spacing between each of the labels
        qBankNameLabel.setFont(detailLabelFont);
        qDetailPanel.add(qBankNameLabel);
        qDetailPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        qBankQNumLabel.setFont(detailLabelFont);
        qDetailPanel.add(qBankQNumLabel);
        qDetailPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        qBankLastGradeLabel.setFont(detailLabelFont);
        qDetailPanel.add(qBankLastGradeLabel);
        qDetailPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        qBankAveGradeLabel.setFont(detailLabelFont);
        qDetailPanel.add(qBankAveGradeLabel);
        qDetailPanel.add(Box.createVerticalGlue());
        qSelectDetailPanel.add(Box.createRigidArea(new Dimension(25, 0)));
        qSelectDetailPanel.add(qSelectPanel);


        qSelectDetailPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        qSelectDetailPanel.add(new JSeparator(SwingConstants.VERTICAL));
        qSelectDetailPanel.add(Box.createRigidArea(new Dimension(50, 0)));
        qSelectDetailPanel.add(qDetailPanel);
        qSelectDetailPanel.add(Box.createRigidArea(new Dimension(150, 0)));

        mainPanel.add(Box.createRigidArea(new Dimension(0, 15)));
        mainPanel.add(qSelectDetailPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        previewScrollPane.setPreferredSize(new Dimension(175, 150));
        previewPanel.add(previewScrollPane);
        mainPanel.add(new JSeparator(SwingConstants.HORIZONTAL));
        mainPanel.add(previewPanel);
        // END MAIN PANEL CONFIGURATION

        mainPanel.setPreferredSize(new Dimension(600, 500));
        mainPanel.setMaximumSize(new Dimension(600, 500));

        containerPanel.add(mainPanel, "main");

        add(containerPanel);

        setSize(650, 575);
    }

    public void display() {
        setVisible(true);
    }
}
