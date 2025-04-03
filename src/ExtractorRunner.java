import javax.swing.SwingUtilities;

public class ExtractorRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ExtractorFrame frame = new ExtractorFrame();
            frame.setVisible(true);
        });
    }
}
