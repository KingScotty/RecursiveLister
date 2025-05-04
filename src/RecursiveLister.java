import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecursiveLister extends JFrame {

    private JTextArea textArea;
    private JButton startButton, quitButton;

    public RecursiveLister() {
        // Set window title and layout and other stuff
        super("Recursive File Lister");

        setLayout(new BorderLayout(10, 10));

        JLabel titleLabel = new JLabel("Recursive File Lister", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(titleLabel, BorderLayout.NORTH);

        // Text area inside scroll pane
        textArea = new JTextArea(20, 50);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        startButton = new JButton("Start");
        quitButton = new JButton("Quit");
        buttonPanel.add(startButton);
        buttonPanel.add(quitButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Quit button action
        quitButton.addActionListener(e -> System.exit(0));

        // Start button action (hook up recursive logic later)
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // To be implemented next
            }
        });

        // Window settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RecursiveLister::new);
    }
}
