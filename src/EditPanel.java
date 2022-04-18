import javax.swing.*;
import java.awt.*;

public class EditPanel extends JFrame{
    private JPanel containerPanel = new JPanel(); // used for the CardLayout

    // START EDIT PANEL COMPONENTS
    private JPanel editPanel = new JPanel();
    private JScrollPane editPanelTablePane = new JScrollPane();
    private JPanel editPanelButtonPanel = new JPanel();
    private JButton editPanelAddButton = new JButton("Add");
    private JButton editPanelEditButton = new JButton("Edit");
    private JButton editPanelDeleteButton = new JButton("Delete");
    private JButton editPanelSaveButton = new JButton("Save");
    // END EDIT PANEL COMPONENTS

    // END QUIZ RESULT COMPONENTS
    EditPanel() {
        setTitle("Quiz Maker");
        // settings for the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocation(60, 60);
        setLayout(new FlowLayout());
        containerPanel.setLayout(new CardLayout());

        // START EDIT PANEL CONFIGURATION
        editPanel.setLayout(new BoxLayout(editPanel, BoxLayout.PAGE_AXIS));
        editPanelButtonPanel.setLayout(new BoxLayout(editPanelButtonPanel, BoxLayout.LINE_AXIS));
        editPanel.add(editPanelTablePane);

        // adding the buttons to the edit panel
        editPanelButtonPanel.add(editPanelAddButton);
        editPanelButtonPanel.add(Box.createRigidArea(new Dimension(10, 0)));


        editPanelButtonPanel.add(editPanelEditButton);
        editPanelButtonPanel.add(Box.createRigidArea(new Dimension(10, 0)));


        editPanelButtonPanel.add(editPanelDeleteButton);
        editPanelButtonPanel.add(Box.createRigidArea(new Dimension(180, 0)));

        editPanelButtonPanel.add(editPanelSaveButton);
        editPanel.add(Box.createRigidArea(new Dimension(0, 15))); // some spacing between table and buttons
        editPanel.add(editPanelButtonPanel);

        // END EDIT PANEL CONFIGURATION


        editPanel.setPreferredSize(new Dimension(600, 500));
        editPanel.setMaximumSize(new Dimension(600, 500));
        containerPanel.add(editPanel, "edit");

        add(containerPanel);

        setSize(650, 575);
    }

    public void display() {
        setVisible(true);
    }
}
