import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ExtractorFrame extends JFrame {

    JPanel northPanel;
    JPanel centerPanel;
    JPanel southPanel;

    JPanel centerSouthPanel;
    JPanel centerFilterBtnPanel;
    JPanel centerFileBtnPanel;

    JLabel placeholderLabel;
    JLabel fileNameLabel;

    JButton goButton;
    JButton quitButton;

    JButton addFilterButton;
    JButton removeFilterButton;
    JButton addInputFileButton;
    JButton removeInputFileButton;

    JTextArea textArea;
    JScrollPane scrollPane;

    File filterFile;
    File inputFile;


    public ExtractorFrame() {
        super("Extractor App");

        setLayout(new BorderLayout());

        // Add panels to their respective positions
        add(createNorthPanel(), BorderLayout.NORTH);
        add(createCenterPanel(), BorderLayout.CENTER);
        add(createSouthPanel(), BorderLayout.SOUTH);

        // Frame settings
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // Center on screen
    }

    private JPanel createNorthPanel() {
        northPanel = new JPanel();
        placeholderLabel = new JLabel("Placeholder Content", SwingConstants.CENTER);
        northPanel.add(placeholderLabel);
        return northPanel;
    }

    private JPanel createCenterPanel() {
        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
//        fileNameLabel = new JLabel("File Name: No File Selected", SwingConstants.CENTER);

        textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);

//        centerFilterBtnPanel = new JPanel();
//        centerFilterBtnPanel.setLayout(new GridLayout(2, 1));
//        addFilterButton = new JButton("Add Filter");
//        addFilterButton.addActionListener(e -> {System.out.println("Add Filter");});
//        removeFilterButton = new JButton("Remove Filter");
//        removeFilterButton.addActionListener(e -> {System.out.println("Remove Filter");});
//        centerFilterBtnPanel.add(addFilterButton);
//        centerFilterBtnPanel.add(removeFilterButton);
//
//        centerFileBtnPanel = new JPanel();
//        centerFileBtnPanel.setLayout(new GridLayout(2, 1));
//        addInputFileButton = new JButton("Add Input File");
//        addInputFileButton.addActionListener(e -> {System.out.println("Add Input File");});
//        removeInputFileButton = new JButton("Remove Input File");
//        removeInputFileButton.addActionListener(e -> {System.out.println("Remove Input File");});
//        centerFileBtnPanel.add(addInputFileButton);
//        centerFileBtnPanel.add(removeInputFileButton);
//
//        centerSouthPanel = new JPanel();
//        centerSouthPanel.setLayout(new GridLayout(1, 2));
//        centerSouthPanel.add(centerFilterBtnPanel);
//        centerSouthPanel.add(centerFileBtnPanel);


//        centerPanel.add(centerSouthPanel, BorderLayout.SOUTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
//        centerPanel.add(fileNameLabel, BorderLayout.NORTH);
        return centerPanel;
    }

    private JPanel createSouthPanel() {
        southPanel = new JPanel();

         goButton = new JButton("Start");
         quitButton = new JButton("Quit");

        // Add lambda-based action listeners
        goButton.addActionListener(e -> System.out.println("Test button clicked!"));
        quitButton.addActionListener(e -> System.exit(0));

        southPanel.add(goButton);
        southPanel.add(quitButton);

        return southPanel;
    }
}
